package task2;

public class Computer {
    int value;
    String model;
    HDD hdd;
    RAM ram;

    public Computer(){}

    public Computer(int value,String model){
        this.value=value;
        this.model=model;
    }

    public Computer(int value,String model,HDD hdd,RAM ram){
        this(value,model);
        this.hdd=hdd;
        this.ram=ram;
    }
    void showInfo(String model){
        System.out.println("Компьютер модели "+this.model+" ценой "+this.value+".");
    }
    void showInfo(){
        System.out.println("Компьютер модели "+model+" ценой "+value+". Жесткий диск "+hdd.name+" типа "+hdd.type+" объемом "+hdd.volume +"Гб.Память "+ram.name+" объемом "+ram.volume+" Гб.");
    }





}
