package demo;

/*
    ·´×ª×Ö·û´®
*/
public class ReverseString {
    public static void main(String[] args) {
        String s = reverse("string", 5);
        System.out.println(s);

    }

    public static String reverse(String a,int len){
        if(len == 0){
            return a.charAt(0)+"";
        }
        return a.charAt(len)+reverse(a, len-1);

    }
}
