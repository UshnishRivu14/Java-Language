public class selectionsort {
    public static void main(String[] args){
        int ar[] = {7,8,3,1,2};
        int n = ar.length;
        int small,temp;

        System.out.print("Array Before sort:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

        //Selection sort
        for (int i = 0; i < n-1; i++) {
            small = i; //setting smallest no. index as 0
            for (int j = i+1; j < n; j++) {
                if(ar[small]>ar[j]){
                    small = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[small];
            ar[small] = temp;
        }

        System.out.println();
        System.out.print("Array after sort:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
