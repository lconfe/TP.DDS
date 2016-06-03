package impl;

import entidad.Ent_Dir;
import interfaz.Dir;

public class Impl_Dir implements Dir {
	private Ent_Dir _Dir;
	
    public void setDir(String unaCalle, int unNroDeCalle, String unCodPostal,
    					 String unaCalleIzq, String unaCalleDer, String unDepto,
    					 int unNroDePiso){
    	_Dir.setCalle(unaCalle);
    	_Dir.setCalleNro(unNroDeCalle);
    	_Dir.setCodPostal(unCodPostal);
    	_Dir.setEntreCalleIzq(unaCalleIzq);
    	_Dir.setEntreCalleDer(unaCalleDer);
    	_Dir.setDepto(unDepto);
    	_Dir.setDeptoPiso(unNroDePiso);
    };


}