package Lesson22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Test test= new Test();
        Class class1= test.getClass();

        Constructor[] constructors= class1.getConstructors();
        for(Constructor c : constructors){
            System.out.println("Constructor is " +c );
        }

        Method [] methods=class1.getDeclaredMethods();
        for(Method m: methods){
            System.out.println("Method is " +m );
            m.setAccessible(true);
            System.out.println(m.invoke(test,"Hiiii"));
        }

        Field [] fields= class1.getDeclaredFields();
        for(Field f:fields){
            try {
                System.out.println("Field is "+f);
                f.setAccessible(true);
                System.out.println(f.getInt(test));
                f.setInt(test,5);
                System.out.println(f.getInt(test));
            }catch (Exception e){

            }
        }

    }
}
