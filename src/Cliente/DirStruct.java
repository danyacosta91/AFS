/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class DirStruct{
    private String _name;
    private double _size;
    private String _cDate;
    private int _version;
    private boolean _dir;
    private String _cUser;
    private ArrayList<DirStruct> _subDirs;

    public DirStruct(String _name, double _size, String _cDate, int _version, boolean _dir, String _cUser, ArrayList<DirStruct> subDirs) {
        this._name = _name;
        this._size = _size;
        this._cDate = _cDate;
        this._version = _version;
        this._dir = _dir;
        this._cUser = _cUser;
        this._subDirs = subDirs;
    }

    public String getName(){
    	return this._name;
    }

    public double getSize(){
    	return this._size;
    }

    public String getCDate(){
    	return this._cDate;
    }

    public int getVersion(){
    	return this._version;
    }

    public boolean isDir(){
    	return this._dir;
    }

    public String getCUser(){
    	return this._cUser;
    }

    public void setName(String name){
    	this._name = name;
    }

    public void setSize(double size){
    	this._size = size;
    }

    public void setCDate(String date){
    	this._cDate = date;
    }

    public void setVersion(int version){
    	this._version = version;
    }

    public void setDir(boolean dir){
    	this._dir = dir;
    }

    public void setCUser(String user){
    	this._cUser = user;
    }

    @Override
    public String toString() {
        return "DirStruct{" + "_name=" + _name + ", _size=" + _size + ", _cDate=" + _cDate + ", _version=" + _version + ", _dir=" + _dir + ", _cUser=" + _cUser + '}';
    }

    public ArrayList<DirStruct> getSubDirs() {
        return _subDirs;
    }

    public void setSubDirs(ArrayList<DirStruct> _subDirs) {
        this._subDirs = _subDirs;
    }
}
