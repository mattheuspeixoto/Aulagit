
public class aluno extends pessoa {
  
	private int mat;
	private String curso;
	
	public void cancelarMatric() {
		System.out.println("Matricula Sera Cancelada");
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
