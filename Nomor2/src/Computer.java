import java.util.ArrayList;
public abstract class Computer {
	protected ArrayList<ComputerSlot> computerSlots = new ArrayList<ComputerSlot>();
	protected String processor;
	protected String memory;  
	protected String additionalCard;
	public abstract boolean canFitInSlot(ComputerSlot slot);
}