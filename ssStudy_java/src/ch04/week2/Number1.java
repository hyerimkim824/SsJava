package ch04.week2;

//let set Song class
class Song{
	
	//Set member variable of song name
	String songName;
	
	//Set constructor
	//By using this constructor, we can put member variable first
	public Song(String n) {
		this.songName = n; // to clarify member variable of songName
	}
	
	//Set member method of getting member variable
	public String getTitle() {
		//Since member variable is String, we should make return value as String
		return songName;
	}
	
	
}

//Below main class is Question of 4th contents
public class Number1 {
	
	public static void main(String[] arg) {
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("공주는 잠 못이루고");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+yourSong.getTitle());
	}

}
