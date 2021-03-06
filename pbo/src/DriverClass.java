import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		Map<String, Ktp> RT1p = new HashMap<>();
		Map<String, Ktp> RT2p = new HashMap<>();
		Map<String, Ktp> RT3p = new HashMap<>();
		Map<String, Ktp> RT4p = new HashMap<>();
		Map<String, Ktp> RT5p = new HashMap<>();
		Map<String, Ktp> RT6p = new HashMap<>();
		Map<String, Ktp> RT7p = new HashMap<>();
		Map<String, Ktp> RT8p = new HashMap<>();

		// nambah orang
		// int NIK
		// ,nama,TTL,Age,JK,Alamat,StatusKawin,Kewarganegaraan,Agama,MasaBerlaku
                		Ktp gusti = new Ktp("20145564","Gusti Ayu","Blitar-1-September-1961","Perempuan",1,2,"Kepanjen","Lowokwaru","Islam","Kawin","Swasta","WNI");
		Ktp mari = new Ktp("20147546", "Marilanda", "Samarinda-3-Agustus-1995", "Perempuan", 9, 21, "Paser", "Balikpapan", "Kristen","Belum Kawin","Wiraswasta","WNI");
		Ktp ande = new Ktp("20147783","Anderia","Jombang-18-Mei-1977","Perempuan",1,9,"Kademangan","Blitar","Islam","Kawin","Swasta","WNI");
		Ktp syaiful = new Ktp("20157789","Syaifullah","Jakarta,9-Januari-1967","Laki-laki",7,1,"Sampit","Lowokwaru","Islam","Belum Kawin","Swasta","WNI");	
		Ktp oka = new Ktp("20179975","Oka Berliano","Blitar-7-Januari-1998","Laki-laki",1,5,"Jone","Tanah Grogot","Islam","Kawin","Swasta","WNI");
		Ktp farid = new Ktp("20118896","Farid Fatullah","Madura-14-Februari-1998","Laki-laki",9,5,"Pademawu","Pamekasan","Islam","Kawin","Swasta","WNI");
                Ktp fatma = new Ktp("20176664","Fatmawati","Ambon-25-November-1998","Perempuan",8,12,"Waiheru","Baguala","Budha","Kawin","Mahasiswa","WNI");
                Ktp ditha = new Ktp("20178943","Ditha Ameilia","Situbondo-8-Mei-1998","Perempuan",8,15,"Awar-awar","Kuamki Baru","Islam","Belum Kawin","Mahasiswa","WNI");
                Ktp rizka = new Ktp("20145337","Rizka Mouliani","Tanjungpinang-25-Agustus-1998","Perempuan",7,89,"Rejowinangun","Kademangan","Islam","Belum Kawin","Swasta","WNI");
                Ktp fina = new Ktp("20178894","Fina Afifana","Pamekasan-9-April-1997","Perempuan",9,15,"Gurem","Pamekasan","Islam","Kawin","PNS","WNI");
                Ktp rena = new Ktp("2016103703", "Rena putri", "Mojokerto, 14-April-1998", "Perempuan", 2, 1, "Kutoporong", "Bangsal", "ISLAM", "Menikah",
				"Mahasiswa", "WNI");
		Ktp wicak = new Ktp("2016103403", "Wicaksono Prawiro", "Mojokerto, 17-Januari-1991", "Laki-Laki", 1, 2, "Jabon", "Mojoanyar", "ISLAM", "Menikah",
				"Wiraswasta", "WNI");
		Ktp kevin = new Ktp("2016103503", "Kevin Adinata", "Bandung, 15-Oktober-1997", "Laki-Laki", 2, 9, "Gayam", "Bangsal", "ISLAM", "Belum Menikah",
				"PNS", "WNI");
		Ktp finis = new Ktp("2016103603", "Finishtri Demiasih", "Aceh, 15-Mei-1994", "Perempuan", 3, 5, "Gebangmalang", "Mojoanyar", "ISLAM", "Cerai",
				"Wiraswasta", "WNI");
		Ktp ou = new Ktp("2016103803", "Ourievia Stevani", "Sidoarjo, 6-Februari-1993", "Perempuan", 4, 4, "Bukittinggi", "Banuhampu", "ISLAM", "Menikah",
				"Ibu rumah tangga", "WNI");
		Ktp gladis = new Ktp("2016103903", "Gladiska Fristia", "Trenggalek, 28-Februari-1991", "Perempuan", 5, 3, "PandaiSingkek", "Kubang Putiah", "ISLAM", "Belum Menikah",
				"Mahasiswa", "WNI");
		Ktp ray = new Ktp("2016103104", "Rayhan", "Cipanas, 8-Maret-1995", "Laki-Laki", 6, 8, "Tirto", "Landungsari", "ISLAM", "Belum Menikah",
				"Mahasiswa", "WNI");
		Ktp nia = new Ktp("2016110330", "Nia Dwi", "Balikpapan, 19-Oktober-1997", "Perempuan", 7, 5, "Jone", "Tanah Grogot", "ISLAM", "Belum Menikah",
				"Mahasiswa", "WNI");
		Ktp danker = new Ktp("20161110220", "Danker Arkeb", "Padang, 19-September-1997", "Laki-Laki", 8, 1, "Keboan", "Meri", "ISLAM", "Belum Menikah",
				"Wiraswasta", "WNI");
		Ktp putra = new Ktp("2016110440", "Putra Ardiansyah", "Madura, 17-Maret-1994", "Laki-Laki", 1, 5, "Puloniti", "Bangsal", "ISLAM", "Menikah",
				"PNS", "WNI");
		
		// masukkan orang ke RT tertentu
		RT1p.put(gusti.getNama(), gusti);
		RT1p.put(mari.getNama(), mari);
		RT2p.put(ande.getNama(), ande);
		RT2p.put(syaiful.getNama(), syaiful);
		RT3p.put(oka.getNama(), oka);
		RT3p.put(farid.getNama(), farid);
		RT3p.put(fatma.getNama(), fatma);
		RT4p.put(ditha.getNama(), ditha);
		RT4p.put(rizka.getNama(), rizka);
		RT4p.put(fina.getNama(), fina);
                RT2p.put(rena.getNama(), rena);
		RT1p.put(wicak.getNama(), wicak);
		RT2p.put(kevin.getNama(), kevin);
		RT3p.put(finis.getNama(), finis);
		RT4p.put(ou.getNama(), ou);
		RT5p.put(gladis.getNama(), gladis);
		RT6p.put(ray.getNama(), ray);
		RT7p.put(nia.getNama(), nia);
		RT8p.put(danker.getNama(), danker);
		RT1p.put(putra.getNama(), putra);
                
		// Masukkin er Arraylist untuk sorting
		List<Ktp> RT1 = new ArrayList<>(RT1p.values());
		List<Ktp> RT2 = new ArrayList<>(RT2p.values());
		List<Ktp> RT3 = new ArrayList<>(RT3p.values());
		List<Ktp> RT4 = new ArrayList<>(RT4p.values());
		List<Ktp> RT5 = new ArrayList<>(RT5p.values());
		List<Ktp> RT6 = new ArrayList<>(RT6p.values());
		List<Ktp> RT7 = new ArrayList<>(RT7p.values());
		List<Ktp> RT8 = new ArrayList<>(RT8p.values());

		// sorting

		// menampilkan
		int i;
		System.out.println("DATA PENDUDUK KECAMATAN BALIKPAPAN BARAT");
		System.out.println("Daftar Kelurahan    :");
		System.out.println("1.Kelurahan Margo Mulyo\n2.Kelurahan Kampung Baru Ulu");
		System.out.println("\nMasukkan Pilihan : ");
		i = input.nextInt();

		// kelurahan Margo Mulyo
		if (i == 1) {
			System.out.println("Daftar RT di Kelurahan Margo Mulyo:");
			System.out.println("1.RT 1\n2.RT 2\n3.RT 3\n4.RT 4");
			System.out.println("\nMasukkan Pilihan : ");
			int rta = input.nextInt();
			if (rta == 1) {
				System.out.println("Daftar Penduduk : ");
				RT1.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 2) {
				RT2.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 3) {
				RT3.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 4) {
				RT4.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			}
		}

		// kelurahan Kampung Baru Ulu
		else if (i == 2) {
			System.out.println("Daftar RT di Kelurahan Kampung Baru Ulu");
			System.out.println("1.RT 5\n2.RT 6\n3.RT 7\n4.RT 8");
			System.out.println("\nMasukkan Pilihan : ");
			int rta = input.nextInt();
			if (rta == 1) {
				System.out.println("Daftar Penduduk : ");
				RT5.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 2) {
				RT6.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 3) {
				RT7.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			} else if (rta == 4) {
				RT8.forEach((p) -> {
					System.out.println(p.getNIK() + "\t" + p.getNama() + "\t" + p.getTTL() + "\t" + p.getJK() + "\t"
							+ p.getRt() + "\t" + p.getRw() + "\t" + p.getDesa() + "\t" + p.getKec() + "\t"
							+ p.getAgama() + "\t" + p.getStatus_Kawin() + "\t" + p.getPekerjaan() + "\t"
							+ p.getKewarganegaraan());
				});
			}
		}
	}
}
