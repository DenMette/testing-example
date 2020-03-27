import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MockDummyTest {

    @Test
    void setEngine_whenCarIsRunning_throwsException() {
        final Engine dummyEngine = new DieselEngine();
        Car testCar = new Car(new DieselEngine());

        testCar.start();
        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> testCar.setEngine(dummyEngine)
        );
    }
}
