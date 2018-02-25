/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizspiel;

/**
 *
 * @author thomas
 */
public enum Fragen {
    
    Frage1("Welche Farbe hat eine Banane?", "gelb", "lila", "schwarz", "blau"),
    Frage2("Welches dieser Tiere kann fliegen?", "Adler", "Schwein", "Esel", "Ochse"),
    Frage3("Was ist Harry Potter?", "Zauberer", "Klempner", "Hausmeister", "Müllmann"),
    Frage4("Wie viele Finger hat eine Hand?", "5", "7", "2", "11"),
    Frage5("In welchem Land liegt Berlin?", "Deutschland", "Frankreich", "England", "Spanien"),
    Frage6("Frage", "Richtige Antwort", "Falsche Antwort 1", "Falsche Antwort 2", "Falsche Antwort 3");
    
    
    private final String frage;
    private final String richtigeAntwort;
    private final String falscheAntwort1;
    private final String falscheAntwort2;
    private final String falscheAntwort3;

    private Fragen(String frage, String richtigeAntwort, String falscheAntwort1, String falscheAntwort2, String falscheAntwort3) {
        this.frage = frage;
        this.richtigeAntwort = richtigeAntwort;
        this.falscheAntwort1 = falscheAntwort1;
        this.falscheAntwort2 = falscheAntwort2;
        this.falscheAntwort3 = falscheAntwort3;
    }

    public String getFrage() {
        return frage;
    }

    public String getRichtigeAntwort() {
        return richtigeAntwort;
    }

    public String getFalscheAntwort1() {
        return falscheAntwort1;
    }

    public String getFalscheAntwort2() {
        return falscheAntwort2;
    }

    public String getFalscheAntwort3() {
        return falscheAntwort3;
    }
    
    
}
