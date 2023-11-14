public class MyArrays {
    public static int odd(int[] array) {
        int count=0;
        for(int i:array) {
            if((i>0)&&(i%2==1)) count++;
        }
        return count;
    }

    public static int above(int[] array) {
        int sum=0;
        for(int i:array) {
            sum+=i;
        }
        float avg=sum/array.length;
        sum=0;
        for(int i:array) {
            if(i>avg) sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));
    }
}
