import java.util.Scanner;

public class Complex {
	private int real; 
	private int img ;
	Scanner sc = new Scanner(System.in) ;
	
	
	public Complex() {
		System.out.println("Enter real value ");
		real = sc.nextInt();
		System.out.println("Enter img value");
		img = sc.nextInt() ;
	}
	public Complex(int real,int img ) {	//para constructor
		this.real=real;
		this.img=img;
	}
	public void display()  {                                       //class method 3+j4
		System.out.println("complex number is ="+this.real+" j"+this.img);
		}
	public int getreal() {
		return this.real ;
	}
	public int getimg() {
		return this.img ;
	}
	public void add(Complex cn1) {
		this.real = this.real+cn1.getreal() ;
		this.img= this.img+cn1.getimg() ;
	}
	public String toString() {{
		return "complex number is ="+this.real+" j"+this.img ;
	}
	
	}
