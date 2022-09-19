package task2;

public class HDD {
   String name;
   int volume;
   String type;

   public HDD(){};

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    void showInfo(){
        System.out.println("Жесткий диск  "+type+" названием "+name+" объемом "+volume);
    }
}
