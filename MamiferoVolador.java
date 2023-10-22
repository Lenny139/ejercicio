package co.edu.upb.ProjectoAnimales;

public class MamiferoVolador extends Animal{
	private boolean alas;
	
	public MamiferoVolador(String nombreEspecie) {
		super(nombreEspecie);
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	
	public String getOnomatopeya() {
		return "ko ko ko ko";
	}
	
}
