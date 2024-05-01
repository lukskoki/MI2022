package hr.fer.oop.zad3;

public class MediaPrinter<A extends Media> extends PrintableList{
	
	@Override
	public String print() {
		
		String ispis = "";
		for (int i = 0;this.elementAt(i) != null;i ++) {
			A media = (A) this.elementAt(i);
			
			ispis += ""+media.getTitle()+" is "+media.getLength()+" seconds long.\n";
		}
		
		return ispis;
	}
}
