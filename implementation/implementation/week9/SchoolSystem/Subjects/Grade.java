package implementation.week9.SchoolSystem.Subjects;

public class Grade {private final Course course;
    private final Assignment assignment;
    private final double score;
    private final String feedback;

    public Grade(Course course, Assignment assignment, double score, String feedback) {
        this.course = course;
        this.assignment = assignment;
        this.score = score;
        this.feedback = feedback;
    }

    public Assignment getAssignment() { return assignment; }

    public double getScore() { return score; }

    public Course getCourse() { return course; }

    public String getFeedback() { return feedback; }

    public boolean isPassing() { return score > 5.5; }
}