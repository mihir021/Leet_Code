class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] freq = new int[26];

        for(int i = 0; i<magazine.length(); i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i<ransomNote.length(); i++){
            if(freq[ransomNote.charAt(i)-'a'] ==0) return false;
            else {
                int i2 = freq[ransomNote.charAt(i) - 'a'];
                i2--;
            }
        }
        return true;
    }
}