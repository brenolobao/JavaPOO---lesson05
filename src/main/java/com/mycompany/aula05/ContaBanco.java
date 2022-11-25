
package com.mycompany.aula05;

public class ContaBanco {
    // atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodos
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);     
        this.setStatus(true);
        
        if(tipo == "CC"){
            this.setSaldo(50);
        }else if(tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public  void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser cancelada pq ainda tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta n pode ser fechada pq tu ta devendo");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Deposito realizado na conta");
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente para sacar");
        }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
            System.out.println("impossivel pagar em uma conta fechada");
        }
    }
    
    public void status(){
        System.out.println("Numero da Conta: " + this.getNumConta() + 
                "\n Tipo da Conta: " + this.getTipo() + 
                "\n Titular da Conta: " + this.getDono() + 
                "\n Saldo da Conta: " + this.getSaldo() + 
                "\n Status da Conta: " + this.getStatus());
    }
    
    //metodos getters & setters

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // metodo construtor
    
    public void ContaBanco(float saldo) {
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    
    
    
    
}
