package ru.andzhey.clinic;

import java.io.IOException;

/**
 * Created by Анджей on 13.05.2016.
 */
public class ClinicRunner {
    public static void main(String[] args) throws IOException {
        Clinic clinic = new Clinic();
        clinic.start();
    }

}
