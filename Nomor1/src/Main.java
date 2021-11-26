public class Main {
	public static void main(String argvs[])   {  
		ParkingSpot pl = new ParkingSpot(2);  
		Car car1 = new Car("2301905543", "Fiona");  
		Motorcycle m1 = new Motorcycle("LJ01", "Varencia");  
		Car car2 = new Car("2021", "Tendio");  
		Motorcycle m2 = new Motorcycle("6122", "Framework");  
		Car car3 = new Car("2022", "layer");  		  
		//  Memarkir Kendaraan yang datang
		pl.parkVehicle(car1);  
		pl.parkVehicle(m1);  
		pl.parkVehicle(car2);  
		//Membuat Object Builder
		Builder builder = new Builder();
		System.out.println();
		builder.insertCompanyName("Fiona");
		pl.ComapnyParked(builder.getCompanyName());  
		System.out.println();
		builder.insertCompanyName("Varencia");
		pl.ComapnyParked(builder.getCompanyName());  
		// Mobil dengan Nama Fiona Keluar dari gedung
		pl.leave(m1,0);  
		// Kendaraan Fiona Masuk Kembali dan Menampilkan Kendaraan yang bernama Fiona
		System.out.println();
		builder.insertCompanyName("Fiona");
		pl.ComapnyParked(builder.getCompanyName());  
		System.out.println();
		pl.parkVehicle(m2);  
		System.out.println();
		pl.parkVehicle(car3);  
	}  
}