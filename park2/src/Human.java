
public class Human implements Valuable {
	
	private String name;
	private int age;

	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public double EstimateValue(int month){
		
		return Double.POSITIVE_INFINITY;
	}
	public double EstimateValue(){
		
		return EstimateValue(1);
	}
	
	public String toString(){
		
		return String.format("Human name : %s \n regitstered age : %d",name,age);
	}
}
