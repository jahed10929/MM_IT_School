package com.android.mmitschool.exam.exam_report;

public class ExamResultModel {
    private String exam_name;
    private String total_marks;
    private String student_marks;

    public ExamResultModel(String exam_name, String total_marks, String student_marks) {
        this.exam_name = exam_name;
        this.total_marks = total_marks;
        this.student_marks = student_marks;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public String getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(String total_marks) {
        this.total_marks = total_marks;
    }

    public String getStudent_marks() {
        return student_marks;
    }

    public void setStudent_marks(String student_marks) {
        this.student_marks = student_marks;
    }
}
