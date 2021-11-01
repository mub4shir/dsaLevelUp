package strings;

public class CanFormPalindrome {
    public static void main(String[] args) {
        String str="aabbccdde";
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++)
            freq[str.charAt(i)-'a']++;

        int odd=0;
        for (int i = 0; i < 26; i++) {
            if((freq[i]&1)!=0) odd++;
            if(odd>1) {System.out.println(false); return;}
        }
        System.out.println(true);
        return;
    }
}
