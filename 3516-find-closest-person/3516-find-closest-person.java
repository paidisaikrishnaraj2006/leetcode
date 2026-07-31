class Solution {
    public int findClosest(int x, int y, int z) {
        int min1=Math.abs(x-z);
        int min2=Math.abs(y-z);
        int per=0;
        if(min1<min2){
            per = 1;
        }else if(min2<min1){
            per = 2;
        }else if(min1==min2){
            per = 0;
        }
        return per;
    }
}