/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;

public interface FileService extends Remote {
	public UUID login(String username, String password) throws RemoteException;
	public boolean register(String username, String password) throws RemoteException;
	public boolean createFile(String location, String name, UUID id) throws RemoteException;
	public String openFile(String location, String name, UUID id) throws RemoteException;
        public boolean writeFile(String location, String name, String content, UUID id) throws RemoteException;
}