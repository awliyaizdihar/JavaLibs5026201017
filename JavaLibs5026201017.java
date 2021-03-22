import javax.swing.JOptionPane;

public class JavaLibs5026201017 {
   public static void main(String[] args) {

	JOptionPane.showMessageDialog(null,
		    "        Selamat datang di TesSib alias Tes Nasib!"
		+ "\n  Hayoo, kelahiran tahun 90an dan awal 2000 pasti"
		+ "\nsudah pada tahu permainan ini. Tema kali ini adalah"
		+ "\n               \"Building your imaginary marriage\""
		+ "\n                 berdasarkan nasibmu sekarang"
		+ "\n    Yuk yuk kita lihat seberapa beruntung kamu :p",
		"TesSib: \"Building your imaginary marriage\"",
		1);
	
	String nameSoul = (String)JOptionPane.showInputDialog(null,
		"Nama kamu siapa dulu nih?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Wati");

	String color = (String)JOptionPane.showInputDialog(null,
		nameSoul+" suka warna apa?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Sky Blue");

	String food = (String)JOptionPane.showInputDialog(null,
		"Makanan yang ingin "+nameSoul+" makan sekarang?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Pizza topping nanas");

	String door = (String)JOptionPane.showInputDialog(null,
		"Mulai random nih, jumlah pintu di rumahmu ada berapa?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"7");

	int kid = Integer.parseInt(door);
	kid = kid*2/3;

	String flower = (String)JOptionPane.showInputDialog(null,
		"Bunga atau jenis tumbuhan kesukaan "+nameSoul+"?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Mawar");

	String country = (String)JOptionPane.showInputDialog(null,
		"Negara yang saat ini ingin dikunjungi "+nameSoul+"?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Italy");

	String city = (String)JOptionPane.showInputDialog(null,
		"Di "+country+", kota apa yang paling ingin "+nameSoul+" kunjungi?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Venice");
	
	String song = (String)JOptionPane.showInputDialog(null,
		"Lagu terakhir yang "+nameSoul+" dengar?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"All My Love");

	String nameMate = (String)JOptionPane.showInputDialog(null,
		"Yang paling penting nih, nama calon jodoh "+nameSoul+"?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"Wawan");

	String time = (String)JOptionPane.showInputDialog(null,
		"Terakhir deh, sekarang di tempat "+nameSoul+" sedang jam berapa?",
		"TesSib: \"Building your imaginary marriage\"",
		3,
		null,
		null,
		"22.03");

	double match = Double.parseDouble(time);
	match = match*4.2;
	
	JOptionPane.showMessageDialog(null,
		   "Asikk, semua pertanyaan udah dijawab nihh.."
		+"\nSaatnya menghitung nasibmu awkawk",
		"TesSib: \"Building your imaginary marriage\"",
		1);

	JOptionPane.showMessageDialog(null,
		   "Terop terop menutupi jalanan~"
		+"\nJanur melengkung di kiri kanan~"
		+"\n"+food+" tersedia di prasmanan~"
		+"\nWadu waduu, siapa ya yang nikahan?"
		+"\n"
		+"\nPengantin wanita berbalut gaun "+color+" berjalan"
		+"\nbersama walinya diiringi lagu "+song+"..."
		+"\n"
		+"\nSelamat "+nameSoul+" atas pernikahannya"
		+"\ndengan "+nameMate+"!!",
		"Your Marriage has been Built!",
		1);

	JOptionPane.showMessageDialog(null,
		   nameSoul+" dan "+nameMate+" bertemu pertama kali"
		+"\ndi "+country+", "+door+" tahun lalu dan sekarang"
		+"\nmemutuskan untuk menikah. Untuk terus"
		+"\nmengenang pertemuan pertama mereka, putri"
		+"\npertama mereka diberi nama "+flower+" "+city+"."
		+"\nHingga saat ini, mereka sudah punya "+kid+" anak."
		+"\n"
		+"\nMeskipun presentase kecocokan "+nameSoul+" dan"
		+"\n"+nameMate+" hanya "+match+"%, tetapi mereka tetap"
		+"\nberhasil membentuk keluarga yang sakinah"
		+"\nmawadah wa rohmah ya bund."
		+"\n"
		+"\nCihuyy selamaat~",
		"Your Marriage has been Built!",
		1);
		

	
	

   }
}
