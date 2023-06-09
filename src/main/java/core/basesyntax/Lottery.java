package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
        static final int COUNTER_LIMIT = 100;

    public Ball getRandomBall() {
        String newColor = colorSupplier.getRandomColor();
        int newNumber = random.nextInt(COUNTER_LIMIT);

        return new Ball(newColor, newNumber);
    }
}
