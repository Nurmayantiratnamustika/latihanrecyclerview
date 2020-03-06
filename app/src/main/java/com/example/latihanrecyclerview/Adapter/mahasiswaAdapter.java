package com.example.latihanrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihanrecyclerview.R;
import com.example.latihanrecyclerview.model.mahasiswa;

import java.util.List;

public class mahasiswaAdapter extends RecyclerView.Adapter<mahasiswaAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View Contactview = inflater.inflate(R.layout.item_mahasiswa,parent,false);

        ViewHolder viewHolder = new ViewHolder(Contactview);
        return  viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewholder, int position) {

        final mahasiswa contact = amahasiswa.get(position);

        final TextView textView = viewholder.tvname;
        textView.setText(contact.getNamanya());
        Button buttonclick = viewholder.messagebutton;
        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(viewholder.itemView.getContext(),contact.getNamanya(),Toast.LENGTH_LONG).show();

            }
        });
        buttonclick.setText(contact.isTombolnya()? "Message" : "Offline");
        buttonclick.setEnabled(contact.isTombolnya());
        TextView tvjk = viewholder.tvjk;
        tvjk.setText(contact.getJeniskelamin());
        TextView tvalamat = viewholder.tvalamat;
        tvalamat.setText(contact.getAlamat());

    }

    public mahasiswaAdapter(List<mahasiswa> contacts){
        amahasiswa= contacts;
    }

    private List<mahasiswa> amahasiswa;

    @Override
    public int getItemCount() {
        return amahasiswa.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView tvname;
        public Button messagebutton;
        public  TextView tvjk;
        public TextView tvalamat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.tv_nama);
            messagebutton = itemView.findViewById(R.id.buttonclick);
            tvjk=itemView.findViewById(R.id.tv_jk);
            tvalamat= itemView.findViewById(R.id.tv_alamat);


        }
    }

}
