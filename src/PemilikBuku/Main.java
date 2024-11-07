package PemilikBuku;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan=new Scanner(System.in);
	
	static ArrayList<Buku>BukuList=new ArrayList<Buku>();
	static ArrayList<Pemilik>PemilikList=new ArrayList<Pemilik>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public void fill() {
		BukuList.add(new jurnal("Fosil", 2022, 2, null, "Horror"));
		BukuList.add(new Novel("Dark", 1122, 1, null, "Crazy"));
		BukuList.add(new Novel("Love", 3322, 3, null, "Romantic"));
		BukuList.add(new Novel("God Loves me", 4422, 4, null, "Action"));
	}
	
	public void display() {
		int n=0;
		System.out.println("==============Novel===============");
		for (int i = 0; i < BukuList.size(); i++) {
			if(BukuList.get(i) instanceof Novel) {
				System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\n", 
						n+1, BukuList.get(i).getBuku(),((Novel) BukuList.get(i)).getGenre(), 
						BukuList.get(i).getTahunTerbit(),BukuList.get(i).getVolume());
				n++;
				System.out.println();
			}
		}
		System.out.println("==============Jurnal===============");
		n=0;
		for (int i = 0; i < BukuList.size(); i++) {
			if(BukuList.get(i) instanceof jurnal) {
				System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\n", 
						n+1, BukuList.get(i).getBuku(),((jurnal) BukuList.get(i)).getGenre(), 
						BukuList.get(i).getTahunTerbit(),BukuList.get(i).getVolume());
				n++;
				System.out.println();
			}
		}
	}
	
	public void displayTotalNovel() {
		int n=0;
		System.out.println("======Novel=======");
		for (int i = 0; i < BukuList.size(); i++) {
			if(BukuList.get(i) instanceof Novel) {
				System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\nNama Pemilik: %s\nUmur Pemilik: %d\n", 
						n+1, BukuList.get(i).getBuku(),((Novel) BukuList.get(i)).getGenre(),BukuList.get(i).getTahunTerbit(),
						BukuList.get(i).getVolume(), BukuList.get(i).getPemilik().getNama(),BukuList.get(i).getPemilik().getUmur());
				n++;
				System.out.println();
			}
		}
		
	}
	
	public void displayTotalJournal() {
		int n=0;
		System.out.println("======Journal=======");
		for (int i = 0; i < BukuList.size(); i++) {
			if(BukuList.get(i) instanceof jurnal) {
				System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\nNama Pemilik: %s\nUmur Pemilik: %d\n", 
						n+1, BukuList.get(i).getBuku(),((jurnal) BukuList.get(i)).getGenre(),BukuList.get(i).getTahunTerbit(),
						BukuList.get(i).getVolume(), BukuList.get(i).getPemilik().getNama(),BukuList.get(i).getPemilik().getUmur());
				n++;
				System.out.println();
			}
		}
	}
	
	public Main() {
		System.out.println("======BUKU DIJUAL======");
		fill();
		display();
		int n=0;
		int umur;
		System.out.println("========PEMILIK BARU========");
		System.out.println("---------NOVEL---------");
		for (int i = 0; i < BukuList.size(); i++) {
            if (BukuList.get(i) instanceof Novel) {
                System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\n", 
                		n+1, BukuList.get(i).getBuku(),((Novel) BukuList.get(i)).getGenre(), 
						BukuList.get(i).getTahunTerbit(),BukuList.get(i).getVolume());
                n++;
                
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                umur=0;
                
                boolean valid=false;
                do {
	                try {
	                	System.out.print("Umur: ");
	                	umur = scan.nextInt();  
	                    scan.nextLine();
	                    valid=true;
	                }catch (Exception e){
	                	System.out.println("[ERR] Input must be a number!");
	    				scan.nextLine();
	                }
                }while(valid!=true);
                Pemilik newPemilik = new Pemilik(nama, umur, BukuList);
                PemilikList.add(newPemilik);
                BukuList.get(i).setPemilik(newPemilik); 
            }
        }
		
		System.out.println("---------JURNAL---------");
		for (int i = 0; i < BukuList.size(); i++) {
            if (BukuList.get(i) instanceof jurnal) {
                System.out.printf("%d. title: %s\nGenre: %s\ntahun terbit:%d\nvolume:%d\n", 
                		n+1, BukuList.get(i).getBuku(),((jurnal) BukuList.get(i)).getGenre(), 
						BukuList.get(i).getTahunTerbit(),BukuList.get(i).getVolume());
                n++;
                
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                umur=0;
                
                boolean valid=false;
                do {
	                try {
	                	System.out.print("Umur: ");
	                	umur = scan.nextInt();  
	                    scan.nextLine();
	                    valid=true;
	                }catch (Exception e){
	                	System.out.println("[ERR] Input must be a number!");
	    				scan.nextLine();
	                }
                }while(valid!=true);
                Pemilik newPemilik = new Pemilik(nama, umur, BukuList);
                PemilikList.add(newPemilik);
                BukuList.get(i).setPemilik(newPemilik); 
            }
        }
		
		displayTotalNovel();
		displayTotalJournal();
	}

}
