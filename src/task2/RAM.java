package task2;

public class RAM {
    String name;
    int volume;

    public RAM(){}

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    void showInfo(){
        System.out.println("Оперативная память"+" названием "+name+" объемом "+volume);
    }
}
