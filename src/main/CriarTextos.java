package main;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CriarTextos extends UnicastRemoteObject implements ICriarTextos{
	
	public CriarTextos() throws RemoteException {
		//dummy text
	}
	
	public String saudacao(String nome, int hora) throws RemoteException{
		String ret = new String();
		if (hora >=0 && hora <=4) {
			ret = "Boa madrugada, " + nome + "!";
		}
		else if (hora >=5 && hora <=12) {
			ret = "Bom dia, " + nome + "!";
		}
		else if (hora >=13 && hora <=17) {
			ret = "Boa tarde, " + nome + "!";
		}
		else if (hora >=18 && hora <=23) {
			ret = "Boa noite, " + nome + "!";
		}
		else if (hora > 24) {
			ret = "Horário inválido!";
		}
		return ret;
	}
	
	public String perguntarTudoBem(String nome) throws RemoteException {
		return "Olá, " + nome + "! Tudo bem?";
	}
}
