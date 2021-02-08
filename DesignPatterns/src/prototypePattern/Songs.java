package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Songs implements Cloneable {

private List<String> songList;

public List<String> getSongList() {
	return songList;
}

	public Songs(){
		songList = new ArrayList<String>();
	}
	
	public Songs(List<String> list){
		this.songList=list;
	}
	public void loadSongs(){
	
		songList.add("song1");
		songList.add("song2");
		songList.add("song3");
		songList.add("song4");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getSongList()){
				temp.add(s);
			}
			return new Songs(temp);
	}
}
