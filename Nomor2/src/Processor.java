import java.util.ArrayList;
public abstract class Processor extends Computer{
	protected int maxProgramManage = 5;	
	public int getMaxProgramManage() {
		return maxProgramManage;
	}
	public void setMaxProgramManage(int maxProgramManage) {
		this.maxProgramManage = maxProgramManage;
	}
	@Override
	public boolean canFitInSlot(ComputerSlot slot) {
		return true;
	}
	public abstract void canRead();
	public abstract void canWrite();
	public abstract void delProcessor(String name,ArrayList<ComputerSlot> cS);
	public abstract void printComputerComponent(ArrayList<ComputerSlot> cS);
}