/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.RecordEntity;
/**
 *
 * @author GENESIS
 */
public interface ClusterControllerInterface {
    public void initiateClusterAndCentroid(int clusterNumber);
    public void initializeCluster(int clusterNumber,  RecordEntity record);
    public void FinalCluster();
    public String ViewDataCluster();

}
