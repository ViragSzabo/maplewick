package implementation.week11.AtherForge.Artifacts;

import implementation.week11.AtherForge.Exceptions.AetherBurstException;
import implementation.week11.AtherForge.Exceptions.SyncErrorException;

public abstract class Artifact {

    /** Attributes */
    private String name;
    private Element element;
    private int chargeLevel;

    /** Constructor */
    public Artifact(String name, Element element, int chargeLevel) {
        this.name = name;
        this.element = element;
        this.chargeLevel = chargeLevel;
    }

    /** Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    /** Abstract Methods */
    public abstract void awaken() throws AetherBurstException;

    /** Charge the artifact's charge level with a specific amount */
    public void infuse(int amount) throws AetherBurstException, SyncErrorException {
        if (this.chargeLevel > 120) {
            throw new AetherBurstException();
        } else if (this.chargeLevel > 100) {
            throw new SyncErrorException();
        } else {
            this.chargeLevel += amount;
            System.out.println(this.name + "'s current charge level: " + this.chargeLevel);
        }
    }

    /** See if the artifact is stable or not */
    public boolean isStable() {
        if (chargeLevel < 100) {
            return true;
        }
        return false;
    }
}