
public class Disponibilidad
{
	private Object horarios[] = null; /*col horarios*/
	private Object dias[] = null;/*col de dias*/
	private String temporada ; 
	public Disponibilidad(int capacidadInicial)
	{
		horarios = new Object[capacidadInicial];
		dias = new Object[capacidadInicial];
	}
}
