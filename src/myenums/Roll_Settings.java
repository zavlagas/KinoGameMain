/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myenums;

import myinterface.FindValues;

/**
 *
 * @author User
 */
public enum Roll_Settings implements FindValues {

    TWO {
        @Override
        public int showValues() {
            int number = 2;
            return (number);
        }
    },
    THREE {
        @Override
        public int showValues() {
            int number = 3;
            return (number);
        }
    },
    FOUR {
        @Override
        public int showValues() {
            int number = 4;
            return (number);
        }
    },
    FIVE {
        @Override
        public int showValues() {
            int number = 5;
            return (number);
        }
    },
    SIX {
        @Override
        public int showValues() {
            int number = 6;
            return (number);
        }
    },
    TEN {
        @Override
        public int showValues() {
            int number = 10;
            return (number);
        }
    },
    TWENTY {
        @Override
        public int showValues() {
            int number = 20;
            return (number);
        }
    },
    FIFTY {
        @Override
        public int showValues() {
            int number = 50;
            return (number);
        }
    },
    HUNDREND {
        @Override
        public int showValues() {
            int number = 100;
            return (number);
        }
    },
    TWO_HUNDREND {
        @Override
        public int showValues() {
            int number = 200;
            return (number);
        }
    },
    
}
