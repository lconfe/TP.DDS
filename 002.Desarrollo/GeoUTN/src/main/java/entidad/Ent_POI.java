package entidad;

import interfaz.GeoPos;
import interfaz.Dir;


public class Ent_POI
{
	private Dir dir;
	private GeoPos geoPos;

	/* Lo que sigue sacarlo cuando se haga el impl de POI*/
	private float latitud;
	private float longitud;
	private String calle;
	private int nro;
	private String entreCalleIzquierda;
	private String entreCalleDerecha;
	private String departamento;
	private int piso;
	private String cp;
	/*-------*/
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
}