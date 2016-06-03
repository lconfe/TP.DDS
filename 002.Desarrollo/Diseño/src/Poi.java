public class Poi
{
	private String descripcion;
	private String calle;
	private int nro;
	private String entreCalleIzquierda;
	private String entreCalleDerecha;
	private String departamento;
	private int piso;
	private String cp;
	private int latitud;
	private int longitud;
	private Object disponibilidades[] = null;/*	private col disponibilidades */
	private Object feriados[] = null;/*  private col feriados*/
	private String etiquetas[]=null; /*para la busqueda*/
	
	private String rubro;
	
	public Poi (int capacidadInicial)
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
