import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        while(n<1 || n>10)
        {
            System.out.println("hi Ed here");
            n= s.nextInt();
        }
        System.out.println("Hi PC is here");

    }
}
