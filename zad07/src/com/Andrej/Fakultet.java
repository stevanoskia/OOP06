package com.Andrej;

public class Fakultet {
        private String ime;
        private int brNaSmerovi;
        private int brNaStudenti;

        public Fakultet (String ime,int brNaSmerovi,int brNaStudenti ) {
            this.ime=ime;
            this.brNaSmerovi=brNaSmerovi;
            this.brNaStudenti=brNaStudenti;
        }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBrNaSmerovi(int brNaSmerovi) {
        this.brNaSmerovi = brNaSmerovi;
    }

    public void setBrNaStudenti(int brNaStudenti) {
        this.brNaStudenti = brNaStudenti;
    }
        public String getIme() {
            return this.ime;
        }
        public int getBrNaSmerovi() {
            return this.brNaSmerovi;
        }
        public int getBrNaStudenti() {
            return this.brNaStudenti;
        }


}

