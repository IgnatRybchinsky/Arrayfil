import java.util.Scanner;





public class Main {
    public static void main(String[] args) {

        int numbers[] = new int[10];

        for (int i=0; i<numbers.length; i++ )
        {
           /* System.out.println("enter number");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt(); */
            numbers[i]= numbers.length-1-i;
        }

        for (int n : numbers) {
            System.out.println("number: " + n);

        }




    }
}