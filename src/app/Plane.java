package app;

// Конкретний клас літака
class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Plane flies on wings through the air quickly" +
                " and delivers cargo from airport to airport.");
    }
}