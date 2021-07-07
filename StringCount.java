//https://codingbat.com/prob/p186177

public int strCount(String str, String sub) {
  /*key is - Substrings not overlapping
  Problem approach: After I match the substring, I can move to the next element following
  that substring.
  Approach this problem recursively at every substring length. If the substring
  is matched, increment the count, make recursive call with str.length()+3
  Else, continue to the next element recursively (str.substring(1))
  
  Base case : if the string length is less than the substring length, return 0
  */
  
  if(str.length() < sub.length()) 
    return 0;
  
  if(str.substring(0, sub.length()).equals(sub)) 
    return 1+strCount(str.substring(sub.length()), sub);
  return strCount(str.substring(1), sub);
  
}
