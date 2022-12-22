import java.util.Comparator;

public class Sort{
    public Sort() {
    }

    public static void InsertionSort(Student[] array) {
        for(int left = 0; left < array.length; ++left) {
            Student value = array[left];

            int i;
            for(i = left - 1; i >= 0 && value.getIDnum() < array[i].getIDnum(); --i) {
                array[i + 1] = array[i];
            }

            array[i + 1] = value;
        }

    }

    public static void quickSort(Student[] array, int low, int high) {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        if (array.length != 0) {
            if (low < high) {
                int middle = low + (high - low) / 2;
                Student opora = array[middle];
                int i = low;
                int j = high;

                while (i <= j) {
                    while (sortingStudentsByGPA.compare(array[i], opora) > 0) {
                        ++i;
                    }

                    while (sortingStudentsByGPA.compare(array[j], opora) < 0) {
                        --j;
                    }

                    if (i <= j) {
                        Student temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        ++i;
                        --j;
                    }
                }

                if (low < j) {
                    quickSort(array, low, j);
                }

                if (high > i) {
                    quickSort(array, i, high);
                }

            }
        }
    }
    public static void MergeSort2(Student[] array, int left, int middle, int right){
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        int n1 = middle - left + 1; //количество элементов в левом массиве
        int n2 = right - middle;//количество элементов в правом массиве
        Student[] array1 = new Student[n1];
        Student[] array2 = new Student[n2]; //создание массивов для левой и правой части
        for (int i = 0; i < n1; i++){
            array1[i] = array[left + i]; //перезапись элементов
        }
        for (int j = 0; j < n2; j++){
            array2[j] = array[middle + j+1]; //перезапись элементов
        }
        int i = 0; //индекс для прохода по левой части массива
        int j = 0; //индекс для прохода по правой части массива
        int k = left; //индекс для перезаписи входного массива

        while (i < n1 && j < n2){ //пока не достигнем конца в одном из массивов
            if (sortingStudentsByGPA.compare(array1[i],array2[j]) <= 0){//если элемент в левой части меньше элемента в правой
                array[k] = array1[i];//перезаписываем во входной массив левый элемент
                i++;
            }
            else{
                array[k] = array2[j]; //перезаписываем во входной массив правый элемент
                j++;
            }
            k++;
        }
        while (i < n1){ //дописываем оставшиеся элементы
            array[k] = array1[i];
            i++;
            k++;
        }
        while (j < n2){;//дописываем оставшиеся элементы
            array[k] = array2[j];
            j++;
            k++;
        }
    }

    public static void MergeSort1(Student[] array, int right, int left){
        if (left < right){
            int middle = (right + left) / 2;
            MergeSort1(array, middle, left);//для дальнейшего разбиения левой части
            MergeSort1(array, right, middle + 1);//для дальнейшего разбиения правой части
            MergeSort2(array, left, middle, right);//слияние двух отсортированных частей
        }
    }
}