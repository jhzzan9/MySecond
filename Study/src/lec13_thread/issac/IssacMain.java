package lec13_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Chef chef = new Chef(issac);
	
		Customer minwoo = new Customer(issac, 2, "민우");
		Customer jeahun = new Customer(issac, 5, "재훈");
		Customer eunji = new Customer(issac, 3, "은지");
		
		chef.start();
		minwoo.start();
		jeahun.start();
		eunji.start();
		
		
	}
}
