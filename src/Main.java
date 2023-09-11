import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        String cadena = "a,c,g,h,e,j,k,i,a,o,g,l,s,f,u";

        aList.add("a");
        aList.add("c");

        for(String c : aList){
            String[] vocal = {"a", "e", "i", "o", "u"};
            for (String s : vocal) {
                if (c.contains(s)) {
                    System.out.println(c + " es una vocal.");
                } else {
                    System.out.println(c + " es una consonante.");
                }
                break;
            }
        }
    }
}