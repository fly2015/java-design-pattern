package creational.singleton.examples.database_connection_pool;

public final class DatabaseConnectionPool {
    private static class DatabaseConnectionPoolHolder {
        private static final DatabaseConnectionPool INSTANCE = new DatabaseConnectionPool();
    }

    private DatabaseConnectionPool() {
    }

    public static DatabaseConnectionPool getInstance() {
        return DatabaseConnectionPoolHolder.INSTANCE;
    }

    public void getConnection() {
        System.out.println("Get connection from pool");
    }

    public void releaseConnection() {
        System.out.println("Release connection to pool");
    }

    public static void main(String[] args) {
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();
        pool.getConnection();
        pool.releaseConnection();
    }
}
