package creational.pattern;
class Usplug {
    public double length;
    public double width;

    public Usplug(double length, double width) {
        this.length = length;
        this.width = width;
    }
}


class Europlug {
    public double base;
    public double hight;

    public Europlug(double base, double hight)
    {
        this.base = base;
        this.hight = hight;
    }
}

class plug {
   public static Usplug usplug ;
    public static double getRange(Usplug r)
    {
        usplug=r;
        return usplug.length * usplug.width;
    }
}


class plugAdapter {

    plug pl;
    Europlug  europlug;

    public double getRange(Europlug t)
    {
        pl = new plug();
        europlug=t;
        double length = europlug.base;
        double width = 0.5*europlug.hight;

        Usplug r = new Usplug(length,width);
        return plug.getRange(r);
    }

}

class Client {
    public static void main(String[] args)
    {
        plugAdapter pg=new plugAdapter();
        System.out.println("This is a Adapter Type design pattern ");
        Europlug t = new Europlug(45,10);
        System.out.println("The us plug range is :" + pg.getRange(t));

    }

}



