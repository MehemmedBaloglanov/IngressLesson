package Lesson6.oneDefault_oneAbstract;

public interface  Named {
    default String getName(){
        return "Lesson6.oneDefault_oneAbstarct";
    }

    static String test(){
        return "test";
    }
}
