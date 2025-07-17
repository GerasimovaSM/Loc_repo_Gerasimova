import java.util.*;

class Телевизор {

    private String модель;
    private int диагональ;
    private int цена;

        public Телевизор(String модель, int диагональ, int цена) {
        this.модель = модель;
        this.диагональ = диагональ;
        this.цена = цена;
    }

        public String getМодель() {
        return модель;
    }

    public int getДиагональ() {
        return диагональ;
    }

    public int getЦена() {
        return цена;
    }

     public void ВыводИнфы() {
        System.out.println("Модель: " + модель + ", Диагональ: " + диагональ + " дюймов, Цена: " + цена + " руб.");
    }
}

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        Телевизор телевизор1 = new Телевизор("Samsung", random.nextInt(30)+6, random.nextInt(50000)+10000);
        Телевизор телевизор2 = new Телевизор("LG", random.nextInt(30) + 6, random.nextInt(50000) + 10000);
        Телевизор телевизор3 = new Телевизор("Sony", random.nextInt(30) + 6, random.nextInt(50000) + 10000);

        телевизор1.ВыводИнфы();
        телевизор2.ВыводИнфы();
        телевизор3.ВыводИнфы();
    }
}