class solution{
    public int lengthOfLastWord(String s){
        s=s.trim();
        int i=s.length() - 1;
        int count=0;

        while(i>0 && s.charAt(i)!= ' '){
            count++;
            i--;
        }
        return count;
    }
}

                                    scoreOfString
class solution{
    public int lengthOfLastWord(String s){
        
        int i=s.length() - 1;
        int count=0;
        //skip trailing spaces
        while(i>0 && s.charAt(i)==' '){
            i--;
        }
        //count the lastWord
        while(i>0 && s.charAt(i)!= ' '){
            count++;
            i--;
        }
        return count;
    }
}

                                    scoreOfString

class solution{
    public int lengthOfLastWord(String s){
        s=s.trim();
        int lastsapce=s.lastIndexOf('');

        return s.length()-lastsapce-1;
    }
}                                 