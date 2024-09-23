package punto3.main;

import punto3.model.Provincia;
import punto3.util.region;
	
public class main {
	public static void main(String[] args) {
		Provincia[] provincias = new Provincia[10];
		
		provincias[1] = new Provincia("P1", "Buenos Aires", region.CENTRO, 17400, 30757, true);
        provincias[2] = new Provincia("P2", "Córdoba", region.CENTRO, 37604, 16532, true);
        provincias[3] = new Provincia("P3", "Santa Fe", region.CENTRO, 34000, 13300, true);
        provincias[4] = new Provincia("P4", "Mendoza", region.CUYO, 20000, 14882, true);
        provincias[5] = new Provincia("P5", "Tucumán", region.NOA, 18000, 22524, true);
        provincias[6] = new Provincia("P6", "Jujuy", region.NOA, 7700, 53219, false);
        provincias[7] = new Provincia("P7", "Chaco", region.NEA, 12000, 99633, false);
        provincias[8] = new Provincia("P8", "San Juan", region.CUYO, 73800, 89651, false);
        provincias[9] = new Provincia("P9", "Río Negro", region.PATAGONIA, 75000, 20303, false);
        provincias[10] = new Provincia("P10", "Formosa", region.NEA, 61000, 72066, false);

        System.out.println("Provincias con estado true:");
        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println(provincia);
            }
        }
    }
}


				 
				 	