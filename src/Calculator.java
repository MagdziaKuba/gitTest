import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = scanner.nextInt();
        int dodawanie, odejmowanie,mnozenie ,dzielenie, modulo;
        dodawanie=pierwszaLiczba+drugaLiczba;
        odejmowanie=pierwszaLiczba-drugaLiczba;
        mnozenie=pierwszaLiczba*drugaLiczba;

        if(drugaLiczba!=0){
            dzielenie=pierwszaLiczba / drugaLiczba;

        }else{
            dzielenie=0;
            System.out.println("niezdefiniowany wynik dzielenia");
        }

        if(drugaLiczba!=0){
            modulo=pierwszaLiczba % drugaLiczba;
        }else{
            modulo=0;
            System.out.println("niezdefiniowany wynik modulo");
        }

        System.out.println("Wynik dodawania: "+ dodawanie+ ", wynik odejmowania: "+ odejmowanie +"wynik mnozeniato:"+mnozenie+", wynik dzielenia to :"+ dzielenie+", wynik modulo to :"+modulo);


    }
}
