
package model;

public class EstadisticasDTO {
    private String posicion;
    private double AVGcanastas;
    private double AVGasitencias;
    private double AVGrebotes;
    private int MAXcanastas;
    private int MAXasistencias;
    private int MAXrebotes;
    private int MINcanastas;
    private int MINasistencias;
    private int MINrebotes;

    public EstadisticasDTO() {
    }

    public EstadisticasDTO(String posicion, double AVGcanastas, double AVGasitencias, double AVGrebotes, int MAXcanastas, int MAXasistencias, int MAXrebotes, int MINcanastas, int MINasistencias, int MINrebotes) {
        this.posicion = posicion;
        this.AVGcanastas = AVGcanastas;
        this.AVGasitencias = AVGasitencias;
        this.AVGrebotes = AVGrebotes;
        this.MAXcanastas = MAXcanastas;
        this.MAXasistencias = MAXasistencias;
        this.MAXrebotes = MAXrebotes;
        this.MINcanastas = MINcanastas;
        this.MINasistencias = MINasistencias;
        this.MINrebotes = MINrebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getAVGcanastas() {
        return AVGcanastas;
    }

    public void setAVGcanastas(double AVGcanastas) {
        this.AVGcanastas = AVGcanastas;
    }

    public double getAVGasitencias() {
        return AVGasitencias;
    }

    public void setAVGasitencias(double AVGasitencias) {
        this.AVGasitencias = AVGasitencias;
    }

    public double getAVGrebotes() {
        return AVGrebotes;
    }

    public void setAVGrebotes(double AVGrebotes) {
        this.AVGrebotes = AVGrebotes;
    }

    public int getMAXcanastas() {
        return MAXcanastas;
    }

    public void setMAXcanastas(int MAXcanastas) {
        this.MAXcanastas = MAXcanastas;
    }

    public int getMAXasistencias() {
        return MAXasistencias;
    }

    public void setMAXasistencias(int MAXasistencias) {
        this.MAXasistencias = MAXasistencias;
    }

    public int getMAXrebotes() {
        return MAXrebotes;
    }

    public void setMAXrebotes(int MAXrebotes) {
        this.MAXrebotes = MAXrebotes;
    }

    public int getMINcanastas() {
        return MINcanastas;
    }

    public void setMINcanastas(int MINcanastas) {
        this.MINcanastas = MINcanastas;
    }

    public int getMINasistencias() {
        return MINasistencias;
    }

    public void setMINasistencias(int MINasistencias) {
        this.MINasistencias = MINasistencias;
    }

    public int getMINrebotes() {
        return MINrebotes;
    }

    public void setMINrebotes(int MINrebotes) {
        this.MINrebotes = MINrebotes;
    }

    @Override
    public String toString() {
        return "EstadisticasDTO{" + "AVGcanastas=" + AVGcanastas + ", AVGasitencias=" + AVGasitencias + ", AVGrebotes=" + AVGrebotes + ", MAXcanastas=" + MAXcanastas + ", MAXasistencias=" + MAXasistencias + ", MAXrebotes=" + MAXrebotes + ", MINcanastas=" + MINcanastas + ", MINasistencias=" + MINasistencias + ", MINrebotes=" + MINrebotes + '}';
    }
    
    
    
}

    