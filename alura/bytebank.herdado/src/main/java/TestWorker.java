public class  TestWorker {
    public static void main(String[] args) {
        /*
        Worker nico = new Worker();
        nico.setName("Nico Steppat");
        nico.setCpf("456.987.778-28");
        nico.setSalary(2000.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());
        */

        Manager manager = new Manager();
        manager.setSalary(5000);
        manager.setName("Marcos");

        Worker f = new Worker();
        f.setSalary(2000);

        EditorVideo ev = new EditorVideo();
        ev.setSalary(2500);

        //System.out.println(manager.getSalary());

        ControleBonificação controle = new ControleBonificação();
        controle.registra(manager);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

    }
}
