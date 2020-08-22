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
public enum Money_Settings implements FindValues {

    ONE {
        @Override
        public int showValues() {
            int number = 1;
            return (number);
        }
    },
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
    FIVE {
        @Override
        public int showValues() {
            int number = 5;
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
    FIFTEEN {
        @Override
        public int showValues() {
            int number = 15;
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
    THIRTY {
        @Override
        public int showValues() {
            int number = 30;
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
    }
}
