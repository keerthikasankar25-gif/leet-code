class solution{
    public int maxDifference(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }

        int maxOdd = Integer.MAX_VALUE;
        int minEven = Integer.MIN_VALUE;

        for(int i=0;i<26;i++){

            if(freq[i]>0){
                if(freq[i]%2 != 0){
                    maxOdd = Math.max(maxOdd, freq[i]);
                }
                else{
                    minEven = Math.min(minEven, freq[i]);
                }
            }
        }
        return maxOdd - minEven;
    }
}