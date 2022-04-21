package algoritms.quickSort;

import java.util.Arrays;

public class QuickSortTraining1 {
    public static int countQuickSort = 0;
    public static int countBubbleSort = 0;

    public static void main(String[] args) {
        int n = 10;
        int[] numbers=new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*100);
        }
        int[] array =new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        numbers = quickSort(numbers,0,numbers.length-1);
        System.out.println(" Отсортировался за " + countQuickSort + "ms");
        array = bubbleSort(array);
        System.out.println(" Отсортировался за " + countBubbleSort + "ms");
    }
    //BubbleSorting
    public static int[] bubbleSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                countBubbleSort++;
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array;

    }


    //Быстрая сортировка
    public static int[]quickSort(int[] array,int from,int to){
        countQuickSort++;
        System.out.println("№" + countQuickSort + ". Массив: "+Arrays.toString(array) + ", from = " +from +"["+array[from] +"], to = " + to+"["+array[to]+"]");
        //проверяем есть ли что сортировать
        if(from<to){
            //делим массив на две части
            int divideIndex = partition(array,from,to);
            //вызываем рекурсивно левую часть
            quickSort(array,from,divideIndex-1);
            //вызываем рекурсивно правую часть
            quickSort(array,divideIndex,to);
        }
        return array;
    }
    //метод возвращает центр массива
    public static int partition(int[] array,int from,int to){
        int rightIndex = to;
        int leftIndex = from;
        int pivot = array[from];
        while(leftIndex<=rightIndex){
            while(array[leftIndex]<pivot){
                leftIndex++;
            }
            while(array[rightIndex]>pivot){
                rightIndex--;
            }

            if(leftIndex<=rightIndex){
                swap(array,rightIndex,leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }
    //меняет элементы массива местами
    public static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    //элемент 3

}
