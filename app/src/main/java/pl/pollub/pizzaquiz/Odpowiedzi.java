package pl.pollub.pizzaquiz;

public class Odpowiedzi {
    private String odpowiedz1;
    private String odpowiedz2;
    private String odpowiedz3;
    private String odpowiedz4;

    public Odpowiedzi(String odpowiedz1, String odpowiedz2, String odpowiedz3, String odpowiedz4) {
        this.odpowiedz1 = odpowiedz1;
        this.odpowiedz2 = odpowiedz2;
        this.odpowiedz3 = odpowiedz3;
        this.odpowiedz4 = odpowiedz4;
    }

    public String getOdpowiedz1() {
        return odpowiedz1;
    }

    public String getOdpowiedz2() {
        return odpowiedz2;
    }

    public String getOdpowiedz3() {
        return odpowiedz3;
    }

    public String getOdpowiedz4() {
        return odpowiedz4;
    }
}
