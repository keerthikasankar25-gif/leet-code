class solution{
    public int numUniqueEmails(String[] emails){
        HashSet<String>set=new HashSet<>();
        
        for(int email:emails){
            String[] parts=email.split("@");
            
            String local=parts[0];
            String domain=parts[1];

            for(int i=0;i<local.length();i++){
                 char ch=local.charAt(i);
                 if(ch=='+'){
                    break;
                 }
                 if(ch!='.'){
                    result.append(ch);
                 }
            }
            set.add(result.toString()+"@"+domain);
        }
        return set.size();
    }
}