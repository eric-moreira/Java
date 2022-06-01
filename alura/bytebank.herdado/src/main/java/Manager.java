public class Manager extends Worker{
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autentica (String password){
        if (this.password == password){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonus() {

        return super.getBonus() + super.salary;
    }
}
