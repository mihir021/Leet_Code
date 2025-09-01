
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char ch : ransomNote.toCharArray()) {
            if (!magazine.contains(String.valueOf(ch))) {
                return false;
            }
            magazine = magazine.replaceFirst(String.valueOf(ch), "");
        }
        return true;
    }
}
