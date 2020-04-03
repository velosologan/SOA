package br.upis;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {

	private static RMIInterface reference;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		
		reference = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String txt = JOptionPane.showInputDialog("What is your name?");
			
		String response = reference.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);

	}

}