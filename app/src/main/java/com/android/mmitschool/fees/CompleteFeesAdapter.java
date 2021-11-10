package com.android.mmitschool.fees;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mmitschool.R;

import java.util.ArrayList;
import java.util.Comparator;

public class CompleteFeesAdapter extends RecyclerView.Adapter<CompleteFeesAdapter.ViewModel> {
    ArrayList<CompleteFeesModel> completeFeesModels;
    Activity activity;

    public CompleteFeesAdapter(ArrayList<CompleteFeesModel> completeFeesModels, Activity activity) {
        this.completeFeesModels = completeFeesModels;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.complete_recycler_listview,parent,false);
        return new CompleteFeesAdapter.ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        String receiptNo = completeFeesModels.get(position).getReceipt_no();
        String month = completeFeesModels.get(position).getMonth();
        String paymentDate = completeFeesModels.get(position).getPayment_date();
        String total = completeFeesModels.get(position).getTotal_due();
        String payBy = completeFeesModels.get(position).getPay_by();

        holder.month_tv.setText(month);
        holder.payment_date_tv.setText(paymentDate);
        holder.receipt_no_tv.setText(receiptNo);
        holder.total_tv.setText(total);
        holder.pay_mode_tv.setText(payBy);


    }

    @Override
    public int getItemCount() {
        return completeFeesModels.size();
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        LinearLayout download_receipt;
        TextView receipt_no_tv, month_tv, payment_date_tv, total_tv, pay_mode_tv;
        public ViewModel(@NonNull View itemView) {
            super(itemView);

            download_receipt = itemView.findViewById(R.id.download_receipt);
            receipt_no_tv = itemView.findViewById(R.id.receipt_no_tv);
            month_tv = itemView.findViewById(R.id.month_tv);
            payment_date_tv = itemView.findViewById(R.id.payment_date_tv);
            total_tv = itemView.findViewById(R.id.total_tv);
            pay_mode_tv = itemView.findViewById(R.id.pay_mode_tv);
        }
    }
}
