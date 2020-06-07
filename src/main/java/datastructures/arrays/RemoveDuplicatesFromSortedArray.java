package datastructures.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] usingTempVariable = removeDuplicatesFromSortedArray(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5});
        for(int a : usingTempVariable)
        {
            System.out.print(a);
        }

        System.out.println();
        int[] withoutTempVariable = removeDuplicatesFromSortedArrayWithoutTemp(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5});
        for(int a : withoutTempVariable)
        {
            System.out.print(a);
        }

    }

    public static int[] removeDuplicatesFromSortedArray(int [] arr)
    {
        int n = arr.length;
        int [] temp = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n-1];
        return temp;
    }


    public static int[] removeDuplicatesFromSortedArrayWithoutTemp(int [] arr)
    {
        int n = arr.length;
        int [] temp = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];
        return arr;
    }
}
