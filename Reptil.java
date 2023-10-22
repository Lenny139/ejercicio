package co.edu.upb.ProjectoAnimales;

public class Reptil extends Animal{
	private TipoReptil tipoReptil;
	
	public Reptil(String nombreEspecie) {
		super(nombreEspecie);
	}
	public Reptil(String nombreEspecie, TipoReptil tipoReptil) {
		super(nombreEspecie);
		this.tipoReptil = tipoReptil;
	}
	public TipoReptil getTipoReptil() {
		return tipoReptil;
	}
	public void setTipoReptil(TipoReptil tipoReptil) {
		this.tipoReptil = tipoReptil;
	}
	
	public String getOnomatopeya() {
		return "shhh shhhh shhhh";
	}
	
}
