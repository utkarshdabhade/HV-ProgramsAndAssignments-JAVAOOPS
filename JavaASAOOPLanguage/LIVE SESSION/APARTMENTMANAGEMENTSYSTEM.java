
/******************** Importing Essential Libraries ************************/

import java.util.*;
import java.io.*;

/*************************** MENU OF AMS ****************************/

class MainMenu {
    public void menu() {
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t  APARTMENT MANAGEMENT SYSTEM");
        System.out.println("\t\t*******************************************");
        System.out.println("\n\nPress 1 : To Add an Apartment Details");
        System.out.println("Press 2 : To See an Apartment Details ");
        System.out.println("Press 3 : To Remove an Apartment");
        System.out.println("Press 4 : To Update Apartment Details");
        System.out.println("Press 5 : To Exit the HMS Portal");

    }
}

/************************ To add details of Apartment *********************/

class Apartment_Add {
    public void createFile() {
        Scanner sc = new Scanner(System.in);

        AptDetail emp = new AptDetail();
        emp.getInfo();
        try {
            File f1 = new File("file" + emp.Apt_No + ".txt");
            if (f1.createNewFile()) {
                FileWriter myWriter = new FileWriter("file" + emp.Apt_No + ".txt");
                myWriter.write("Apartment No:" + emp.Apt_No + "\n" + "Apartment Name     :" + emp.name + "\n" +
                        "Apartment floor     :" + emp.Apt_floor + "\n" + "Apartment Contact  :" + emp.Apt_contact
                        + "\n" +
                        "Email Information :" + emp.email);
                myWriter.close();
                System.out.println("\nApartment has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            } else {
                System.out.println("\nApartment already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/************************* Taking Apartment Details ************************/

class AptDetail {
    String name;
    String Apt_floor;
    String email;
    String Apt_No;
    String Apt_contact;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Apartment's name --------: ");
        name = sc.nextLine();
        System.out.print("Enter Apartment's floor location -: ");
        Apt_floor = sc.nextLine();
        System.out.print("Enter Apartment's No ----------: ");
        Apt_No = sc.nextLine();
        System.out.print("Enter Apartment's Email No ----: ");
        email = sc.nextLine();
        System.out.print("Enter Apartment contact Info --: ");
        Apt_contact = sc.nextLine();
    }
}

/************************ To Show details of Apartment *********************/

class Apartment_Show {
    public void viewFile(String s) throws Exception {
        File file = new File("file" + s + ".txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}

/***************************** To Remove Apartment *************************/

class Apartment_Remove {
    public void removeFile(String No) {

        // File file = new File("file" + No + ".txt");

        try {
            PrintWriter pw = new PrintWriter("file" + No + ".txt");
            pw.close();
            System.out.println("\nApartment has been removed Successfully");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

/************************ To Update details of Apartment ********************/

class Apartment_Update {
    public void updateFile(String s, String o, String n) throws IOException {
        File file = new File("file" + s + ".txt");
        Scanner sc = new Scanner(file);
        String fileContext = "";
        while (sc.hasNextLine()) {
            fileContext = fileContext + "\n" + sc.nextLine();
        }
        FileWriter myWriter = new FileWriter("file" + s + ".txt");
        fileContext = fileContext.replaceAll(o, n);
        myWriter.write(fileContext);
        myWriter.close();

    }
}

/************************ To Exit from the HMS Portal *********************/

class CodeExit {
    public void out() {
        System.out.println("\n*****************************************");
        System.out.println("$ cat Thank You ");
        System.out.println("*****************************************");
        System.exit(0);
    }
}

/***************************** Main Class *******************************/
class APARTMENTMANAGEMENTSYSTEM {
    public static void main(String arv[]) {
        /** To clear the output Screen **/
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        Apartment_Show epv = new Apartment_Show();

        int i = 0;

        /*** Callining Mainmenu Class function ****/
        MainMenu obj1 = new MainMenu();
        obj1.menu();

        /*** Initialising loop for Menu Choices ***/
        while (i < 6) {

            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());

            /** Switch Case Statements **/
            switch (i) {
                case 1: {
                    /** Creating class's object and calling Function using that object **/
                    Apartment_Add ep = new Apartment_Add();
                    ep.createFile();

                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2: {
                    System.out.print("\nPlease Enter Apartment's No :");
                    String s = sc.nextLine();
                    try {
                        epv.viewFile(s);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }

                case 3: {
                    System.out.print("\nPlease Enter Apartment's No :");
                    String s = sc.nextLine();
                    Apartment_Remove epr = new Apartment_Remove();
                    epr.removeFile(s);

                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 4: {
                    System.out.print("\nPlease Enter Apartment's No :");
                    String I = sc.nextLine();
                    try {
                        epv.viewFile(I);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    Apartment_Update epu = new Apartment_Update();
                    System.out.print("Please Enter the detail you want to Update :");
                    System.out.print("\nFor Example :\n");
                    System.out.println(
                            "If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
                    String s = sc.nextLine();
                    System.out.print("Please Enter the Updated Info :");
                    String n = sc.nextLine();
                    try {
                        epu.updateFile(I, s, n);

                        System.out.print("\nPress Enter to Continue...");
                        sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        obj1.menu();
                        break;
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
                case 5: {
                    CodeExit obj = new CodeExit();
                    obj.out();
                }
            }
        }
    }
}

