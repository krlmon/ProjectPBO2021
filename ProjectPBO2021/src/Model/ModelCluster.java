/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.List;
import  Entity.ClusterEntity;

/**
 *
 * @author GENESIS
 */
public  class ModelCluster {
   List<ClusterEntity>  clusters=  new ArrayList<ClusterEntity>();

    public void setClusters(List<ClusterEntity>  clusters) {
        this.clusters  = clusters;
    }

    public List<ClusterEntity>  getClusters() {
        return clusters;
    }
}

