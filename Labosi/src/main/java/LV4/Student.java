/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV4;

import java.io.Serializable;

/**
 *
 * @author Marin
 */
public class Student implements Serializable {
     public int maticniBroj, godina;
        public String ime, prezime, fakultet, smjer;
        public float prosjecnaOcjena;

        public int getMaticniBroj() {
            return maticniBroj;
        }

        public void setMaticniBroj(int maticniBroj) {
            this.maticniBroj = maticniBroj;
        }

        public int getGodina() {
            return godina;
        }

        public void setGodina(int godina) {
            this.godina = godina;
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public String getFakultet() {
            return fakultet;
        }

        public void setFakultet(String fakultet) {
            this.fakultet = fakultet;
        }

        public String getSmjer() {
            return smjer;
        }

        public void setSmjer(String smjer) {
            this.smjer = smjer;
        }

       public float getProsjecnaOcjena() {
        return prosjecnaOcjena;
      }

      public void setProsjecnaOcjena(float prosjecnaOcjena) {
        this.prosjecnaOcjena = prosjecnaOcjena;
     }

        
    
}
