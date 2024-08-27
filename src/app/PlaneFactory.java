package app;

// Конкретний підклас, який реалізує фабричний метод
class PlaneFactory extends TransportFactory {
    // Перевизначення фабричного методу для створення літака
    @Override
    Transport createTransport() {
        return new Plane();
    }
}