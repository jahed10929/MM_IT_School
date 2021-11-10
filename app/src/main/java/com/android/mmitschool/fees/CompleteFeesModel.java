package com.android.mmitschool.fees;

public class CompleteFeesModel {
    private String receipt_no;
    private String month;
    private String payment_date;
    private String total_due;
    private String pay_by;

    public CompleteFeesModel(String receipt_no, String month, String payment_date, String total_due, String pay_by) {
        this.receipt_no = receipt_no;
        this.month = month;
        this.payment_date = payment_date;
        this.total_due = total_due;
        this.pay_by = pay_by;
    }

    public String getReceipt_no() {
        return receipt_no;
    }

    public void setReceipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getTotal_due() {
        return total_due;
    }

    public void setTotal_due(String total_due) {
        this.total_due = total_due;
    }

    public String getPay_by() {
        return pay_by;
    }

    public void setPay_by(String pay_by) {
        this.pay_by = pay_by;
    }
}
