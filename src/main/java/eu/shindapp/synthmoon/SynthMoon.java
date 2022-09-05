package eu.shindapp.synthmoon;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import eu.shindapp.synthmoon.models.BotSettings;

import java.sql.SQLException;

public class SynthMoon {

    private static JdbcConnectionSource connectionSource;

    private static Dao<BotSettings, String> botSettingsDao;

    public static void main(String[] args) {
        try {
            connectionSource = new JdbcConnectionSource("", "", "");
            System.out.println("Successfully connected to SQL Database!");

            botSettingsDao = DaoManager.createDao(connectionSource, BotSettings.class);
            TableUtils.createTableIfNotExists(connectionSource, BotSettings.class);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static JdbcConnectionSource getConnectionSource() {
        return connectionSource;
    }

    public static Dao<BotSettings, String> getBotSettingsDao() {
        return botSettingsDao;
    }
}
