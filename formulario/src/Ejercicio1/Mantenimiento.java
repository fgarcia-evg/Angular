package Ejercicio1;

import java.util.Scanner;
/**
 * 
 * @author Esperanza Rodríguez Martínez
 *
 */
public class Mantenimiento {

	Scanner teclado = new Scanner(System.in);
	Planetas planeta;
	double mc1,mc2;
	int op,dis;
	/**
	 * Mantenimiento del ejercicio
	 */
	public Mantenimiento() {
		planeta = new Planetas(17.15,1.64,49.244,"4.504.300.000",8,"Neptuno");	//Ejemplo de introdución de datos
 
		System.out.println("\nCalculo de la atracción gravitatoria entre dos cuerpos\n");
		op=lista();
		mc1=planetas(op);
		op=lista();
		mc2=planetas(op);
		System.out.println("\nIntroduce distancia entre los planetas: ");
		dis=teclado.nextInt();
		System.out.println("\nLa atracción gravitatoria entre los dos plantas es: "+planeta.atraccion_Gravitatoria(mc1, mc2, dis));
	}
	public int lista() {
		
		int op = 0;
		do {
			System.out.println("\n1)Mercurio\n2)Venus\n3)Tierra\n4)Marte\n5)Jupiter\n6)Saturno\n7)Urano\n8)Neptuno");
			op=teclado.nextInt();
		}while(op<1 || op>8);

		return op;
	}
	public double planetas(int p) {
		
		double m = 0;
		
		switch (p)
		{
			case 1:
				m=0.055 ;
			break;
			case 2:
				m=0.815 ;
			break;
			case 3:
				m=5.9722*Math.pow(10,24);
			break;
			case 4: 
				m=0.107;
			break;
			case 5: 
				m=317.8;
			break;
			case 6: 
				m=95.16;
			break;
			case 7: 
				m=14.54;
			break;
			case 8:
				m=17.15;
			break;
		}
		
		return m;
	}
}
