package com.teachersdunet.javaintermediaire;

import javax.swing.JOptionPane;

public class BoiteDialogueTest {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Name ? ");
		JOptionPane.showMessageDialog(null, "hello "+nom);
	}

}
