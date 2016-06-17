package temporal;

public class Disponibilidad
{
	private Object temporadas[] = null; /*col de temporadas*/
	private Object feriados[] = null; /*col de feriados*/
	
	public Object[] getTemporadas()
	{
		return temporadas;
	}
	public void setTemporadas(Temporada temporadas[])
	{
		this.temporadas = temporadas;
	}
	public Object[] getFeriados()
	{
		return feriados;
	}
	public void setFeriados(Feriado feriados[])
	{
		this.feriados = feriados;
	}
	
}
