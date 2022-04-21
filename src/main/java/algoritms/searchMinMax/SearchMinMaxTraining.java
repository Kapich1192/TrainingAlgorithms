package algoritms.searchMinMax;

public class SearchMinMaxTraining {

    public static void main(String[] args) {
        int[] array = {35,345,243,1,2,42,253,35,4,35,64,4745,42,243,2,3};
        System.out.println("Search min = " + searchMinValue(array));
        System.out.println("Search max = "+ searchMaxValue(array));
    }

    public static int searchMinValue(int[] numbers){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min){min = numbers[i];}
        }
        return min;
    }

    public static int searchMaxValue(int[] numbers){
        int max = numbers[0];
        for (int n = 1; n < numbers.length; n++) {
            if(numbers[n]>max)max=numbers[n];
        }
        return max;
    }
}
