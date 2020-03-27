

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(final Engine engine) {
        if (this.engine.isRunning()) {
            throw new UnsupportedOperationException("No switching when it's turned on!");
        }
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {}

    public boolean isRunning() { return this.engine.isRunning(); }
}
