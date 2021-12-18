import builderPattern.BuilderClass;
import builderPattern.modul.Address;
import builderPattern.modul.Student;
import factoryPattern.Book;
import factoryPattern.modul.*;
import quickSortInJava.modul.StudentNameAndMark;
import quickSortInJava.modul.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Book book = new ScienceBook();
//        Book book1 = new ArtsBook();
//        Book book2 = new CommerceBook();
//        Book[] bookList = {book,book1,book2};
//        show(bookList);
        FactoryMethod.chooseInstance(Chooses.ARTS);
        FactoryMethod.chooseInstance(Chooses.COMMERCE);
        FactoryMethod.chooseInstance(Chooses.SCIENCE);


        BuilderClass builderClass = new BuilderClass.BuilderCreation()
                .student(new Student("Al Amin",1))
                .build();
        System.out.println(builderClass);
        BuilderClass builderClass1 = new BuilderClass.BuilderCreation()
                .student(new Student("Al Amin",1))
                .address(new Address("Rajnarayanpur","Pabna"))
                .build();
        System.out.println(builderClass1);
        List<StudentNameAndMark> quickSortedClassList = Arrays.asList(
                new StudentNameAndMark("Alamin", 12),
                new StudentNameAndMark("Saima", 11),
                new StudentNameAndMark("Akash", 9),
                new StudentNameAndMark("Sky", 14),
                new StudentNameAndMark("Tomal", 11),
                new StudentNameAndMark("Pabon", 4)
        );

//        List<StudentNameAndMark> quickSortedClassList = new ArrayList<>();
//        quickSortedClassList.add(new StudentNameAndMark("Alamin", 12));
//        quickSortedClassList.add(new StudentNameAndMark("Saima", 11));
//        quickSortedClassList.add(new StudentNameAndMark("Rony", 44));
//        quickSortedClassList.add(new StudentNameAndMark("Sumom", 9));
//        quickSortedClassList.add(new StudentNameAndMark("Saima", 442));
//        quickSortedClassList.add(new StudentNameAndMark("FFgfg", 442));
        QuickSort.quickSort(quickSortedClassList,0,quickSortedClassList.size()-1);
        quickSortedClassList.forEach(System.out::println);


    }
    private static void show(Book[] book){
        for (Book b: book){
            if (!(b instanceof ScienceBook)){
                b.searchBook();
            }
        }

    }
}
