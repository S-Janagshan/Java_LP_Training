package Jana_ChainOfResponsibility;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Vat vat =new Vat();
        NBT nbt=new NBT();
        BBT bbt=new BBT();
        SSF ssf=new SSF();
        Tax tax=new Tax();

        //set the chain
        tax.setSuccessor(nbt);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(bbt);
        bbt.setSuccessor(ssf);



        JFrame frame = new JFrame();
        JButton button = new JButton("click Here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);


    }
}