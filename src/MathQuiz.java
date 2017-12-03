import java.util.Scanner;

public class MathQuiz {

    Scanner scanner = new Scanner(System.in);
    Points points = new Points();

    public boolean question1(){
        double odp;
        System.out.println("Jaki jest wynik mnożenia 3 * 5 ?");
        odp = scanner.nextDouble();
        if(odp == 15) {
            points.setPointsQuestion1(1);
            return true;
        } else
            return false;
    }

    public boolean question2(){
        System.out.println("Jakie jest pole kwadratu o boku 12 ?");
        double
        odp = scanner.nextDouble();
        if(odp == 144) {
            points.setPointsQuestion2(1);
            return true;
        } else
            return false;
    }

    public boolean question3() {
        System.out.println("Jaki jestpierwiastek kwadratowy z 15129 ?");
        double odp;
        odp = scanner.nextDouble();
        if (odp == 123) {
            points.setPointsQuestion3(1);
            return true;
        } else
            return false;
    }


    public void summary(){
        System.out.print("Odpowiedź na pytanie 1 była ");
        if(points.getPointsQuestion1()==1){
            System.out.println("prawidłowa.");
        } else {
            System.out.println("błędna.");
        }
        System.out.print("Odpowiedź na pytanie 2 była ");
        if(points.getPointsQuestion2()==1){
            System.out.println("prawidłowa.");
        } else {
            System.out.println("błędna.");
        }
        System.out.print("Odpowiedź na pytanie 3 była ");
        if(points.getPointsQuestion3()==1){
            System.out.println("prawidłowa.");
        } else {
            System.out.println("błędna.");
        }
        System.out.println("Zdobyto punktów : " + (points.getPointsQuestion1() + points.getPointsQuestion2() + points.getPointsQuestion3()));


    }

}


