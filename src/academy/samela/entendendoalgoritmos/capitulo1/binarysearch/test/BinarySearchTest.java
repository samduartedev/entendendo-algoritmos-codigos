package academy.samela.entendendoalgoritmos.capitulo1.binarysearch.test;

import academy.samela.entendendoalgoritmos.capitulo1.binarysearch.domain.BinarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,9};
        int target = 6;
        BinarySearch search = new BinarySearch();
        int result = search.binarySearch(arr,target);
        if (result != -1){
            System.out.println("Element found in position " + result);
        } else {
            System.out.println("Element not found!");
        }


    }
}
