
public class Player {
	private String name; 
	private int age; 
	private String color;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return age; 
	}
	
	public void setAge(int age) { 
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be positive!");
		}
	}

}
