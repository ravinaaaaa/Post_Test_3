package model;

public class destinasi {
    private String namaDestinasi;
    private int tiketDewasa;
    private int tiketAnak;

    public destinasi(String namaDestinasi, int tiketDewasa, int tiketAnak) {
        this.namaDestinasi = namaDestinasi;
        this.tiketDewasa = tiketDewasa;
        this.tiketAnak = tiketAnak;
    }

    // Getter & Setter (Encapsulation)
    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public int getTiketDewasa() {
        return tiketDewasa;
    }

    public void setTiketDewasa(int tiketDewasa) {
        this.tiketDewasa = tiketDewasa;
    }

    public int getTiketAnak() {
        return tiketAnak;
    }

    public void setTiketAnak(int tiketAnak) {
        this.tiketAnak = tiketAnak;
    }
}
