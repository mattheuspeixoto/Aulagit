
public class principal {

	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		aluno p2 = new aluno();
	    professor p3 = new professor();
	    Funcionario p4 = new Funcionario();
	   
	    p1.setNome("Pedro");
	    p2.setNome("Maria");
	    p3.setNome("Claudia");
	    p4.setNome("Fabiana");
	    
	    p1.setSexo("M");
	    p4.setSexo("F");
	    p2.setIdade(18);
	    p2.setCurso("Informatica");
	    p3.setSalario(2500.75f);
	    p4.setSetor("Estoque");
	    
	    
	    
	    System.out.println(p1.toString());
	    System.out.println(p2.toString());
	    System.out.println(p3.toString());
	    System.out.println(p4.toString());
       
	}

}
