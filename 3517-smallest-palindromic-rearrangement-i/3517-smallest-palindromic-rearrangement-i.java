class Solution {
    public String smallestPalindrome(String s) {
        char[]arr=s.toCharArray();
        Arrays.sort(arr);

        char[]ans=new char[arr.length];
        int left=0,right=arr.length-1;

        int i=0;
        while(i<arr.length){
            int j=i;
            while(j<arr.length && arr[j]==arr[i]){
                j++;
            }
            int count=j-i;

            while(count>=2){
                ans[left++]=arr[i];
                ans[right--]=arr[i];
                count-=2;
            }
            if(count==1){
                ans[arr.length/2]=arr[i];
            }
            i=j;
        }
        return new String(ans);
    }
}