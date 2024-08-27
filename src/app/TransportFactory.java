package app;

// Базовий клас для створення транспортного засобу
public abstract class TransportFactory {
    // Фабричний метод для створення транспортного засобу
    abstract Transport createTransport();
    // Деякі інші методи, спільні для всіх підкласів
}
