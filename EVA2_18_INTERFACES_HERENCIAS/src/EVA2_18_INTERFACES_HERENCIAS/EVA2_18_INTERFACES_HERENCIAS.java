/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA2_18_INTERFACES_HERENCIAS;

/**
 *
 * @author Usuario Final
 */
public class EVA2_18_INTERFACES_HERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    interface intA {

        public abstract void A();
    }

    interface intB {

        void B();
    }

    interface intC extends intA, intB {

        void C();
    }

    class Prueba implements intC {

        @Override
        public void C() {
            
        }

        @Override
        public void A() {
        }

        @Override
        public void B() {            
        }
    }
}
