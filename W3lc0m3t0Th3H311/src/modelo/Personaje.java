package modelo;

public class Personaje {

	public final static String FARIÑEZ = "fariñez";
	public final static String CRISTIAN = "cristian";
	public final static String JAZMIN = "jazmin";
	public final static String SOSA = "sosa";
	public final static String CUARTAS = "cuartas";
	public final static String JACKER = "jacker";
	public final static String MIGUEL = "miguel";
	public final static String OMAR = "omar";
	public final static String BUSTAMANTE = "bustamante";

	private String nombre;
	private int speed;
	private int posX;
	private int posY;
	private Personaje siguente;

	public Personaje(String nombre, int speed, int posX, int posY) {

		this.nombre = nombre;
		this.speed = speed;
		this.posX = posX;
		this.posY = posY;
		this.siguente = null;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX
	 *            the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY
	 *            the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int moveHorizontal() {

		setPosX(posX + speed);

		return posX;

	}

	public void resetX() {

		posX = -100;

	}

	public Personaje getSiguente() {
		return siguente;
	}

	public void setSiguente(Personaje siguente) {
		this.siguente = siguente;
	}

}
