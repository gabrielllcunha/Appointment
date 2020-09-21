package br.com.unipar.appointment.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.unipar.appointment.dao.AppointmentDao;
import br.com.unipar.appointment.entities.Appointment;

@Database(entities = {Appointment.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AppointmentDao appointmentDao();
}
