package Question.tekEdedler;

//1’den 100’e kadar tek sayıları yazdıran algoritma

public class TekEdedler {
    public static void main(String[] args) {
        int sayi;

        for (sayi = 0; sayi < 100; sayi++)
        {
            if(sayi%2==1)
                System.out.println("Değer = " + sayi);
        }
    }
}
