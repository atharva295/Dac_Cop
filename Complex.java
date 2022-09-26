
public class Complex {
	private int real; 
	private int img ;
	public Complex( ) {  //constructor

	} 
	public Complex(int real,int img ) {	//para constructor
		this.real=real;
		this.img=img;
	}
	public void display()  {                                       //class method
		System.out.println("complex number is ="+real+"j"+img);
		}
	}
