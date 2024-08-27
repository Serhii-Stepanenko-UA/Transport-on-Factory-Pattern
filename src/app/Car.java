package app;

// Конкретний клас автомобіля
class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Car drives on wheels on the roads slowly" +
                " and delivers cargo from anywhere to any point on land.");
    }
}