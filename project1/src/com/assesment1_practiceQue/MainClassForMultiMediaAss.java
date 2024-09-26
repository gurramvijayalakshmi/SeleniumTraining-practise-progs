package com.assesment1_practiceQue;


import java.util.Scanner;

class MultimediaDevice {
    String brand;
    String model;
    int yearOfManufacture;

    public MultimediaDevice(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void Displayinfo(){
        System.out.println("Brand: " + brand+" Model: " + model+" Year of Manufacture: " + yearOfManufacture);
    }
}

class BasicMediaPlayer extends MultimediaDevice {
    String supportedFormats;
    public BasicMediaPlayer(String brand, String model, int yearOfManufacture,String supportedFormats) {
        super(brand, model, yearOfManufacture);
        this.supportedFormats =supportedFormats;
    }
    public void play(){
        System.out.println("Playing multiMedia contents: " + supportedFormats);
    }
    public void Displayinfo(){
        super.Displayinfo();
    }
}

class SmartTv extends MultimediaDevice {
    int screansize;
    String smartfeatures;

    public SmartTv(String brand, String model, int yearOfManufacture,int screansize,String smartfeatures) {
        super(brand, model, yearOfManufacture);
        this.screansize=screansize;
        this.smartfeatures=smartfeatures;
    }
    public void adjustBass(){
        System.out.println("Adjusting bass on the Smart TV");
    }

    public void adjustVolume(){
        System.out.println("Adjusting volume on the Smart TV");
    }

    public
    @Override
    /*public void Displayinfo(){
        super.Displayinfo();
        System.out.println("Screansize: " + screansize+" inches, Smart features: " + smartfeatures);
    }*/

}

class HomeTheaterSystem extends SmartTv{
    boolean surroundsound;
    boolean subwoofer;

    public HomeTheaterSystem(String brand, String model, int yearOfManufacture,int screansize,String smartfeatures,boolean surroundsound, boolean subwoofer) {
        super(brand,model,yearOfManufacture,screansize,smartfeatures);
        this.surroundsound=surroundsound;
        this.subwoofer=subwoofer;
    }
    @Override
    public void Displayinfo(){
        super.Displayinfo();
        System.out.println("Surroundsound: " +(surroundsound ? "Enabled" : "Disabled") + "subwoofer: " + (subwoofer ? "Enabled" : "Disabled"));
    }
    public void adjustVolume(){
        System.out.println("Adjusting volume on the Home Theater");
    }

    public void adjustTreble(){
        System.out.println("Adjusting treble on the Home Theater");
    }
}


public class MainClassForMultiMediaAss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Device to interact with :  ");
        System.out.println("1. Basic Media Player");
        System.out.println("2. Smart TV");
        System.out.println("3. Home Theater");
        int choice = sc.nextInt();

        MultimediaDevice device =null;
        switch(choice) {
            case 1:
                device = new BasicMediaPlayer("Sony","XYZ-100",2002,"mp3,avi");
                break;
            case 2:
                device = new SmartTv("Sony","ABC-200",2023,55,"YouTube , Netflix");
                break;
            case 3:
                device = new HomeTheaterSystem("Samsung","HTS-5000",2022,75,"Amazon Primo",true,true);
                break;
            default:
                System.out.println("Invalid choice");

        }
        device.Displayinfo();

        if (device instanceof BasicMediaPlayer) {
            ((BasicMediaPlayer) device).play();
        } else if (device instanceof SmartTv) {
            SmartTv smartTV = (SmartTv) device;
            smartTV.adjustVolume();
            //smartTV.changeChannel();
        }

        if (device instanceof HomeTheaterSystem) {
            HomeTheaterSystem homeTheater = (HomeTheaterSystem) device;
            homeTheater.adjustBass();
            homeTheater.adjustTreble();
        }

        sc.close();


    }
}
