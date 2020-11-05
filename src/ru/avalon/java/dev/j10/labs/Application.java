package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"Массив","Следует" ,"Проинициализировать", "Таким", "Образом", "Чтобы", "Он", "Содержал", "Двадцать", "Строк",
		"Расположенных", "Не", "По", "Порядку", "Создайте", "Класс", "Персон", "Реализующий", "Интерфейс", "Созданного"} ;

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[20];
            persons[0] = new PersonClass("Иван", LocalDate.of(1982, 1, 1));
            persons[1] = new PersonClass("Петр", LocalDate.of(1983, 2, 11));
            persons[2] = new PersonClass("Николай", LocalDate.of(1990, 8, 9));
            persons[3] = new PersonClass("Василий", LocalDate.of(1987, 5, 2));
            persons[4] = new PersonClass("Светлана", LocalDate.of(1986, 4, 3));
            persons[5] = new PersonClass("Ирина", LocalDate.of(1992, 7, 2));
            persons[6] = new PersonClass("Екатерина", LocalDate.of(1993, 6, 29));
            persons[7] = new PersonClass("Ярослав", LocalDate.of(1999, 3, 16));
            persons[8] = new PersonClass("Иона", LocalDate.of(1979, 1, 13));
            persons[9] = new PersonClass("Васса", LocalDate.of(1987, 2, 28));
            persons[10] = new PersonClass("Наина", LocalDate.of(1984, 12, 31));
            persons[11] = new PersonClass("Саша", LocalDate.of(1995, 10, 19));
            persons[12] = new PersonClass("Сергей", LocalDate.of(1996, 11, 7));
            persons[13] = new PersonClass("Дмитрий", LocalDate.of(1991, 8, 5));
            persons[14] = new PersonClass("Марина", LocalDate.of(1992, 3, 23));
            persons[15] = new PersonClass("Валентин", LocalDate.of(1975, 6, 17));
            persons[16] = new PersonClass("Андрей", LocalDate.of(1970, 5, 10));
            persons[17] = new PersonClass("Анна", LocalDate.of(1971, 11, 7));
            persons[18] = new PersonClass("Анастасия", LocalDate.of(1995, 10, 26));
            persons[19] = new PersonClass("Анастасия", LocalDate.of(2001, 4, 22));

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortClass();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new ComparatorClass();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        //System.out.println("Несортированный массив:");
        //System.out.println(Arrays.toString(persons));      
        //System.out.println("Массив отсортирован:");
        sort.sort(persons);
        //System.out.println(Arrays.toString(persons));  

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        //System.out.println("Несортированный массив:");
        //System.out.println(Arrays.toString(strings));
        sort.sort(strings); 
        //System.out.println("Сортировка по возрастанию:");
        //System.out.println(Arrays.toString(strings));
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        
        sort.sort(strings, comparator);

       //System.out.println("Сортировка по убыванию:");
       //System.out.println(Arrays.toString(strings));
       
       
    }
}
