package ab;

public class Hdfc extends Banking{
	public void saving() {
		System.out.println("SAVIN ACC");
		
	}

	public void joinacc() {
		System.out.println("JOIN ACC");
		
	}
	public void current() {
		System.out.println("CURRENT ACC");
		
	}
	public static void main(String[]args) {
		Hdfc obj = new Hdfc();
		obj.saving();
		obj.salary();
		obj.current();
		obj.joinacc();
		
	}
	
}
