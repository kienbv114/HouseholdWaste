/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import Controller.CollectionManager;
import Model.CollectionModel;


public class Main {

    public static void main(String[] args) {
        int[] garbageAtStations = {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};
        
        CollectionModel cm = new CollectionModel(garbageAtStations);
        CollectionManager cma = new CollectionManager(cm);
        
        cma.calculateCost();
        cma.updateView();
    }
}
