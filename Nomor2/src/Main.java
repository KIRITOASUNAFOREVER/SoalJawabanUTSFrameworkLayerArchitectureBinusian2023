import java.util.ArrayList;
public class Main {
	ArrayList<ComputerSlot> CS = new ArrayList<>();
	public Main() {
		//INSERT CPU
		CPU cpu = new CPU();
		cpu.addCPU("Fiona",CS);
		cpu.addCPU("Varencia",CS);
		cpu.addCPU("Tendio",CS);
		cpu.delProcessor("Tendio",CS);
		cpu.printComputerComponent(CS);
		cpu.canRead();
		cpu.canWrite();
		System.out.println();
		//INSERT ACCELERATOR
		Accelerator accelerator = new Accelerator();
		accelerator.addAccelerator("Fio",CS);		
		accelerator.addAccelerator("Varen",CS);	
		accelerator.delProcessor("Varen",CS);
		accelerator.printComputerComponent(CS);
		accelerator.canRead();
		accelerator.canWrite();
		System.out.println();
		//INSERT RAM
		RAM ram = new RAM();
		ram.addRAM("Dio", CS);
		ram.addRAM("Ten", CS);
		ram.delMemory("Dio", CS);
		ram.printComputerComponent(CS);
		ram.canRead();
		ram.canWrite();
		//INSERT CACHE
		Cache cache = new Cache();
		cache.addCache("Cia", CS);
		cache.addCache("Na", CS);
		cache.addCache("Endi", CS);
		cache.delMemory("Na", CS);
		cache.printComputerComponent(CS);
		//INSERT ADDITIONAL CARD FLAC
		FlacAudio flacaudio = new FlacAudio();
		flacaudio.addCard("Flac", CS, 1);
		flacaudio.canRead();
		flacaudio.canWrite();
		flacaudio.printComputerComponent(CS);
		//INSERT ADDITIONAL CARD OGG
		OggAudio oggaudio = new OggAudio();
		oggaudio.addCard("Ogg", CS, 1);
		oggaudio.canRead();
		oggaudio.canWrite();
		oggaudio.printComputerComponent(CS);
		//INSERT ADDITIONAL CARD MP3
		mp3Audio mp3audio = new mp3Audio();
		mp3audio.addCard("Mp3", CS, 1);
		mp3audio.canRead();
		mp3audio.canWrite();
		mp3audio.printComputerComponent(CS);
		//INSERT MORE THAN 3 ADDTIONAL CARD
		flacaudio.addCard("Flac1", CS, 1);
		//INSERT BUT NO EXTENSION CARD
		oggaudio.addCard("Ogg1", CS, 0);		
	}
	public static void main(String argvs[])   {  
		new Main();
	}
}