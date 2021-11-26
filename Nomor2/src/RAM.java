import java.util.ArrayList;

public class RAM extends Memory{
	void addRAM(String RAM, ArrayList<ComputerSlot> cS) {
		if(canFitInSlot(null) ==true) {
			int hitung = 0;
			System.out.println("Berhasil Insert RAM dengan Nama "+RAM);
			for (int i = 0; i < cS.size(); i++) {
				if(cS.get(i).getCheck()==3) {
					hitung++;
				}
			}
			
			if(hitung ==0) {
				cS.add(new ComputerSlot("", "", RAM, "", "", 0, getMaxSpeed()+10, 3));
				System.out.println("Maksimal Speed Menjadi "+cS.get(cS.size()-1).getComputerSpeed());
				System.out.println();
			}else {
				cS.add(new ComputerSlot("", "", RAM, "", "", 0, cS.get(cS.size()-1).getComputerSpeed()+10, 3));	
				System.out.println("Maksimal Speed Menjadi "+cS.get(cS.size()-1).getComputerSpeed());
				System.out.println();
			}
		}
	}
	@Override
	public void canRead() {
		System.out.println("RAM Berhasil Membaca");
	}

	@Override
	public void canWrite() {
		System.out.println("RAM Berhasil Menulis");
	}

	@Override
	public void delMemory(String name, ArrayList<ComputerSlot> cS) {
		int count = cS.size();
		int indeks = -1;
		for (int i = 0; i < count; i++) {
			if(cS.get(i).getRAM().equals(name)) {
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
