package entrada;
public class Main {

	public static void main(String[] args) {
		
		LogineSenhas loginEsenhas = new LogineSenhas();
				
		PaginaEntrada PEntrada = new PaginaEntrada(loginEsenhas.getLoginInfo());

	}
}