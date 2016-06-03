package impl;

import entidad.EntGeoPos;
import interfaz.GeoPos;

public class ImplGeoPos implements GeoPos
{
	private EntGeoPos _GeoPos;
	
    public float getLatitud()
    {
    	return _GeoPos.latitud;
    }
    
    public void setLatitud(float latitud)
    {
    	_GeoPos.latitud = latitud;
    }

    public float getLongitud()
    {
    	return _GeoPos.longitud;
    }
    public void setLongitud(float longitud)
    {
    	_GeoPos.longitud = longitud;
    }
}