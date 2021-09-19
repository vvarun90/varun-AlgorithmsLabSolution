package demoGL.Denomination;
import java.util.Scanner;

public class Currency {
	public static void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int[]notes, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			mergeSort(notes, left, mid);
			mergeSort(notes, mid + 1, right);

			// Merge the sorted halves
			merge(notes, left, mid, right);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of Denominations");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	  int denominations[]= new int[N];
		for(int i=0; i<N; i++)
	  {
		  System.out.println("Enter Denominations");
		  denominations[i]=sc.nextInt();
		  
	  }
		mergeSort(denominations,0, denominations.length-1);
		for(int i=0 ;i< denominations.length; i++)
			System.out.println(denominations[i]);
			
				System.out.println("Enter the amount you want to pay:");
				int amount=sc.nextInt();
				
				for (int i=0; i<denominations.length; i++) {
					if (amount> denominations[i]);
					int notes= amount/denominations[i];
					System.out.println(denominations[i]+":"+notes);
					amount= amount% denominations[i];
				}
				
	if(amount > 0)
	  System.out.println(" remaining amount: "+amount);
	}
}
