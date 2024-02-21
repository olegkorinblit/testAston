import java.util.Scanner;

public class Calcul {
    public void  calcul(int a, int b) {
        System.out.println("a*b="+a*b);
        System.out.println("a/b="+(double)a/b);
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));


    }
    public void calculator(int a, int b, char sym) {

        double res;

        switch(sym) {
            case '+':
                res=a+b;
                System.out.println("a+b="+res);
                break;
            case '-':
                res=a-b;
                System.out.println("a-b="+res);
                break;
            case '*':
                res=a*b;
                System.out.println("a*b="+res);
                break;
            case '/':
                if(b==0){
                    System.out.println("На 0 делить нельзя");
                }
                res=(double)a/b;
                System.out.println("a/b="+res);
                break;
            default:
                System.out.println("Ошибка.Вводите только целые числа и символы +-*/.Повторите  ");

        }
    }
    public char getSym() {
        System.out.println("Введите символ(+-*/): ");
        Scanner scanner = new Scanner(System.in);
        char c  ;

        if(scanner.hasNext()) {
            c=scanner.next().charAt(0);
            //	if(c!='+' && c!='-' && c!='*' && c!='/') {
        }else {
            System.out.println("Вы ввели неправильный символ.попробуйте еще раз");
            scanner.next();
            c=getSym();
        }

        return c;

    }
    public void evenNumbers(int[] ar) {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
                System.out.print(ar[i]+"	");
        }


    }

    public void commpareString(String a1, String b1) {
        if(a1.equalsIgnoreCase(b1))
            System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");




    }



   public  int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num;
        if(scanner.hasNextInt()) {
            num=scanner.nextInt();

        }
        else {
            System.out.println("ОШИБКА. Введите еще раз");
            scanner.nextInt();
            num=getInt();

        }

        return num;



    }


    public  void compareNum(int a, int b) {
        if(a>b)
            System.out.println("a>b");
        if(a<b)
            System.out.println("a<b");
        if(a==b)
            System.out.println("a==b");

    }
    public  String getString(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку: ");
        String res;
        if(scanner.hasNext()) {
            res = scanner.next();

        }else {
            System.out.println("ОШИБКА. Введите еще раз");
            scanner.next();
            res=getString();

        }

        return res;
    }

}
