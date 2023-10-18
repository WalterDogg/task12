import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] simpleTriangle = new char[2][4];
        simpleTriangle[0][1] = '/';
        simpleTriangle[0][2] = '\\';
        simpleTriangle[1][3] = '\\';
        simpleTriangle[1][0] = '/';
        simpleTriangle[1][1] = '_';
        simpleTriangle[1][2] = '_';
        char[][] result = Triangle.drawTriangle(simpleTriangle,n);
        for (char[] a : result) {
            for (char i : a) {
                if (i==0) {
                    System.out.print("  ");

                }else{
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
        }

    }
}


