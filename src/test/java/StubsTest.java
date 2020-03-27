import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StubsTest {

    @Test
    void isRunning_withCannedAnswer_returnsFalse() {
        final Engine stubbedEngine = new Engine() {
            @Override
            public void start() {}

            @Override
            public void stop() {}

            @Override
            public boolean isRunning() {
                return false;
            }
        };

        Car testCar = new Car(stubbedEngine);

        testCar.start();
        Assertions.assertFalse(testCar.isRunning());
    }
}
