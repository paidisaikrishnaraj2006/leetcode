class Solution {
    public int vowelConsonantScore(String s) {
        int vow=0;
        int con=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vow++;
                }else{
                    con++;
                }
            }
        }
        if(con==0){
            return 0;
        }
        return vow/con;
    }
}