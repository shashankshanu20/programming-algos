package personal.programming.algos.binarysearch;

import java.util.ArrayList;

public class SearchInBitonicArray {
    public static void main(String []args){

    }

    public int solve(ArrayList<Integer> A, int B) {
            int ans = -1;
            int start = 0, end = A.size() - 1;
            int mid = 0;
            while(start<=end)
            {
                mid = start + (end-start)/2;
                if(A.get(mid)>A.get(mid+1) && A.get(mid)>A.get(mid-1))
                    break;
                else if(A.get(mid)<A.get(mid+1) && A.get(mid-1)<A.get(mid))
                    start = mid+1;
                else
                    end = mid-1;
            }
            if(A.get(mid) == B)
                return mid;
            int l = asc(A,0,mid-1,B);
            int r = dsc(A,mid+1,A.size()-1,B);
            if(l!=-1 || r!=-1)
                return l!=-1?l:r;
            return -1;
    }

    public int asc(ArrayList<Integer> A, int low, int high, int B)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == B)
                return mid;
            else if (A.get(mid) > B)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }


    public int dsc(ArrayList<Integer> A, int low, int high, int B)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == B)
                return mid;
            else if (A.get(mid) < B)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

}
