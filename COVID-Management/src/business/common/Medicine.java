/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.common;

/**
 *
 * @author shravyagunda
 */

//gets all medicines
public class Medicine {
    String name;
    int avaialableQuantity;
    int requiredQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvaialableQuantity() {
        return avaialableQuantity;
    }

    public void setAvaialableQuantity(int avaialableQuantity) {
        this.avaialableQuantity = avaialableQuantity;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    public Medicine(String name, int avaialableQuantity, int requiredQuantity) {
        this.name = name;
        this.avaialableQuantity = avaialableQuantity;
        this.requiredQuantity = requiredQuantity;
    }

    
    
    
}
