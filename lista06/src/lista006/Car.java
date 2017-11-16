package lista006;

public class Car implements CarbonFootprint{
	
	String combustivel;
	String modelo;
	
	public Car(String combustivel, String modelo) {
		super();
		this.combustivel = combustivel;
		this.modelo = modelo;
	}

	/**
	 * @return the combustivel
	 */
	public String getCombustivel() {
		return combustivel;
	}

	/**
	 * @param combustivel the combustivel to set
	 */
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public float getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
}
