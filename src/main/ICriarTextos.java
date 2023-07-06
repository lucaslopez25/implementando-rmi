package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICriarTextos extends Remote{
	
	String saudacao(String nome, int hora) throws RemoteException;
	String perguntarTudoBem(String nome) throws RemoteException;
	
}
