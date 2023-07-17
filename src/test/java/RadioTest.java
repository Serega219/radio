import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testCurrentStantion2() {
        Radio radio = new Radio();
        radio.setCurrentStantion(2);

        int expected = 2;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCurrentStantionminus() {
        Radio radio = new Radio();
        radio.setCurrentStantion(-1);

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCurrentStantion1() {
        Radio radio = new Radio();
        radio.setCurrentStantion(1);

        int expected = 1;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStantion9() {
        Radio radio = new Radio();
        radio.setCurrentStantion(9);

        int expected = 9;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStantion10() {
        Radio radio = new Radio();
        radio.setCurrentStantion(11);

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStantion0() {
        Radio radio = new Radio();
        radio.setCurrentStantion(8);
        radio.setCurrentStantion(0);

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnext() {
        Radio radio = new Radio();
        radio.setCurrentStantion(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testnextmax() {
        Radio radio = new Radio();
        radio.setCurrentStantion(10);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprev() {
        Radio radio = new Radio();
        radio.setCurrentStantion(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testprevmin() {
        Radio radio = new Radio();
        radio.setCurrentStantion(0);
        radio.prev();

        int expected = 10;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testminusmax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testminus2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.minus();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testplus2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.plus();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testplusmaxx() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testplusmaxover() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.plus();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testminusmaxover() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentStantion();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationCount() {
        Radio radio = new Radio(26);

        int expected = 25;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
