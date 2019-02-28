
public class Rectangle {

	
		int sideA;
		int sideB;
		
		public Rectangle(int a,int b){
			sideA = a;
			sideB = b;
		}
		public int area() {
			
			return sideA * sideB;			
		}
		public int perimeter(){
			
			return 2 * (sideA + sideB);
		}
}
