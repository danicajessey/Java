package PemilikBuku;

public class Novel extends Buku{
	protected String genre;
	
	
	public Novel(String buku, int tahunTerbit, int volume, Pemilik pemilik, String genre) {
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
