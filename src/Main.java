import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilen Sayi : ");
        int sayi = scanner.nextInt();


        int minYakin = list[0];
        int maxYakin = list[0];

        for(int i : list){
            if(sayi < minYakin){
                minYakin = i;
            }
            if(sayi > maxYakin){
                maxYakin = i;
            }
        }

        System.out.println("Minimum Değer " + minYakin);
        System.out.println("Maximum Değer " + maxYakin);

    }
}