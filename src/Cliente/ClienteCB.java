/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Daniel Acosta
 */
public interface ClienteCB extends Remote {
    public void newFile() throws RemoteException;   
    public void newDir() throws RemoteException;
}
