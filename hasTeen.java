import java.util.Scanner;

public class isinrange {
    private static boolean result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isInRange(a, b, c);
        System.out.printf("hasTeen(%d, %d, %d ---> %b)", a, b, c, result);
    }
    public static boolean isInRange(int a, int b, int c) {
        if(a >= 13 & a <= 19 | b >= 13 & b <= 19 | c >= 13 & c <= 19){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
