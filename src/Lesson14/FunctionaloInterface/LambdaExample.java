package Lesson14.FunctionaloInterface;

import java.util.Comparator;

public class LambdaExample {
        public static void comparatorExample() {
            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.length() - s2.length();
                }
            };
            Comparator<String> lambdaComparator = (s1,s2) ->s1.length()-s2.length();
            Comparator<String> lambdaComparator2 =Comparator.comparingInt(String :: length);

        }

        public static void ownInterfaceExample(){
            TestClass testClass = new TestClass();

            //Anonym class
//            testClass.testLambda(new FunctionalInterfaceExample(){
//
//                @Override
//                public void test() {
//                    System.out.println("with lambda");
//                }
//            }); // BU Java8 den evvel olandir

            testClass.testLambda(()-> System.out.println("with lambda")); // Java8 den sonra ise bu lambda exspression geldi ve artiq
            //bele yazilmaga baslandi


        }

    public static void main(String[] args) {
        comparatorExample();
    }


}
