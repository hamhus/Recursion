public int countX(String str) {
  //if(str.length()==0) return 0;
  
  //if(str.substring(str.length()-1,str.length()-1)=="x")
    //return 1+countX(str.substring(0, str.length()-2));
  //return countX(str.substring(0, str.length()-2)); 
  if(str.length() == 0) return 0;
  //if(str.length() == 1 && str.charAt(0) == 'x') return 1;
  //else if(str.length() == 1 && str.charAt(0) != 'x') return 0;
  //else countXs(str,)
  if(str.substring(0,1).equals("x"))
    return 1 + countX(str.substring(1));
  return countX(str.substring(1));
}
