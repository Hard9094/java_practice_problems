package com.company;
interface camera
{
    void takesnap();
    void recordvideo();
    private void greet()
    {
        System.out.println("good morning");
    }
    default void record4Kvideo()
    {
        greet();
        System.out.println("takinng video in 4K");
    }
}
interface wifi
{
    String[] getNetworks();
    void connecttonetwork(String network);
}
class mycellphone {
    void callnumber(int phonenumber) {
        System.out.println("talking" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting...");
    }
}

    class smartphone2 extends mycellphone implements camera,wifi{

       public  void takesnap()
        {
            System.out.println("taking snap");
        }
        public void recordvideo()
        {
            System.out.println("recording video");
        }
        public void record4Kvideo()
        {
            System.out.println("taking snap and record");
        }
        public String[] getNetworks()
        {
            System.out.println("setting list of networks");
            String[] networklist= {"diya","vidhi"};
            return networklist;
        }
        public void connecttonetwork(String network)
        {
            System.out.println("connecting to" + network);
        }
    }

public class default_methods_polymorsphism {
    public static void main(String[]args)
    {
        smartphone2 obj= new smartphone2();
        camera c= new smartphone2(); //this is a smartphone use it as a camera
        c.takesnap();


       obj.record4Kvideo();
       obj.connecttonetwork("namee");
       obj.callnumber(9856);
         //obj.greet();     throws an errorr!!!
        String[] ar= obj.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }
      //  c.callNumber(); //--not allowed only the methods in camera are allowed because it is used as a reference
    }
}
