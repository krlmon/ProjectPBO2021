/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import  Entity.RecordEntity;

/**
 *
 * @author GENESIS
 */
public class ModelRecord {
private List<RecordEntity>  data=  new ArrayList<RecordEntity>();

    public void setData(List<RecordEntity> data) {
        this.data  =  data;
    }

    public List<RecordEntity> getData() {
        return data;
    }
}
