package lessons;

/*
static void problem_45_5() {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, a, b, P = 0, S = 0;
        for (int i = 0; i < 3; i++) {
            x1 = sc.nextInt(); y1 = sc.nextInt();
            x2 = sc.nextInt(); y2 = sc.nextInt();

            a = x2 - x1; b = y2 - y1;
            P = (a + b) * 2;
            S = a * b;
            System.out.println(P + " " + S);
        }
    }

    static void problem_41_40() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        for (int x = 0; x < n; x++) {
            boolean result = true;
            String input = sc.nextLine();
            int[] numbers = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i = 1; i < numbers.length - 1; i++) {
                if ((numbers[i] < numbers[i - 1] && numbers[i] < numbers[i + 1]
                        || (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]))) {
                    result = false;
                    break;
                }
            }
            if (!result) System.out.println(numbers.length);
            else System.out.println(numbers[0]);
        }
    }

/*
// 8. 30
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] arrays = new int[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }

        for (int[] array : arrays) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.print(sum + " ");
        }

        scanner.close();
    }
}
*/
/*
//8.25
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[][] arrays = new int[k][n];

        for (int i = 0; i < k; i++) {
            System.out.println("Enter elements for array " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }

        for (int[] array : arrays) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.print(sum + " ");
        }

        scanner.close();
    }
}

 */
/*
//8.20
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = cin.nextInt();
        }
        for(int i =0; i<n; i++){
            if(a[i]<a[1]){
                System.out.print(a[i] + " ");
            }
        }
    }
}
 */
/*
// 8.15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = scanner.nextInt();
    int[]  son = new int[size];
    for(int i=0; i<size; i++){
        son[i] = scanner.nextInt();
    }
int Sum = 0;
        for (int number : son) {
            if (number > n) {
                Sum = number;
                break;
            }
        }

        System.out.println(Sum);



    }
}
*/
/*
//8.10
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        boolean a = true;
        int x[] = new int[n];
        for(int i =0; i< n;i++){
            x[i] = cin.nextInt();
        }
        for(int i =0; i< n;i++){
            if(x[i] < 0){
                a = false;
                break;
            }
        }
        System.out.println(a);
    }
}
 */
/*
//8.5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        int cnt = 0;
        double[] a = new double[n];
        for(int i = 0 ; i < n; i++){
            a[i] = cin.nextDouble();
        }
        for(int i = 0; i< n;i++){
            a[i] = (int) a[i];
            System.out.println((int)a[i] + " ");
            cnt+=a[i];
        }
        System.out.println(cnt);
    }
}


 */

/*
// 7.25
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a=1,b=1,c=0;
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
 */
/*
//7.20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int S = 0;
        boolean two = false;
        while (n != 0) {
            S = n % 10;
            if (S == 2) {
                two = true;
                break;
            }
            n /= 10;
        }
        System.out.println(two);

    }
}
*/
/*
// 7.15
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p = scanner.nextDouble();

        double i = 1000.0;
        double f = 1100.0;
        int months = 0;

        while (i < f) {
            i += i * (p / 100);
            months++;
        }

        System.out.println(months + " " + i);

        scanner.close();
    }
}
*/
/*
//7.10
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k=2,a=3,cnt=0;
        while(a<n){
            a = (int)Math.pow(a,k);
            k++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
*/
/*
// 7.5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int cnt = 0;
        while (n !=1){
            n/=2;
            cnt++;
        }
        System.out.println(cnt);
    }
}

 */
/*
// 6.40
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
*/
/*
// 6.35

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.text.DecimalFormat;

public class Main {
    public static void Calculate (int n){
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for(int i = 3; i < n; i ++){
            a[i] = a[i-1] + a[i-2] - (2*a[i-3]);
        }

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Calculate(n);
    }
}


 */
/*
// 6.30
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        int n = 2;
        double a = 0.0;
        double b = 2.0;
        DecimalFormat Format = new DecimalFormat("#.#");
        double h = (b - a) / n;
        double x = a;

        for (int i = 0; i <= n; i++) {
            double fx = 1 - Math.sin(x);

            System.out.print(Format.format(fx) + " ");
            x += h;
        }
    }
}

 */
/*
// 6.25
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x = cin.nextDouble();
        int n = cin.nextInt();
        double res = (Math.pow(-1,n-1)*Math.pow(x,n)) / n;
        System.out.println(res + x);
    }
}
*/
/*
// 6.20
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.text.DecimalFormat;

public class Main {
    public static int Fa(int n){
        if(n == 0){
            return 1;
        } else {
            return n * Fa(n -1);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            cnt+=Fa(i);
        }
        System.out.println(cnt);
    }
}


 */
