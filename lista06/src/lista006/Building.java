package lista006;

public class Building implements CarbonFootprint{
	
	int numeroPessoas;
	boolean usoEnergiaRenov;
	int numeroLampadas;
	boolean usoArCond;
	
	public Building(int numeroPessoas, boolean usoEnergiaRenov, int numeroLampadas, boolean usoArCond) {
		super();
		this.numeroPessoas = numeroPessoas;
		this.usoEnergiaRenov = usoEnergiaRenov;
		this.numeroLampadas = numeroLampadas;
		this.usoArCond = usoArCond;
	}

	/**
	 * @return the numeroPessoas
	 */
	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	/**
	 * @param numeroPessoas the numeroPessoas to set
	 */
	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	/**
	 * @return the usoEnergiaRenov
	 */
	public boolean isUsoEnergiaRenov() {
		return usoEnergiaRenov;
	}

	/**
	 * @param usoEnergiaRenov the usoEnergiaRenov to set
	 */
	public void setUsoEnergiaRenov(boolean usoEnergiaRenov) {
		this.usoEnergiaRenov = usoEnergiaRenov;
	}

	/**
	 * @return the numeroLampadas
	 */
	public int getNumeroLampadas() {
		return numeroLampadas;
	}

	/**
	 * @param numeroLampadas the numeroLampadas to set
	 */
	public void setNumeroLampadas(int numeroLampadas) {
		this.numeroLampadas = numeroLampadas;
	}

	/**
	 * @return the usoArCond
	 */
	public boolean isUsoArCond() {
		return usoArCond;
	}

	/**
	 * @param usoArCond the usoArCond to set
	 */
	public void setUsoArCond(boolean usoArCond) {
		this.usoArCond = usoArCond;
	}

	@Override
	public float getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
