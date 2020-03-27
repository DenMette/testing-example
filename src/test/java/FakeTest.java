import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FakeTest {

    @Test
    void isRunning_withFakeEngineImplementation_ReturnsTrue() {
        final Engine fakeEngine = new Engine() {
            boolean started = false;

            @Override
            public void start() {
                started = true;
            }

            @Override
            public void stop() {
                started = false;
            }

            @Override
            public boolean isRunning() {
                return started;
            }
        };

        Car testCar = new Car(fakeEngine);

        testCar.start();
        Assertions.assertTrue(testCar.isRunning());
    }
}
