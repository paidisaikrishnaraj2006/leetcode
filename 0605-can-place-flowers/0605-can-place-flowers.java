class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean leftEmp=(i==0 || flowerbed[i-1]==0);
                boolean rightEmp=(i==flowerbed.length-1 || flowerbed[i+1]==0);

                if(leftEmp && rightEmp){
                    flowerbed[i]=1;
                    n--;

                    if(n==0){
                        return true;
                    }
                }
            }

        }
        return n<=0;
    }
}