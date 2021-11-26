import java.util.ArrayList;  
import java.util.*;  
import java.util.HashMap;  
public class ParkingSpot{
	private Level[] lvls;  
	private final int NUM_LVLS = 2;  
	private int numberSlots;  
	Map<String, ArrayList<String>> CompanytoVeh;  
	public ParkingSpot(int numberSlots)  {  
		this.numberSlots = numberSlots;  
		this.CompanytoVeh = new HashMap<String, ArrayList<String>>();  
		lvls = new Level[NUM_LVLS];  
		for (int j = 0; j < NUM_LVLS; j++)  {  
			lvls[j] = new Level(j, numberSlots);  
			System.out.println("Level " + j + " dibuat sejumlah " + numberSlots + " " +  "slots");  
		}  
	}  
	// Method Meyimpan Data Kendaraan yang diparkir seperti Nama Pemilik dan Nomor Kendaraan 
	public boolean parkVehicle(Vehicle vh)  {  
		System.out.println(" ------------------------------------ ");    
		for (int i = 0; i < lvls.length; i++)  {  
			if (lvls[i].parkVehicle(vh))   {  
				System.out.println(" Level " + i + " Dengan Plat Nomor " + vh.licPlate + " dari " + vh.companyName);  
				if (this.CompanytoVeh.containsKey(vh.companyName))   {  
					ArrayList<String> regNoList = this.CompanytoVeh.get(vh.companyName);  
					this.CompanytoVeh.remove(vh.companyName);  
					regNoList.add(vh.licPlate);  
					this.CompanytoVeh.put(vh.companyName, regNoList);  
				}   else   {  
					ArrayList<String> regNoList = new ArrayList<String>();  
					regNoList.add(vh.licPlate);  
					this.CompanytoVeh.put(vh.companyName, regNoList);  
				}  
				return true;  
			}  
		}  
		System.out.println("TEMPAT PARKIR SUDAH PENUH");  
		return false;  
	}  
	// Method ketika Kendaraan Keluar (Hapus dari List)
	public boolean leave(Vehicle vh, int lvl)  {  
		System.out.println(" ------------------------------------------ ");  
		lvls[lvl].slotFreed();  
		System.out.println("Slot freed from  Level " + lvl + " and exited  " + vh.licPlate + " of " + vh.companyName);  
		ArrayList<String> vhList = this.CompanytoVeh.get(vh.companyName);  
		// Untuk Cek apakah kendaraan yang keluar ada di List
		if (vhList.contains(vh.licPlate))   {  
			vhList.remove(vh.licPlate);  
		}  
		return true;  
	}  
	// Method untuk Print kendaraan di List.
	public void ComapnyParked(String companyName)  {  
		System.out.println(" ------------------------------------------ ");  
		ArrayList<String> vhList = this.CompanytoVeh.get(companyName);  
		System.out.print("Kendaraan dari  " + companyName + " : ");  
		for(String vl : vhList)  {  
			System.out.print(vl + "\t");  
		}  
		System.out.println();  
	}	
}  