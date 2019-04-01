package h2;

public class bolsista extends aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: "+this.getNome());
	}
	
	public void PagarMensalidade() {
		System.out.println("pagando mensalidade de aluno bolsista"+  this.getNome());
			}
		
	}


