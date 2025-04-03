public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord("Maharishi Himself");

        Building building1 = new Building("H1 Building", 5000);
        Building building2 = new Building("Fair Apartments", 3500);
        Building building3 = new Building("Downtown Lofts", 4200);

        building1.addApartment(new Apartment("101", 1200));
        building1.addApartment(new Apartment("102", 1300));
        building1.addApartment(new Apartment("103", 1250));
        building1.addApartment(new Apartment("201", 1400));
        building1.addApartment(new Apartment("202", 1450));

        building2.addApartment(new Apartment("A1", 950));
        building2.addApartment(new Apartment("A2", 975));
        building2.addApartment(new Apartment("B1", 1100));
        building2.addApartment(new Apartment("B2", 1150));

        building3.addApartment(new Apartment("L1", 1600));
        building3.addApartment(new Apartment("L2", 1650));
        building3.addApartment(new Apartment("L3", 1700));
        building3.addApartment(new Apartment("L4", 1750));

        landlord.addBuilding(building1);
        landlord.addBuilding(building2);
        landlord.addBuilding(building3);

        for (Building building : landlord.getBuildings()) {
            double profit = building.calculateMonthlyProfit();
            System.out.println(building.getName() + " monthly profit: $" + profit);
        }

        double totalProfit = landlord.calculateTotalMonthlyProfit();
        System.out.println("\nTotal monthly profit for " + landlord.getName() + ": $" + totalProfit);
    }
} 