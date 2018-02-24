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
    
    Frage1("Wie hoch ist der Mount Everest?", "8892 Meter", "7980 Meter", "8036 Meter", "8507 Meter"),
    Frage2("Frage 2", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage3("Frage 3", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage4("Frage 4", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage5("Frage 5", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage6("Frage 6", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage7("Frage 7", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage8("Frage 8", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage9("Frage 9", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage10("Frage 10", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage11("Frage 11", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage12("Frage 12", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage13("Frage 13", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage14("Frage 14", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage15("Frage 15", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage16("Frage 16", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage17("Frage 17", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage18("Frage 18", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage19("Frage 19", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage20("Frage 20", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage21("Frage 21", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage22("Frage 22", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage23("Frage 23", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage24("Frage 24", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage25("Frage 25", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage26("Frage 26", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage27("Frage 27", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage28("Frage 28", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage29("Frage 29", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage30("Frage 30", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage31("Frage 31", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage32("Frage 32", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage33("Frage 33", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3"),
    Frage34("Frage 34", "Richtig", "Falsch 1", "Falsch 2", "Falsch 3");
    
    
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
