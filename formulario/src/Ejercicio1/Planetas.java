package Ejercicio1;
/**
 * 
 * @author Esperanza Rodríguez Martínez
 *
 */
public class Planetas {
	
	private double masa;
	private double densidad;
	private double diametro;
	private String distanciaSol;
	private int identificador;
	private String nombre;
	
	static final double g = 6.67408*Math.pow(10,-11);
	
	/**
	 * Pojo Planetas
	 */
	public Planetas() {

	}
	
	public Planetas(double masa, double densidad, double diametro, String distanciaSol, int identificador, String nombre) {
		this.masa = masa;
		this.densidad = densidad;
		this.diametro = diametro;
		this.distanciaSol = distanciaSol;
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public double getDensidad() {
		return densidad;
	}
	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getDistancia() {
		return distanciaSol;
	}

	public void setDistancia(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double  atraccion_Gravitatoria(double m1,double m2,double d) {
		double f;
		
		f=(g*m1*m2)/Math.pow(d,2);
		
		return f;
	}

}
