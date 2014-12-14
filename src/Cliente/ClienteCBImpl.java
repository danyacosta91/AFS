/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Daniel Acosta
 */
public class ClienteCBImpl extends UnicastRemoteObject implements ClienteCB {
    main _main;
    public ClienteCBImpl(main _main) throws RemoteException {
        this._main = _main;
    }
    @Override
    public void newFile() throws RemoteException{
        _main.initialRootFilesLoad();
    }
    @Override
    public void newDir() throws RemoteException{
        _main.initialRootFilesLoad();
    }
}
