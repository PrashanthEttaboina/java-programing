package prototypePattern;

import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Songs song = new Songs();
		song.loadSongs();

		System.out.println(song.getSongList());

		Songs song1 = (Songs) song.clone();
		List l = song1.getSongList();
		l.add("song5");

		System.out.println(song1.getSongList());

		System.out.println(song.getSongList());

	}

}
