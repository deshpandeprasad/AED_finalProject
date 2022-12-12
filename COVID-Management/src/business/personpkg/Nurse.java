
package business.personpkg;

/**
 *
 * @author shravyagunda
 */
//person: nurse
public class Nurse extends Person{
    private String nurseId;
    private static int count = 001;
    private String experience;
    private String degree;
    private boolean poscov;

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Nurse.count = count;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isPoscov() {
        return poscov;
    }

    public void setPoscov(boolean poscon) {
        this.poscov = poscon;
    }
    
    
}
