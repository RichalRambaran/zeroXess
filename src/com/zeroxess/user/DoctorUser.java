package com.zeroxess.user;

import com.zeroxess.medical.Calendar;

import java.util.ArrayList;
import java.util.Arrays;

public class DoctorUser extends User {

    private Calendar calendar;

    public enum DoctorSpecialization {
        EYE,
        NOSE,
        EAR,
        SKIN,
        GENERAL
    }

    private ArrayList<DoctorSpecialization> specializations = new ArrayList<>();

    public DoctorUser(String username, String password, UserProfile userProfile, DoctorSpecialization... specializations) {
        super(username, password, userProfile);
        this.specializations.addAll(Arrays.asList(specializations));
        this.calendar = new Calendar();
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public ArrayList<DoctorSpecialization> getSpecializations() {
        return specializations;
    }

    @Override
    public String toString() {
        return getUserProfile().getFirstName()+" "+getUserProfile().getLastName();
    }
}
