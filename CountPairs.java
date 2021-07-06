//https://codingbat.com/prob/p154048
/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
*/

public int countPairs(String str) {
  //Since the problem said pairs seperated by a char, any string length <= 2 will return zero pairs
  if(str.length() <=2) return 0;
  //Compare the first element with the third element, if they are same, increment 1
  //and make a recursive call with the rest of the string
  if(str.substring(0,1).equals(str.substring(2,3)))
    return 1+countPairs(str.substring(1));
  //else recurisve call the remaining string
  return countPairs(str.substring(1));
}
