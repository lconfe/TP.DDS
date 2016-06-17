package temporal;

public class Temporada
{
	private int orden; /*orden de la temporada en el año*/
	private Fecha fechaDesde;
	private Fecha fechaHasta;
	private Object horarios[] = null; /*col de horarios*/

	public Temporada(int o, Fecha fD, Fecha fH)
	{
		setOrden(o);
		setFechaDesde(fD);
		setFechaHasta(fH);
	}
	
		public Object[] getHorarios()
	{
		return horarios;
	}

	public void setHorarios(Object horarios[])
	{
		this.horarios = horarios;
	}

	public int getOrden()
	{
		return orden;
	}

	public void setOrden(int orden)
	{
		this.orden = orden;
	}

	public Fecha getFechaDesde()
	{
		return fechaDesde;
	}

	public void setFechaDesde(Fecha fechaDesde)
	{
		this.fechaDesde = fechaDesde;
	}
	
	public Fecha getFechaHasta()
	{
		return fechaHasta;
	}

	public void setFechaHasta(Fecha fechaHasta)
	{
		this.fechaHasta = fechaHasta;
	}

}
