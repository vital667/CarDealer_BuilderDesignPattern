public class Main {
    public static void main(String[] args) {

        Car car = Car.builder("Audi", 3, 2.8)
                .horsePower(220)
                .hasTurbo(true)
                .build();

        System.out.println(car);

        Dealer dealer = new Dealer();
        System.out.println("Car like " + car + ", costs to buy " + dealer.buyCar(car));
        System.out.println("Car like " + car + ", costs to sell " + dealer.sellCar(car));

    }
}
