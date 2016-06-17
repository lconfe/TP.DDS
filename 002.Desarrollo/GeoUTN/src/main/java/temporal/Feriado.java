package temporal;

public class Feriado
{
	private Fecha fecha = null;
	
	public Feriado(int d, int m, int a)
	{
		setFecha(new Fecha(d,m,a));
	}

	public Fecha getFecha()
	{
		return fecha;
	}

	public void setFecha(Fecha fecha)
	{
		this.fecha = fecha;
	}
}
