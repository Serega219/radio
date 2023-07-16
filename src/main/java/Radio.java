public class Radio {
    private int maxRadioWave = 10;
    private int minRadioWave = 0;
    private int maxSoundLevel = 100;
    private int minSoundLevel = 0;
    private int currentStantion;
    private int currentVolume;

    public Radio() {

    }
    public Radio(int numberStation) {
               this.maxRadioWave = numberStation - 1;
    }


    public void next() {
        if (currentStantion != maxRadioWave){
            currentStantion++;
        } else {
            currentStantion = minRadioWave;
        }
    }

    public void prev() {
        if (currentStantion != minRadioWave) {
            currentStantion--;
        } else {
            currentStantion = maxRadioWave;
        }
    }
    public int plus() {
        if (currentVolume != maxSoundLevel){
            currentVolume++;
        } return currentVolume;
    }
    public int minus() {
        if (currentVolume != minSoundLevel){
            currentVolume--;
        } return currentVolume;
    }
    public int getMaxRadioStation() {
        return maxRadioWave;
    }
    public int getCurrentStantion() {
        return currentStantion;
    }

    public void setCurrentStantion(int currentStantion) {
        if (currentStantion < minRadioWave) {
            return;
        }
        if (currentStantion > maxRadioWave) {
            return;
        }
        this.currentStantion = currentStantion;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minSoundLevel) {
            return;
        }
        if (currentVolume > maxSoundLevel) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
