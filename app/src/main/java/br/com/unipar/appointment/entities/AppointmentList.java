package br.com.unipar.appointment.entities;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Objects;

public class AppointmentList {
    public static ListView Appointment;
    public static List<Appointment> listAppointments = new ArrayList<>();
    public static List<Appointment> listPacientName = new ArrayList<>();
    public static List<Appointment> listHour = new ArrayList<>();
    public static List<Appointment> listDoctor = new ArrayList<>();

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
