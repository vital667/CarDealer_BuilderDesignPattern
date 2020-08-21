public class Car {
    public static final String UNKNOWN = "UNKNOWN";
    //required
    private String manufacturer;
    private int age;
    private double engineCapacity;
    //additional
    private String model;
    private String color;
    private int horsePower;
    private boolean hasTurbo;

    // restricted constructor
    private Car(Builder builder) {
        this.manufacturer = builder.manufacturer;
        this.age = builder.age;
        this.engineCapacity = builder.engineCapacity;
    }

    public static class Builder {
        //required
        private String manufacturer;
        private int age;
        private double engineCapacity;
        //additional
        private String model = Car.UNKNOWN;
        private String color = Car.UNKNOWN;
        private int horsePower = -1;
        private boolean hasTurbo = false;

        public Builder(String manufacturer, int age, double engineCapacity) {
            this.manufacturer = manufacturer;
            this.age = age;
            this.engineCapacity = engineCapacity;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder horsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder hasTurbo(boolean hasTurbo) {
            this.hasTurbo = hasTurbo;
            return this;
        }

        public Car build() {
            Car car = new Car(this);
            car.model = this.model;
            car.color = this.color;
            car.horsePower = this.horsePower;
            car.hasTurbo = this.hasTurbo;
            return car;
        }
    }

    public static Builder builder(String manufacturer, int age, double engineCapacity) {
        return new Builder(manufacturer, age, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", age=" + age +
                ", engineCapacity=" + engineCapacity +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", hasTurbo=" + hasTurbo +
                '}';
    }

    public int getAge() {
        return age;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }
}
