package impl;

import entidad.Ent_GeoPos;
import interfaz.GeoPos;

public class Impl_GeoPos implements GeoPos {
	private Ent_GeoPos _GeoPos;
	
    public void setGeoPos(float unaLatitud, float unaLongitud){
    	_GeoPos.setLatitud(unaLatitud);
    	_GeoPos.setLongitud(unaLongitud);
    };
}