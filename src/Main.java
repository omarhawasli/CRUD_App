import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Myapp myapp = new Myapp();
         myapp.Hauptmenu();

//        Database database = new Database();
//        database.connect();
//        //

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wählen Sie bitte: ");
//        System.out.println("[1]. READ");
//        System.out.println("[2]. CREATE");
//        System.out.println("[3]. UPDATE");
//        System.out.println("[4]. DELETE");
//
//        int eingabe = scanner.nextInt();
//
//        boolean weiter = false;
//
//
//        switch (eingabe){
//            case 1:
//                    database.read();
//                break;
//            case 2:
//
//                do{
//                    System.out.println("Geben Sie bitte an: ");
//                    System.out.println("Produkt Name: ");
//                    String produkte_name = String.valueOf(scanner.next());
//                    scanner.nextLine();
//
//                    System.out.println("Preis");
//                    Double preis = Double.valueOf(scanner.nextDouble());
//                    scanner.nextLine();
//
//                    System.out.println("Beschreibung");
//                    String beschreibung = String.valueOf(scanner.next());
//                    scanner.nextLine();
//
//                    Produkt produkt = new Produkt(produkte_name,preis,beschreibung);
//                    database.creat(produkt);
//
//
//                    System.out.println("Möchten Sie weitere Produkt erstellen: Y/N");
//
//                    String antwort = scanner.next().toLowerCase();
//
//                    if(antwort.equals("y")){
//                        weiter = false;
//                    }else if (antwort.equals("n")){
//                        weiter = true;
//                    }else {
//                        System.out.println("Geben Sie: Y/N");
//                    }
//
//                }while(!weiter);
//
//                break;
//            case 3:
//                do{
//
//                    database.read();
//
//                    System.out.println("Geben Sie bitte neue Informationen an: ");
//                    System.out.println("ID: ");
//                    int id = scanner.nextInt();
//
//                    System.out.println("Produkt Name: ");
//                    String updateProduktname = String.valueOf(scanner.next());
//                    scanner.nextLine();
//
//                    System.out.println("Preis");
//                    double updatePreis = Double.valueOf(scanner.nextDouble());
//                    scanner.nextLine();
//
//                    System.out.println("Beschreibung");
//                    String updateBeschreibung = String.valueOf(scanner.next());
//                    scanner.nextLine();
//
//                    Produkt updateprodukt = new Produkt(id,updateProduktname,updatePreis,updateBeschreibung);
//                    database.update(updateprodukt);
//
//                    System.out.println("Möchten Sie andere Produkte aktualiesieren: Y/N");
//
//                    String antwort = scanner.next().toLowerCase();
//
//                    if(antwort.equals("y")){
//                        weiter = false;
//                    }else if (antwort.equals("n")){
//                        weiter = true;
//                    }else {
//                        System.out.println("Geben Sie: Y/N");
//                    }
//
//                }while(!weiter);
//
//                break;
//            case 4:
//
//                do {
//                        database.read();
//
//                        System.out.println("Geben Sie bitte die Produkt ID an: ");
//                        System.out.println("ID: ");
//                        int deleteId = scanner.nextInt();
//
//                        Produkt deleteProdukt = new Produkt(deleteId);
//                        database.delete(deleteProdukt);
//
//
//                        System.out.println("Möchten Sie weiter Löschen: Y/N");
//                        String antwort = scanner.next().toLowerCase();
//                        if(antwort.equals("y")){
//                            weiter = false;
//                        }else if (antwort.equals("n")){
//                            weiter = true;
//                        }else {
//                            System.out.println("Geben Sie: Y/N");
//                        }
//                }while(!weiter);
//
//                break;
//        }



    }
}