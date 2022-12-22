import java.util.Comparator;
    public class SortingStudentsByGPA implements Comparator<Student> {
        public SortingStudentsByGPA() {
        }

        @Override
        public int compare(Student student1, Student student2){
            return student1.getFinals() - student2.getFinals();
        }
    }