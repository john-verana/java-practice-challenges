
public class GettersSetters {

	public static void main(String[] args) {
		
		//object
		Player p = new Player(); 
		
		//call
		p.setName("John");
		p.setAge(21);
		p.setColor("black");
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Color: " + p.getColor());	

	}

}
