import java.sql.*;

public class Database {

    // Drivermanger -> Connection
    // CONNECTION -> Statement
    // STATEMENT -> RESULTSET

    //1. Anmeldedaten .. 127.0.0.1

        String url = "jdbc:mysql://localhost:3306/onlineshop";
        String user = "root";
        String password = "";

        Connection connection;

        public void connect(){
            // Verbindung zur DB aufbauen

            try{

                connection = DriverManager.getConnection(url,user,password);
//                System.out.println("Verbindung erfolgreich hergestellt");

            } catch( SQLException e ){

                System.out.println(e);

            }

        }

        public void read(){
            try{
                String sql = "SELECT * FROM produkte;";

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while(resultSet.next()){
                    System.out.print("ID: " + resultSet.getString("id"));
                    System.out.print(" - ");
                    System.out.print(resultSet.getString("produkte_name"));
                    System.out.print(" - ");
                    System.out.print(resultSet.getString("preis") + "€");
                    System.out.print(" - ");
                    System.out.print(resultSet.getString("beschreibung"));
                    System.out.print(" |--| ");
                }

            }catch(SQLException e){
                System.out.println(e);
            }
        }

        public void creat(Produkt neuesProdukt){
            try{

                //Prepared Statement
                String sql = "INSERT INTO produkte (produkte_name,preis,beschreibung) VALUES (?,?,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1,neuesProdukt.getProdukte_name());
                preparedStatement.setDouble(2,neuesProdukt.getPreis());
                preparedStatement.setString(3,neuesProdukt.getBeschreibung());

                preparedStatement.execute();

                System.out.println("erfolgreich!! Produkt ist hinzugefügt");


            } catch(SQLException e){
                System.out.println(e);
            }
        }

        public void update(Produkt updateProdukt){
            try{
                String sql = "UPDATE produkte SET produkte_name=? ,preis=? ,beschreibung=? WHERE id=? ;";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1,updateProdukt.getProdukte_name());
                preparedStatement.setDouble(2,updateProdukt.getPreis());
                preparedStatement.setString(3,updateProdukt.getBeschreibung());
                preparedStatement.setInt(4,updateProdukt.getId());

                preparedStatement.executeUpdate();

                System.out.println("erfolgreich!! Produkt ist Updated");


            }catch(SQLException e){

            }
        }


        public void delete(Produkt deleteProdukt){
            try{
                String sql = "DELETE FROM produkte WHERE id=?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,deleteProdukt.getId());

                preparedStatement.executeUpdate();

                System.out.println("Erfolgreich !! Produkt ist gelöscht");


            }catch(SQLException e){
                System.out.println(e);
            }
        }
}
