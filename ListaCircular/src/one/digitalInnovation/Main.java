package one.digitalInnovation;


public class Main {
    public static void main(String[] args) {

        ListaCircular<String> myList = new ListaCircular<>();

        myList.add("Hi");
        myList.remove(0);


        System.out.println(myList);

    }
}