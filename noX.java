//https://codingbat.com/prob/p118230
public String noX(String str) {
  if(str.length()==0) return "";
  //Iterate each character, if x is found, to remove, just call the func recursively,
  //else append the non-x character with the recursive func call.
  if(str.substring(0,1).equals("x"))
    return noX(str.substring(1));
  return str.substring(0,1)+noX(str.substring(1));
}
