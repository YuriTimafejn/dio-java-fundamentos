package cliente;

public class Cliente {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Cliente () {}

    public String getNumero ()
    {
        return String.format("%d", this.numero);
    }

    public String getAgencia() 
    { 
        return this.agencia; 
    }

    public String getNomeCliente () 
    {
        return this.nomeCliente;
    }

    public String getSaldo ()
    {
        return String.format("%4.2f", this.saldo);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString()
    {
        return "Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo " + this.getSaldo() + " já está disponível para saque";
    }
}
