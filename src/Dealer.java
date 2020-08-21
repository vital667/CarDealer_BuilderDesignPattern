public class Dealer {

    public double buyCar(Car car) {
        return calculateCarPrice(car);
    }

    public double sellCar(Car car) {
        return calculateCarPrice(car) * 0.8;
    }

    private double calculateCarPrice(Car c) {
        double result = 0;
        result -= c.getAge() * 100;
        result += c.getEngineCapacity() * 2500;
        result += c.getColor().toLowerCase().equals("red") ? 7500 : 0;
        result += c.getHorsePower() != -1 ? c.getHorsePower() * 10 : 0;
        result += c.isHasTurbo() ? 10000 : 0;
        return result * 4 / 5.0;
    }

}
