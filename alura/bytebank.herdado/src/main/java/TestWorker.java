public class TestWorker {
    public static void main(String[] args) {

        Worker nico = new Worker();
        nico.setName("Nico Steppat");
        nico.setCpf("456.987.778-28");
        nico.setSalary(2000.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());


        Manager manager = new Manager();
        manager.setSalary(5000);
        manager.setPassword("4567");

        System.out.println(manager.getSalary());
        System.out.println(manager.getPassword());

    }
}
