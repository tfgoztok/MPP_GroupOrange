public class Apartment {
    private String id;
    private double monthlyRent;

    public Apartment(String id, double monthlyRent) {
        this.id = id;
        this.monthlyRent = monthlyRent;
    }

    public String getId() {
        return id;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }
} 