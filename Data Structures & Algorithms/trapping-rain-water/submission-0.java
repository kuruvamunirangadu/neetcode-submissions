class Solution {
    public int trap(int[] height) {
        int twater=0;
        for(int i=0;i<height.length;i++){
            int leftmax=0;
            for(int j=0;j<=i;j++){
                leftmax=Math.max(leftmax,height[j]);
            }

            int rightmax=0;
            for(int k=i;k<height.length;k++){
                rightmax=Math.max(rightmax,height[k]);
            }
            
            int water=Math.min(rightmax,leftmax)-height[i];
            twater=twater+water;
        }
        return twater;
    }
}
