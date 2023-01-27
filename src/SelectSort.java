import java.util.Scanner;


class SelectSort 
{
	static int temp = 0;

	public void select_sort(int data[]) {
		Scanner keyboard = new Scanner(System.in);
		int size = 0, i=0;

		System.out.print("\nPlease enter number to sort ( enter 0 when end ):\n");
		do {
			System.out.printf("#%d number : ", ++i);
			data[size] = keyboard.nextInt();
		} while (data[size++] != 0);

		for (i = 0; i < 60; i++) 
			System.out.print("-");
		System.out.print("\n");
		
		System.out.print("\nOriginal data: ");
		for (i = 0; i < size-1; i++)
			System.out.print(data[i] + "  ");
		System.out.print("\n\n");
		
		sorting(data, --size);
		for (i = 0; i < 60; i++)  
			System.out.print("-");

		System.out.print("\nFinal sorted data: ");
		for (i = 0; i < size; i++)
			System.out.print(data[i] + "  ");
	}

	public static void sorting(int data[], int size) {
		int base = 0, compare = 0, min = 0, i = 0;

		for (base = 0; base < size - 1; base++) {
			min = base;
			for (compare = base + 1; compare < size; compare++)
				if (data[compare] < data[min])
					min = compare;
			System.out.printf("#%d selected data is : %d\n", base + 1, data[min]);
			
			temp = data[min];
			data[min] = data[base];
			data[base] = temp;  
				
			System.out.print("Partial sorted data: ");
			for (i = 0; i < size; i++)
				System.out.print(data[i] + "  ");
			System.out.print("\n\n");
		}
	}

	public static void main (String args[])	{
		SelectSort obj = new SelectSort();
		int[] data = new int[20];

		obj.select_sort(data);
	}
}

