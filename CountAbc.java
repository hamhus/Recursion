//https://codingbat.com/prob/p161124
/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

*/

public int countAbc(String str) {
  //The first thing that comes to my mind - the strings "abc" and "aba" are of length=3,
  //I will use the substring with length 3 at each recursive call and see if there is a match
  //If there is a match, increment by 1, else continue with the rest of the string
  //Question- Does the substring have to be consecutive abc or aba, or can we have something
  //like "ababc"
  
  //If the string length is less than, return zero since there are no combinations of abc
  // and aba for less than string length 3.
  if(str.length()<3) return 0;
  
  if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
    return 1 + countAbc(str.substring(1));
    
  return countAbc(str.substring(1));
}
