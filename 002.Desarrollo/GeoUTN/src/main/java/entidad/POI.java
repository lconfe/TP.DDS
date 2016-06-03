package entidad;

import entidad.Posicion;

public class POI
{
	private Posicion Posicion;

	private String descripcion;
	private String calle;
	private int nro;
	private String entreCalleIzquierda;
	private String entreCalleDerecha;
	private String departamento;
	private int piso;
	private String cp;
	private float longitud;
	private Object disponibilidades[] = null;/*	private col disponibilidades */
	private Object feriados[] = null;/*  private col feriados*/
	private String etiquetas[]=null; /*para la busqueda*/
	
	private String rubro;
	
	public POI (int capacidadInicial)
	{
		disponibilidades = new Object[capacidadInicial];
		feriados = new Object[capacidadInicial];
	}

	
	public int  criterio()
	{
		/*la idea es que cada subclase lo utilice como criterio de distancia*/	
		return 1;
	}
	
	
	public Posicion(float latitud, float longitud)
	{
	    Latitud = latitud;
	    Longitud = longitud;
	}
	  
	public float Latitud { get; set; }
	public float Longitud { get; set; }
}
