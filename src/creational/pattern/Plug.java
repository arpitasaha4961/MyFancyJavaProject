package creational.pattern;
class Usplug {
    public double length;
    public double width;

    public Usplug(double length, double width) {
        this.length = length;
        this.width = width;
    // Jim: This is the singleton instance that will be used as the only one instance
    private static Usplug singletUsPlugInstance;

    public static Usplug getSingleton() {
        if (singletUsPlugInstance == null) {
            singletUsPlugInstance = new Usplug();
        }
        return singletUsPlugInstance;
    }

    /* Jim: Constructor has to be private in Singleton
        No parameter shall be passed to constructor
    */
    private Usplug() {
        this.l = 10;
        this.w = 5;
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
    // Jim: This is the singleton instance that will be used as the only one instance

    private static Europlug singletEuroPlugInstance;

    /* Jim: Constructor has to be private in Singleton
        No parameter shall be passed to constructor
    */
    public static Europlug getSingleton() {
        if (singletEuroPlugInstance == null) {
            singletEuroPlugInstance = new Europlug();
        }
        return singletEuroPlugInstance;
    }

    private Europlug()
    {
        this.b = 11;
        this.h = 15;
    }
}


class usplugadapter
{
    private usplugadapter(){}
    private static usplugadapter uspa;

    public static usplugadapter getSingleton() {
        if(uspa == null) {
            uspa = new usplugadapter();
        }

        return uspa;
    }
   public static Usplug usplug = Usplug.getSingleton() ;
    public static double getRange(Usplug r)
    {
        usplug=r;
        return usplug.length * usplug.width;
    }
}


class plugAdapter {

    usplugadapter pl;
    Europlug  europlug;

    public double getRange(Europlug t)
    {
        pl = usplugadapter.getSingleton();
        europlug=t;
        double length = europlug.base;
        double width = 0.5*europlug.hight;

        Usplug r = new Usplug(length,width);
        return plug.getRange(r);
        Usplug r = Usplug.getSingleton();
        return pl.getRange(r);
    }

}

class Client {
    public static void main(String[] args)
    {
        plugAdapter pg=new plugAdapter();
        System.out.println("This is a Adapter Type design pattern ");
        Europlug t = new Europlug(45,10);
// Jim: Class name has to be same as file-name
class Plug
{
    public static void main(String[] args)
    {
        plugAdapter pg=new plugAdapter();
        Europlug t = Europlug.getSingleton();
        System.out.println("The us plug range is :" + pg.getRange(t));

    }

}



