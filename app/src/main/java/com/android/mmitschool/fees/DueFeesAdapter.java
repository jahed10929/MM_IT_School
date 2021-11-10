package com.android.mmitschool.fees;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mmitschool.R;

import java.util.ArrayList;

public class DueFeesAdapter extends RecyclerView.Adapter<DueFeesAdapter.ViewHolder> {
    ArrayList<DueFeesModel> dueFeesModels;
    Activity activity;

    public DueFeesAdapter(ArrayList<DueFeesModel> dueFeesModels, Activity activity) {
        this.dueFeesModels = dueFeesModels;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.due_recycler_listview, parent, false);
        return new DueFeesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String receiptNo = dueFeesModels.get(position).getReceipt_no();
        String month = dueFeesModels.get(position).getMonth();
        String paymentDate = dueFeesModels.get(position).getPayment_date();
        String total = dueFeesModels.get(position).getTotal_due();

        holder.month_tv.setText(month);
        holder.payment_date_tv.setText(paymentDate);
        holder.receipt_no_tv.setText(receiptNo);
        holder.total_tv.setText(total);

    }

    @Override
    public int getItemCount() {
        return dueFeesModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout pay_now;
        TextView receipt_no_tv, month_tv, payment_date_tv, total_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pay_now = itemView.findViewById(R.id.pay_now);
            receipt_no_tv = itemView.findViewById(R.id.receipt_no_tv);
            month_tv = itemView.findViewById(R.id.month_tv);
            payment_date_tv = itemView.findViewById(R.id.payment_date_tv);
            total_tv = itemView.findViewById(R.id.total_tv);
        }
    }
}
