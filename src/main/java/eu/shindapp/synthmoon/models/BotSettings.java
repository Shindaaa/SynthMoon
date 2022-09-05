package eu.shindapp.synthmoon.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;

@Data
@DatabaseTable(tableName = "synthmoon_bot_settings")
public class BotSettings {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField()
    private String clientId;

    @DatabaseField()
    private String ownerId;

    @DatabaseField()
    private String mainGuildId;

    @DatabaseField()
    private String clientAuthKey;

}
