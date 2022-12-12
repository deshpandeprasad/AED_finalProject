
package business.vitalsign;

//this is the vitalsigns
public class VitalSign {
    
   
    private int heartRate;
    private boolean isLungsEffected;
    private boolean isBreathingDifficulty;
    private boolean isCovid;

    public VitalSign(int heartRate, boolean isLungsEffected, boolean isBreathingDifficulty, boolean isCovid) {
        this.heartRate = heartRate;
        this.isLungsEffected = isLungsEffected;
        this.isBreathingDifficulty = isBreathingDifficulty;
        this.isCovid = isCovid;
    }

    public boolean isIsLungsEffected() {
        return isLungsEffected;
    }

    public void setIsLungsEffected(boolean isLungsEffected) {
        this.isLungsEffected = isLungsEffected;
    }

    public boolean isIsBreathingDifficulty() {
        return isBreathingDifficulty;
    }

    public void setIsBreathingDifficulty(boolean isBreathingDifficulty) {
        this.isBreathingDifficulty = isBreathingDifficulty;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public boolean isIsCovid() {
        return isCovid;
    }

    public void setIsCovid(boolean isCovid) {
        this.isCovid = isCovid;
    }

    
}
