using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySqlConnector;

namespace MySqlCsharp2
{
    class Program
    {
        static void Insert(MySqlConnection connect, string name, string birthday, int id)
        {
            string query = "Insert into artist(id, name, birthday) values(" + id + " ,'" + name + "', '" + birthday + "')";

            //open connection
            connect.Open();

            //create command and assign the query and connection from the constructor
            MySqlCommand cmd = new MySqlCommand(query, connect);

            //Execute command
            cmd.ExecuteNonQuery();

            //close connection
            connect.Close();
        }

        static void Update(MySqlConnection connect, string name, string birthday, int id)
        {

            string query = string.Format(
                "UPDATE artist SET name='{0}', birthday='{1}' WHERE id={2}",
                name,
                birthday,
                id
            );

            //open connection
            connect.Open();
            //create command and assign the query and connection from the constructor
            MySqlCommand cmd = new MySqlCommand(query, connect);
            //Execute command
            cmd.ExecuteNonQuery();
            //close connection
            connect.Close();
        }


        static void Delete(MySqlConnection connect, int id)
        {
            string query = "DELETE FROM artist WHERE id=" + id + "";

            connect.Open();
            MySqlCommand cmd = new MySqlCommand(query, connect);
            cmd.ExecuteNonQuery();
            connect.Close();
        }

        static List<string> SelectAllArtists(MySqlConnection connect)
        {
            string query = "SELECT * FROM artist";
            //Create a list to store the result
            List<string> list = new List<string>();
            //Open connection
            connect.Open();
            //Create Command
            MySqlCommand cmd = new MySqlCommand(query, connect);
            //Create a data reader and Execute the command
            MySqlDataReader dataReader = cmd.ExecuteReader();
            //Read the data and store them in the list
            while (dataReader.Read())
            {
                list.Add(
                    dataReader["id"] + " " +
                    dataReader["name"] + " " +
                    dataReader["birthday"] + " "
                );
            }
            //close Data Reader
            dataReader.Close();
            //close Connection
            connect.Close();
            //return list to be displayed
            return list;
        }

        static int Count(MySqlConnection connect, string table)
        {
            string query = "SELECT Count(*) FROM " + table;


            //Open Connection
            connect.Open();
            //Create Mysql Command
            MySqlCommand cmd = new MySqlCommand(query, connect);

            //ExecuteScalar will return one value
            int Count = Convert.ToInt32(cmd.ExecuteScalar());

            //close Connection
            connect.Close();

            return Count;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("MySqlConnector !");

            string server = "localhost";
            string database = "rsa";
            string uid = "root";
            string password = ""; // à remplacer par votre password
            string connectionString = "SERVER=" + server + ";" + "DATABASE=" + database + ";" +
                                      "UID=" + uid + ";" + "PASSWORD=" + password + ";";

            MySqlConnection mySqlConnection = new MySqlConnection(connectionString);

            Insert(mySqlConnection, "voulzy", "1940-10-01", 5);
            Update(mySqlConnection, "Laurent Voulzy", "1940-10-01", 5);
            Delete(mySqlConnection, 5);


            List<string> artists = SelectAllArtists(mySqlConnection);
            foreach (string artist in artists)
            {
                Console.WriteLine(artist);
            }

            Console.WriteLine("la table artist contient " + Count(mySqlConnection, "artist") + " lignes");
            Console.WriteLine("la table album contient " + Count(mySqlConnection, "album") + " lignes");
        }
    }
}
