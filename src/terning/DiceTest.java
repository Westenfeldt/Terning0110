package terning;

import static org.junit.Assert.*;

public class DiceTest {
Dice dice1 = new Dice();

    @org.junit.Test
    public void roll() {
       int et = dice1.roll();
       int to = dice1.roll();


    }

    @org.junit.Test
    public void rollMultiple() {
        dice1.rollMultiple(2);
    }
}