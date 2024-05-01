package Week_2.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Kazuya Mishima",30,120,86,40,50);
        Fighter f2 = new Fighter("Heihachi Mishima",40,100,85,30,50);

        Match match=new Match(f1,f2,70,150);
        match.run();
    }
}
