public class App{
	
	public double area(int r) {
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		App app=new App();
		System.out.print(app.area(5));
		
	}
}