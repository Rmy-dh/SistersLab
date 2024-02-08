package Week_5;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int minValueOfHeight,distance,maxArea=0,leftLocation=0,rightLocation=height.length-1;

        while (leftLocation<rightLocation){
            minValueOfHeight=Math.min(height[leftLocation],height[rightLocation]);
            distance=rightLocation-leftLocation;
            maxArea=Math.max(maxArea,minValueOfHeight*distance);
            if(height[leftLocation]<height[rightLocation]){
                leftLocation++;

            }else{
                rightLocation--;

            }
        }
        System.out.println("Answer is: "+maxArea);


    }
}
