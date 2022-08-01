package functionalinterface;

public class Main {
    public static void main(String[] args) {
       Greeting gr = new Greeting() {
           @Override
           public void greet(String name) {
               System.out.println(name+" Hello World");   /*Annonymous inner class*/
           }
       };
       gr.greet("Venkatesh");

       Greeting gr2 = (name) -> {
               System.out.println(name+" Hello World");
       };
       gr2.greet("Somesh");
    }
}

