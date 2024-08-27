package app;

public class Client {

    public static void main(String[] args) {
        run();
    }

    static void run() {
        System.out.println("\nClient Car:");
        // Створення екземпляра фабрики CarFactory
        TransportFactory carFactory = new CarFactory();
        // Виклик методу createTransport() для створення транспортного засобу - car
        Transport car = carFactory.createTransport();
        // Виклик методу руху для car
        car.move(); // Машина їде на колесах по дорозі помалу і доставляє товари із будьякого пункту в любий на суші.

        System.out.println("\nClient Plane:");
        // Створення екземпляра фабрики PlaneFactory
        TransportFactory planeFactory = new PlaneFactory();
        // Виклик методу createTransport() для створення транспортного засобу - plane
        Transport plane = planeFactory.createTransport();
        // Виклик методу руху для plane
        plane.move(); // Планер летить на крилах повітрям швидко і доставляє товари з аеропорту до аеропорту.
    }
}