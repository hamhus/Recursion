public boolean strCopies(String str, String sub, int n) {
  //Took 20 mins to solve
  /*
  The "n" matches number of substring, therefore make recurisve call to see if you
  have exactly n number of matches and decrease n at each recursive call.
  Because the question mentioned overlapping, compute the string with sub length,
  and see if they match. If they do, make a recursive call with string at position 1, 
  the sub string and decrease 'n'
  The base condtion - str<sub lengths and n==0 for true, else false.
  */
  
  //if(str.length()==0) return false;
  //if(str.length()<sub.length()) return false;
  if(str.length()<sub.length() && n==0) return true;
  else if(str.length()<sub.length()) return false;
  
  if(str.substring(0, sub.length()).equals(sub))
    return strCopies(str.substring(1), sub, --n);
    
  return strCopies(str.substring(1), sub, n);
  
}
