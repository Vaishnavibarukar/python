class1
package calc;

public class addition {
	 private int num1;
	   private int num2;
	   
	   public void setadd(int num1, int num2) {
		   this.num1=num1;
		   this.num2=num2;
	   }
	   public void getadd() {
		   int result=(num1+num2);
		   System.out.println(result);
	   }

}
class2
package calc;

public class substraction {

	 private int num1;
	   private int num2;
	   
	   public void setsub(int num1, int num2) {
		   this.num1=num1;
		   this.num2=num2;
	   }
	   public void getsub() {
		   int result=(num1-num2);
		   System.out.println(result);
	   }
}

class3
package calc;

public class multiplication {

	 private int num1;
	   private int num2;
	   
	   public void setmul(int num1, int num2) {
		   this.num1=num1;
		   this.num2=num2;
	   }
	   public void getmul() {
		   int result=(num1*num2);
		   System.out.println(result);
	   }
}

class4
package calc;

public class division {
	
	 private int num1;
	   private int num2;
	   
	   public void setdiv(int num1, int num2) {
		   this.num1=num1;
		   this.num2=num2;
	   }
	   public void getdiv() {
		   int result=(num1/num2);
		   System.out.println(result);
	   }

}
class5
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner S=new Scanner(System.in);
			addition a=new addition();
			substraction s=new substraction();
			multiplication m=new multiplication();
			division d= new division();
			System.out.println("select from the following choices");
			System.out.println("1 for add");
			System.out.println("2 for sub");
			System.out.println("3 for mul");
			System.out.println("4 for div");
			
			System.out.println("enter your choice");
			int choice=S.nextInt();
			if(choice>=1 &&choice<=4) {
				System.out.println("enter num1");
				int num1=S.nextInt();
				System.out.println("enter num2");
				int num2=S.nextInt();
				System.out.println("................");
				switch(choice) {
				case 1:
					a.setadd(num1, num2);
					a.getadd();
					break;
					
				case 2:
					s.setsub(num1, num2);
					s.getsub();
					break;
				case 3:
					m.setmul(num1, num2);
					m.getmul();
					break;
			    default:
			    	d.setdiv(num1, num2);
			    	d.getdiv();
			    	break;
				}
			}

			
		}
		

	}

}
