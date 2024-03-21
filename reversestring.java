/**
 * reversestring
 */
public class reversestring {

public static void main(String[] args) {
    
    String a ="rajaryan";
    String b="";

    for(int i = 0; i<a.length(); i++){

        b = a.charAt(i)+b;
    }

    System.err.println(b);
}
}