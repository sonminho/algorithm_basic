import java.util.Scanner;

public class QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2]; // �ǹ�
		
		do{
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			
			if(pl <= pr)
				swap(a, pl++, pr--);
		}while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ����");
		System.out.print("��� �� ? ");
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		quickSort(a, 0, n-1);
		
		System.out.println("�������� ���");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " "); 
		}
	}
}
