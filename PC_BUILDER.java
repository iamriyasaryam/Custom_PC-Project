import java.util.*;
public class PC_BUILDER{

    public static void main(String args []){
        // Tree Structure for project 
        System.out.println("*****WELCOME TO MODEX COMPUTERS*****");
        System.out.println();
        System.out.println("press (1) for PRE-BUILT PCs");
        System.out.println("press (2) for IN-BUILT PCs");
        Scanner sc = new Scanner(System.in);
        int primary_Option = sc.nextInt();
        if(primary_Option == 1){
            System.out.println("This service is coming soon");
        }
        else if(primary_Option == 2){
            System.out.println("press(1) for INTEL BASED PCs");
            System.out.println("press(2) for  AMD BASED PCs");
            int brand_Option = sc.nextInt();
            if(brand_Option == 1){
                for(int i=1; i<=10; i++){
                    switch(i){
                        case 1:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_1 = sc.nextInt();
                            String part_1 = processor(sort_1);
                        case 2:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_2 = sc.nextInt();
                            String part_2 = ram(sort_2); 

                        case 3:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_3 = sc.nextInt();
                            String part_3 = gpu(sort_3);

                        case 4:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_4 = sc.nextInt();
                            String part_4 = psu(sort_4);
                        case 5:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_5 = sc.nextInt();
                            String part_5 = ssd(sort_5);

                        case 6:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_6 = sc.nextInt();
                            String part_6 = hdd(sort_6);
                        case 7:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_7 = sc.nextInt();
                            String part_7 = cabinet(sort_7);
                        case 8:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_8 = sc.nextInt();
                            String part_8 = cooler(sort_8);

                        case 9:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_9 = sc.nextInt();
                            String part_9 = cabels(sort_9);
                        case 10:
                            System.out.println("press(1) to sort price LOW TO HIGH");
                            System.out.println("press(2) to sort price HIGH TO LOW");
                            int sort_10 = sc.nextInt();
                            String part_10 = mother_board(sort_10);
                        default: System.out.println("Error 404");
            
                    }
                }
            }
            else if(brand_Option == 2){

            }
            else{
                System.out.println("INVALID OPTION");
            }
        }
        else{
            System.out.println("INVALID OPTION");
        }

    
    }

