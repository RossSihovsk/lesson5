package task_3;

class Amphibia {

    public void eat() {
        System.out.println("Хочу їсти!");
    }

    public void sleep() {
        System.out.println("Хочу спати!");
    }

    public void swim() {
        System.out.println("Хочу плавати!");
    }

    public void walk() {
        System.out.println("Хочу гуляти!");
    }

}


class Frog extends Amphibia
{ }






public class Main {

    public static void main(String[] args) {

        Amphibia frog = new Frog();

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

    }

}
