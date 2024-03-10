package DiceRoller;
import java.util.Random;

public class Dice {
    Random random = new Random();

    public Integer d100 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(101);
        }
        return randomInt;
    }
    public Integer d20 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(21);
        }
        return randomInt;
    }
    public Integer d12 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(13);
        }
        return randomInt;
    }
    public Integer d10 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(11);
        }
        return randomInt;
    }
    public Integer d8 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(9);
        }
        return randomInt;
    }
    public Integer d6 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(7);
        }
        return randomInt;
    }
    public Integer d4 () {
        Integer randomInt = 0;
        while (randomInt == 0) {
            randomInt = random.nextInt(5);
        }
        return randomInt;
    }
}
