public class PruebaCompare {
    public static void main(String[] args){
       int num = compareTo("AB", "BC");
       System.out.println(num);
    }
    public static int compareTo(String s1, String s2){
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < s1.length(); i++){
             suma1 += (int) s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++){
            suma2 += (int) s2.charAt(i);
        }
        return suma1 - suma2;
    }    
}
