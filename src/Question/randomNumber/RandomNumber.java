package Question.randomNumber;

//0 ile 1000 arasında random bir say yaradaraq
// bu sayın reqemleri cemini veren java algoritma kodunu yazın

public class RandomNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*(1000));
        System.out.println(randomNumber);

        int birlik = randomNumber % 10;

        randomNumber = randomNumber/10;

        int onluq = randomNumber%10;

        int yuzluk = randomNumber/10;

        System.out.println("Toplam : "+(birlik+onluq+yuzluk));
    }
}
