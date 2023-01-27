import java.util.Scanner;


class sorting 
{
	int temp = 0;
	public void bubble_sort(int data[])
	{
		int size = 0, i = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nPlease enter number to sort ( enter 0 when end ):\n");
		do {
			System.out.printf("#%d number : ", ++i);
			data[size] = keyboard.nextInt();
		} while (data[size++] != 0);
		for (i = 0; i < 60; i++) 
			System.out.print("-");
		System.out.print("\n");
		sorting(data, --size);  // --size�Ω�N��Ƭ��s�̱ư�
		for (i = 0; i < 60; i++)  
			System.out.print("-");
		System.out.print("\nSorted data : ");
		for (i = 0; i < size; i++)
			System.out.print(data[i] + "  ");
	}

	public void sorting(int data[], int size)
	{
		int base=0, compare=0, flag, k;

		for (base = 0; base < size-1; base++)  {
			flag=0;
			
			System.out.printf("#%d pass: \n", base+1);
			for (compare = 0; compare < size-base-1; compare++) {
				if (data[compare] > data[compare+1]) {
					flag=1;
					temp = data[compare];
					data[compare] = data[compare+1];
					data[compare+1] = temp;
				}
				
				System.out.printf(" #%d compare: ", compare+1);
		
				for(k=0; k<size-base; k++)		
					System.out.printf("%d ", data[k]);
				System.out.printf("\n");
			}

			System.out.printf("#%d pass sorted data: ", base+1);
			for (k = 0; k < size; k++)
				System.out.printf("%d ", data[k]);
			System.out.print("\n\n");
			if(flag != 1)
				break;
		}
	}

	public static void main (String args[]) 
	{
		sorting obj = new sorting();
		int[] data = new int[20];

		obj.bubble_sort(data);  
	}
}