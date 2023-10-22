package co.edu.upb.ProjectoAnimales;

public class MamiferoAcuatico extends Animal {
	private int minutosContieneRespiracion;

	public MamiferoAcuatico(String nombreEspecie) {
		super(nombreEspecie);
	}

	public int getMinutosContieneRespiracion() {
		return minutosContieneRespiracion;
	}

	public void setMinutosContieneRespiracion(int minutosContieneRespiracion) {
		this.minutosContieneRespiracion = minutosContieneRespiracion;
	}
	
	public String getOnomatopeya() {
		return "glu glu glu";
	}
	
}
