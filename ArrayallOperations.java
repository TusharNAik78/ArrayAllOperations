import java.util.Scanner;

public class ArrayallOperations{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Enter size of array:- ");
		int size=sc.nextInt();
		int[] ar=new int[size];
		Inputarray(ar,size);
		printArray(ar,size);
		do{
			System.out.println("1.Ascending array");
			System.out.println("2.Descending array");
			System.out.println("3.Largest number in array");
			System.out.println("4.Smallest number in array");
			System.out.println("5.Get any largest number in array ");
			System.out.println("6.Get any smallest number in array");
			System.out.println("7.Right rotate the element of an array");
			System.out.println("8.Left rotate the element of an array");
			System.out.println("9.Remove Duplicate elements");
			System.out.println("10.Even Numbers");
			System.out.println("11.Odd Numbers");
			System.out.println("Enter your choice:- ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Ascending array:- ");
				ascending(ar,size);
				printArray(ar,size);
				break;
			case 2:
				System.out.println("Descending array:- ");
				descending(ar,size);
				printArray(ar,size);
				break;
			case 3:
				getLargestnumber(ar,size);
				break;
			case 4:
				getSmallestnumber(ar,size);
				break;
			case 5:
				getAnyLargestNumberinarray(ar,size);
				break;
			case 6:
				getAnySmallestNumberinarray(ar,size);
				break;
			case 7 :
				rotateRight(ar,size);
				break;
			case 8:
				rotateLeft(ar,size);
				break;
			case 9:
				ascending(ar,size);
				int len=removeDuplicates(ar,size);
				for(int i=0;i<len;i++) {
				System.out.println(ar[i]+" ");
				}
				break;
			case 10:
				evenNumber(ar,size);
				break;
			case 11:
				oddNumber(ar,size);
				break;
				
			}
			System.out.println("Do you want to contniue(y/n):- ");
		}while(sc.next().equalsIgnoreCase("y"));
	}
	
	public static void Inputarray(int[] ar,int size) {
		System.out.println("Enter data:- ");
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
	}
	
	
	public static void printArray(int []ar,int size) {
		System.out.println("\n\tArray data:- ");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
	
	
	public static void ascending(int []ar,int size) {
			int temp;
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(ar[i]>ar[j]) {
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
			
			
	}
	
	
	public static void descending(int []ar,int size) {
			int temp;
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(ar[i]<ar[j]) {
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
			
			
		}
	
	
	public static void getLargestnumber(int []ar,int size) {
		ascending(ar,size);
		printArray(ar,size);
		System.out.println("Largest number in array is "+ar[size-1]);
	}
	
	public static void getSmallestnumber(int []ar,int size) {
		descending(ar,size);
		printArray(ar,size);
		System.out.println("Smallest number in array is "+ar[size-1]);
	}
	
	public static void getAnyLargestNumberinarray(int[]ar,int size) {
		ascending(ar,size);
		System.out.print("Enter position of array:- ");
		int n=sc.nextInt();
		System.out.println(n+" last largest number is "+ar[size-n]);
	}
	
	public static void getAnySmallestNumberinarray(int[]ar,int size) {
		descending(ar,size);
		System.out.print("Enter position of array:- ");
		int n=sc.nextInt();
		System.out.println(n+" last smallest number is "+ar[size-n]);
	}
	
	public static void rotateRight(int []ar,int size) {
		int last=ar[size-1];
		for(int i=size-1;i>0;i--) {
			ar[i]=ar[i-1];
		}
		ar[0]=last;
		System.out.println("Right Rotated array:- ");
		printArray(ar,size);
	}
	
	public static void rotateLeft(int []ar,int size) {
		int last=ar[0];
		for(int i=1;i<size;i++) {
			ar[i-1]=ar[i];
		}
		ar[size-1]=last;
		System.out.println("left Rotated array:- ");
		printArray(ar,size);
	}
	
	public static int removeDuplicates(int[] ar,int size) {
		if (size==0 || size==1){  
            return size;  
        }  
        int[] temp = new int[size];  
        int j = 0;  
        for (int i=0; i<size-1; i++){  
            if (ar[i] != ar[i+1]){  
                temp[j++] = ar[i];  
            }  
         }  
        temp[j++] = ar[size-1];     
        for (int i=0; i<j; i++){  
            ar[i] = temp[i];  
        }  
        return j;  
	}
	
	public static void evenNumber(int [] ar,int size) {
		System.out.println("Even numbers:- ");
		for(int i=0;i<size;i++) {
			if(ar[i]%2==0) {
				System.out.print(" "+ar[i]);
			}
		}
		System.out.println(" ");
	}
	
	public static void oddNumber(int []ar,int size) {
		System.out.println("Odd numbers:- ");
		for(int i=0;i<size;i++) {
			if(ar[i]%2!=0) {
				System.out.print(" "+ar[i]);
			}
		}
		System.out.println(" ");
	}
}