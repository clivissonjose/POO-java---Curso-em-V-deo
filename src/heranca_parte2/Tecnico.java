package heranca_parte2;

public class Tecnico extends Aluno{
	
	
	private int registroProfissional;
	
	public void praticar(){
		System.out.println("Sou técnico e estou praticando!");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

}
