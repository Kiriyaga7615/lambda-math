package app;

import java.util.concurrent.ThreadLocalRandom;

class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
