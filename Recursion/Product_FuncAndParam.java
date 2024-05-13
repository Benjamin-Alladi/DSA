
public class Product_FuncAndParam {

    // Parametric Recursion
    static void fact(int i,int product)
    {
        if(i==0)
        {
            System.out.println("Factorial: "+product);
            return;
        }
        product=product*i;
        fact(i-1,product);
    }

    // Functional Recursion
    static int factorial(int i)
    {
        if(i==0)
        {
            return 1;
        }
        int product= i*factorial(i-1);
        return product;
    }
    public static void main(String[] args) {
        fact(5,1);

        System.out.println("Factorial of 5: "+factorial(5));
    }
}
