public class ParkingSlot {
	private Vehicle vh;  
	private VSize siz;  
	private int lane;  
	private int slotNumber;  
	private Level l;  	  
	public ParkingSlot(Level lvl, int r, int num, VSize vs)   {  
		l = lvl;  
		lane = r;  
		slotNumber = num;  
		siz = vs;  
	}  
	public boolean isAvailable()   {  
		return vh == null;  
	}  
	public boolean canFitVehicle(Vehicle vh)   {  
		return isAvailable() && vh.canFitInSlot(this);  
	} 
	public boolean park(Vehicle vObj)   {  
		if (!canFitVehicle(vObj))  {  
			return false;  
		}  
		vh = vObj;  
		vh.parkInSlot(this);  
		return true;  
	}  
	public int getLane()   {  
		return lane;  
	}   
	public int getSlotNumber()   {  
		return slotNumber;  
	}  
	public VSize getSize()   {  
		return siz;  
	}  
	public void removeVehicle()   {  
		l.slotFreed();  
		vh = null;  
	}  
}  