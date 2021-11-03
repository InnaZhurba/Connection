package db;

public class Connection {
    private static Connection thisConnection;
    private Connection(){//об'єкти на зовні ми створювати не можемо через цей приватний конструктор

    }
    public static Connection getConnection(){//створює один екземпляр - і передає його постійно
       if(thisConnection==null){
           thisConnection = new Connection();
       }
        return thisConnection;
    }

}
