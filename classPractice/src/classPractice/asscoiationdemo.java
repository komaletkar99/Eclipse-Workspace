package classPractice;
class Animal{
	int id;
	int salary;
	String name;
	String city;
	public Animal(int id,int salary,String name,String city) {
		this.id=id;
		this.salary = salary;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", salary=" + salary + ", name=" + name + ", city=" + city + "]";
	}
	
}

class Bird{
	String birdcolor;
	String birdNmae;
	Animal animal;
	public Bird(String birdcolor, String birdNmae, Animal animal) {
		this.birdcolor = birdcolor;
		this.birdNmae = birdNmae;
		this.animal=animal;
	}

	public String displayBirdDetail() {
		return "birdcolor" +  birdcolor + ", " + birdNmae + ", " + birdNmae + ", " + animal.toString();
		
	}
	
}

public class asscoiationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal(10, 152, "komal", "pune");
		Bird ob = new Bird("green", "peacock", animal);
		System.out.println(ob.displayBirdDetail());
		

	}

}
