package db.migration;

import java.sql.Connection;
import java.sql.Statement;

public class V7__Insert_users {

    public void migrate(Connection connection) throws Exception {
        try (Statement statement = connection.createStatement()) {
            statement.execute("ALTER TABLE usuario ADD COLUMN status VARCHAR(50)");
        }
    }
}
