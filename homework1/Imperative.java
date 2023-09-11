public class Imperative {
//Отсортировать массив чисел в порядке убывания в императивном стиле
 
    public static void main(String[] args) {
        int [] numbers = {1, 17, 5, 11, 14, 25, 6, 8, 20};
        sortListImperative(numbers, 0, numbers.length - 1);
        showArray(numbers);

    }

    public static void sortListImperative(int [] array, int startPosition, int endPosition){

        int pivot = array[(startPosition + endPosition) / 2];
        int leftPosition = startPosition;
        int rightPosition = endPosition;

        do{
            while(array[leftPosition] > pivot){
                leftPosition++;
            }
            while (array[rightPosition] < pivot){
                rightPosition--;
            }
            if (leftPosition <= rightPosition){
                if (leftPosition < rightPosition){
                    int temp = array[leftPosition];
                    array [leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (startPosition < endPosition){
            sortListImperative(array, leftPosition, endPosition);
        }

        if (startPosition < rightPosition){
            sortListImperative(array, startPosition, rightPosition);
        }
    }

    public static void showArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
    

}