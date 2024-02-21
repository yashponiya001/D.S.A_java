import java.util.Arrays;

public class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        int index = -1;
        for (int currentAsteroid : asteroids) {

            boolean currentAsteroidIsUndestroyed = true;
            while (currentAsteroidIsUndestroyed && index >= 0 && asteroids[index] > 0 && currentAsteroid < 0) {
                currentAsteroidIsUndestroyed = currentAsteroid + asteroids[index] < 0;
                if (currentAsteroid + asteroids[index] <= 0) {
                    --index;
                }
            }
            if (currentAsteroidIsUndestroyed) {
                asteroids[++index] = currentAsteroid;
            }
        }

        return Arrays.copyOfRange(asteroids, 0, index + 1);
    }
}
