package Jana_ChainOfResponsibility;

public class Vat extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.01);
        System.out.println("VAT Calculated");

        if(invoice.getAmount()<=100)
        {
            return invoice.getTax();
        }
        else {
            //go to next level
            return successor.applyTax(invoice);

        }
    }



}