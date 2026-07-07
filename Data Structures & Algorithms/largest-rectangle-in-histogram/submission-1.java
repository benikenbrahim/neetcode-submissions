//Solution optimise (stack):
class Solution {
    public int largestRectangleArea(int[] heights) {
            int max_area=0;
        for(int i=0;i<heights.length;i++){
            int countright=0;
            int countleft=0;
            int k=i-1;
            int j=i;
            while(k>=0 && heights[k]>=heights[i]){
                countleft+=1;
                k-=1;
            }
            while(j<heights.length && heights[j]>=heights[i]){
                countright+=1;
                j+=1;
            }
            int area = heights[i]*(countright+countleft);
            if (area > max_area){
                max_area=area;
            }
        }
        return max_area;
    }
}
