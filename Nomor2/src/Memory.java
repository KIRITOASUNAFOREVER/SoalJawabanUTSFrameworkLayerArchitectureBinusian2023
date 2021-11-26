import java.util.ArrayList;

public abstract class Memory extends Computer{
	protected int maxSpeed = 50;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public boolean canFitInSlot(ComputerSlot slot) {
		return true;
	}
	public abstract void canRead();
	public abstract void canWrite();
	public abstract void delMemory(String name,ArrayList<ComputerSlot> cS);
	public abstract void printComputerComponent(ArrayList<ComputerSlot> cS);
}