package Lesson6.Class_And_Interface_Have_Same_Method;

public class ExampleResualt extends Example implements Examples{
    public static void main(String[] args) {
        ExampleResualt exampleResualt = new ExampleResualt();
        System.out.println(exampleResualt.getCount()); // Burada hem Example classindan extends edib Examples interfaceinden ise
        //Implements edib ama ki eyni methodu cagiranda extendin iyarxiyasi gucludur diye onu birinci cagirir
    }
}
