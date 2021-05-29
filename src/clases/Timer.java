package clases;

public class Timer {

    private long start;
    private long stop;

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getStop() {
        return stop;
    }

    public void setStop(long stop) {
        this.stop = stop;
    }

    public void start(){
        long milisegundos = System.currentTimeMillis();
        this.start = milisegundos;
        System.out.println("Start...");

    }
    public void stop(){
        long milisegundos = System.currentTimeMillis();
        this.stop = milisegundos;
        System.out.println("Stop!");
    }

    public long elapsedTime(){
        long diferencia =0;
        diferencia = this.start - this.stop;
        return diferencia;
    }
}
