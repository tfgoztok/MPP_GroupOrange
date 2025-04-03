import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private double monthlyMaintenanceCost;
    private List<Apartment> apartments;

    public Building(String name, double monthlyMaintenanceCost) {
        this.name = name;
        this.monthlyMaintenanceCost = monthlyMaintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double calculateMonthlyProfit() {
        double totalRent = apartments.stream()
                .mapToDouble(Apartment::getMonthlyRent)
                .sum();
        return totalRent - monthlyMaintenanceCost;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyMaintenanceCost() {
        return monthlyMaintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
} 