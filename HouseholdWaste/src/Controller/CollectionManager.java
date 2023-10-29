/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CollectionModel;


public class CollectionManager {
    private final CollectionModel model;

    public CollectionManager(CollectionModel model) {
        this.model = model;
    }
    
    
    public void updateView() {
        model.printTotalCost(model.getTotalCost());
    }
    
    public void calculateCost() {
        model.calculateCost();
    }
}
