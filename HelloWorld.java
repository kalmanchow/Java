

public class HelloWorld{
	 public static void main(String[] args){
	 	 A a = new A();
	 	 int i=10;
	 	 System.out.print(((Object)i).toString());
	}
}

class A {
	public void print(){
		System.out.print("Hello!");
	}
}