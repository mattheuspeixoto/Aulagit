package ufc;

public class Lutador {
	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String Categoria;
	private int vitorias, empates, derrotas;
	
	//Construtor	
		public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
			int vitorias, int empates, int derrotas) {
			this.nome = nome;
			this.nacionalidade = nacionalidade;
			this.idade = idade;
			this.altura = altura;
			this.setPeso(peso);
			this.vitorias = vitorias;
			this.empates = empates;
			this.derrotas = derrotas;
		}


// Metodos Publicos	
	public void apresentar() {
		System.out.println("-------------------------------");
		System.out.println("Chegou a hora!!! Apresentamos o lutador "+ this.getNome());
		System.out.println("Diretamente de  "+ this.getNacionalidade());
		System.out.println("Com  "+ this.getIdade() + " anos e " + this.getAltura()+ " de altura");
		System.out.println("Pesando "+ this.getPeso()+ " kg");
		System.out.println("Tendo "+ this.getVitorias() + " vitorias");
		System.out.println( this.getDerrotas() +" Derrotas e ");
		System.out.println(this.getEmpates() +" Empates");
	
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() +" vezes");
		System.out.println("Perdeu " + this.getDerrotas()+" vezes");
		System.out.println("Empatou " + this.getEmpates()+" vezes");
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}	
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}

		// Getters and Setters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return Categoria;
	}

	private void setCategoria() {
		if(this.peso <52.2) {
			this.Categoria = "invalido";
		}else if	(this.peso <= 70.3) {
			this.Categoria = "Leve";			
		}else if(this.peso <= 83.9) {
			this.Categoria = "Medio";
		}else if	(this.peso <= 120.2) {
			this.Categoria = "Pesado";
		}else 
			this.Categoria = "Invalido";
		
}	
	
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
}
