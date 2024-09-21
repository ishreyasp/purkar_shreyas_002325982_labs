/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * Class for vital signs history
 * 
 * @author Shreyas Purkar
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> historyList;
    
    public VitalSignsHistory() {
        historyList = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addNewVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        historyList.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSigns(VitalSigns vitalSign) {
        historyList.remove(vitalSign);
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return historyList;
    }
}
