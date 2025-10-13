package StringReverse;

public class RevStrToChar {
    public static void main(String[] args){
        String str = "Hello My name is Rahul";
        char[] strChar = str.toCharArray();

        for(int i=str.length()-1; i>=0; i--)
        {
                System.out.print(strChar[i]);
        }
    }
}
