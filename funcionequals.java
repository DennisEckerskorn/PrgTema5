public class funcionequals {
    public static boolean equals(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static int compare(String s1, s2){
        int n1 = charAt(s1);
        int n2 = charAt(s2);
    }
}

