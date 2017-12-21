package com.example.mohamedabdelaziz.project1.Report;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohamedabdelaziz.project1.ProjectProfile;
import com.example.mohamedabdelaziz.project1.R;

/**
 * Created by Mohamed on 10/27/2017.
 */

public class Fragment2Card1 extends Fragment {
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_report, null);
        getActivity().setTitle("تقرير اجمالى للمشاريع");
        mRecyclerView = (RecyclerView) view.findViewById(R.id.reportRecycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setAdapter(new Adapter2());

        return view;
    }

    class Adapter2 extends RecyclerView.Adapter<Holder2> {

        @Override
        public Holder2 onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.view1_card_item, null);
            return new Holder2(layoutInflater);
        }

        @Override
        public void onBindViewHolder(Holder2 holder, int position) {
            holder.company_nane.setText("ابراج المحمديه");
            holder.project_name.setText("المشاريع:1");
            holder.payment.setText("مصروفات:2022");
            holder.earn.setText("الايرادات:2000");
            holder.total_earn.setText("ارباح جميع المشاريع:5000");
            holder.finished.setImageResource(R.drawable.delete);
            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getContext(), ProjectProfile.class));
                }
            });
            holder.delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new AlertDialog.Builder(getActivity())
                            //set message, title, and icon
                            .setTitle("تاكيد الحذف")
                            .setMessage("هل تريد الحذف ")
                            .setIcon(R.drawable.xbutton)

                            .setPositiveButton("حذف", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int whichButton) {
                                    //your deleting code
                                    dialog.dismiss();
                                }

                            })


                            .setNegativeButton("الغاء", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                    dialog.dismiss();

                                }
                            })
                            .create().show();
                }
            });
        }
        @Override
        public int getItemCount() {
            return 5;
        }
    }

    class Holder2 extends RecyclerView.ViewHolder {

        TextView company_nane, project_name, payment, earn, total_earn;
        ImageView finished;
        View view;
        ImageButton delete;
        public Holder2(View itemView) {
            super(itemView);
            view=itemView;
            delete= (ImageButton) itemView.findViewById(R.id.delete);
            company_nane = (TextView) itemView.findViewById(R.id.text_item1);
            project_name = (TextView) itemView.findViewById(R.id.text_item2);
            payment = (TextView) itemView.findViewById(R.id.text_item3);
            earn = (TextView) itemView.findViewById(R.id.text_item4);
            total_earn = (TextView) itemView.findViewById(R.id.text_item5);
            finished = (ImageView) itemView.findViewById(R.id.image_statues);
        }
    }
}
