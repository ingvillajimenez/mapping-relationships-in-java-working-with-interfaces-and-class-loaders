package com.skillsoft.inheritanceandinterfaces;

import java.util.Calendar;

public interface Automobile {

    // NOTE: All methods in an interface are public and abstract by default
    // we can omit the public modifier for interfaces. If you try specifying
    // modifiers other than public it will show an error
    String safetyAssessmentProgram = "Global NCAP";

    String getMake();

    String getModel();

    Double getPrice();

    static String getFormattedCalendarString() {
        Calendar now = Calendar.getInstance();

        return String.format("%s-%s-%s", now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.YEAR));
    }

//    String getReleaseDate();
    default String getReleaseDate() {
        return getFormattedCalendarString();
    }

}
