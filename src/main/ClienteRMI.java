package main;

import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) throws Exception{
        String endereco = "rmi://localhost:2311/CriarTexto";
        ICriarTextos ct = (ICriarTextos) Naming.lookup(endereco);
        
        System.out.println(ct.saudacao("Ibra", 13));
        System.out.println(ct.saudacao("Lázaro", 19));
        System.out.println(ct.saudacao("Lucas", 3));

        System.out.println(ct.perguntarTudoBem("Allan"));
    }
}
