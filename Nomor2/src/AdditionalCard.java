import java.util.ArrayList;

public abstract class AdditionalCard extends Computer{	
	@Override
	public boolean canFitInSlot(ComputerSlot slot) {
		return true;
	}
	public abstract void addCard(String CPUName, ArrayList<ComputerSlot> cS,int papanEkstensi);
	public abstract void canRead();
	public abstract void canWrite();
	public abstract void cardBehaviour();
	public abstract void delAdditionalCard(String name,ArrayList<ComputerSlot> cS);
	public abstract void printComputerComponent(ArrayList<ComputerSlot> cS);
}