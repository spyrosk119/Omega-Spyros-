package ss.week2;

/**
 * A lamp with 4 different settings
 * (off, low, medium, high) , which can switch between them
 */
public class ThreeWayLamp {

    public enum LampSetting {OFF, LOW, MEDIUM, HIGH}

    private LampSetting setting = LampSetting.OFF;

    /**
     *return the setting of the lamp
     * @return the setting of the lamp
     */
    public LampSetting getSetting() {
        return setting;
    }

    /**
     *set the lamp to the given setting.
     * @param newSetting setting the switch to
     */
    public void setSetting(LampSetting newSetting) {
setting = newSetting;
    }

    /**
     * switches to the next setting of the lamp
     */
    public void next() {
        switch (setting) {
            case OFF:
                setting = LampSetting.LOW;
                break;
            case LOW:
                setting = LampSetting.MEDIUM;
                break;
            case MEDIUM:
                setting = LampSetting.HIGH;
                break;
            case HIGH:
                setting = LampSetting.OFF;
        }
    }
}
