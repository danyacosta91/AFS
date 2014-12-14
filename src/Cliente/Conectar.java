/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Daniel Acosta
 */
public class Conectar {
    Registry _registry;
    FileService _fileService;
    UUID _id;
    main _main;
    
    public Conectar(main _main){
        this._main = _main;
        //init();
    }
    
    private void init(){
        try {
            // colocar la ip del server
            _registry = LocateRegistry.getRegistry("127.0.0.1", 1099);                         
            _fileService = (FileService) _registry.lookup("fileService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean Register( String user, String pwd ) throws RemoteException{
        return _fileService.register( user, pwd );
        //return _fileService.register( user, pwd, new ClienteCB(_main) );
    }
    
    public boolean Login( String user, String pwd ) throws RemoteException{
        _id = _fileService.login( user, pwd );
        
        return _id != null;
    }
    
    public boolean createFile( String location, String name ) throws RemoteException{
        return _fileService.createFile( location, name, _id );
    }
    public String openFile( String location, String name ) throws RemoteException{
        return _fileService.openFile( location, name, _id );
    }
    
    public boolean writeFile( String location, String name, String content ) throws RemoteException{
        return _fileService.writeFile( location, name, content, _id );
    }
    
    public ArrayList<DirStruct> openDir(){
        //return return _fileService.openDir( location, _id );
        ArrayList<DirStruct> lista = new ArrayList<DirStruct>();
        ArrayList<DirStruct> lista2 = new ArrayList<DirStruct>();
        ArrayList<DirStruct> lista3 = new ArrayList<DirStruct>();
        ArrayList<DirStruct> lista4 = new ArrayList<DirStruct>();
        ArrayList<DirStruct> def = new ArrayList<DirStruct>();
        def.add(new DirStruct("",0,"",0,true,"", null));
        lista4.add(new DirStruct("test3.txt",10.1,"13/12/2014",1,false,"dany", null));
        lista4.add(new DirStruct("test4.txt",10.1,"13/12/2014",1,false,"dany", null));
        lista2.add(new DirStruct("dany",10.1,"13/12/2014",1,true,"dany", lista4));
        lista2.add(new DirStruct("dany2.txt",10.1,"13/12/2014",1,false,"dany", null));
        lista3.add(new DirStruct("test.txt",10.1,"13/12/2014",1,false,"dany", null));
        lista3.add(new DirStruct("test2.txt",10.1,"13/12/2014",1,false,"dany", null));
        lista.add(new DirStruct("home",10.1,"13/12/2014",1,true,"dany", lista2));
        lista.add(new DirStruct("home2",10.1,"13/12/2014",1,true,"dany", lista3));
        lista.add(new DirStruct("home3",10.1,"13/12/2014",1,true,"dany", def));
        lista.add(new DirStruct("home4",10.1,"13/12/2014",1,true,"dany", def));
        lista.add(new DirStruct("home5",10.1,"13/12/2014",1,false,"dany", null));
        lista.add(new DirStruct("home6",10.1,"13/12/2014",1,false,"dany", null));
        return lista;
    }
    
    public boolean createDir( String location, String name ){
        //return _fileService.createDir( location, name, _id );
        return true;
    }
    
    public int readVersion( String location, String file ){
        //return _fileService.readVersion( location, file, _id );
        return 0;
    }
}