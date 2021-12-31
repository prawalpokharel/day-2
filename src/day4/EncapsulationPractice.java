package day4;

public class EncapsulationPractice {

    public static void main(String[] args) {
        Student student1 = new Student();
        //student1.name = "Ram";
        student1.setName("Ram");
        student1.playing();

        Student student2 = new Student();
        //student2.name = "Hari";
        student2.setName("Hari");
        student2.playing();


    }
}
