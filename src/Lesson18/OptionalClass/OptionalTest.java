package Lesson18.OptionalClass;


import java.util.Optional;
import java.util.SortedMap;

public class OptionalTest {
    public static void main(String[] args) {
//        test();
//        test1(); java.lang.NullPointerExcaption
//        test2();
//        test3();Optional.empty
//        test4();
//        test5();
        test6();

    }

    static void test(){
        Optional<String > name = Optional.of("John");
        System.out.println(name);
    }

    static void test1(){
      Optional<String > name = Optional.of(null);

    }

    static void test2(){
        Optional<String> name = Optional.ofNullable("John");
        System.out.println(name);
    }

    static void test3(){
        String john = null;
        Optional<String> name = Optional.ofNullable(john);
        System.out.println(name);
    }
    static void test4(){
        Optional<String > emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
    }

    static void test5(){
        Optional<String > name = Optional.of("John");
        System.out.println(name.get());

        Optional<String > nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional.get());
    }

    static void test6(){
        Optional<String> name = Optional.of("John");
        if(name.isPresent()){
            System.out.println(name.get());
        }

        Optional<Object> empty = Optional.empty();
        if(empty.isPresent()){
            System.out.println(empty.get());
        }
    }

    static void test7(){
        Optional<String> name= Optional.of("John");
        name.ifPresent(System.out::println);

        Optional<String> empty = Optional.empty();
        empty.ifPresent(System.out::println);
    }
    static void test8(){
        Optional<String> name = Optional.of("John");
        System.out.println(name.orElse("Blank"));

        Optional<Object> empty = Optional.empty();
        System.out.println(empty.orElse("Blank"));
    }

    static void test9(){
        Optional<String> name = Optional.of("John");
        System.out.println(name.orElseGet(() -> "Blank"));

        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElseGet(() -> "Blank"));
    }

    static void test10(){
        Optional<String> name = Optional.of("John");
        String nameValue = name.orElseThrow(() -> new RuntimeException());
        System.out.println(nameValue);

        Optional<Object> empty = Optional.empty();
        Object emptyValue = empty.orElseThrow(RuntimeException::new);
    }

    static void test11(){
        Optional<String > name = Optional.of("JOHN");
        System.out.println(name.map(String::toLowerCase));

        Optional<String> empty =Optional.empty();
        System.out.println(empty.map(String::toLowerCase));
    }
}
