package implementation.week13.companion;

import implementation.week12.highcourt.strategies.Strategy;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;

public class EthicalUI extends JFrame
{
    /* Components */
    private JTextArea inputArea;
    private JTextArea outputArea;
    private AIReflectionService aiService;

    /* Custom Colors - Dark Theme */
    private final Color BG_COLOR = new Color(30, 30, 30);
    private final Color TEXT_COLOR = new Color(220, 220, 220);
    private final Color ACCENT_COLOR = new Color(70, 130, 180);
    private final Color BUTTON_COLOR = new Color(50, 50, 50);

    public EthicalUI()
    {
        // 1. Set up the Window
        setTitle("\uD83C\uDF3F Ethical Decision Companion");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(BG_COLOR);

        // 2. Initialize Service
        aiService = new AIReflectionService();

        // 3. Create the layout
        initUI();

        // 4. Center on screen
        setLocationRelativeTo(null);
    }

    private void initUI()
    {
        // HEADER
        JLabel titleLabel = new JLabel("ETHICAL DECISION COMPANION", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLabel.setForeground(ACCENT_COLOR);
        titleLabel.setBorder(new EmptyBorder(15, 0, 15, 0));
        add(titleLabel, BorderLayout.NORTH);

        // Split Pane
        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 10, 0)); // 1 row, 2 cols, 10px gap
        centerPanel.setBackground(BG_COLOR);
        centerPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        // Input
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(BG_COLOR);

        JLabel inputLabel = new JLabel("Describe the Dilemma:");
        inputLabel.setForeground(Color.GRAY);
        leftPanel.add(inputLabel, BorderLayout.NORTH);

        inputArea = new JTextArea("A hospital has one ICU bed left.\nTwo patients need it.\nPatient A has better survival odds.\nPatient B has 3 young children.");
        styleTextArea(inputArea);
        leftPanel.add(new JScrollPane(inputArea), BorderLayout.CENTER);

        // Output
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(BG_COLOR);

        JLabel outputLabel = new JLabel("Analysis & Reflection:");
        outputLabel.setForeground(Color.GRAY);
        rightPanel.add(outputLabel, BorderLayout.NORTH);

        outputArea = new JTextArea("Ready for analysis...");
        styleTextArea(outputArea);
        outputArea.setEditable(false); // Read only
        rightPanel.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        add(centerPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        buttonPanel.setBackground(BG_COLOR);

        JButton btnUtil = createButton("Strategy: Utilitarian");
        JButton btnDuty = createButton("Strategy: Duty-Based");
        JButton btnAI = createButton("✨ Ask AI Companion");

        // Action Listeners
        btnUtil.addActionListener(e -> runStrategy(new UtilitarianStrategy()));
        btnDuty.addActionListener(e -> runStrategy(new DutyBasedStrategy()));

        btnAI.addActionListener(e -> {
            outputArea.setText("🤖 Contacting AI... (Please wait)");

            // Run network call in a separate thread to prevent freezing
            new Thread(() -> {
                Scenario current = getScenarioFromInput();
                String result = aiService.analyseScenario(current);

                // Update UI back on the main thread
                SwingUtilities.invokeLater(() -> outputArea.setText(result));
            }).start();
        });

        buttonPanel.add(btnUtil);
        buttonPanel.add(btnDuty);
        buttonPanel.add(btnAI);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private JButton createButton(String s)
    {
        JButton button = new JButton(s);
        button.setFocusPainted(false);
        button.setBackground(BUTTON_COLOR);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    // Helper: Runs a standard Java strategy
    private void runStrategy(DecisionStrategy strategy)
    {
        Scenario s = getScenarioFromInput();
        String analysis = strategy.analyse(s);
        outputArea.setText("--- " + strategy.getName() + " ---\n\n" + analysis);
    }

    // Helper: Turns text box into a Scenario Object
    private Scenario getScenarioFromInput()
    {
        String rawText = inputArea.getText();
        return new Scenario("GUI Scenario", rawText, new HashSet<>(Arrays.asList("User", "Stakeholders")));
    }

    // Helper: Styles text areas
    private void styleTextArea(JTextArea area)
    {
        area.setBackground(new Color(40, 40, 40));
        area.setForeground(TEXT_COLOR);
        area.setFont(new Font("Consolas", Font.PLAIN, 14));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            new EthicalUI().setVisible(true);
        });
    }
}