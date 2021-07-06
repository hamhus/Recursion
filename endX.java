//https://codingbat.com/prob/p105722
/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/
//
public String endX(String str) {
  if(str.length()==0) return "";
  if(str.length()==1) return str;
  //If the first element is "x", then push this to the end of the string, else append the first element
  if(str.substring(0,1).equals("x"))
    return endX(str.substring(1))+str.substring(0,1);
    
  return str.substring(0,1)+endX(str.substring(1));
}

/*Test case
eg: rexx

4. str.length=1, returns e
3. re => r==x => r+endX(e) == r+e (from step 4) = re
2. xre => x==x => endX(re)+str.substring (0,1) == re (step3) +x = rex
1. xxre => x==x => endX(xre)+str.substring (0,1) == rex (step2) + x = rexx
*/
