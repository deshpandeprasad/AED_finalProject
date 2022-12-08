
package business.personpkg;

import business.vitalsign.VitalSign;
import java.util.ArrayList;

//person: patient
public class Patient extends Person{
    
    private String patientId;
    private static int count = 001;
    private boolean isCritical = false;
    private float spo2Level;
    private boolean isCough;
    private float temperature;
    private boolean isCovid;
    private boolean isCured =false;
    private boolean isDead = false;
    private VitalSign vitalSign;

    public boolean isIsCured() {
        return isCured;
    }

    public void setIsCured(boolean isCured) {
        this.isCured = isCured;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
    private ArrayList<VitalSign> vitalSignList;
    private volatile boolean stop = false;
    private int counter = 0;

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean isIsCovid() {
        return isCovid;
    }

    public void setIsCovid(boolean isCovid) {
        this.isCovid = isCovid;
    }
  

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    
    
    public Patient()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("CUST");
        sb.append(count);
        patientId = sb.toString();
        count++;
        vitalSign= new VitalSign(-1,false,false,false);
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

    public String getPatientId() {
        return patientId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public boolean isIsCritical() {
        return isCritical;
    }

    public void setIsCritical(boolean isCritical) {
        this.isCritical = isCritical;
    }

    public float getSpo2Level() {
        return spo2Level;
    }

    public void setSpo2Level(float spo2Level) {
        this.spo2Level = spo2Level;
    }

    public boolean isIsCough() {
        return isCough;
    }

    public void setIsCough(boolean isCough) {
        this.isCough = isCough;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

 
}
