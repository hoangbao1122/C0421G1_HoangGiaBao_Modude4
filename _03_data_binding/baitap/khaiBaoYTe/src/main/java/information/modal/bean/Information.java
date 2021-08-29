package information.modal.bean;

public class Information {
    private String name;
    private int yearBirthday;
    private String gender;
    private String nationality;
    private String CMND;
    private String vehicle; // thong tin di lai
    private String Idvehicle; // so hieu phuong tien
    private int chairNumber;
    private String dateStart;
    private String endStart;
    private String note;
    private String thanhPho;
    private String quanHuyen;
    private String phuongXa;
    private String diaChiNoiO;
    private String soDienThoai;
    private String email;
    private String trieuTrung;
    private String lichSuPhoiNhiem;

    public Information(){

    }

    public Information(String name, int yearBirthday, String gender, String nationality, String CMND, String vehicle, String idvehicle, int chairNumber, String dateStart, String endStart, String note, String thanhPho, String quanHuyen, String phuongXa, String diaChiNoiO, String soDienThoai, String email, String trieuTrung, String lichSuPhoiNhiem) {
        this.name = name;
        this.yearBirthday = yearBirthday;
        this.gender = gender;
        this.nationality = nationality;
        this.CMND = CMND;
        this.vehicle = vehicle;
        this.Idvehicle = idvehicle;
        this.chairNumber = chairNumber;
        this.dateStart = dateStart;
        this.endStart = endStart;
        this.note = note;
        this.thanhPho = thanhPho;
        this.quanHuyen = quanHuyen;
        this.phuongXa = phuongXa;
        this.diaChiNoiO = diaChiNoiO;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.trieuTrung = trieuTrung;
        this.lichSuPhoiNhiem = lichSuPhoiNhiem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getIdvehicle() {
        return Idvehicle;
    }

    public void setIdvehicle(String idvehicle) {
        Idvehicle = idvehicle;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getEndStart() {
        return endStart;
    }

    public void setEndStart(String endStart) {
        this.endStart = endStart;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getDiaChiNoiO() {
        return diaChiNoiO;
    }

    public void setDiaChiNoiO(String diaChiNoiO) {
        this.diaChiNoiO = diaChiNoiO;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrieuTrung() {
        return trieuTrung;
    }

    public void setTrieuTrung(String trieuTrung) {
        this.trieuTrung = trieuTrung;
    }

    public String getLichSuPhoiNhiem() {
        return lichSuPhoiNhiem;
    }

    public void setLichSuPhoiNhiem(String lichSuPhoiNhiem) {
        this.lichSuPhoiNhiem = lichSuPhoiNhiem;
    }
}
