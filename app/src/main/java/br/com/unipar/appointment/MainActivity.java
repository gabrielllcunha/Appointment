package br.com.unipar.appointment;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;

import br.com.unipar.appointment.dao.AppointmentDao;
import br.com.unipar.appointment.database.AppDatabase;
import br.com.unipar.appointment.database.RoomDatabaseOpenHelper;
import br.com.unipar.appointment.entities.Appointment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertUser();
    }

    public void insertUser() {
        AppDatabase appDatabase = RoomDatabaseOpenHelper.getDatabase(new WeakReference<Context>(this));
        AppointmentDao userDao = appDatabase.appointmentDao();
        Appointment user = new Appointment();
        user.setPacientName("Aaron");
        user.setPacientContact("255525694");
        user.setPacientEmail("aaron2342@outlook.com");
        long uuid = userDao.insertAll(user);
        Appointment searchedUser = userDao.findByUuid(uuid);
    }
}