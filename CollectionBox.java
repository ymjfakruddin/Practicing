package currency6.com;

public class CollectionBox {

	public static void main(String[] args) {

		Dollar d= new Dollar();
		d.compute(200);
		d.dollar(200);
		d.print();
		Pound p= new Pound();
		p.compute(500);
		p.pound(500);
		p.print();
		Rupee r= new Rupee();
		r.compute(100);
		r.rupees(100);
		r.print();

	}

}