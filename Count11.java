//https://codingbat.com/prob/p167015
/*
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public int count11(String str) {
  
  //Since the string "11" is of length=2, any length less than 2 will return 0 (base case)
  //I will use the substring with length 2 at each recursive call and see if there is a match
  //If there is a match, increment by 1, make a recursive call from string length=2
  //else continue with the rest of the string
  
  if(str.length()<2) return 0;
  
  if(str.substring(0,2).equals("11"))
    return 1 + count11(str.substring(2)); //2 because the substrings don't overlap, otherwise 1
    
  return count11(str.substring(1));
}
