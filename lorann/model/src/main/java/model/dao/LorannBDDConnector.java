package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**

* <h1>The Class BoulderDashBDDConnector.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
final class LorannBDDConnector {
	static String personne = "bite";
    /** The instance. */
    private static LorannBDDConnector instance;

    /** The login. */
    private static String                  user     = "root";

    /** The password. */
    private static String                  password = "";

    /** The url. */
    private static String                  url      = "jdbc:mysql://localhost/lorann?useSSL=false&serverTimezone=UTC";

    /** The connection. */
    public static Connection                     connection =null;

    /** The statement. */
    public static Statement                      statement =null;
    	

    public static void sauverEnBase (String personne) {
    	
    	
    	 
    	 try 
    {
    	//Step 1: Loading the driver
    	Class.forName("com.mysql.jdbc.Driver");
    	//Step 2: checking the connection
    	connection = DriverManager.getConnection(url, user, password);
    	//Step 3: creating a statement
    	statement = connection.createStatement();
    	String sql = "INSERT INTO 'javadb' ('personne') VALUES ('"+ personne + "')";
    	//Step 4: executing the query
    	statement.executeUpdate(sql);
    } catch (SQLException e) {
    	e.printStackTrace();
    } catch (ClassNotFoundException e) {
    	e.printStackTrace();
    } finally {
    	try {
    		//Step 5: liberate memory ressources
    		connection.close();
    		statement.close();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    }
   
    	
    }
    /**
     * Instantiates a new boulder dash BDD connector.
     */
    private LorannBDDConnector() {
        this.open();
    }

    /**
     * Gets the single instance of BoulderDashBDDConnector.
     *
     * @return single instance of BoulderDashBDDConnector
     */
    public static LorannBDDConnector getInstance() {
        if (instance == null) {
            setInstance(new LorannBDDConnector());
        }
        return instance;
    }

    /**
     * Sets the instance.
     *
     * @param instance
     *            the new instance
     */
    private static void setInstance(final LorannBDDConnector instance) {
        LorannBDDConnector.instance = instance;
    }

    /**
     * Open.
     *
     * @return true, if successful
     */
    private boolean open() {
        try {
            this.connection = DriverManager.getConnection(LorannBDDConnector.url, LorannBDDConnector.user,
                    LorannBDDConnector.password);
            this.statement = this.connection.createStatement();
            return true;
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    /**
     * Execute query.
     *
     * @param query
     *            the query
     * @return the result set
     */
    public ResultSet executeQuery(final String query) {
        try {
            return this.getStatement().executeQuery(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Prepare call.
     *
     * @param query
     *            the query
     * @return the java.sql. callable statement
     */
    public java.sql.CallableStatement prepareCall(final String query) {
        try {
            return this.getConnection().prepareCall(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Execute update.
     *
     * @param query
     *            the query
     * @return the int
     */
    public int executeUpdate(final String query) {
        try {
            return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Gets the connection.
     *
     * @return the connection
     */
    public Connection getConnection() {
        return this.connection;
    }

    /**
     * Sets the connection.
     *
     * @param connection
     *            the new connection
     */
    public void setConnection(final Connection connection) {
        this.connection = connection;
    }

    /**
     * Gets the statement.
     *
     * @return the statement
     */
    public Statement getStatement() {
        return this.statement;
    }

    /**
     * Sets the statement.
     *
     * @param statement
     *            the new statement
     */
    public void setStatement(final Statement statement) {
        this.statement = statement;
    }

}
