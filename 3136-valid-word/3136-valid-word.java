class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vow=0;
        int con=0;
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vow++;
                }else{
                    con++;
                }
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return vow>0 && con>0;
    }
}