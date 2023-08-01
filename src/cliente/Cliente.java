package cliente;

public class Cliente {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Cliente (int numero, String agencia, String nomeCliente, double saldo)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

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

    public String toString()
    {
        return "Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo " + this.getSaldo() + " já está disponível para saque";
    }
}
