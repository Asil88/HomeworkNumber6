package task2;

public class Main {
    public static void main(String[] args) {
        Computer computer1 =new Computer(1800,"Samsung");
        Computer computer2 =new Computer(3200,"Asus",new HDD("Toshiba",1000,"iner"),new RAM("Corsair",16));

        computer1.showInfo(computer1.model);
        computer2.showInfo();

    }
}
