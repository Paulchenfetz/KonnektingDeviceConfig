/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.konnekting.deviceconfig;

/**
 *
 * @author achristian
 */
public interface ProgramProgressListener {

    public void onStatusMessage(String statusMsg);

    public void onProgressUpdate(int currentStep, int steps);
    
}
