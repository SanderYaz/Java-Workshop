package generics;

public class Util {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}

	
	public static  boolean compareStr(Pair<String, Integer> p1, Pair<String, Integer> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
	public static  boolean compareInt(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
	public static void foo(int a) {
		
	}
	
	
	public static void foo(String a) {
			
	}
}
