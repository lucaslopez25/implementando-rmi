package main;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
	public static void main(String[] args) {
		try {
			ICriarTextos criatexto = new CriarTextos();
			String acesso = "rmi://localhost/CriarTexto";
			LocateRegistry.createRegistry(2311);
			Naming.rebind(acesso, criatexto);
			System.out.println("Servidor aguardando contato...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
