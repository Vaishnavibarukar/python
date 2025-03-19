class 1 multilevel inheritance

package mypack;

class one{
	public void print_one() {
		System.out.println("java");
	}
}
class two extends one{
	public void print_two() {
		System.out.println("program");
	}
}
class three extends two{
	public void print_three() {
		System.out.println("examples");
	}
}


public class main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		three t=new three();
		t.print_one();
		t.print_two();
		t.print_three();
		

	}

}


class2   hierarchical inheritance