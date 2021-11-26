public class Motorcycle extends Vehicle{
	public Motorcycle(String licPlate, String companyName)  {  
		slotsNeeded = 1;  
		siz = VSize.Motorcycle;  
		this.licPlate = licPlate;  
		this.companyName = companyName;  
	}  
	@Override
	public boolean canFitInSlot(ParkingSlot spot) {
		return spot.getSize() == VSize.CarSize || spot.getSize() == VSize.Motorcycle;
	}
}