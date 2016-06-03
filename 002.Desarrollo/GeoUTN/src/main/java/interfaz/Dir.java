package interfaz;

import entidad.Ent_Dir;

public interface Dir {
	/* Constructor */
    public Ent_Dir setDir(String unaCalle, int unNroDeCalle, String unCodPostal,
    	                  String unaCalleIzq, String unaCalleDer, String unDepto,
    	                  int unNroDePiso);
}