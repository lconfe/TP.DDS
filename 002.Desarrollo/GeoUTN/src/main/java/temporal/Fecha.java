package temporal;

public class Fecha
{
	public int dia;
	public int mes;
	public int anio;
	public int anioActual;
	
	public Fecha(int d, int m, int a)
	{
	dia = d;
	mes = m;
	anio = a;
	}
	
	public Fecha(int d, int m)
	{
	dia = d;
	mes = m;
	anio = anioActual;
	}
	
	public Fecha(int a)
	{
	anioActual = a;	
	}
}