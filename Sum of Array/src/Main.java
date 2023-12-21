class Animal{

    static {
        System.out.println("Static block of  Animal Class");
    }
     {
        System.out.println("Non Static block of  Animal Class");
     }
    Animal(){
        this(1);
        System.out.println("No Arg Constructor of Animal Class");
    }
    Animal(int i){
        System.out.println("int Arg Constructor of Animal Class");
    }
}
class Mammal extends Animal{

    static {
        System.out.println("Static block of Mammal Class");
    }
    {
        System.out.println("Non Static block of Mammal Class");
    }
    Mammal(String i , int j){
        System.out.println("String , int Arg Constructor of Mammal Class");
    }
}
class Reptails extends Animal{

    static {
        System.out.println("Static block of  Reptails Class");
    }
    {
        System.out.println("Non Static block of Reptails Class");
    }

    Reptails(char c){
        super(1);
        System.out.println("char Arg Constructor of Reptails Class");
    }
}
class Cat extends Mammal{
    static int j = mTwo();
    int i = mOne();
    static {
        System.out.println("Static block of Cat Class");
    }
    {
        System.out.println("Non Static block of Cat Class");
    }
    Cat(int [] arr){
        super("ABC",10);// Paused
        System.out.println("Array int Arg Constructor of Cat Class");
    }
    public int mOne(){
        System.out.println("mOne Method Cat Class");
        return 30;
    }
    public static int mTwo(){
        System.out.println("mTwo Method Cat Class");
        return 40;
    }
}
class Lizard extends Reptails{
    static int j = mTwo();
    int i = mOne();
    static {
        System.out.println("Static block of Lizard Class");
    }
    {
        System.out.println("Non Static block of Lizard Class");
    }
    Lizard(){
        super('a');
        System.out.println("no Arg Constructor of Lizard Class");
    }
    public int mOne(){
        System.out.println("mOne Method Lizard Class");
        return 20;
    }
    public static int mTwo(){
        System.out.println("mTwo Method Lizard Class");
        return 10;
    }
}
public class Main {
    static {
        System.out.println("Static block of  Executable Class");
    }
    {
        System.out.println("Non Static block of  Executable Class");
    }

    public static void main(String[] args) {

        Cat c = new Cat(new int[5]);
        c.mOne();
        Lizard L = new Lizard();
        L.mOne();
        Lizard.mTwo();
        Cat.mTwo();

    }
}