/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Shreyas Purkar
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;
    private ImageIcon logoImage;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        this.features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public Feature addNewFeature(Feature feature) {
        this.features.add(feature);
        return feature;
    }
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
}