/*
// 6.15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x = cin.nextDouble();
        int y = cin.nextInt();
        double x1=x;
        for(int i = 0 ; i < y-1; i++){
            x1*=x;
        }
        System.out.println(x1);
    }
}
*/
/*
// 6.10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

      int n = cin.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println(sum);
    }
}
*/
/*
// 6.5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i=1; i<=n; i++)
            System.out.print(i + " ");

    }
}
*/
/*
// 5.20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();
        String answer1 = "";
        switch (y) {
            case 1:
                if (x >= 20) {
                    answer1 = "suvchi";
                } else {
                    answer1 = "tog' echkisi";
                }
                break;
            case 2:
                if (x >= 19) {
                    answer1 = "baliq";
                } else {
                    answer1 = "suvchi";
                }
                break;
            case 3:
                if (x >= 21) {
                    answer1 = "qo'y";
                } else {
                    answer1 = "baliq";
                }
                break;
            case 4:
                if (x >= 21) {
                    answer1 = "buzoq";
                } else {
                    answer1 = "qo'y";
                }
                break;
            case 5:
                if (x >= 21) {
                    answer1 = "egizaklar";
                } else {
                    answer1 = "buzoq";
                }
                break;
            case 6:
                answer1 = "qisqichbaqa";
                break;
            case 7:
                if (x >= 23) {
                    answer1 = "arslon";
                } else {
                    answer1 = "qisqichbaqa";
                }
                break;
            case 8:
                if (x >= 23) {
                    answer1 = "parizod";
                } else {
                    answer1 = "arslon";
                }
                break;
            case 9:
                if (x >= 23) {
                    answer1 = "tarozi";
                } else {
                    answer1 = "parizod";
                }
                break;
            case 10:
                if (x >= 23) {
                    answer1 = "chayon";
                } else {
                    answer1 = "tarozi";
                }
                break;
            case 11:
                answer1 = "yoy";
                break;
            case 12:
                if (x >= 22) {
                    answer1 = "tog' echkisi";
                } else {
                    answer1 = "yoy";
                }
                break;
            default:
                break;
        }
        System.out.println(answer1);
    }
}
*/
/*
//  5.15
// 26 bet
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();

        String card;

        if (n >= 6 && n <= 10) {
            card = "toppon";
        }
        else if (n >= 11 && n <= 14) {
            if (n == 11)
            {
                card = "valit";
            }
            else if (n == 12)
            {
                card = "dama";
            }
            else if (n == 13)
            {
                card = "karol";
            }
            else
            {
                card  = "tuz";
            }
        }


        else
        {
            card = "Xato!";
        }

        if (m >= 1 && m <= 4) {
            if (card.equals("Xato!")) {
                card = "Invalid!";
            }
            else {
                if (card == "toppon") {
                    card = n + " qarg'a";
                } else if (card == " valit") {
                    card = n + " chillik";
                } else if (card == " dama") {
                    card = n + " g'isht";
                } else if (card == " karol") {
                    card = n + " tuz";
                }
            }
        }

        else
        {
            card = "Invalid!";
        }

        System.out.println(card);
    }
}
*/
/*
// 5.10
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int S = G(n, m);
        String result = getName(S);

        System.out.println(result);
    }

    public static int G(int n, int m) {
        switch (m) {
            case -1:
                n--;
                break;
            case 0:

                break;
            case 1:
                n++;
                break;
            default:
                System.out.println("Xato !");
                return n;
        }

        if (n < 1)
        {
            n = 4;
        }
        else if (n > 4) {
            n = 1;
        }

        return n;
    }

    public static String getName(int n){
        switch (n){
            case 1:
                return "Shimol";
            case 2:
                return "G'arb";
            case 3:
                return "Janub";
            case 4:
                return "Sharq";
            default:
                return "Xato !";
        }
    }
    }
*/
/*
//  5.5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result;

        if (a == 1) {
            result = b + c;
        } else if (a == 2) {
            result = b - c;
        } else if (a == 3) {
            result = b * c;
        } else if (a == 4) {
            result = b / c;
        }

        else {
            System.out.println("Xato !");
            return;
        }

        System.out.println(result);
    }
}
*/
/*
// 4.30
    import java.util.Scanner;

    public class Main
    {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            if(n >= 1 && n <= 9) {
                if (n % 2 == 0) {
                    System.out.print("1 xonali juft son");
                    return;
                } else {
                    System.out.print("1 xonali toq son");
                    return;
                }
            }
            else if( n > 9 && n <= 99 ) {
                if (n % 2 == 0) {
                    System.out.print("2 xonali juft son");
                    return;
                } else {
                    System.out.print("2 xonali toq son");
                    return;
                }
            }
            else if(n > 99 && n <= 999) {
                if (n % 2 == 0) {
                    System.out.print("3 xonali juft son");
                    return;
                } else {
                    System.out.print("3 xonali toq son");
                    return;
                }
            }
           else if(n > 999){
               System.out.print("kirtgan soningiz 999 dan katta ! iltimos boshqa son kiriting");
               return;
           }



        }
    }
*/
/*
// 4.25
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        if(a<(-2) || a>2){
            System.out.println(2*a);
        }
        else {
            System.out.println(-3*(a));
        }
        if(b<(-2) || b>2){
            System.out.println(2*b);
        }
        else {
            System.out.println(-3*(b));
        }
    }
}
*/
/*
// 4.20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int Yaqin ;
        int masofa ;
   if(Math.abs(a-b) < Math.abs(a-c)){
       Yaqin = b;
       masofa = Math.abs(a-b);
   }
   else{
       Yaqin = c;
       masofa = Math.abs(a-c);
   }
        System.out.print(Yaqin + " " + masofa);

    }
}
*/
/*
// 4.15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        int max2 = S(a, b, c);

        System.out.println(max2);
    }

    public static int S(int a, int b, int c) {
        int Big;
        int s;

        if (a >= b && a >= c) {
            Big = a;
            s = (b >= c) ? b : c;
        } else if (b >= a && b >= c) {
            Big = b;
            s = (a >= c) ? a : c;
        } else {
            Big = c;
            s = (a >= b) ? a : b;
        }

        return Big + s;
    }
}
*/
/*
// 4.10
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int S = a + b;
       if(a == b){
           a = b = 0;
       }
else {
    a = b = S;
       }
        System.out.print(a + " "+ b);

    }
}
*/
/*
// 4.5
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int x2 = cin.nextInt();
        int cnt = 0, cnt2 = 0;
        if(x1 > 0){
            cnt++;
        }
        else {
            cnt2++;
        }
        if(y1 > 0){
            cnt++;
        }
        else{
            cnt2++;
        }
        if(x2 > 0){
            cnt++;
        }
        else  {
            cnt2++;
        }
        System.out.print(cnt + " " + cnt2);


    }
}
*/
/*
 // 3.40
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x1 = cin.nextInt();
        int y1 = cin.nextInt();
        int x2 = cin.nextInt();
        int y2 = cin.nextInt();

        boolean S = (x1 - y1 == 0 && Math.abs(x2-y2)==1);

        System.out.println(S);


    }
}
*/
/*
//  3.35
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  Scanner cin = new Scanner(System.in);
  int a = cin.nextInt();
  int b = cin.nextInt();
  int c = cin.nextInt();
  int d = cin.nextInt();

  boolean S = ((a+b)%2 == (c+d)%2);

        System.out.println(S);


    }
}
*/
/*
// 3.30
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int y = scanner.nextInt();
        int x = scanner.nextInt();

        boolean i = (d == y ) && (y == x) && (x == d);

        System.out.println(i);
    }
}
*/
/*
// 3.25
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();
    boolean Is = ( x < 0 && y > 0);
        System.out.println(Is);




    }
}
*/
/*
// 3.20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        boolean result = (a != b) && (b != c) && (a != c);

        System.out.println(result);
    }
}

*/
/*
// 3.15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        boolean result = (a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || (a <= 0 && b > 0 && c > 0);

        System.out.println(result);
    }
}

*/
/*

// 3.10
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a,b,c=2;
        for(int i=0;i<c;i++) {
            a=cin.nextInt();
            b=cin.nextInt();
            if (a % 2==0 && b % 2 == 1) System.out.print("true");
            else System.out.printf("false");
        }
    }
}

*/
/*
//3.5
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a,b,c=2;
        for(int i=0;i<c;i++) {
            a=cin.nextInt();
            b=cin.nextInt();
            if (a >= 0 && b < -2) System.out.print("true");
            else System.out.printf("false");
        }
    }
}*/
/*


//2.30
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.print(n/100+1);
    }
}





*/
/*

// 2.25
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.print((n%7)+3 );
    }
}

*/
/*
// 2.20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.print(n/3600);
    }
}
*/
/*
//2.15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.print(n/10%10 +" "+ n/100 + " " + n%10);
    }
}
*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int S = n % 100 / 10;

        System.out.print(n%10 + " " + S);
    }
}


//     2.10
*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        int L = a - (b - 1);
        System.out.println(L);
    }
}

//          2.5






*/
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double Pi = 3.14;
        double S = (n/Pi)*180;
        System.out.print(S);
    }
}

