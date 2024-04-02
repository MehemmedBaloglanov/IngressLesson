package Lesson6.two_abstract;

public class Developer implements AlghoritmicThinking,LogicalThinking{

    @Override
    public boolean isAbleToThink() {
        return true;
    }

    public static void main(String[] args) {
        Developer developer = new Developer();
        System.out.println(developer.isAbleToThink());
    }
}
