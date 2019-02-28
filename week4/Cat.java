
public class Cat {
	
	Cat mom;
	Cat father;
	
	String name;
	int age;
	String breed;
	boolean isMale;
	
	double weight;
	
	boolean isHungry;
	
	Cat[] kittens;
	
	
	public Cat[] giveBirth() {
		kittens = new Cat[5];
		for (int i=0; i<5; i++) {
		
			kittens[i] = new Cat();
			kittens[i].mom = this;
		}
		return kittens;
	}
	

}
