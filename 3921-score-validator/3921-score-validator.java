class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;

        for(String num:events){
            if(num.equals("W")){
                counter++;
                if(counter==10){
                    break;
                }
            }else if(num.equals("WD")||num.equals("NB")){
                score++;
            }else{
                score+=Integer.parseInt(num);
            }
        }
        return new int[]{score,counter};
    }
}