import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:10:44
 **/
public class HomeWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >=0 ; i-=2) {
            System.out.print(n >>> i & 1);
        }
        System.out.println();
        for (int i = 30; i >=1 ; i-=2) {
            System.out.print(n >>> i & 1);
        }
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0){
            count++;
            n &= (n-1);
        }
        System.out.println(count);
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0){
            System.out.print(n%10+"  ");
            n = n/10;
        }
    }

    public static void main8(String[] args) {

        int n = 3;
        while(n > 0){
            System.out.println("请输入密码：");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            if (str.equals("123Zss")){
                System.out.println("密码正确");
                break;
            }
            n--;
            System.out.println("密码不正确你还有"+n+"次机会输入密码");
        }
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = n;
        int count = 0;
        while(tmp != 0){
            count++;
            tmp = tmp/10;
        }
        tmp = n;
        int sum = 0;
        while (tmp != 0){
            sum += Math.pow(tmp%10,count);
            tmp = tmp/10;
        }
        if (sum == n){
            System.out.println(n);
        }
    }

    public static void main5(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 10 == 9){
                count++;
            }
            if (i / 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main4(String[] args) {
        double sum = 0.0;
        int flag = 1;
        for (int i = 1; i <= 100; i++) {
            sum += (1.0/i)*flag;
            flag = -flag;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a%b;
        while (c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        System.out.println(b);
    }


    public static void main2(String[] args) {
       int i = 2;

        for (; i <= 100 ; i++) {
            int j = 2;
            for (; j <= i ; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j >= i){
                System.out.print(i+" ");
            }
        }
    }
    public static void isPrimaryNum(int num){
        int i = 2;
        for (; i <=num/2 ; i++) {
            if (num % i == 0){
                break;
            }
        }
        if (i > (num/2)){
            System.out.println("是素数");
        }
    }

    public static void main1(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        isPrimaryNum(num);
    }
}
