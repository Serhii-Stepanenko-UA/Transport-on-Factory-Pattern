package app;

// Конкретний підклас, який реалізує фабричний метод
class CarFactory extends TransportFactory {
    // Перевизначення фабричного методу для створення автомобіля
    @Override
    Transport createTransport() {
        return new Car();
    }
}
