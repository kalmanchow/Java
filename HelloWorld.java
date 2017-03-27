public class HelloWorld{
	 public static void main(String[] args){
	 	 A a = new A();
	 	 try{
	    a.print();
	   }catch(Exception ex)
	   {
	   	System.out.print(ex);
	   }
	}
}

class A {
	public void print() throws myException{
		System.out.print("Hello!");
	 	System.out.println("Hello World!");
	 	
	 	throw new myException("test");
	}
}

class myException extends Exception {
	 public myException(String  test){
	 	   new Exception(test);	
	 }
	 
	 public String toString(){
	 	return "test";//super.toString();
	 }
}