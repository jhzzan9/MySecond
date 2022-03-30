package submit03.submit01;

public class CartoonBoard extends Board {
	private String image;

	public CartoonBoard(int no, String name, String content) {
		super(no, name, content);
		this.image = image;
	}

	CartoonBoard(){}

	@Override
	public String toString() {
		return super.toString() + "image=" + image + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
