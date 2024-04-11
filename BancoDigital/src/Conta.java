public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, int numero, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Titular: " + cliente.getNome()));
        sb.append(String.format("%nAgência: %d%n", this.agencia));
        sb.append(String.format("Número: %d%n", this.numero));
        sb.append(String.format("Saldo: %.2f", this.saldo));

        System.out.println(sb);
    }
}
