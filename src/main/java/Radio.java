public class Radio {
    private int currentStantion;
    private int currentVolume;

    public void next() {
        if (currentStantion != 9){
            currentStantion++;
        } else {
            currentStantion = 0;
        }
    }

    public void prev() {
        if (currentStantion != 0) {
            currentStantion--;
        } else {
            currentStantion = 9;
        }
    }
    public int plus() {
        if (currentVolume != 100){
            currentVolume++;
        } return currentVolume;
    }
    public int minus() {
        if (currentVolume != 0){
            currentVolume--;
        } return currentVolume;
    }

    public int getCurrentStantion() {
        return currentStantion;
    }

    public void setCurrentStantion(int currentStantion) {
        if (currentStantion < 0) {
            return;
        }
        if (currentStantion > 9) {
            return;
        }
        this.currentStantion = currentStantion;
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
