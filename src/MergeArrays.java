public class MergeArrays {
    public static void main(String[] args) {
        int[] arr = {1, 112, 3, 5};
        int[] arr1 = {3, 55, 7, 88};
        int[] finalArr = new int[arr.length + arr1.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < finalArr.length) {
            int val1 = arr[j];
            int val2 = arr1[k];
            if (i == arr.length) {
                if (j == arr1.length) {
                    System.out.println("we are done");
                }
                while (j < arr1.length) {
                    finalArr[k] = arr1[j];
                    j++;
                    k++;
                }
            } else if (j == arr1.length) {
                while (j < arr1.length) {
                    finalArr[k] = arr1[j];
                    j++;
                    k++;
                }
            }


            if (val1 < val2) {
                finalArr[k] = val1;
                i++;
                j++;
            } else {
                finalArr[k] = val2;
                i++;
                k++;
            }


        }

    }
}
