public class Solution {
 public String reverseWords(String a) {
     //split and then reverse them//
    String s[] = a.split(" ");
    if(s.length == 1)return s[0];
    StringBuilder sb = new StringBuilder();
    for(int i = s.length - 1; i > 0; i--){
        sb.append(s[i]+" ");
    }
    sb.append(s[0]);
    return sb.toString();
 }
}
