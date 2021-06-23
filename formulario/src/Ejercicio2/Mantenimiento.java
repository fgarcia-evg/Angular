package Ejercicio2;

import java.util.Scanner;
/**
 * 
 * @author Esperanza Rodríguez Martínez
 *
 */
public class Mantenimiento {
	
	Scanner teclado = new Scanner(System.in);
	Alumnos Alumno = new Alumnos();
	/**
	 * Mantenimiento del ejercicio
	 */
	public Mantenimiento() {
		
		System.out.println("\nGESTION DE ALUMNOS");
		menu();
		
	}
	/**
	 * Menu del ejercicio 
	 */
	public void menu() {
		
		Alumno.setOp(elegir_op());
		
		switch (Alumno.getOp())
		{
			case 1:
				matricular();
			break;
			case 2:
				buscar();
			break;
			case 3:
				borrar();
			break;
			case 4: 
				ver();
			break;
		}
		System.out.print ("\n");
		menu();
	}
	/**
	 * Función para elegir opción del menu
	 * @return
	 */
	public int elegir_op() {
			
		int op = 0;
		do {
			System.out.println("\n1)Matricular\n2)Buscar\n3)Borrar\n4)Ver todos los alumnos de un curso");
			op=teclado.nextInt();
		}while(op<1 || op>4);

		return op;
		
	}
	/**
	 * Función para matricular a los alumnos
	 */
	public void matricular() {
		
		char p='s';
		teclado.nextLine();
		for (int i=0;i<40 && p=='s';i++) {
			for (int j=0;j<4;j++){
				System.out.print("Alumno "+i+"Dato "+j+": ");
				Alumno.setvalor(teclado.nextLine(), i, j);
			}
			do {
				System.out.println("\nDesea introducir otro alumno?(s/n) ");
				p=Character.toLowerCase(teclado.next().charAt(0));
			}while(p!='s' && p!='n');
			teclado.nextLine();
		
		}
	}
	/**
	 * Función para buscar a los alumnos por su DNI
	 */
	public void buscar() {
	
		int sw=0;
		
		teclado.nextLine();	
		System.out.println("\nIntroduce DNI: ");
		Alumno.setBdni(teclado.nextLine().toUpperCase());
		for (int i=0;i<40 && sw==0;i++){	
		    if(Alumno.getvalor(i, 3).equals(Alumno.getBdni())) {
		    	Alumno.setB(i);
		    	sw=1;
		    }else {
		    	sw=2;
		    }
		}
	    if(sw == 2) {
	    	System.out.println("\nEl alumno no está matriculado");
	    }
		for (int j=0;j<4 && sw==1;j++) {
			System.out.print("\t"+Alumno.getvalor(Alumno.getB(), j));
		}
	}
	/**
	 * Función para borrar al alumno anteriormente buscado por su DNI
	 */
	public void borrar() {
		
		char o;
		buscar();

		do {
			System.out.println("\n\nDesea borrarlo? (s/n)");
			o=Character.toLowerCase(teclado.next().charAt(0));
		}while(o!='s' && o!='n');
		
		if(o=='s') {
			for (int j=0;j<4;j++) {
				Alumno.setvalor(null, Alumno.getB(), j);
			}
			 System.out.println("\nAlumno borrado");
		}
	}
	/**
	 * Función para ver los alumnos matriculados
	 */
	public void ver() {
				
		for (int i=0;i<40;i++){	
			if(Alumno.getvalor(i, 0)!=null) {
				System.out.println ("\n");	
				for (int j=0;j<4;j++) {
					System.out.print("\t"+Alumno.getvalor(i, j));
				}
			}
		}
		System.out.println ("\n");	
	}
}
