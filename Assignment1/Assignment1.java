import java.util.*;



public class Assignment1
{
public static void main(String[] args){
   
       System.out.println("MAIN MENU : ");
       System.out.println("Press 1: for Max number ");
       System.out.println("Press 2: for Min number");
	   System.out.println("Press 3: for Repeated numbers");
	   System.out.println("Press 4: for Sum Of All numbers");
       System.out.println("Press 5: for print the numbers In assending Orders");
       System.out.println("Press 6: for Print Odd numbers");
       System.out.println("Press 7: for Print even numbers");
	   char c;
	   Scanner sc = new Scanner(System.in); 
   
        // Character input 
         c = sc.next().charAt(0);
	   
	   switch (c){
		
		case '1':
			int n, sum = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Give Array  Size for finding maximum Number  :");
			n = s.nextInt();
			int a[] = new int[n];
			System.out.println("Give Values in Array:");
			int max=a[0];
			for(int i =0; i < n; i++){
					a[i] = s.nextInt();
					if(max < a[i])
					{
						max=a[i];
						
					}
					
				}
				
			System.out.println("Maximum No:"+max);
		break;
			
		case '2':
			Scanner input = new Scanner(System.in); 
		int arraySize, number,min_number = 0;
		char check,option,check2;
		
		do{
		
		System.out.println("\n\n \t\t Main Menu");
		System.out.println("\t\t 1:Insert");
		
		option = input.next().charAt(0);
		switch(option){
			case '1':
			do {
				System.out.print("Enter Array size : ");
				arraySize = input.nextInt();
		        int[] array = new int[arraySize];
				
				System.out.println("Enter number in Array");
				for(int i = 0; i < array.length; i++ ){
					number = input.nextInt();
					array[i] = number;
				}
				min_number = array[0];
				
				for(int j = 1; j < array.length; j++){
					if(array[j] < min_number){
						min_number = array[j];
					}
				}
				System.out.println("Minimum Number in the given Array is :" + min_number);
				
				System.out.println("\n Add more Number (y/n)?");
				check = input.next().charAt(0);
			}while(check != 'n');
			break;
			
			default:
			System.out.println("\n Please Enter valid number...\n");
			break;
		}
		System.out.println("\n Do you want to go main menu?");
		check2 = input.next().charAt(0);
		}while(check2 != 'n');
	
			
    	case '3':
		
		int rep, sp = 0;
			Scanner q = new Scanner(System.in);
			System.out.print("Give Array  Size for finding repeated Numbers	  :");
			rep = q.nextInt();
			int []arr = new int[rep];
			for(int i = 0; i < rep; i++){
			arr[i] = q.nextInt();
			}
			System.out.println("Duplicate elements in given array:");
			// Search for duplicate array 
			for(int i=0; i<arr.length;i++)
			{
					for(int j=0; j<arr.length;j++)
				{
			     
                 if((arr[i]==arr[j])&& (i!=j))
				 {
					 System.out.println(arr[j]);	
					 
				 }
					 
					 
		
				}		
			}
			
			
		 
		
		break;
			
		case '4':
						int x,w = 0;
			Scanner sa = new Scanner(System.in);
			System.out.print("Give Array Size for Sum  :");
			x = sa.nextInt();
			int m[] = new int[x];
			System.out.println("Give Values in Array:");
			for(int i = 0; i < x; i++){
					m[i] = sa.nextInt();
					w = w + m[i];
				}
			System.out.println("Sum:"+w);
		break;
			
		case '5':
          
		  int l, temp;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        l = r.nextInt();
        int b[] = new int[l];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < l; i++) 
        {
            b[i] = r.nextInt();
        }
        for (int i = 0; i < l; i++) 
        {
            for (int j = i + 1; j < l; j++) 
            {
                if (b[i] > b[j]) 
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < l - 1; i++) 
        {
            System.out.print(b[i] + ",");
        }
        System.out.print(b[l - 1]);
    
		  

        break;	
		
		case '6':
		
		int t;
        Scanner p = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        t = p.nextInt();
        int arrr[] = new int[t];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < t; i++) 
        {
            arrr[i] = p.nextInt();
        }
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < t ; i++)
        {
            if(arrr[i] % 2 != 0)
            {
                System.out.print(arrr[i]+" ");
            }
        }
		break;
		
		case '7':
		int z;
        Scanner v = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        z = v.nextInt();
        int arrrr[] = new int[z];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < z; i++) 
        {
            arrrr[i] = v.nextInt();
        }
		
		System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < z ; i++)
        {
            if(arrrr[i] % 2 == 0)
            {
                System.out.print(arrrr[i]+" ");
            }
        }
		break;
	   }		
}	
		}

	

