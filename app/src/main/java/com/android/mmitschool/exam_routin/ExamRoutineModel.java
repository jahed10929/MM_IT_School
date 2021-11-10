package com.android.mmitschool.exam_routin;

public class ExamRoutineModel {
    private String exam_date;
    private String exam_month;
    private String exam_day;
    private String exam_subject;
    private String exam_time;
    private String exam_name;

    public ExamRoutineModel(String exam_date, String exam_month, String exam_day, String exam_subject, String exam_time, String exam_name) {
        this.exam_date = exam_date;
        this.exam_month = exam_month;
        this.exam_day = exam_day;
        this.exam_subject = exam_subject;
        this.exam_time = exam_time;
        this.exam_name = exam_name;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public String getExam_month() {
        return exam_month;
    }

    public void setExam_month(String exam_month) {
        this.exam_month = exam_month;
    }

    public String getExam_day() {
        return exam_day;
    }

    public void setExam_day(String exam_day) {
        this.exam_day = exam_day;
    }

    public String getExam_subject() {
        return exam_subject;
    }

    public void setExam_subject(String exam_subject) {
        this.exam_subject = exam_subject;
    }

    public String getExam_time() {
        return exam_time;
    }

    public void setExam_time(String exam_time) {
        this.exam_time = exam_time;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }
}
