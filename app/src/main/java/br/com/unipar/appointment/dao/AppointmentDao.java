package br.com.unipar.appointment.dao;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

import br.com.unipar.appointment.entities.Appointment;

@Dao
public interface AppointmentDao {

    @Query("SELECT * FROM appointments")
    List<Appointment> listAppointments();

    @Query("SELECT * FROM appointments where pacientName = :name")
    List<Appointment> listPacientName(String name);

    @Query("SELECT * FROM appointments where hour = :hour")
    List<Appointment> listHour(String hour);

    @Query("SELECT * FROM appointments where doctor = :doctor")
    List<Appointment> listDoctor(String doctor);

    @Insert
    @Transaction
    long insertAll(Appointment... users);

    @Delete
    @Transaction
    void deleteAll(Appointment... users);
}
