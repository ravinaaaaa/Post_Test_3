package model;

public class wisataBudaya extends destinasi {
    private String acaraAdat;

    public wisataBudaya(String namaDestinasi, int tiketDewasa, int tiketAnak, String acaraAdat) {
        super(namaDestinasi, tiketDewasa, tiketAnak);
        this.acaraAdat = acaraAdat;
    }

    public String getAcaraAdat() {
        return acaraAdat;
    }

    public void setAcaraAdat(String acaraAdat) {
        this.acaraAdat = acaraAdat;
    }
}
