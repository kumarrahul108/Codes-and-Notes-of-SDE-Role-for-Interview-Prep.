
// Sortings in Java  

public class Sortings    
{
    // *** Array Traversal *** 
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + "  ");
        } 
    }


    // *** Bubble Sorting *** 
    public static void bubbleSort(int a[],int n)
    {
        // No of Passes 
        for(int i=0;i<(n-1);i++)
        {
            // Total No of Comparison 
            for(int j=0;j<(n-i-1);j++)
            {
                // comparison between adjacent elements 
                if(a[j] > a[j+1])
                {
                    // swap adjacent elements
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        // display new updated array 
        display(a);
    }   


    // *** Selection Sorting *** 
    public static void selectionSort(int a[],int n)
    {
        // No of Passes
        for(int i=0;i<(n-1);i++)
        {
            int min = i; // assume 1st value in pass as minimum

            // comparison with all the elements 
            for(int j=i+1;j<n;j++) 
            {
                if(a[j] < a[min]) 
                {
                    min = j;
                }
            }
            // swap the min. element with (i)th element 
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;   
        }

        // display new updated array 
        display(a);
    }    


    // *** Insertation Sorting *** 
    public static void insertationSort(int a[],int n)
    {
        // No of Passes
        for(int i=1;i<n;i++)
        {
            int j = i-1;  // to track sorted part 
            int curr = a[i];

            // comparison 
            while(j >= 0 && curr < a[j])
            {
                a[j+1] = a[j];  // shift each element 1 step ahead
                j--;
            } 

            a[j+1] = curr;
        }

        // display new updated array 
        display(a);
    }


    // *** Count Sorting *** 
    public static void countSort(int a[],int n)
    {
        int max = arrayMax(a, n);

        int count[] = new int[max + 1];

        // initialise each element of count array to 0
        for(int i=0;i<count.length;i++)
        {
            count[i] = 0;
        } 

        // mark 1 for element in count array wrt original array
        for(int i=0;i<n;i++)
        {
            count[a[i]] = count[a[i]] + 1;
        } 

        int i= 0;
        int j = 0;

        // put our main data 
        while(i <= max)
        {
            if(count[i] > 0)
            {
                a[j] = i;
                count[i] = count[i] -1;
                j++;
            }
            else 
            {
                i++; 
            }
        }

        // display new updated array
        display(a);
    }


    // *** Get Max. from the Array *** 
    public static int arrayMax(int a[],int n)
    {
        int max = a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        } 

        return max; 
    }


    // *** Quick Sorting *** 
    public static void quickSort(int[] a, int low,int high)
    {
        if(low < high)
        {
            int pidx = partition(a,low,high);

            // less than pivot 
            quickSort(a, low, pidx -1);

            // greater than pivot
            quickSort(a, pidx + 1, high); 
        }

        // display new updated array
        // display(a);
    }


    // *** Partition the Pivot *** 
    public static int partition(int a[],int low,int high)
    {
        int pivot = a[high];
        int i = low -1 ;  // track for empty spaces
        
        for(int j=low;j<high;j++)
        {
            // element < pivot
            if(a[j] < pivot)
            {
                i++;  // space created to store smaller element
                // swap : -> phele jo us position par store element with jo abhi element mila  
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
            } 
        }
        i++; // add 1 more space to pivot 

        // swap pivot : -> pivot end me hai so put it at its excat position in array
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        
        return i;   // pivot index 
    }


    // *** Merge Sorting *** 
    // *** Divide the Array ***
    public static void divide(int[] a, int si,int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei-si)/2;
        divide(a, si, mid);
        divide(a, mid+1, ei); 
        conquer(a,si,mid,ei);
    }


    // *** Merge the Array *** 
    public static void conquer(int a[],int si,int mid,int ei)
    {
        int merged[] =  new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0; // to track index of merged array

        while(idx1 <= mid && idx2 <= ei)
        {
            if(a[idx1] <= a[idx2])
            {
                merged[x++] = a[idx1++];
            }
            else 
            {
                merged[x++] = a[idx2++];
            }
        }

        // for array 1 copying its elements into merged array
        while(idx1 <= mid)
        {
            merged[x++] = a[idx1++];
        }

        // for array 2 copying its elements into merged array
        while(idx2 <= ei)
        {
            merged[x++] = a[idx2++];
        }

        int j = si;
        // to copy merged array into original array 
        for(int i=0;i<merged.length;i++)
        {
            a[j] = merged[i];
            j++;
        }
    }



    // *** Main Functions *** 
    public static void main(String[] args) 
    {
        int arr[] = {34,23,78,12,10,67,56};    
        int n = arr.length; 

        System.out.print("\nArray ELements                        :  ");
        display(arr);

        System.out.print("\n\nArray ELements after Bubble Sort      :  ");
        bubbleSort(arr, n); 

        System.out.print("\n\nArray ELements after Selection Sort   :  ");
        selectionSort(arr, n); 

        System.out.print("\n\nArray ELements after Insertation Sort :  ");
        insertationSort(arr, n);
        
        System.out.print("\n\nArray ELements after Count Sort       :  ");
        countSort(arr, n);

        System.out.print("\n\nArray ELements after Quick Sort       :  ");
        quickSort(arr, 0,n-1);
        display(arr);

        System.out.print("\n\nArray ELements after Merge Sort       :  ");
        divide(arr, 0,n-1);
        display(arr);
    }
}