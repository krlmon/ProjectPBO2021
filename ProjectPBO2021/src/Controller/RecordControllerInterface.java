/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import  Entity.RecordEntity;

/**
 *
 * @author GENESIS
 */
public interface RecordControllerInterface {
    public void  InsertRecord(String  provinsi,  int TingkatKematian,  int JumlahKasus,  int  PotensiPenularan);
    public void  UpdateRedord(int index,  String  provinsi,  int TingkatKematian,   int JumlahKasus,  int  PotensiPenularan);
    public void  DeleteRecord(int index);
    public String  ViewDataRecord();

}
