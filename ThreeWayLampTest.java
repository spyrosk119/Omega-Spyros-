package ss.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for ThreeWayLamp.
 */
public class ThreeWayLampTest {
    /** The lamp being tested. */
    private ThreeWayLamp lamp;

    /**
     * Creates a fresh lamp before every test.
     */
    @BeforeEach
    public void setUp() {
        lamp = new ThreeWayLamp();
    }

    /**
     * Tests that a new lamp is OFF.
     */
    @Test
    public void testStartsOff() {
        assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getSetting());
    }

    /**
     * Tests the order OFF, LOW, MEDIUM, HIGH, OFF.
     */
    @Test
    public void testNext() {
        lamp.next();
        assertEquals(ThreeWayLamp.LampSetting.LOW, lamp.getSetting());
        lamp.next();
        assertEquals(ThreeWayLamp.LampSetting.MEDIUM, lamp.getSetting());
        lamp.next();
        assertEquals(ThreeWayLamp.LampSetting.HIGH, lamp.getSetting());
        lamp.next();
        assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getSetting());
    }

    /**
     * Tests that setSetting changes the lamp to the given setting.
     */
    @Test
    public void testSetSetting() {
        lamp.setSetting(ThreeWayLamp.LampSetting.HIGH);
        assertEquals(ThreeWayLamp.LampSetting.HIGH, lamp.getSetting());
    }
}