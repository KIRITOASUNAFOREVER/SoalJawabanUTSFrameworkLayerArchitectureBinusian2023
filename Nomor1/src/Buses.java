public class Buses extends Vehicle{
	public Buses(String licPlate, String companyName)  {  
		slotsNeeded = 1;  
		siz = VSize.Buses;  
		this.licPlate = licPlate;  
		this.companyName = companyName;  
	}  	
	@Override
	public boolean canFitInSlot(ParkingSlot spot) {
		return spot.getSize() == VSize.Buses;
	}
}