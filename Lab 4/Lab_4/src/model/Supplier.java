/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Shreyas Purkar
 */
public class Supplier {
    
    private String supplyName;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
