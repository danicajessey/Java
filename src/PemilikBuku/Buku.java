package PemilikBuku;

public class Buku {
	protected String Buku;
	protected int tahunTerbit;
	protected int volume;
	protected Pemilik pemilik;
	
	public String getBuku() {
		return Buku;
	}
	public void setBuku(String buku) {
		Buku = buku;
	}
	public int getTahunTerbit() {
		return tahunTerbit;
	}
	public void setTahunTerbit(int tahunTerbit) {
		this.tahunTerbit = tahunTerbit;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public Pemilik getPemilik() {
		return pemilik;
	}
	public void setPemilik(Pemilik pemilik) {
		this.pemilik = pemilik;
	}
	public Buku(String buku, int tahunTerbit, int volume, Pemilik pemilik) {
		super();
		Buku = buku;
		this.tahunTerbit = tahunTerbit;
		this.volume = volume;
		this.pemilik = pemilik;
	}
	
	
}
