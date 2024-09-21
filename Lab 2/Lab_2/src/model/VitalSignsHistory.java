/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * Class for vital signs history records
 * 
 * @author Shreyas Purkar
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> historyList;
    
    /**
     * Constructor for VitalSignsHistory class
     */
    public VitalSignsHistory() {
        historyList = new ArrayList<VitalSigns>();
    }
    
    /**
     * Method to add new vital sign record
     * 
     * @return VitalSigns object
     */
    public VitalSigns addNewVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        historyList.add(vitalSign);
        return vitalSign;
    }
    
    /**
     * Method to delete vital sign record
     * 
     * @param vitalSign object to be deleted
     */
    public void removeVitalSigns(VitalSigns vitalSign) {
        historyList.remove(vitalSign);
    }
    
    /**
     * Method to display list of all vital signs recorded
     * 
     * @return List of all vital signs
     */
    public ArrayList<VitalSigns> getHistory() {
        return historyList;
    }
}
