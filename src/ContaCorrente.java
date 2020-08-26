public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaPorOperação = 0.45;
    @Override
    public void deposita(double valor) {
        this.saldo += valor - this.taxaPorOperação;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor + this.taxaPorOperação;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
