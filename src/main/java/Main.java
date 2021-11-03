import db.Connection;

public class Main {
    public static void main(String[] args){
        Connection c_temp;
        Connection c = Connection.getConnection();

        System.out.println(c_temp);
        Connection c2 = Connection.getConnection();

        System.out.println(c==c2);
    }
}
