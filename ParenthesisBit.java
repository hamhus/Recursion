//https://codingbat.com/prob/p137918
/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/
public String parenBit(String str) {
  
  if(str == null) return str;
  else if(str.length() > 0 && str.substring(0, 1).equals(")")) return ")";
  //else if(str.contains(")")) return ")";
  //str.charAt(0)==')'
  
  if(str.substring(0, 1).equals("(") || !str.contains("(") && str.contains(")"))
    return str.substring(0, 1)+parenBit(str.substring(1));
  //else if(!str.contains("(") && str.contains(")"))
    //return str.substring(0, 1)+parenBit(str.substring(1));
  return parenBit(str.substring(1));
}


