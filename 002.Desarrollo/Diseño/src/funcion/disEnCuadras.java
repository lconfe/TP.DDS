/* Funcion Distancia: 
 * 	Recibe como parametro un POI y una Posicion
 * 	Retorna la distancia en CUADRAS entre ambos.
 * */
package funcion;

import entidad.POI;
import entidad.Posicion;

import java.lang.Math;

public class disEnCuadras
{
	private static int EnKM(float valor)
	{
		double valEnKm = (Math.PI / 180) * valor;
		return (int) valEnKm;
	}
	
	private static int EnMts(float valor)
	{
		int valEnKm = EnKM(valor);
		return valEnKm/1000;
	}

	public static int main(POI unPoi, Posicion unaPosicion)
	{
		
		int x = Math.abs(EnMts(unPoi.Latitud) - EnMts(unaPosicion.getLatitud()));
		int y = Math.abs(EnMts(unPoi.Longitud)- EnMts(unaPosicion.getLongitud()));
		return (x+y)/100;
	}

}