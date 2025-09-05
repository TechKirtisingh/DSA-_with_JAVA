// imp:::

public class ques 
{
    static boolean isPrime (int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    static void printTable(int j)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i+"*"+j+"="+(i*j));
        }
    
    }

    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }

    static void learn()
    {
        System.out.println("Keep Learning Java");
    }

    static int max(int a, int b)
    {
        if(a>b)
         return a;
        else
         return b;
    }

     static double max(double a, double b)
    {
        if(a>b)
         return a;
        else
         return b;
    }

    public static void main(String args[])
    {
        boolean ans=isPrime(101);
        System.out.println("Is Prime : " + ans);
        printTable(3);
        int fact=factorial(9);
        System.out.println("factorial : "+ fact);
        learn();
        int val=max(25,35);
        System.out.println("Max integer "+val);
        double val2=max(25.7,-35.89);
        System.out.println("Max Double "+val2);
    }
}