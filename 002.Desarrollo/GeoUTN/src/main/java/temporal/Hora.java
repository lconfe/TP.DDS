package temporal;

public class Hora
{
	private int hora;
	private int minuto;
	
	public Hora(int h, int m)
	{
		setHora(h);
		setMinuto(m);
	}

	public int getHora()
	{
		return hora;
	}

	public void setHora(int hora)
	{
		this.hora = hora;
	}

	public int getMinuto()
	{
		return minuto;
	}

	public void setMinuto(int minuto)
	{
		this.minuto = minuto;
	}
	
	
}
