public class C4 {
    public static int positiveOdd(int[] array) {
        int count=0;
        for(int i:array) {
            if((i>0)&&(i%2==1)) count++;
        }
        return count;
    }

    public static int even(int[] array) {
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
}
