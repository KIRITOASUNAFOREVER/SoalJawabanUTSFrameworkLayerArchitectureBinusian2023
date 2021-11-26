import java.util.ArrayList;

public class OggAudio extends AdditionalCard{

	@Override
	public void canRead() {
		System.out.println("Ogg Audio Berhasil Membaca");
	}

	@Override
	public void canWrite() {
		System.out.println("Ogg Audio Berhasil Menulis");
	}

	@Override
	public void cardBehaviour() {
		System.out.println("Memainkan Format Audio Ogg");
	}

	@Override
	public void addCard(String OggAudio, ArrayList<ComputerSlot> cS, int papanEkstensi) {
		if(canFitInSlot(null) ==true) {
			int hitung = 1;
			for (int i = 0; i < cS.size(); i++) {
				if(cS.get(i).getCheck()==5) {
					hitung++;
				}
			}
			
			if(hitung <=3 && papanEkstensi==1) {
				System.out.println("Berhasil Insert Ogg Audio dengan Nama "+OggAudio);
				if(cS.size()==0) {
					cS.add(new ComputerSlot("", "", "", "", OggAudio,0 , 0, 5));
					System.out.println();
				}else {
					cS.add(new ComputerSlot("", "", "", "", OggAudio,0 , 0, 5));
					System.out.println();
				}
			}else if(papanEkstensi==0) {
				System.out.println("Tidak ada Papan Ekstensi, Tidak Bisa Insert Card!!!");
			}
			else {
				System.out.println("Slot untuk Kartu Tambahan Sudah Penuh...");
			}
		}
	}

	@Override
	public void delAdditionalCard(String name, ArrayList<ComputerSlot> cS) {
		int count = cS.size();
		int indeks = -1;
		for (int i = 0; i < count; i++) {
			if(cS.get(i).getAdditionalCard().equals(name)) {
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
