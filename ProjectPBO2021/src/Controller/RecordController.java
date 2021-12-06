/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import  Entity.*;
import  Model.*;

/**
 *
 * @author GENESIS
 */
public class RecordController implements RecordControllerInterface{
@Override
    public void  InsertRecord(String  provinsi,  int TingkatKematian,  int JumlahKasus,  int  PotensiPenularan){
    AllObjectModel.modelrecord.getData().add(new  RecordEntity(provinsi, TingkatKematian,JumlahKasus, PotensiPenularan));
}
@Override
public void  UpdateRedord(int index,  String  provinsi,  int TingkatKematian,   int JumlahKasus,  int  PotensiPenularan){
    AllObjectModel.modelrecord.getData().set(index,  new  RecordEntity(provinsi, TingkatKematian, JumlahKasus, PotensiPenularan));
} 
@Override
public void DeleteRecord(int index){
    AllObjectModel.modelrecord.getData ().remove(index);
}
@Override
public String ViewDataRecord(){
    String text;
    text="Provinsi\tTingkat Kematian\tJumlah  Kasus\tPotensi Penularan\n";

for(int i=0;i<AllObjectModel.modelrecord.getData().size();i++){
    text+=""+ AllObjectModel.modelrecord.getData().get(i).getProvinsi()
            + "\t\t" + AllObjectModel.modelrecord.getData().get(i).getTingkatKematian()
            + "\t\t\t" + AllObjectModel.modelrecord.getData().get(i).getJumlahKasus()
            + "\t\t" + AllObjectModel.modelrecord.getData().get(i).getPotensiPenularan()+"\n";
}
return text;
}

}
