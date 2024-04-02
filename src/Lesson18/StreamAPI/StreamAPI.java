package Lesson18.StreamAPI;

import Lesson18.Car1;
import Lesson18.Human;
import Lesson18.Person1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class StreamAPI {
    public static void main(String[] args) {
//        getEvenNumbers();
//        countOfLenghtGreaterThanFour();
//        checkLetter();
//        getTheDoubleOfNumb();
//        getCarNumbers();
//        getCarNumbersYearGreaterThen();
//        getEvenNumbList();
//        convertToUpperCase();
//        putInQ();
//        groupByHumanSurname();
//        groupByWithCount();
//        groupWithAmountOfMoney();
//        groupAndConvertToSet();
//        getPetNames();
//        convertArrayFromMultiToOne();
//        parallelStreamDifference();
//        findFirstExample();
//        isEvenNumber();
//        isAllNumbersEven();
//        isAllNumbersOdds();
//        distinctTest();
//        noneEqualsClassMethod();
//        sortedStreamExample();
//        parallelStreamExample();
//        parallelToSquential();
//        limitExample();


    }



    static void getEvenNumbers(){
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer i : numbers){
            if(i%2==0){
                System.out.println(i);
            }
        }//OLD STYLE

        //---------------------------------------------

        List<Integer> numbers1 = asList(1,2,3,4,5,6,7,8,9,10);
        numbers1.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);//NEW STYLE
    }

    static void countOfLenghtGreaterThanFour(){
        List<String> names = asList("John","Jan","Tirron","Marry","Nikolas");
        int counter=0;
        for (String a : names){
            if(a.length()>4){
                counter++;
            }
        }

        System.out.println(counter);//OLD STYLE

        //---------------------------------------------

        List<String> names1 = asList("John","Jan","Tirron","Marry","Nikolas");
        long count=names1.stream()
                .filter(i->i.length()>4)
                .count();
        System.out.println(count);//NEW STYLE

    }

    static void checkLetter() {
        List<String> list = asList("John", "Alan", "Sadiq", "", null, "Lola");
        for (String a : list) {
            if (a != null && !a.isEmpty() && a.contains("a")) {
                System.out.println(a);
            }
        }//OLD STYLE

        //---------------------------------------------

        List<String> list1 = asList("John", "Alan", "Sadiq", "", null, "Lola");
        list1.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);//NEW STYLE
    }

    static void getTheDoubleOfNumb(){
        List<Integer> listInterger =asList(1,3,5,7);

        for (Integer i :listInterger){
            System.out.println(i*2);
        }//OLD STYLE

        //---------------------------------------------

        List<Integer> listInterger1 =asList(1,3,5,7);

        listInterger1.stream()
                .map(i->i*2)
                .forEach(System.out::println);//NEW STYLE
    }

    static void getCarNumbers(){
        List<Car1> cars =asList(new Car1("90GH634",2010),
                                new Car1("67GH635",2019),
                                new Car1("67GH835",2018));
        for (Car1 car1 : cars){
            System.out.println(car1.getCarNumber());
        }//OLD STYLE

        //---------------------------------------------

        List<Car1> car1s =asList(new Car1("90GH634",2010),
                                new Car1("67GH635",2019),
                                new Car1("67GH835",2018));

        car1s.stream()
                .map(Car1::getCarNumber)
                .forEach(System.out::println);//NEW STYLE
    }

    static void getCarNumbersYearGreaterThen(){
        List<Car1> car1List =asList(new Car1("75HY634",2007),
                                    new Car1("34HH463",2010),
                                    new Car1(null,2012),
                                    new Car1("",2015),
                                    new Car1("75UU252",2017));

        for (Car1 car:car1List){
            if(car.getYear()>2010){
                String number=car.getCarNumber();
                if(number!=null && !number.isEmpty()){
                    System.out.println(number);
                }
            }
        }//OLD STYLE

        //---------------------------------------------

        List<Car1> car1List1 =asList(new Car1("75HY634",2007),
                new Car1("34HH463",2010),
                new Car1(null,2012),
                new Car1("",2015),
                new Car1("75UU252",2017));
        car1List1.stream()
                .filter(a->a.getYear()>2010)
                .map(Car1::getCarNumber)
                .filter(s->s!=null && !s.isEmpty())
                .forEach(System.out::println);//NEW STRYLE
    }

    static void getEvenNumbList(){
        List<Integer> numbers =asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumers = new ArrayList<>();

        for(Integer i : numbers){
            if(i%2==0){
                evenNumers.add(i);
            }
        }

        System.out.println(evenNumers);//OLD STYLE

        //---------------------------------------------

        List<Integer> numbers1 =asList(1,2,3,4,5,6,7,8,9,10);


        List<Integer> evenNumers1 = numbers1.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(evenNumers1);//NEW STYLE
    }

    static void convertToUpperCase(){
        List<String> names =asList("John","Arya","Sansa");
        Set<String> upperCaseNames =new HashSet<>();
        for(String a : names){
            upperCaseNames.add(a.toUpperCase());
        }
        System.out.println(upperCaseNames);//OLD STYLE

        //---------------------------------------------

        List<String> names1 =asList("John","Arya","Sansa");

        Set<String> upperCaseNames1 = names1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(upperCaseNames1);//NEW STYLE
    }

    static void putInQ(){
        List<String> names = asList("Jaime","Daenerys","","Tyrion","");
        Queue<String> queue =new LinkedList<>();
        for(String name :names){
            if(!name.isEmpty()){
                queue.add(name);
            }
        }
        System.out.println(queue); //OLD STYLE

        //---------------------------------------------

        List<String> names1 = asList("Jaime","Daenerys","","Tyrion","");

        Queue<String> queue1 =names1.stream()
                .filter(n->!n.isEmpty())
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(queue1);//NEW STYLE
    }

    static void groupByHumanSurname(){
        List<Human> humans =asList(
                new Human("X","Aliyev",1),
                new Human("Y","Aliyev",2),
                new Human("Z","Aliyev",3),
                new Human("I","Mamedov",4),
                new Human("R","Mamedov",5),
                new Human("U","Mamedov",6),
                new Human("O","Aliyeva",7),
                new Human("W","Aliyeva",8));

        Map<String,List<Human>> map = new HashMap<>();


        for(Human human : humans){
            String surname = human.getSurname();
            if(!map.containsKey(surname)){
                List<Human> humanList = new ArrayList<>();
                humanList.add(human);
                map.put(surname,humanList);
            }else{
                List<Human> humanList = map.get(surname);
                humanList.add(human);
            }
        }

        System.out.println(map);//OLD STYLE

        //---------------------------------------------

        List<Human> humans1 =asList(
                new Human("X","Aliyev",1),
                new Human("Y","Aliyev",2),
                new Human("Z","Aliyev",3),
                new Human("I","Mamedov",4),
                new Human("R","Mamedov",5),
                new Human("U","Mamedov",6),
                new Human("O","Aliyeva",7),
                new Human("W","Aliyeva",8));


        Map<String ,List<Human>> map1 = humans1.stream()
                .collect(Collectors.
                        groupingBy(Human::getSurname));

        System.out.println(map1);//NEW STYLE
    }

    static void groupByWithCount(){
        List<Human> humans1 =asList(
                new Human("X","Aliyev",1),
                new Human("Y","Aliyev",2),
                new Human("Z","Aliyev",3),
                new Human("I","Mamedov",4),
                new Human("R","Mamedov",5),
                new Human("U","Mamedov",6),
                new Human("O","Aliyeva",7),
                new Human("W","Aliyeva",8));

        Map<String, Long> map=humans1.stream()
                .collect(Collectors.groupingBy(Human::getSurname,Collectors.counting()));
        System.out.println(map);

    }

    static void groupWithAmountOfMoney(){
        List<Human> humans1 =asList(
                new Human("X","Aliyev",1),
                new Human("Y","Aliyev",2),
                new Human("Z","Aliyev",3),
                new Human("I","Mamedov",4),
                new Human("R","Mamedov",5),
                new Human("U","Mamedov",6),
                new Human("O","Aliyeva",7),
                new Human("W","Aliyeva",8));

        Map<String ,Integer> map = humans1.stream()
                .collect(Collectors.groupingBy(Human::getSurname,Collectors.summingInt(Human::getMoney)));

        System.out.println(map);
    }

    static void groupAndConvertToSet(){
        List<Human> humans1 =asList(
                new Human("X","Aliyev",1),
                new Human("Y","Aliyev",2),
                new Human("Z","Aliyev",3),
                new Human("X","Mamedov",4),
                new Human("Y","Mamedov",5),
                new Human("Z","Mamedov",6),
                new Human("O","Aliyeva",7),
                new Human("W","Aliyeva",8));

        Map<String,Set<String>> map = humans1.stream()
                .collect(Collectors.groupingBy(Human::getSurname,
                        Collectors.mapping(Human::getName,Collectors.toSet())));
        System.out.println(map);
    }

    static void getPetNames(){
        List<Person1> person1s =asList(new Person1("Sam",asList("Buddy","Lucy")),
                                       new Person1("Bob",asList("Frankie","Rosie")),
                                       new Person1("Marta",asList("Simba","Tilly")));

        List<String> petName = new ArrayList<>();
        for (Person1 person1 : person1s){
            petName.addAll(person1.getPets());
        }

        System.out.println(petName);//OLD STYLE

        //---------------------------------------------

        List<Person1> person2 =asList(new Person1("Sam",asList("Buddy","Lucy")),
                new Person1("Bob",asList("Frankie","Rosie")),
                new Person1("Marta",asList("Simba","Tilly")));

        List<String > petName1 =person2.stream()
                .flatMap(human->human.getPets().stream())
                // flatMap bir streamdan onun altinda olan bir deyerin streamne kecmek ucundur
                .filter(pet->pet.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(petName1);
    }

    static void convertArrayFromMultiToOne(){
        int [][] arr = {{1,2},{3,4},{5,6}};
        int [] newArray = new int[arr.length*arr[0].length];

        for (int i=0,index=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                newArray[index++]=arr[i][j];
            }
        }

        System.out.println(Arrays.toString(newArray));//OLD STYLE

        //---------------------------------------------

        int [][] arr1 = {{1,2},{3,4},{5,6}};

        int[] newArray1= Arrays.stream(arr1)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(newArray1));//NEW STYLE
    }

    static void parallelStreamDifference(){
        List<String> strings=Arrays.asList("Java is the best","Java 8","Java 9","Jacoco","BOLB");
        Optional<String> java = strings.stream()
                .filter(s->s.contains("Java"))
                .findAny();
        System.out.println(java);

        List<String> str =Arrays.asList("Java is the best","Java 8" ,"Jacoco","BLOB","Java 9");
        Optional<String> str1=str.parallelStream()
                .filter(s->s.contains("Java"))
                .findAny();
        System.out.println(str);
    }

    static void findFirstExample(){
        List<Integer> list =asList(1,5,8,10,12,15);
        Optional<Integer> first =list.stream()
                .filter(n->n>10)
                .findFirst();
        System.out.println(first);
    }

    static void isEvenNumber(){
        List<Integer> numbers = asList(1,2,3,4,5);

        boolean match=numbers.stream()
                .anyMatch(number->number%2==0);
        System.out.println(match);
    }

    static void isAllNumbersEven(){
        List<Integer> list = asList(1,2,3,4,5);

        boolean match =list.stream()
                .allMatch(n->n%2==0);
        System.out.println(match);
    }

    static void isAllNumbersOdds(){
        List<Integer> list = asList(1,2,3,4,5);

        boolean match =list.stream()
                .noneMatch(n->n%2==0);
        System.out.println(match);
    }

    static void distinctTest(){
        List<String> strings = asList("a","b","c","d","a","b");
        strings.stream()
                .distinct()
                .forEach(System.out::println);
    }

    static void noneEqualsClassMethod(){
        List<Human> humans= asList(new Human("JO"),
                                   new Human("JO"),
                                   new Human("Lui"));

        humans.stream()
                .distinct()
                .forEach(System.out::println);
    }

    static void sortedStreamExample() {
        List<Human> humans = asList(new Human("JO"),
                new Human("JO"),
                new Human("Lui"));

        humans.stream()
//                .sorted()//Bu cur yazanda islemeyecek cunki Comparator ve ya Comparable yoxdur
                .sorted(Comparator.comparing(Human::getName))
                .forEach(System.out::println);
    }

    static void parallelStreamExample(){
        List<String> strings = asList("Jo","Jui","Lui","Andy");

        strings.parallelStream()
                .forEach(System.out::println);
    }

    static void parallelToSquential(){
        List<String> people = asList("Jo","Jui","Lui","Andy");

        people.parallelStream()
                .sequential()//Bu adi stream demekdir
                .forEach(System.out::println);
    }

    static void limitExample(){
        List<Integer> list =asList(1,2,3,4,5,6,7,8,9,10);

        list.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    static void skipExample(){
        List<Integer> list =asList(1,2,3,4,5,6,7,8,9,10);

        list.stream()
                .skip(5)
                .forEach(System.out::println);
    }











}
