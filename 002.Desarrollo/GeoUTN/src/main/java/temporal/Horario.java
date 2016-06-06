package temporal;

public class Horario
{
	private int diaDeLaSemana;
	private Hora horaDesde;
	private Hora horaHasta;
	
	public Horario(int dia, int hd, int md, int hh, int mh)
	{
		diaDeLaSemana = dia;
		horaDesde = new Hora(hd,md);
		horaHasta = new Hora(hh,mh);
	}
	
	public int getDiaDeLaSemana()
	{
		return diaDeLaSemana;
	}
	public void setDiaDeLaSemana(int diaDeLaSemana)
	{
		this.diaDeLaSemana = diaDeLaSemana;
	}
	public Hora getHorarioDesde()
	{
		return horaDesde;
	}
	public void setHorarioDesde(Hora horarioDesde)
	{
		this.horaDesde = horarioDesde;
	}
	public Hora getHorarioHasta()
	{
		return horaHasta;
	}
	public void setHorarioHasta(Hora horarioHasta)
	{
		this.horaHasta = horarioHasta;
	}

}
