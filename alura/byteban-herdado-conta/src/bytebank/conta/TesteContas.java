package bytebank.conta;

public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposit(100);

        ContaPoupanca cp = new ContaPoupanca(112,112);
        cp.deposit(200);

        cc.transfer(cp,10);
        System.out.println("CC: " + cc.getBalance());
        System.out.println("CP: " + cp.getBalance());

    }

}
