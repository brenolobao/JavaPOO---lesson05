

package com.mycompany.aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Cabeça de Porronca");
        c1.abrirConta("CC");
        c1.depositar(300);
        c1.pagarMensal();
        c1.sacar(25);
        c1.status();
    }
}
