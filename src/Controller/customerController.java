package Controller;

import Model.Customer;

import java.awt.event.*;

public class customerController extends Customer {

    private void printInformation(String name, String Address)
    {
        System.out.println("Name: " + name + "\nAddress: " + Address);

    }

    class readName implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    class readPassword implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    class readAddress implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }






}
