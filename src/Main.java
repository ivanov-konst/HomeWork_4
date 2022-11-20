public class Main {
    public static void main(String[] args)
    {System.out.println("Hello world!");

//Задание1
        int i = 1;
        while (i <= 10) {
            System.out.print( + i++ + " ");}
            System.out.println();
        for (int X = 10; X >= 1; X--) {
            System.out.print( + X + " ");}
            System.out.println();
//Задание2
       // int friday = 2;
        for (int friday = 2; friday <= 31; friday = friday+7) {
            System.out.println( "Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");}

//Задание3
        int year = 2021;
        int pastYears = year - 200;
        int futureYears = year + 100;
        for (int CometFlight = 0; CometFlight <= futureYears; CometFlight = CometFlight + 79) {
            if (CometFlight < futureYears && CometFlight > pastYears) {
                System.out.println(CometFlight);
            }
        }

//Задание4
        int w = 1;
        for (; w <= 30; w++) {
            if (w % 3 == 0 && w % 5 == 0) {
                System.out.println(+w + ": ping pong");}
            else if (w % 3 == 0) {
                System.out.println(+w + ": ping");}
            else if (w % 5 == 0) {
                System.out.println(+w + ": pong");}
            else if (w % 3 == 0) {
                System.out.println(+w + ": ping");}
            else System.out.println(+w + ":");
        }
//Задание5
        int a = 0;
        int b = 1;
        int c;
        System.out.print(+a+" "+b+" ");
        for(int x = 3; x <= 10; x++){
            c=a+b;
            System.out.print(+c+" ");
            a=b;
            b=c;
        }
        System.out.println();






    }

}