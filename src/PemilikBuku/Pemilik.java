package PemilikBuku;

import java.util.ArrayList;

public class Pemilik {
	private String nama;
	private int umur;
	
	private ArrayList<Buku>BukuList=new ArrayList<Buku>();

	public Pemilik(String nama, int umur, ArrayList<Buku> bukuList) {
		super();
		this.nama = nama;
		this.umur = umur;
		BukuList = bukuList;
	}


	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public ArrayList<Buku> getBukuList() {
		return BukuList;
	}

	public void setBukuList(ArrayList<Buku> bukuList) {
		BukuList = bukuList;
	}
	
	
	
}
