package com.javalearnings.oops;

  public class SmartPhone {
     private String Brand;

     public SmartPhone(String brand) {
         this.Brand = brand;

     }

     public String getBrand() {
         return Brand;

     }

     public void makecall(String Contact) {
         System.out.println("Calling" + Contact);

     }
 }
      class iPhone  extends SmartPhone {
          public iPhone(String Brand) {
              super(Brand);

          }

          public void facetime(String Contact) {
              System.out.println("facetiming:" + Contact);
          }
      }
         class AndroidPhone extends SmartPhone{
             public AndroidPhone (String brand){
                 super (brand);
         }
        public void runAndroidApp (String appName){
                 System.out.println("Running:"+appName);
             }
       }
          class WindowsMobilePhone extends SmartPhone {
              public WindowsMobilePhone(String brand) {
                  super(brand);
              }

              public void runWindowsApp(String appname) {
                  System.out.println("running:" + appname);

              }
          }

 class main {
    public static void main (String[] args) {
        iPhone iPhone = new iPhone("Apple");
        AndroidPhone AndroidPhone = new AndroidPhone("Samsung");
        WindowsMobilePhone WindowsMobilePhone = new WindowsMobilePhone("Nokia");

        System.out.println(iPhone.getBrand());
        iPhone.facetime("Surya");

        System.out.println(AndroidPhone.getBrand());
        AndroidPhone.runAndroidApp("Whatsapp");

        System.out.println(WindowsMobilePhone.getBrand());
        WindowsMobilePhone.runWindowsApp("Skype");
    }
}


