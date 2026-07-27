class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int num:candies){
            if(num>max){
                max=num;
            }
        }
        List<Boolean>res=new ArrayList<>();

        for(int candy:candies){
            res.add(candy+extraCandies>=max);
        }
        return res;
    }
}