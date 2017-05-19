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
		Ktp zidan = new Ktp("1124762761225", "Zidan", "Malang, 31-Feb-1998", "Laki-Laki", 2, 3, "Pagelaran", "Pagelaran", "ISLAM", "BK",
				"Mahasiswa", "WNI");
		Ktp scott = new Ktp("2", "Scott", "Samarinda-3-Agustus-1995", "", 9, 21, "L", "Balikpapan", "K", "WNI",
				"3-Agustus-2018", "Islam");
		Ktp anna = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp aanna = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp ajim = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp dedi = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp anggie = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp hussin = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp dani = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp raden = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp purniawan = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK",
				"WNI", "8-Maret-2018", "Islam");
		Ktp ayu = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp gista = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp putri = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp sugeng = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp parjo = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp sumiati = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp ucol = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp sulis = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");
		Ktp ninda = new Ktp("1", "Jim", "Balikpapan-8-Maret-1996", "Laki-Laki", 1, 1, "L", "Balikpapan", "BK", "WNI",
				"8-Maret-2018", "Islam");

		// masukkan orang ke RT tertentu
		RT1p.put(jim.getNama(), jim);
		RT1p.put(scott.getNama(), scott);
		RT2p.put(anna.getNama(), anna);
		RT2p.put(aanna.getNama(), aanna);
		RT3p.put(ajim.getNama(), ajim);
		RT3p.put(dedi.getNama(), dedi);
		RT3p.put(anggie.getNama(), anggie);
		RT4p.put(hussin.getNama(), hussin);
		RT4p.put(dani.getNama(), dani);
		RT4p.put(raden.getNama(), raden);
		RT5p.put(purniawan.getNama(), purniawan);
		RT5p.put(ayu.getNama(), ayu);
		RT6p.put(gista.getNama(), gista);
		RT6p.put(putri.getNama(), putri);
		RT6p.put(sugeng.getNama(), sugeng);
		RT7p.put(parjo.getNama(), parjo);
		RT7p.put(sumiati.getNama(), sumiati);
		RT8p.put(ucol.getNama(), ucol);
		RT8p.put(sulis.getNama(), sulis);
		RT8p.put(ninda.getNama(), ninda);

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
