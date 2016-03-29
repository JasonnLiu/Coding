package sort;

import leetcode.util;

public class H_index {

	public int hIndex(int[] citations) {
		createHeap(citations);
		int i;
		for (i = 0; i < citations.length; i++) {
			if (citations[0] >= i + 1) {
				exch(citations, 0, citations.length - 1 - i);
				sink(citations, 0, citations.length - 1 - i - 1);
			} else {
				return i;
			}
		}
		return i;
	}

	public void heapsort(int[] a) {
		createHeap(a);
		for (int i = 0; i < a.length; i++) {
			exch(a, 0, a.length - 1 - i);
			sink(a, 0, a.length - 1 - i - 1);
		}
	}

	public void createHeap(int[] a) {
		for (int i = parent(a.length - 1); i >= 0; i--) {
			sink(a, i, a.length - 1);
		}
	}

	public void sink(int[] a, int k, int end) {
		int tmp = a[k];
		while (leftC(k) <= end) {
			int maxC;
			if (leftC(k) + 1 <= end && a[leftC(k)] < a[leftC(k) + 1]) {
				maxC = leftC(k) + 1;
			} else {
				maxC = leftC(k);
			}
			if (tmp < a[maxC]) {
				a[k] = a[maxC];
				k = maxC;
			} else {
				break;
			}
		}
		a[k] = tmp;
	}

	public int leftC(int k) {
		return 2 * k + 1;
	}

	public int parent(int k) {
		return (k - 1) / 2;
	}

	public void exch(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public int hIndex_opt(int[] citations) {
		int len = citations.length;
		int[] tmp = new int[len+1];
		for(int i = 0 ; i < citations.length ;i ++){
			if(citations[i] > len){
				tmp[len]++;
			}else{
				tmp[citations[i]]++;
			}
		}
		for(int i = len; i >=1;i--){
			tmp[i-1] = tmp[i-1] + tmp[i]; 
		}
		int j;
		for(j = len; j >=1 && tmp[j]<j;j--){
		}
		return j;
	}

	public static void main(String[] args) {
		H_index h = new H_index();
		int[] a = { 1, 1, 3, 6, 7, 10, 7, 1, 8, 5, 9, 1, 4, 4, 3 };
		h.hIndex(a);
		util.print(a);
	}

}
