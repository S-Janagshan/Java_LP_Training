public class SmartTV
{
    private String  size;
    private String  price;
    private boolean IosSupport;

    public SmartTV( String size, String price, boolean IosSupport )
    {
        super();
        this.size = size;
        this.price = price;
        this.IosSupport = IosSupport;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize( String size )
    {
        this.size = size;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice( String price )
    {
        this.price = price;
    }

    public boolean isIosSupportSupport()
    {
        return IosSupport;
    }

    public void setIosSupportSupport( boolean IosSupport )
    {
        this.IosSupport = IosSupport;
    }

    @Override
    public String toString()
    {
        return "SmartTV [size=" + size + ", price=" + price + ", IosSupport=" + IosSupport + "]";
    }

}