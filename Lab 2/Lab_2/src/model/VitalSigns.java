/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class for vital signs
 * 
 * @author Shreyas Purkar
 */
public class VitalSigns {

    private String date;
    private double bloodPressure;
    private double temperature;
    private int pulse;

    //Default constructor
    public VitalSigns() {
    }

    //Parameterized constructor
    public VitalSigns(String date, double bloodPressure, double temperature, int pulse) {
        this.date = date;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.pulse = pulse;
    }

    //Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

}
