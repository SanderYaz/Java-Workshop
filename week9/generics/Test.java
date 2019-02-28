package generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Box<String> b = new Box<>();
		
		b.set("hello");
		
		
		String str = (String)b.get();

		
		Pair<String,Integer> aPair = 
				new PairImpl<>("Ozgur", 54);
		
		Pair<Integer,Integer> bPair = 
				new PairImpl<>(67, 54);
		
		//aPair = bPair;
		
		ArrayList<Pair<String,Integer>> list = new
				ArrayList<>();
		list.add(aPair);
		//list.add(bPair);
		
		
		Pair p = new PairImpl("Hello", 67);
		
		
		Util.compare(aPair, aPair);
		Util.compare(bPair, bPair);
		
		
		
		Util.compareStr(aPair, aPair);
		
		Util.compareInt(bPair, bPair);
	}

}
