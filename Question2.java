import java.util.Scanner; 
class Question2 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
		for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            int last = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            
            arr[n-1]= last;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
	}
}