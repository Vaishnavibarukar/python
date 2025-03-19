class 1 for single D array

package mypack;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum"+sum);
		System.out.println("array:"+sum/a.length);

	}

}

class 2 for mul D array

package mypack;

public class mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int [] [] a= {{2,3},{4,5}};
		int [] [] b= {{3,6},{4,1}};
		int [] [] c=new int [2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}