public class Persontask2
 {
    private String name;
    private int age;

    public Persontask2() {
        this.name = "";
        this.age = 18;
    }

    public Persontask2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Persontask2 person1 = new Persontask2();
        person1.displayInfo();


        Persontask2 person2 = new Persontask2("Puneethrajkumar", 50);
        person2.displayInfo();
    }
}
