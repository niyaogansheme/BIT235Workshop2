public class FuelConsumption {
    public static void main(String[] args) {
        double tank = 40;
        double normalPer100km = 8;
        double roughExtraRate = 1.15;

        double roughPer100km = normalPer100km * roughExtraRate;

        double distanceNormal = (tank / normalPer100km) * 100;
        double distanceRough = (tank / roughPer100km) * 100;

        System.out.println("With a full 40L tank, distance on normal road: "+distanceNormal + " km");
        System.out.println("With a full 40L tank, distance on rough road: "+distanceRough + " km");
    }
}
