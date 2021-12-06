/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo2021;

import Controller.AllObjectController;
import Gui.RecordGui;
import java.util.Scanner;

/**
 *
 * @author GENESIS
 */
public class ProjectPBO2021 {
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dataDefault();
        RecordGui g = new RecordGui();

    }
    
    static void  dataDefault(){
        AllObjectController.recordcontroller.InsertRecord("Jatim", 19, 15, 39);
        AllObjectController.recordcontroller.InsertRecord("Jateng", 21, 15, 81);
        AllObjectController.recordcontroller.InsertRecord("Kalbar", 20, 16, 6);
        AllObjectController.recordcontroller.InsertRecord("Jabar", 23, 16, 77);
        AllObjectController.recordcontroller.InsertRecord("Sulteng", 31, 17, 40);
        AllObjectController.recordcontroller.InsertRecord("Sumut", 22, 17, 76);
    } 

}