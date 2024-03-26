package todo1;

public class Anjing {
	
	String nama;
	String breed;
	int umur;
	int berat;
	
	Anjing(String nama, String breed, int umur, int berat){
		this.nama = nama;
		this.breed = breed;
		this.umur = umur;
		this.berat = berat;
	}
	void info() {
		System.out.println("---------=INFORMASI=---------");
		System.out.println("Nama: " + nama);
		System.out.println("Breed: " + breed);
		System.out.println("Umur: " + umur + " tahun");
		System.out.println("Berat: " + berat + " kg");
	}
	
	void bark() {
		System.out.println("Awooooo!");
	}
	
	void makan() {
		System.out.println(nama + " sedang makan...");
	}
	
	void jalan() {
		System.out.println(nama + " sedang jalan...");
	}

}
