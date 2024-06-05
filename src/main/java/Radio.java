public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (currentRadioStationNumber != maxStation) {
            currentRadioStationNumber++;
            return;
        }
        currentRadioStationNumber = 0;
    }

    public void previous() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume >= 100) {
            return;
        }
        currentVolume++;
    }

    public void previousVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxStation) {
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