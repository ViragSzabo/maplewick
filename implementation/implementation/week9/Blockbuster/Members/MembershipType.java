package implementation.week9.Blockbuster.Members;

public enum MembershipType {
    BASIC, PREMIUM, VIP;

    public double getDiscountRate() {
        return switch (this) {
            case BASIC -> 0.05;
            case PREMIUM -> 0.10;
            case VIP -> 0.20;
        };
    }

    public String getPerks() {
        return switch (this) {
            case BASIC -> "🎬 Access to standard rentals";
            case PREMIUM -> "🍿 Includes early access & bonus content";
            case VIP -> "👑 Unlimited rentals + exclusive screenings";
        };
    }
}