///////// 1.30


*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int v = cin.nextInt();
        int u = cin.nextInt();
        int t1 = cin.nextInt();
        int t2 = cin.nextInt();

        int boat = v*t1;
        int river = (v - u) * t2;

        System.out.print(boat + river);


    }
}

///////////////// 1.35

*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int result = cal(x);
        System.out.println(result);
    }

    public static int cal(double x) {
        double y =  3 * Math.pow(x, 6) - 6 * Math.pow(x, 3) - 7;
        return (int)y;
    }
}


/// 1.25




*/
/*
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int x1 = scanner.nextInt();
int y1 = scanner.nextInt();
int x2 = scanner.nextInt();
int y2 = scanner.nextInt();

        int d = c(x1, y1, x2, y2);
        System.out.println(d);
    }

    public static int c(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
}
/// 1.20
*/
/*
import java.util.Scanner;


public class  Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.print(a+b + " ");
        System.out.print(a-b + " ");
        System.out.print(a*b + " ");
        System.out.print(a/b + " ");

    }
}

// 1.10


*/
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double Pi = 3.14;
        double r = Math.sqrt(n * 1. / Pi);
        double d = 2 * r;
        double l = 2 * Pi * r;
        System.out.format("%d,%.1f", (int) d, l);
    }
}
// 1.15
*/
/*
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.print(n*n*n+ " ");
        System.out.print(6*n*n);

    }
}

// 1.5
*/


//  6.10 ( abdubosit) , 7.30


