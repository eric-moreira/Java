package bytebank.conta;

public class ContaCorrente extends Account{
    public ContaCorrente(int agency, int number){
        super(agency, number);
    }

    @Override
    public boolean withdraw(double amount) {
        double valorASacar = amount + 0.2;
        return super.withdraw(valorASacar);
    }
}
