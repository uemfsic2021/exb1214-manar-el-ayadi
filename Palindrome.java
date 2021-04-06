public class Palindrome {
  public static boolean is_palindrome(String s) {
    String reverse = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      reverse = reverse + s.charAt(i);
    }
    if (s.equalsIgnoreCase(reverse)) { 
      return true;
      
    } 
    else {
      return false;
      
    }
    

  }
}
