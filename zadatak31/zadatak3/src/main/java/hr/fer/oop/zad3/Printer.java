package hr.fer.oop.zad3;

public class Printer {
	public static String printVideoList(MyList<Video> list) {
		String ispis = "";
		for (int i = 0;list.elementAt(i) != null;i++) {
			Video video = list.elementAt(i);
			
			ispis += ""+video.getTitle()+" - "+video.getLength()+" sec. - "+video.getFormat()+"\n";
			
		}
		
		return ispis;
	}
	
	public static <A extends Audio> String printAudioList(MyList<A> list) {
		String ispis = "";
		for (int i = 0;list.elementAt(i) != null;i++) {
			Audio audio = list.elementAt(i);
			
			ispis += ""+audio.getTitle()+" - "+audio.getLength()+" sec. - "+audio.getCodec()+"\n";
			
		}
		
		return ispis;
	}
}
