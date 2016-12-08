package New_topic_Maven;

import org.apache.tools.ant.taskdefs.Exit;

import java.util.Scanner;

/**
 * Created by welcome on 13/11/2016.
 */
public class TubeMap {
    public static void main(String[] args) {

//        System.out.println("Enterthe name of station from following list:\nRegentsPark , OxfordCircus , Holborn , Euston, Warrenstreet,\nBarersStreet, GreenPark, PicadillyCircus, BondStreet, Temple");
//        Scanner sc=new Scanner(System.in);
//        String station_name=sc.nextLine();
//        String station = station_name.toUpperCase();
       // int attemp = 0;



        String RegentsPark []={"Bakerloo Line"};
        String OxfordCircus []={"Victoria Line","Bakerloo Line","Central Line"};
        String Holborn []= {"Picadilly Circus","Central Line"};
        String Euston []= {"Northen Line via Charingcross","Northen Line via bank","Overground to Watford Junction","London Midland service"};
        String WarrenStreet [] = {"Northen Line Charingcross ","Victoria Line"};
        String BakerStreet []= {"Bakerloo Line","Metropolitan Line", "HammersmithandCity Line","Circle Line"};
        String GreenPark []= {"Victoria Line","Jubilee Line","Picadilly Line"};
        String PicadillyCircus [] ={"Picadilly Line","Bakerloo Line"};
        String Bondstreet []= {"Central Line","Jubilee Line "};
        String Temple []={"District Line","Circle Line"};
int attempt=0;
        while(attempt<3){


                System.out.println("Enterthe name of station from following list:\nRegentsPark , OxfordCircus , Holborn , Euston, Warrenstreet,\nBakersStreet, GreenPark, PicadillyCircus, BondStreet, Temple");
                Scanner sc = new Scanner(System.in);
                String station_name = sc.nextLine();
                String station = station_name.toUpperCase();
                if (station.equals("REGENTSPARK")) {
                    for (String aa : RegentsPark) {
                        System.out.println(aa);
                    }
                    System.exit(0);
                } else if (station.equals("OXFORDCIRCUS")) {
                    for (String bb : OxfordCircus) {
                        System.out.println(bb);
                    }
                    System.exit(0);
                } else if (station.equals("HOLBORN")) {
                    for (String cc : Holborn) {
                        System.out.println(cc);
                    }
                    System.exit(0);
                } else if (station.equals("EUSTON")) {
                    for (String dd : Euston) {
                        System.out.println(dd);
                    }
                    System.exit(0);
                } else if (station.equals("WARRENSTREET")) {
                    for (String ee : WarrenStreet) {
                        System.out.println(ee);
                    }
                    System.exit(0);
                } else if (station.equals("BAKERSTREET")) {
                    for (String ff : BakerStreet) {
                        System.out.println(ff);
                    }
                    System.exit(0);
                } else if (station.equals("GREENPARK")) {
                    for (String gg : GreenPark) {
                        System.out.println(gg);
                    }
                    System.exit(0);
                } else if (station.equals("PICADILLYCIRCUS")) {
                    for (String h : PicadillyCircus) {
                        System.out.println(h);
                    }
                    System.exit(0);
                } else if (station.equals("BONDSTREET")) {
                    for (String i : Bondstreet) {
                        System.out.println(i);
                    }
                    System.exit(0);
                } else if (station.equals("TEMPLE")) {
                    for (String j : Temple) {
                        System.out.println(j);
                    }
                    System.exit(0);
                }

            attempt ++;

            if (attempt ==1){
                System.out.println("Station out of Zone One\nPlease Try again\ntwo attemps remaining \n\n ");
            }
            else if (attempt==2){
                System.out.println("Station out of Zone One\nPlease Try again\none attemps remaining\n\n  ");
            }
            else {
                System.out.println("Station out of Zone One\nSorry ! You can not enter any more choice . Try next time");
            }

        }

    }
}

