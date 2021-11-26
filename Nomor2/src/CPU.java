import java.util.ArrayList;

public class CPU extends Processor{
	public CPU() {
		super();
	}
	
	void addCPU(String CPUName, ArrayList<ComputerSlot> cS) {
		if(canFitInSlot(null) ==true) {
			System.out.println("Berhasil Insert CPU dengan Nama "+CPUName);
			if(cS.size()==0) {
				cS.add(new ComputerSlot(CPUName, "", "", "", "",getMaxProgramManage()+5 , 0, 1));
				System.out.println("Maksimal Banyak Program Berjalan Menjadi "+cS.get(cS.size()-1).getMaxProgramManage());
				System.out.println();
			}else {
				cS.add(new ComputerSlot(CPUName, "", "", "", "",cS.get(cS.size()-1).getMaxProgramManage()+5 , 0, 1));
				System.out.println("Maksimal Banyak Program Berjalan Menjadi "+cS.get(cS.size()-1).getMaxProgramManage());
				System.out.println();
			}
		}
	}
	@Override
	public void canRead() {
		System.out.println("CPU Berhasil Membaca");
	}
	@Override
	public void canWrite() {
		System.out.println("CPU Berhasil Menulis");
	}
	@Override
	public void delProcessor(String name,ArrayList<ComputerSlot> cS) {
		int count = cS.size();
		int indeks = -1;
		for (int i = 0; i < count; i++) {
			if(cS.get(i).getCPU().equals(name)) {
				indeks = i;
				break;
			}
		}
		if(indeks >= 0) {
			cS.remove(indeks);
			System.out.println("Berhasil Hapus Komponen dengan nama "+name);
		}
	}
	@Override
	public void printComputerComponent(ArrayList<ComputerSlot> cS) {
		int jumlah = cS.size();
		if(jumlah==0) {
			System.out.println("Tidak ada komponen");
		}else {
			System.out.println("Jumlah Sisa Komponen  = "+jumlah);
			for (int i = 0; i <jumlah; i++) {
				if(cS.get(i).getCheck()==1) {
					System.out.println("Nama : "+cS.get(i).getCPU() +" (Tipe : CPU)");
				}else if(cS.get(i).getCheck()==2) {
					System.out.println("Nama : "+cS.get(i).getAccelarator() +" (Tipe : Accelerator)");
				}else if(cS.get(i).getCheck()==3) {
					System.out.println("Nama : "+cS.get(i).getRAM() +" (Tipe : RAM)");
				}else if(cS.get(i).getCheck()==4) {
					System.out.println("Nama : "+cS.get(i).getCache() +" (Tipe : Cache)");
				}else if(cS.get(i).getCheck()==5) {
					System.out.println("Nama : "+cS.get(i).getAdditionalCard() +" (Tipe : Additional Card)");
				}
			}
			System.out.println();
		}
	}	
}