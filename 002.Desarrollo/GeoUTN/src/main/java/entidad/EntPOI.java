package entidad;

import interfaz.GeoPos;

public class EntPOI
{
	private GeoPos geoPos;
	private float latitud;	// sacar cuando este el impl de poi.
	private float longitud;	// sacar cuando este el impl de poi.
	
	private String descripcion;
	private String calle;
	private int nro;
	private String entreCalleIzquierda;
	private String entreCalleDerecha;
	private String departamento;
	private int piso;
	private String cp;
	private Object disponibilidades[] = null;/*	private col disponibilidades */
	private Object feriados[] = null;/*  private col feriados*/
	private String etiquetas[]=null; /*para la busqueda*/
	
	private String rubro;
	
	public EntPOI (int capacidadInicial)
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
