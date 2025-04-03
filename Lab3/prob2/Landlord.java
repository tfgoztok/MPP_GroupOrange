import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Building> buildings;

    public Landlord(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double calculateTotalMonthlyProfit() {
        return buildings.stream()
                .mapToDouble(Building::calculateMonthlyProfit)
                .sum();
    }

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
} 