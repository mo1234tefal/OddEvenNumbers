public class Main {

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        print_numbers(arr);
        System.out.println("even numbers : " );
        printEven(arr);
        System.out.println("odd numbers : " );
        printOdd(arr);



    }

    static void print_numbers(int[] arr)
    {
        for(int i :arr)
            System.out.println(i);
    }
    static void printEven(int arr[])
    {
        for(int i : arr)
        {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
    static void printOdd(int arr[])
    {
        for(int i : arr)
        {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}