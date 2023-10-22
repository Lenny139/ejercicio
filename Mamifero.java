package co.edu.upb.ProjectoAnimales;

public abstract class Mamifero extends Animal{
	private String habitat;

	public Mamifero(String nombreEspecie) {
		super(nombreEspecie);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public abstract String getOnomatopeya();
	
}
