import java.util.Arrays;

public class Main {




    public static void main(String[] args) {
        int a = 3;
        int b = 56;


        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a);
        stringBuilder.append("+");
        stringBuilder.append(b);
        stringBuilder.append("=");
        stringBuilder.append(59);

        System.out.println(stringBuilder);

        stringBuilder.append(a);
        stringBuilder.append("-");
        stringBuilder.append(b);
        stringBuilder.append("=");
        stringBuilder.append(-53);
        stringBuilder.replace(3,5,"равно");
        //stringBuilder.insert(4 ,"равно");
        System.out.println(stringBuilder);

        stringBuilder.append(a);
        stringBuilder.append("*");
        stringBuilder.append(b);
        stringBuilder.append("=");
        stringBuilder.append(168);
        stringBuilder.replace(3, 5, "равно");
        //stringBuilder.insert(4 ,"равно");
        System.out.println(stringBuilder);
        //не знаю как сделать , чтобы результат предыдущего не дублировался


        //-----------------------1
        int[] arr = {1, 2, 3, 5};
        int[] arr1 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("искомое число: "+Number(arr));
        System.out.println("искомое число: "+Number1(arr1));

        //-----------------------2

        int [] arr2= {1, 5, 7, 1};
        int [] arr3={1, 1, 1, 1};
        System.out.println("число пар:"+NumberOfPairs(arr2));
        System.out.println("число пар:"+NumberOfPairs1(arr3));
        //почему даёт двойной результат?
    }
    public static int Number( int[] arr) {
        int sum=0;
        int n =5;
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
         sum= (n*(n+1))/2;
         sum1+=arr[i];
        }
        return sum-sum1;
    }
    public static int Number1( int[] arr1) {
        int sum=0;
        int n =10;
        int sum1=0;
        for (int i = 0; i < arr1.length; i++) {
            sum= (n*(n+1))/2;
            sum1+=arr1[i];
        }
        return sum-sum1;
    }
    public static int NumberOfPairs( int[] arr2) {
        int k = 6;
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if ( j!=i&& (arr2[i] + arr2[j] ) == k) {
                    count++;
                }
            }


        }
        return count;
    }
    public static int NumberOfPairs1( int[] arr3) {
        int k = 2;
        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (j!=i&& ( arr3[i] + arr3[j])  == k) {
                    count++;
                }
            }


        }
        return count;
    }



}
