package DSA_from_basics.Collections;

import java.util.*;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sachin","ganguli","kohli","surya","hardik");

        print(list);

        List<Student> studetnList = new ArrayList<>();

        studetnList.add(new Student(10, "Suresh", 400));
        studetnList.add(new Student(11, "Ram", 440));
        studetnList.add(new Student(12, "Surya", 490));
        studetnList.add(new Student(13, "Rahul", 435));

        // listStudentListUsingComparator(studetnList);

        // sortUsingLE(studetnList);

        sortUsingComparable(studetnList);
    }

    public static void print(List<String> list){
        Iterator<String> listIterator = list.iterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    public static void listStudentListUsingComparator(List<Student> studentsList){

        Collections.sort(studentsList, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getMark() > s2.getMark() ? +1 : -1;
            }
            
        });

        for (Student s : studentsList){
            System.out.println(s);
        }
    }

    public static void sortUsingLE(List<Student> list){
        Collections.sort(list, (s1,s2)-> s1.getMark() > s2.getMark() ? +1 : -1);

        list.forEach(s-> System.out.println(s));
    }

    public static void sortUsingComparable(List<Student> list){
        Collections.sort(list);

        list.forEach(s-> System.out.println(s));
    }
}
