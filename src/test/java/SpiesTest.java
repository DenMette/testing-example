import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpiesTest {

    @Test
    void isRunning_withCannedAnswer_returnsFalse() {
        final SpyEngine spyEngine = new SpyEngine();
        Car testCar = new Car(spyEngine);

        testCar.start();

        Assertions.assertEquals(1, spyEngine.startedCalledCount);
    }
}

class SpyEngine extends DieselEngine {
    int startedCalledCount = 0;

    @Override
    public void start() {
        startedCalledCount++;
        super.start();
    }
}