package model;

public class wisataAlam extends destinasi {
    private String fasilitas;

    public wisataAlam(String namaDestinasi, int tiketDewasa, int tiketAnak, String fasilitas) {
        super(namaDestinasi, tiketDewasa, tiketAnak);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
}
