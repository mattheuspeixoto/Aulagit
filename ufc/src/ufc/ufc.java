package ufc;

public class ufc {

	public static void main(String[] args) {
		Lutador l[] = new Lutador [6];		
		l[0] = new Lutador("pretty boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("putscript", "brazil", 29, 1.65f, 57.8f, 14, 2, 3);
	//	l[0].status();
		
		luta ufc = new luta();
		ufc.marcarLuta(l[0], l[1]);
		ufc.lutar();
			
		
	}

}
