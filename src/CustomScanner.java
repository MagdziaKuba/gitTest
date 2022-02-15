import java.util.Scanner;

public class CustomScanner {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba= scanner.nextInt();
        int result=liczba+liczba;
        System.out.println("result: "+ result);






    }

}
