import java.util.Random;
import java.util.Scanner;

public class Myapp {
    Scanner scanner = new Scanner(System.in);

    Database database = new Database();
    boolean weiter = false;
//    private Random input;


    public Myapp() {
        database.connect();
    }

    public void Hauptmenu() {


        System.out.println("Wählen Sie bitte: ");
        System.out.println("[1]. READ");
        System.out.println("[2]. CREATE");
        System.out.println("[3]. UPDATE");
        System.out.println("[4]. DELETE");

        int eingabe = scanner.nextInt();


        switch (eingabe) {
            case 1:
                Read();
                break;
            case 2:
                Creat();
                break;
            case 3:
                Update();
                break;
            case 4:
                Delete();
                break;
        }
    }

    public void Read() {
        database.read();
    }

    public void Creat() {
        do {

            System.out.println("Geben Sie bitte ein Produkt Name an: ");
            String produkte_name = String.valueOf(scanner.next());
            scanner.nextLine();

            System.out.println("Geben Sie bitte ein Preis an");
            Double preis = Double.valueOf(scanner.nextDouble());
            scanner.nextLine();

            System.out.println("Geben Sie bitte eine Beschreibung an");
            String beschreibung = String.valueOf(scanner.next());
            scanner.nextLine();

            Produkt produkt = new Produkt(produkte_name, preis, beschreibung);
            database.creat(produkt);


            System.out.println("Möchten Sie weitere Produkt erstellen: Y/N");

            String antwort = scanner.next().toLowerCase();

            if (antwort.equals("y")) {
                weiter = false;
            } else if (antwort.equals("n")) {
                weiter = true;
            } else {
                System.out.println("Geben Sie: Y/N");
            }

        } while (!weiter);
    }

    public void Update() {
        do {

            database.read();


            System.out.println("Geben Sie bitte neue Informationen an: ");

            System.out.println("wählen Sie  die ID an: ");
            int id = scanner.nextInt();

            Produkt produkt = database.getProduktByID(id);

            if (produkt != null) {


                if (CheckBearbeiten("Möchten Sie die Produkt Name bearbeiten? Y/N")) {
                    System.out.println("Geben Sie bitte ein Produkt Name an: ");
                    String updateProduktname = scanner.nextLine();
                    produkt.setProdukte_name(updateProduktname);
                }


                if (CheckBearbeiten("Möchten Sie den Preis bearbeiten? Y/N")) {
                    System.out.println("Geben Sie bitte ein Preis an");
                    double updatePreis = Double.valueOf(scanner.nextDouble());
                    produkt.setPreis(updatePreis);
                    scanner.nextLine();
                }


                if (CheckBearbeiten("Möchten Sie die Beschreibung bearbeiten? Y/N")) {
                    System.out.println("Geben Sie bitte eine Beschreibung an");
                    String updateBeschreibung = String.valueOf(scanner.next());

                    produkt.setBeschreibung(updateBeschreibung);
                }

                database.update(produkt);

                System.out.println("Möchten Sie andere Produkte aktualiesieren Y/N:");

                String antwort = scanner.next().toLowerCase();

                if (antwort.equals("y")) {
                    weiter = false;
                } else if (antwort.equals("n")) {
                    weiter = true;
                } else {
                    System.out.println("Geben Sie bitte: Y/N");
                }
            } else {
                System.out.println("Produkt");
            }
        }
        while (!weiter);
    }


    public void Delete() {
        do {
            database.read();

            System.out.println("Geben Sie bitte die Produkt ID an: ");
            System.out.println("ID: ");
            int deleteId = scanner.nextInt();

            Produkt deleteProdukt = new Produkt(deleteId);
            database.delete(deleteProdukt);


            System.out.println("Möchten Sie weiter Löschen: Y/N");
            String antwort = scanner.next().toLowerCase();
            if (antwort.equals("y")) {
                weiter = false;
            } else if (antwort.equals("n")) {
                weiter = true;
            } else {
                System.out.println("Geben Sie: Y/N");
            }
        } while (!weiter);
    }



    public boolean CheckBearbeiten(String s) {
            System.out.println(s);
            System.out.println("Wollen Sie bearbeiten");
            System.out.println("Bitte waehlen sie:");


//            Scanner input = new Scanner(System.in);
            String auswahl = scanner.next();
            scanner.nextLine();
            if(auswahl.equals("J") || auswahl.equals("j")){
                return true;
            }
            return false;
        }
    }
