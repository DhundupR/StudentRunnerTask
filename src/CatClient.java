public class CatClient {
    public static void main(String[] args){
        Cat cat1 = new Cat("Bubbles", 12, 3.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jim", 4, 5.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
