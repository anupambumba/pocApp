package springboothelloworld.helloworld.pojo;

public class IDCardImage {
	private String frontImage=null;
	private String backImage=null;
	public IDCardImage() {
		super();
	}
	public IDCardImage(String frontImage, String backImage) {
		super();
		this.frontImage = frontImage;
		this.backImage = backImage;
	}
	public String getFrontImage() {
		return frontImage;
	}
	public void setFrontImage(String frontImage) {
		this.frontImage = frontImage;
	}
	public String getBackImage() {
		return backImage;
	}
	public void setBackImage(String backImage) {
		this.backImage = backImage;
	}
	

}
