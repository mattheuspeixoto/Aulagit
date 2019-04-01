package exception;

public class qtdPneusException extends Exception {
		private int qtdPneus;
		public qtdPneusException(int qtd) {
		qtdPneus = qtd;
		}
		public String getMessage(){
		return "A quantidade de pneus deve ser par."
		+ qtdPneus + " é impar";
		}
	
}
