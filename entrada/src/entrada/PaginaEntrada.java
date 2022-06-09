package entrada;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class PaginaEntrada implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton BotaoLogin = new JButton("Login");
	JButton BotaoResetar = new JButton("Limpar");
	JTextField CampoID = new JTextField();
	JPasswordField CampoSenha = new JPasswordField();
	JLabel CampoIDtag = new JLabel("ID:");
	JLabel CampoSenhatag = new JLabel("senha:");
	JLabel mensagem = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	PaginaEntrada(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		CampoIDtag.setBounds(330,100,75,25);
		CampoSenhatag.setBounds(300,150,75,25);
		
		mensagem.setBounds(250,300,500,100);
		mensagem.setFont(new Font(null,Font.BOLD,25));
		
		CampoID.setBounds(380,100,200,25);
		CampoSenha.setBounds(380,150,200,25);
		
		BotaoLogin.setBounds(380,200,200,25);
		BotaoLogin.setFocusable(false);
		BotaoLogin.addActionListener(this);
		
		BotaoResetar.setBounds(380,230,200,25);
		BotaoResetar.setFocusable(false);
		BotaoResetar.addActionListener(this);
		
		frame.add(CampoIDtag);
		frame.add(CampoSenhatag);
		frame.add(mensagem);
		frame.add(CampoID);
		frame.add(CampoSenha);
		frame.add(BotaoLogin);
		frame.add(BotaoResetar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==BotaoResetar) {
			CampoID.setText("");
			CampoSenha.setText("");
		}
		
		if(e.getSource()==BotaoLogin) {
			
			String login = CampoID.getText();
			String senha = String.valueOf(CampoSenha.getPassword());
			
			if(logininfo.containsKey(login)) {
				if(logininfo.get(login).equals(senha)) {
					mensagem.setForeground(Color.green);
					mensagem.setText("fazendo login");
					frame.dispose();
					BoasVindas boasvindas = new BoasVindas(login);
				} else {
					mensagem.setForeground(Color.red);
					mensagem.setText("senha incorreta! tente novamente");
				}

			} else {
				mensagem.setForeground(Color.red);
				mensagem.setText("usuário não encontrado");
			}
		}
	}	
}