import java.util.Scanner;

class InsertSort
{
	static int temp = 0;
		
	public static void Insertion_Sort(int data[])
	{
		Scanner keyboard = new Scanner(System.in);
		int size=0,i=0;

		System.out.print("\nPlease enter number to sort ( enter 0 when end ):\n");
		do {  // �n�D��J��ƪ����J���s
			System.out.printf("#%d number : ", ++i);
			data[size] = keyboard.nextInt();     
		} while (data[size++] != 0);
		for (i = 0; i < 60; i++) 
			System.out.print("-");
		System.out.print("\n");
		sorting(data, --size);
		for (i = 0; i < 60; i++)  
			System.out.print("-");
		System.out.print("\nFinal sorted data: ");
		for (i = 0; i < size; i++)
			System.out.print(data[i] + "  ");
	}
	
	public static void sorting(int data[], int size)
	{
		int base = 0, compare = 0, i = 0;
		System.out.printf("First data is %d\n\n", data[0]);
		
		for (base = 1; base < size; base++) { 
			temp = data[base];
			compare = base;
			System.out.printf("Inserting data is %d\n", data[base]);
			while (compare > 0 && data[compare-1] > temp) {
				data[compare] = data[compare-1];
				data[compare-1]=temp;
				compare--;
			}
			
			System.out.printf("After #%d insertion: ", base);
			for (i = 0; i <= base; i++)
				System.out.print(data[i] + "  ");
			System.out.print("\n\n");
		}
	}

	public static void main (String args[])	 
	{
		InsertSort obj = new InsertSort();
		int[] data = new int[20];

		obj.Insertion_Sort(data);  
	}
}