public class Level {
	private int floor;  
	private ParkingSlot[] slots;
	private int availableSlots = 0; // Variabel buat penghitung Slot yang Tersedia
	// Setiap Baris Saya Anggap Muat 10 Kendaraan
	private static final int SLOT_PER_ROW = 10;  
	public Level(int flr, int numberSlots)  {  
		floor = flr;  
		availableSlots = numberSlots;  
		slots = new ParkingSlot[numberSlots];  
		int largeSlots = numberSlots / 4;  
		int bikeSlots = numberSlots / 4;  
		int compactSlots = numberSlots - largeSlots - bikeSlots;    
		for (int j = 0; j < numberSlots; j++)  {  
			VSize siz = VSize.Motorcycle;  
			if (j < largeSlots + compactSlots)  {  
				siz = VSize.CarSize;  
			}  else {
				siz = VSize.Buses;
			}
			int row = j / SLOT_PER_ROW;  
			slots[j] = new ParkingSlot(this, row, j, siz);  
		}  
	}  
	public int availableSlots(){  
		return availableSlots;  
	}  
	public boolean parkVehicle(Vehicle vh)  {  
		//Function buat Mencari tempat parkir buat kendaraan
		if (availableSlots() < vh.getSlotsNeeded())  
			return false;  
		  
		int slotNumber = findAvailableSlots(vh);  
		if (slotNumber < 0)  
			return false;  
		System.out.print(", Nomor Slot " + slotNumber);  
		return parkStartingAtSlot(slotNumber, vh);  
	}  
	private boolean parkStartingAtSlot(int num, Vehicle vh)  {  
	// Update Slot yang tersedia
		vh.clearSlots();  
		boolean success = true;  
		for (int j = num; j < num + vh.slotsNeeded; j++)  {  
			success &= slots[j].park(vh);  
		}  
		availableSlots = availableSlots - vh.slotsNeeded;  
		return success;  
	}  
	private int findAvailableSlots(Vehicle vh)  {  
		int slotsNeeded = vh.getSlotsNeeded();  
		int lastRow = -1;  
		int slotsFound = 0;    
		for (int j = 0; j < slots.length; j++)  {  
			ParkingSlot spot = slots[j];  
			if (lastRow != slots[j].getLane())  {  
				slotsFound = 0;  
				lastRow = slots[j].getLane();  
			}  
			if (slots[j].canFitVehicle(vh))  {  
				slotsFound = slotsFound + 1;  
			}  else  {  
				slotsFound = 0;  
			}  
			if (slotsFound == slotsNeeded)  {  
					if(vh.siz == VSize.CarSize)  
						System.out.print("Sebuah Mobil Diparkir di ");  
					else if(vh.siz == VSize.Motorcycle) 
						System.out.print("Sebuah Motor Diparkir di ");
					else
						System.out.print("Sebuah Bus Diparkir di ");
				System.out.print("Baris Nomor " + lastRow);  
				return j - (slotsNeeded - 1);  
			}  
		}  
		return -1;  
	} 
	// Ketika ada kendaraan yang keluar gedung
	// Update Jumlah Slot Parkir
	public void slotFreed()  {  
		availableSlots = availableSlots + 1;  
		System.out.println("Slot yang masih tersedia di Level ini :" + availableSlots);  
	}  
}  