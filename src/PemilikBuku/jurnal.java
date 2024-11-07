package PemilikBuku;

public class jurnal extends Buku{
	protected String genre;
	
	
	
	public jurnal(String buku, int tahunTerbit, int volume, Pemilik pemilik, String genre) {
		super(buku, tahunTerbit, volume, pemilik);
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
