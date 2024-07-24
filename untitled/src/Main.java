public class Main {

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        print_numbers(arr);
        System.out.println("is even: " + isEven(15));
        System.out.println("is odd: " + isOdd(15));



    }

    static void print_numbers(int[] arr)
    {
        for(int i :arr)
            System.out.println(i);
    }
    static boolean isEven(int number)
    {
        boolean even = false;
        if(number % 2 == 0)
        {
            even = true;
        }
        return even;
    }
    static boolean isOdd(int number)
    {
        boolean Odd = false;
        if(number % 2 != 0)
        {
            Odd = true;
        }
        return Odd;
    }
}