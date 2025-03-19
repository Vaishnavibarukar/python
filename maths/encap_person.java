class1
package mypack;

public class encap_person 
{
	private int age;
	private String name;
	
	public void setdata(int age,String name) 
{
		this.age=age;
		this.name=name;
		
}
	public void get() {
		System.out.print("the name of a person is "+name+"\n"+"the age of student is:"+age);
	}
	

}
class2
package mypack;

public class person_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap_person p=new encap_person();
		p.setdata(18, "prasad");
		p.get();
		

	}

}