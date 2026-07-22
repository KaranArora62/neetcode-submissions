class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(str1.length != str2.length) return false;
        int i = 0;
        int j = 0;

        while(i < str1.length){

            if(str1[i] != str2[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
