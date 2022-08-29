public class ControleBonificação {

    private double soma;


    public void registra(Worker f){
        double bonus = f.getBonus();
        this.soma += bonus;

    }


    public double getSoma(){
        return this.soma;
    }
}
