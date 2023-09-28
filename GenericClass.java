 package AllJava8Featuress;

public class GenericClass {

	public static void main(String[] args) {
		// initialize generic class
	    // with Integer data
		
		GenClass<Integer> obj = new GenClass<>(10);
		System.out.println("GenClass Return " +  " " + obj.getData());
		
		//for String
		GenClass<String> obj1 = new GenClass<>("Piyush");
		System.out.println(obj1.getData());

	}

}
//Create a Generic class
class GenClass<T>{
	//Variable of type T
	private T data;
	
	
	public GenClass(T data) {
		this.data = data;
		
	}
	// Method jo T type variable retrn Karega..
	public T getData() {
    return this.data;
	}
}