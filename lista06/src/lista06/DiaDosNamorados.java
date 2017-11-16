package lista06;

public class DiaDosNamorados extends CartaoWeb{

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}
	public String retornarMensagem(String remetente) {
		String mensagem = "Feliz dias do namorados, " + this.destinatario
				+ "!\nTe amo muito e quero estar sempre contigo!\n"
				+ "Com amor, " + remetente + ".";
		return mensagem;
	}
}
