package Main;

import javax.swing.JOptionPane;

import Function.File;

public class Run {

	public static void main(String[] Args) throws Exception {

		try {
			String imputDirectory = JOptionPane.showInputDialog(null, "Digite o Diretório de Entrada: ","Nutror - Preencha as Informações Necessárias", JOptionPane.QUESTION_MESSAGE);
			String outputDirectory = JOptionPane.showInputDialog(null, "Digite o Diretório de Saida com o / no final: ", "Nutror - Preencha as Informações Necessárias", JOptionPane.QUESTION_MESSAGE);
			double productValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu Produto para o LTV: ", "Nutror - Preencha as Informações Necessárias", JOptionPane.QUESTION_MESSAGE));
			new File().readFile(imputDirectory, productValue, outputDirectory);
			JOptionPane.showMessageDialog(null, "Log processado com sucesso!");
		} catch (Exception ExceptionError) {
			JOptionPane.showMessageDialog(null, "Log processado com sucesso!");
		}

	}

}
