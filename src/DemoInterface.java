public class DemoInterface {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        //Depósitos em ambos tipos de contas
        cc.deposita(500.0);//Conta Corrente
        cp.deposita(500.0);//Conta Poupança
        //Saques em ambos tipos de contas
        cc.saca(150.0);//Conta Corrente
        cp.saca(100.0);//Conta Poupança

        GeradorDeExtratos extrato = new GeradorDeExtratos();
        extrato.geraExtrato(cc);//Conta Corrente
        extrato.geraExtrato(cp);//Conta Poupança

        //Porque apenas colocando a denominaçao de cada classe eu consigo utilizar o método Gera Extrato instanciado com
        //Conta c? Porque através da interface Conta eu implementei ambas as classes, assim me dando acesso em ambas.
    }
}