/* Funcion Distancia: 
 * 	Recibe como parametro un POI y una Posicion
 * 	Retorna la distancia en CUADRAS entre ambos.
 * */
package funcion;

import entidad.Ent_GeoPos;
import entidad.Ent_POI;

import java.lang.Math;

public class disEnCuadras
{
	private static double aRad(float unaDisGeo) {
		return (Math.PI / 180) * unaDisGeo;
	}
	
	private static double aMts(double valEnKm)
	{
		return valEnKm/1000;
	}

	public static int main(Ent_POI unPOI, Ent_GeoPos unaPosicion)
	{
		double radT = 6378.137; //Radio de la tierra en KM.		
		double dLat = aRad(unPOI.getLatitud() - unaPosicion.getLatitud());
		double dLon = aRad(unPOI.getLongitud() - unaPosicion.getLongitud());
		
		double a = Math.sin(dLat/2) * Math.sin(dLat/2)
				 + Math.cos(aRad(unPOI.getLatitud()))
				 * Math.cos(aRad(unaPosicion.getLatitud())) 
				 * Math.sin(dLon/2) * Math.sin(dLon/2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		
		double valEnKm = radT * c;
		int  valEnCuad = (int) aMts(valEnKm)/100;

		return valEnCuad;
	}
}