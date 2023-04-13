public class Animal {
    void eat() {

    }
}
class Dog extends Animal{
    void eat() {
        System.out.println("Eating Any Food!");
    }
}
class Lion extends Animal{
    void eat() {
        System.out.println("Eating Meat Only!");
    }
}class Run {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal l= new Lion();
        d.eat();
        l.eat();
    }
}