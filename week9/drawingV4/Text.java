package drawingV4;

public class Text implements Drawable{
	private String text;

	public Text(String text) {
		this.text = text;
	}

	public void draw(){		
		System.out.println("Drawing Text: " + text);
		
	}
}
