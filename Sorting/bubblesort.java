//BUBBLE SORT

public class bubblesort {

    public static void printarry(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int ar[] = {7,3,1,2,8};

        System.out.println("Array Before Sorting: ");
        printarry(ar);

        //Time Complexity: O(n^2)

        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                if(ar[j]>ar[j+1]){
                    int temp =ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        System.out.println("Array After Sorting: ");
        printarry(ar);


    }
}
