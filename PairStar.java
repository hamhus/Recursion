public String pairStar(String str) {
  if(str.length()==0) return "";
  if(str.length()==1) return str;
  
  //if(str.substring(0,1).equals(str.substring(1,2)))
    //return str.substring(0,1)+"*"+pairStar(str.substring(1));
  //return str.substring(0,1)+pairStar(str.substring(1));
  
  //OR
  
  return (str.substring(0,1).equals(str.substring(1,2)))?
        str.substring(0,1)+"*"+pairStar(str.substring(1)):str.substring(0,1)+pairStar(str.substring(1));
}
