public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n)
    {
        // todo
        if (n%2==0) return false;
        int count = 0;
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0) count++;
        }
        if (count != 0)return false;
        else return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        if (n<0) return -1;
        int a = 0, b = 1, index= 0;
        while (a <= n)
        {
            if (a == n) return index;
            int temp = a + b;
            a = b;
            b = temp;
            index++;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n)
    {
        // todo
        char[][] triangle = new char[n][];
        for (int i = 0; i < n; i++){
            triangle[i] = new char[i+1];
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i || i == n - 1){
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
     System.out.println("Index of 7 in fibo is :" + new Exercises().fibonacciIndex(34) + "\n");
     char[][] m = new Exercises().generateTriangle(7);
     for (int i = 0; i < 7; i++){
         for (int j = 0; j <= i; j++){
             System.out.print(m[i][j]);
         }
         System.out.print("\n");
     }


    }
}
