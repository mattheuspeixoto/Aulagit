package exception;

public class carro {

private int qtdPneus;
public carro(int qtdPneus) throws qtdPneusException{
if(qtdPneus % 2 != 0)
throw new qtdPneusException(qtdPneus);
//this.qtdPneus = qtdPneus;
}
public static void main(String[] args) throws qtdPneusException {

	
carro carro = new carro(3);
}
}