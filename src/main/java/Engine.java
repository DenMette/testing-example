

public interface Engine {

    void start();
    void stop();
    boolean isRunning();
}

class DieselEngine implements Engine {

    private boolean running = false;

    @Override
    public void start() {
        this.running = true;
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public boolean isRunning() { return running; }
}
