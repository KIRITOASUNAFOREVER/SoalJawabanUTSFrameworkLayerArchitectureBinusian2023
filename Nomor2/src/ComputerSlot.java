
public class ComputerSlot {
	String CPU;
	String Accelarator;
	String RAM;
	String cache;
	String additionalCard;
	int maxProgramManage;
	int computerSpeed;
	int check;
	public ComputerSlot(String cPU, String accelarator, String rAM, String cache, String additionalCard,
			int maxProgramManage, int computerSpeed, int check) {
		super();
		CPU = cPU;
		Accelarator = accelarator;
		RAM = rAM;
		this.cache = cache;
		this.additionalCard = additionalCard;
		this.maxProgramManage = maxProgramManage;
		this.computerSpeed = computerSpeed;
		this.check = check;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getAccelarator() {
		return Accelarator;
	}
	public void setAccelarator(String accelarator) {
		Accelarator = accelarator;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
	}
	public String getAdditionalCard() {
		return additionalCard;
	}
	public void setAdditionalCard(String additionalCard) {
		this.additionalCard = additionalCard;
	}
	public int getMaxProgramManage() {
		return maxProgramManage;
	}
	public void setMaxProgramManage(int maxProgramManage) {
		this.maxProgramManage = maxProgramManage;
	}
	public int getComputerSpeed() {
		return computerSpeed;
	}
	public void setComputerSpeed(int computerSpeed) {
		this.computerSpeed = computerSpeed;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	
}
