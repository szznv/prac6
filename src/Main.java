public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Петров А.С.", 1234, 99);
        student[1] = new Student("Митрошина А.Ю.", 1222, 65);
        student[2] = new Student("Поляков Л.М.", 8812, 77);
        student[3] = new Student("Теплихин Р.Д.", 5678, 45);
        System.out.println("BEFORE");
        Student.showRes(student);
        Sort.InsertionSort(student);
        System.out.println("AFTER INSERTION SORT");
        Student.showRes(student);
        Sort.quickSort(student, 0, student.length - 1);
        System.out.println("AFTER QUICK SORT");
        Student.showRes(student);
        Student[] student1 = new Student[4];
        student1[0] = new Student("Солдунова А.С.", 6666, 100);
        student1[1] = new Student("Анохин А.Ю.", 3489, 23);
        student1[2] = new Student("Дмитриенко Л.М.", 4349, 84);
        student1[3] = new Student("Солнцев Р.Д.", 9959, 75);
        Student[] student2 = new Student[4];
        student2[0] = new Student("Петров А.С.", 1234, 99);
        student2[1] = new Student("Митрошина А.Ю.", 1222, 65);
        student2[2] = new Student("Поляков Л.М.", 8812, 77);
        student2[3] = new Student("Теплихин Р.Д.", 5678, 45);
        System.out.println("BEFORE");
        Student.showRes(student1);
        Student.showRes(student2);
        Student[] student3 = new Student[8];
        for (int i = 0; i < 4; i++) {
            student3[i] = student1[i];
            student3[i + 4] = student2[i];
        }
        Sort.MergeSort1(student3, 7, 0);
        System.out.println("AFTER MERGE SORT");
        Student.showRes(student3);
    }
}