    // Function to print PROCESSORS name
    public static String processor(int sort_1){
        if(sort_1 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_1 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(sorted_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
       
        

        return processor_part;
    }


    // Funtion to print RAM name
    public static String ram(int sort_2){
        if(sort_2 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_2 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(low2high_processor);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return ram_part;
    }


    // Function to print GRAPHIC CARD name
    public static String gpu(int sort_3){
        if(sort_3 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_3 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return gpu_part;
    }


    // Function to print POWER SUPPLY names
    public static String psu(int sort_4){
        if(sort_4 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_4 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return psu_part;
    }


    // Function to print SSD name
    public static String ssd(int sort_5){
        if(sort_5 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_5 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return ssd_part;
    }


    // Function to print HDD Names
    public static String hdd(int sort_6){
        if(sort_6 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_6 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return hdd_part;
    }


    // Function to print CABINET Names
    public static String cabinet(int sort_7){
        if(sort_7 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_7 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return cabinet_part;
    }


    // Function to print CABELS name
    public static String cabels(int sort_9){
        if(sort_9 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_9 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return cabels_part;
    }


    // Function to print MOTHER BOARD Name
    public static String mother_board(int sort_10){
        if(sort_10 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_10 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return mother_board_part;
    }


    // Function to print COOLER Name
    public static String cooler(int sort_8){
        
        if(sort_8 == 1){
            String low2high_Sorted = low2high_Sorted(String names);
            double low2high_Price = low2high_Price(double price);
            for(int i=0; i<low2high_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + low2high_Sorted[i] + "   " + low2high_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<low2high_Sorted; i++){
                if(Index == i){
                    System.out.println(low2high_Sorted[i]);

                    String low2high_processor = low2high_Sorted[i];

                    Billing(low2high_processor);
                }
            }
           
        }
        else if(sort_8 == 2) {
            String high2low_Sorted = high2low_Sorted(String names);
            double high2low_Price = high2low_Price(double price);
            for(int i=0; i<high2low_Sorted.length; i++){

                System.out.println("Index : "+ i+1  + "  " + high2low_Sorted[i] + "   " + high2low_price[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("select Index :"  );
            int Index = sc.nextInt();
            for(int i=0; i<high2low_Sorted; i++){
                if(Index == i){
                    System.out.println(high2low_Sorted[i]);

                    String high2low_processor2 = high2low_Sorted[i];

                    Billing(high2low_processor2);
                }
            }
            
        }
        else{
            System.out.println("Service Error");
        }
        return cooler_part;
    }



    // Function to store All parts 
    public static String parts_Store(int sort){
        String processor[] = {"intel core 2 duo","intel i3 12th gen 12300k","intel i3 12th gen 12340f","intel i5 12th gen 12500k","intel i5 12th gen 12540f","intel i7 12th gen 12700k","intel i7 12th gen 12740f","intel i9 12th gen 12900k","intel i9 12th gen 12940f","intel xenon extream 12999e"};

        String ram[] = {"edta xpg 2666 mhz","edta 3200 mhz","coreshir vengenc 3200 mhz","g.skill trident 3200 mhz","g.skill trident 4800 mhz","deepkool 5200 mhz","crucial pro 5600 mhz","corsair dominator 7200","Kingston fury 2666 mhz","team group t force delta 3200"};
        String gpu[]= {"GIGABYTE GEFORCE RTX 3060","ASUS ROG GEFORCE RTX 4090","INN03D NVIDIA GEFORCE GTX 1050","MSI GEFORCE RTX 4060","COLORFUL GEFORCE GT 1030","SROCK RX570","ASUS TUF GTX 1660","ASUS DUAL RTX 2060","GIGABYTE GEFORCE RTX 3090","GALAX GEFORCE RTX 3080"};
        String  psu[] = {"MSI MEG 1300W","CORSAIR RM1000E 1000W","ZEBRONICS 450 W","CORSAIR HX 1200 W","CORESAIR CV 650 W","MSI MAG 650 W","FRONTECK 450 W","ROG THOR 1200 W","MSI MAG 850 W","DEEPCOOL PM750D 750 W"};
        String ssd[] = {"CHIPTRONEX GAM X 240 GB","XPG M.2 NVME 1TB","WESTERN GREEN SATA  240 GB","WESTERN SN570 NVME 500 GB","SAMSUNG T7 SHIELD 2 TB","AMEGON AM500S 512 GB","ANT ESPORT 256 GB","EVM 128 GB","CRUCIAL P3 500 GB","SANDISK EXTREME PORTABLE 1 TB"};
        String hdd[] = {"WESTERN DIGITAL WD 4TB","SEAGATE EXPANSION 2 TB","TOSHIBA CANVIO BASICS 1TB","MATRIX 500 GB SATA","SEGAGATE BARRACUDA 2 TB","GEONIX 500 GB","WESTERN DIGITAL 2 TB","SEGAGATE EXPANSION 8TB","TOSHIBA 500 GB","GEONIX 1 TB"};
        String cooler[] = {"THERMALRIGHT 120MM","DEEPCOOL AG 400 120 MM","DEEPCOOL LE500 240MM","COOLER MASTER HYPER H410R 92MM","ALSEYE 0120Z 120 MM","DEEPCOOL GAMMA ARCHER 120MM","CORESAIR H100 RGB 240 MM","ZEBRONICS ZEB PGF110 120 MM","FRACTAL 120MM","ASIAHORSE COSMIQ 120 MM"};
        String cabinet[] = {"COOLER MASTER CMP520","COOLER MASTER CMP520","ZEBRONICS ZIUM","ANT ESPORT 100","ANT ESPORT ICE 112","CHIPTRONEX Z810","FRONTECH PREMIUM SILVER","ANT ESPORT SI24","MUSETEX ATX","ENTWINO WARRIOR","GALAX REVOLUTION"};

        String mother_board[] = {"MSI B550 m pro","GIGABYTE B450 m  ds3h","ASUS Prime H510M","ZEBRONICS H61","AsRock H660M","AsRock B760M","MSI MPG B550","MSI B760M","GIGABYTE H410M","GIGABYTE Z790 Aorus Xtream"};
        String cabels[] = {"LINKUP  PSU CABELS WHITE","SENSEI MODS CUSTOM SLEEVED CABLES","VOLTED MODS PSU CUSTOM SLEEVED CABLES","ANT ESPORT MODO PRO PREMIUM PSU SLEEVED CABLES","asiahorse mod sleev psu cable","cooler master coloured psu cable","corsair premium s;leeved pcie cable","lian li strimer plus rgb cables","ezdiy fab psu cable sleeved"};


        return parts_Store(sort); 
    }

    // Function to calculate Bill 
    public static void Billing(String parts_Name, double price){
        String parts_Name1[] = new String[10];
        double price1[] = new price[];
        parts_Name1[] = {};
        price1[] = {};
        for(int i=0; i<10; i++){
            parts_Name1[i] = parts_Name;
        }
        for(int i=0; i<10; i++){
            price1[i] = price;
        }

        double total_Bill;
        for(int i=0; i<10; i++){
            System.out.println("Parts Name = "+parts_Name1[i] + "    "+ "Price: "+price1[i]);
            total_Bill += price1[i];
        }
        System.out.println("Your Total BILL : " + total_Bill);

        System.out.println("");

    }



    

    
}