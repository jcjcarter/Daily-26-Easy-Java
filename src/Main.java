public class Main {

    public static void main(String[] args){

        Duplicate duplicate = new Duplicate();

        duplicate.trimDuplicate("dailyprogramer");

        System.out.println(duplicate.wordLeftovers);

        System.out.println(duplicate.wordTrimmed);
    }
}
