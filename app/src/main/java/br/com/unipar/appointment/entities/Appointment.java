package br.com.unipar.appointment.entities;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "appointments")
public class Appointment {

    public static final String UUID = "uuid";
    public static final String NAME = "pacientName";
    public static final String DATE = "hour";
    public static final String DOCTOR = "doctor";
    public static final String CONTACT = "pacientContact";
    public static final String EMAIL = "pacientEmail";

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = UUID)
    private long uuid;

    @ColumnInfo(name = NAME)
    private String pacientName;

    @ColumnInfo(name = DATE)
    private String hour;

    @ColumnInfo(name = DOCTOR)
    private String doctor;

    @ColumnInfo(name = CONTACT)
    private String pacientContact;

    @ColumnInfo(name = EMAIL)
    private String pacientEmail;

    public long getUuid() {
        return uuid;
    }
    public void setUuid(long uuid) {
        this.uuid = uuid;
    }
    public String getName() {
        return pacientName;
    }
    public void setName(String pacientName) {
        this.pacientName = pacientName;
    }
    public String getCellPhone() {
        return pacientContact;
    }
    public void setCellPhone(String pacientContact) {
        this.pacientContact = pacientContact;
    }
    public String getEmail() {
        return pacientEmail;
    }
    public void setEmail(String pacientEmail) {
        this.pacientEmail = pacientEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment user = (Appointment) o;
        return uuid == user.uuid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
