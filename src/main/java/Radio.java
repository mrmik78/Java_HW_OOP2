public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public void next() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber++;
            return;
        }
        currentRadioStationNumber = 0;
    }

    public void previous() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 0;
    }

    public void previousVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}