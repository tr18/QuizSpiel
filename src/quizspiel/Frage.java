/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizspiel;

import java.io.Serializable;

/**
 *
 * @author thomas
 */
public class Frage implements Serializable {
    
    private static int instanceCounter = 0;
    
    private final int counter;
    
    private final String frage;
    
    private final String richtigeAntwort;
    
    private final String falscheAntwort1;
    
    private final String falscheAntwort2;
    
    private final String falscheAntwort3;

    public Frage(String frage, String richtigeAntwort, String falscheAntwort1, String falscheAntwort2, String falscheAntwort3) {
        instanceCounter++;
        this.counter = instanceCounter;
        this.frage = frage;
        this.richtigeAntwort = richtigeAntwort;
        this.falscheAntwort1 = falscheAntwort1;
        this.falscheAntwort2 = falscheAntwort2;
        this.falscheAntwort3 = falscheAntwort3;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.counter;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Frage other = (Frage) obj;
        if (this.counter != other.counter) {
            return false;
        }
        return true;
    }
    
    
}
