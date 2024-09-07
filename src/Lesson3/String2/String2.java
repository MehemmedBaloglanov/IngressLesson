package Lesson3.String2;

public class String2{
    public static void main(String[] args) {
     example14();

    }
    static void example1(){
        String name = "John";
        String surname = new String("Snow");
        System.out.println(name);
        System.out.println(surname);
    }

    static void example2(){
        String value = String.valueOf(3);
        System.out.println(value);
    }

    static void example3(){
        String name = "John";
        char c = name.charAt(2);
        System.out.println(c);
    }

    static void example4(){
        String firstName ="John";
        String lastName ="Snow";
        String fullName=lastName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(fullName.concat(" " + lastName));
        System.out.println(firstName + " " + lastName);
    }

    static void example5(){
        String test = "Java";
        boolean isContain=test.contains("av");
        System.out.println(isContain);
    }

    static void example6(){
        String str = "Starbucks";
        boolean isStarted=str.startsWith("Star");
        boolean isEnded=str.endsWith("Star");
        System.out.println(isStarted);
        System.out.println(isEnded);
    }

    static void example7(){
        String test = "      test ";
        System.out.println(test);
        System.out.println(test.trim());
    }

    static void example8(){
        String test = "Hello";
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
    }

    static void example9(){
        String test ="Hello";
        int index = test.indexOf('e');
        System.out.println(index);
        int lastIndex=test.lastIndexOf('l');
        System.out.println(lastIndex);
    }

    static void example10(){
        String str = "Hello World";
        System.out.println(str.substring(4));
        System.out.println(str.substring(1,4));
    }

    static void example11(){
        String str ="Hello";
        System.out.println(str.replace('l','L'));
    }

    static void example12(){
        String name = "John";
        String surname= "Snow";
        System.out.println(name.equals(surname));
    }

    static void example13(){
        String str = "Hi,Student,f";
        String [] strings = str.split(",");
        for (String s : strings){
            System.out.println(s);
        }
    }

    static void example14(){
//   StringBuffer s = "Test"; yazsaq komplasiya erroru verecek
        StringBuffer sb =new StringBuffer("test");
        sb.append('-').append("test");
        System.out.println(sb);
        sb.append(true);
        System.out.println(sb);
        sb.append(1);
        String a = sb.toString();
        System.out.println(a);
    }

    static void example15(){
        StringBuffer stringBuffer =new StringBuffer("I Java");
        stringBuffer.insert(2,"love");
    }

    static void example16(){
        StringBuffer stringBuffer = new StringBuffer("palindrome");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }

    static void example17(){
        StringBuffer stringBuffer = new StringBuffer("I do not like Java");
        stringBuffer.delete(2,8);
        System.out.println(stringBuffer);
    }

    static void example18(){
        String t = "t";
        String cat1 = "ca" + t;
        System.out.println(cat1);
        String cat2 = "cat";
        System.out.println(cat1==cat2);
    }

    static void example19(){
        String text ="sum" + 1+2;
        System.out.println(text);
        String test="sum" + (1+2);
        System.out.println(test);
        String test2 = 1+2+"=3";
        System.out.println(test2);
    }

    static void example20(){
        String text1 ="Java";
        String text2 = "Java";
        System.out.println(text1==text2);//true
        System.out.println(text1.equals(text2));//true
    }

    static void example21(){
        String text1 = new String("java");
        String text2 = new String("java");
        System.out.println(text1==text2);//false
        System.out.println(text1.equals(text2));//true
    }

    static void example22(){
        String str = new String("Java");
        System.out.println(str.concat("Love"));
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder.append("Love"));
        System.out.println(stringBuilder);
    }







}
