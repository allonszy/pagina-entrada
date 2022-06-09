package entrada;
import java.awt.*;
import javax.swing.*;

public class BoasVindas {

	JFrame frame = new JFrame();
	JLabel boasvindas = new JLabel("");
	
	BoasVindas(String userID){
		
		boasvindas.setBounds(160,225,900,50);
		boasvindas.setFont(new Font(null,Font.PLAIN,25));
		boasvindas.setText("Entrada registrada - Seja Bem-Vindo(a), "+userID);
		
		frame.add(boasvindas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}