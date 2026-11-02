class solution{
    public String longestCommonPrefix(String[] strs){

        int prefix=strs[0];

        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return " ";
                }
            }
        }
        return prefix;
    }
}