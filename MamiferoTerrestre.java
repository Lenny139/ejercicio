package co.edu.upb.ProjectoAnimales;

public class MamiferoTerrestre extends Animal{
	private TipoExtremidad tipoExtremidad;
	public MamiferoTerrestre(String nombreEspecie) {
	super(nombreEspecie);
	}
	public MamiferoTerrestre(String nombreEspecie, TipoExtremidad tipoExtremidad) {
		super(nombreEspecie);
		this.tipoExtremidad = tipoExtremidad;
		
	}
	public TipoExtremidad getTipoExtremidad() {
		return tipoExtremidad;
	}
	public void setTipoExtremidad(TipoExtremidad tipoExtremidad) {
		this.tipoExtremidad = tipoExtremidad;
	}
	public String getOnomatopeya() {
		return "meow meow";
	}
	public enum tipoExtremidad{
		PLANTIGRADO, DIGITIGRADO, UNGULADO
	}
}
