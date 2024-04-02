package Lesson21.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName= System.getProperty("user.dir")+
                File.separator+
                "serializedFile.txt";
        serialize(fileName);
        deserialize(fileName);
    }

    public static void serialize(String fileName){
        User user= new User(1,"John","a");

        try (FileOutputStream fileOutputStream=new FileOutputStream(fileName)){
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
        }catch (IOException e){
            System.out.println(e.getCause());
        }
    }

    public static void deserialize(String filaName){
        User user=null;

        try (FileInputStream inputStream =new FileInputStream(filaName)){
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            user =(User) objectInputStream.readObject();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        System.out.println(user);
    }
}
