interface findOut{
	void calculateArea();
	void calculateCircumference();
	void calculateVolume();
}

abstract class rectangle implements findOut{
	public void calculateArea(){
		int area;
		int length = 4;
		int width = 8;
		area = length * width;
		System.out.println("Area of rectangle with length "+length+"and width "+width+" is: " + area);
	}

	public void calculateCircumference(){
		int circumference;
		int length = 4;
		int width = 8;
		circumference = 2 * (length + width);
		System.out.println("Circumference of rectangle with length "+length+"and width "+width+" is: " + circumference);
	}
}

class angle extends rectangle{
	public void calculateVolume(){
		int volume;
		int length = 4;
		int width = 8;
		int height = 6;
		volume = length * width * height;
		System.out.println("Volume of rectangle with length "+length+" width "+width+" and height "+height+ "is: " + volume);
	}
} 

public class question1{
	public static void main(String args[]){
		angle allangle = new angle();

		allangle.calculateArea();
		allangle.calculateCircumference();
		allangle.calculateVolume();
	}
}