// Matrix : Flipping an image
// To flip an image horizontally means that each row of the image is reversed.
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        // reverse each row
        for(int i=0; i<image.length; i++)
        {
            int st = 0, end = image[0].length-1;
            while(st<end && st<image[0].length)
            {
                // swap the elements of the row
                int temp = image[i][st];
                image[i][st] = image[i][end];
                image[i][end] = temp;
                
                st++;
                end--;
            }
        }
        
        // invert the image
        for(int i=0; i<image.length; i++)
        {
            for(int j=0; j<image[0].length; j++)
            {
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        
        return image;
    }
}
