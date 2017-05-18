public class Ktp {
	private int NIK;
	private String Nama;
	private String TTL;
	private String JK;
	private int Rt;
	private int Rw;
	private String Desa;
	private String Kec;
	private String Agama;
	private String Status_Kawin;
	private String Pekerjaan;
	private String Kewarganegaraan;

	public void Ktp(int NIK, String Nama, String TTL, String JK, int Rt, int Rw, String Desa, String Kec,
			String Agama, String Status_Kawin, String Pekerjaan, String Kewarganegaraan) {
		this.NIK = NIK;
		this.Nama = Nama;
		this.setTTL(TTL);
		this.setJK(JK);
		this.Rt = Rt;
		this.Rw = Rw;
		this.Desa = Desa;
		this.Kec = Kec;
		this.Agama = Agama;
		this.Status_Kawin = Status_Kawin;
		this.Kewarganegaraan = Kewarganegaraan;
		this.Pekerjaan = Pekerjaan;
	}

	public int getNIK() {
		return NIK;
	}

	public void setNIK(int nIK) {
		NIK = nIK;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public int getRt() {
		return Rt;
	}

	public void setRt(int rt) {
		Rt = rt;
	}

	public int getRw() {
		return Rw;
	}

	public void setRw(int rw) {
		Rw = rw;
	}

	public String getDesa() {
		return Desa;
	}

	public void setDesa(String desa) {
		Desa = desa;
	}

	public String getKec() {
		return Kec;
	}

	public void setKec(String kec) {
		Kec = kec;
	}

	public String getAgama() {
		return Agama;
	}

	public void setAgama(String agama) {
		Agama = agama;
	}

	public String getStatus_Kawin() {
		return Status_Kawin;
	}

	public void setStatus_Kawin(String status_Kawin) {
		Status_Kawin = status_Kawin;
	}

	public String getPekerjaan() {
		return Pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		Pekerjaan = pekerjaan;
	}

	public String getKewarganegaraan() {
		return Kewarganegaraan;
	}

	public void setKewarganegaraan(String kewarganegaraan) {
		Kewarganegaraan = kewarganegaraan;
	}

	public String getTTL() {
		return TTL;
	}

	public void setTTL(String tTL) {
		TTL = tTL;
	}

	public String getJK() {
		return JK;
	}

	public void setJK(String jK) {
		JK = jK;
	}

}
