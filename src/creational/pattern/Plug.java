package creational.pattern;
class Usplug {
    public double l;
    public double w;

    public Usplug(double l, double w) {
        this.l = l;
        this.w = w;
    }
}


class Europlug
{
    public double b;
    public double h;

    public Europlug(double b, double h)
    {
        this.b = b;
        this.h = h;
    }
}

class plug
{
   public static Usplug usplug ;
    public static double getRange(Usplug r)
    {
        usplug=r;
        return usplug.l * usplug.w;
    }
}


class plugAdapter
{

    plug pl;
    Europlug  europlug;

    public double getRange(Europlug t)
    {
        pl = new plug();
        europlug=t;
        double l = europlug.b;
        double w = 0.5*europlug.h;

        Usplug r = new Usplug(l,w);
        return plug.getRange(r);
    }

}

class Client
{
    public static void main(String[] args)
    {
        plugAdapter pg=new plugAdapter();
        Europlug t = new Europlug(20,10);
        System.out.println("The us plug range is :" + pg.getRange(t));

    }

}



