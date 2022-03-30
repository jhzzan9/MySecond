package submit03.submit01;

public class AudioBoard extends Board {
	private String audio;
	
	public AudioBoard(int no, String name, String content) {
		super(no, name, content);
		this.audio = audio;
	}
	AudioBoard(){}

	@Override
	public String toString() {
		return super.toString() + "audio=" + audio + "]";
	}
	
	public String getAudio() {
		return audio;
	}
	
	public void setAudio(String audio) {
		this.audio = audio;
	}
	
}
