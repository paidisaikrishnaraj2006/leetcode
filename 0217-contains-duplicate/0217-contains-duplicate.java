class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        boolean hasDup=false;

        for(int num : nums){
            if(!set.add(num)){
                hasDup=true;
                break;
            }
        }
        return hasDup;
    }
}