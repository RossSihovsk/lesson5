package task_1;
abstract  class  Pet{
    public abstract  void display();
}

class Dog extends  Pet{


    public void display() {
        System.out.println("Я пес - Гаууу-Гауу");
    }

}


class  Cat extends  Pet{

    @Override
    public void display() {
        System.out.println("Я кіт - Мяууу-Мяууу");

    }
}

class  Cow extends  Pet{

    @Override
    public void display() {
        System.out.println("Я корова - Мяууу-Мяууу");

    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();

        Cat cat = new Cat();
        cat.display();

        Cow cow = new Cow();
        cow.display();
    }

    }



