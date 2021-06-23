package Ejercicio2;
/**
 * 
 * @author Esperanza Rodríguez Martínez
 *
 */
public class Alumnos {
	
	private int op;
	private String cursos[][];
	private String bdni;
	private int b;
	/**
	 * Pojo Alumnos
	 */
	public Alumnos(){
		cursos=new String[40][4];
		b=0;
	}
		
	public Alumnos(int op, String[][] cursos, String bdni, int b) {
		super();
		this.op = op;
		this.cursos = cursos;
		this.bdni = bdni;
		this.b = b;
	}

	public void setvalor(String valor,int i ,int j) {
		cursos[i][j]=valor;
		
	}
	public String getvalor(int i ,int j) {
		return cursos[i][j];
		
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public String[][] getCursos() {
		return cursos;
	}

	public void setCursos(String[][] cursos) {
		this.cursos = cursos;
	}

	public String getBdni() {
		return bdni;
	}

	public void setBdni(String bdni) {
		this.bdni = bdni;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
