package entidad;

import entidad.Ent_GeoPos;
import entidad.Ent_Dir;

public class Ent_POI
{
	public Ent_Dir    dir;
	public Ent_GeoPos geoPos;

/*Falta revisar lo que sigue*/
	private String descripcion;

	private Object disponibilidades[] = null;/*	private col disponibilidades */
	private Object feriados[] = null;/*  private col feriados*/
	private String etiquetas[]=null; /*para la busqueda*/
	
	private String rubro;
	
	public Ent_POI (int capacidadInicial)
	{
		disponibilidades = new Object[capacidadInicial];
		feriados = new Object[capacidadInicial];
	}

	
	public int  criterio()
	{
		/*la idea es que cada subclase lo utilice como criterio de distancia*/	
		return 1;
	}

    /* Definición de Getters y Setters */	
	
	/* Estructura Dirección */
    public Ent_Dir getDir(){
    	return dir;
    }
    public String getCalle(){
    	return dir.getCalle();
    };
    public int getCalleNro(){
    	return dir.getCalleNro();
    };
    public String getCodPostal(){
    	return dir.getCodPostal();
    };
    public String getEntreCalleIzq(){
    	return dir.getEntreCalleIzq();
    };
    public String getEntreCalleDer(){
    	return dir.getEntreCalleDer();
    };
    public String getDepto(){
    	return dir.getDepto();
    };
    public int getDeptoPiso(){
    	return dir.getDeptoPiso();
    };

	/* Estructura GeoPosición */
    public Ent_GeoPos getGeoPos(){
    	return geoPos;
    }	
    public float getLatitud(){
    	return geoPos.getLatitud();
    }
    public float getLongitud(){
    	return geoPos.getLongitud();
    }
}