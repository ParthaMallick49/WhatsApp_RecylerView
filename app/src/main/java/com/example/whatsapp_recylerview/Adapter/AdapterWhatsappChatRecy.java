package com.example.whatsapp_recylerview.Adapter;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp_recylerview.Model.ModelWhatsappChat;
import com.example.whatsapp_recylerview.R;

import java.util.List;

public class AdapterWhatsappChatRecy extends RecyclerView.Adapter<AdapterWhatsappChatRecy.ViewHolderAdapterWhatsappChatRecy>{

    List<ModelWhatsappChat> chatList;
    Context context;

    public AdapterWhatsappChatRecy(List<ModelWhatsappChat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderAdapterWhatsappChatRecy onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.layout_chat,parent,false);
        ViewHolderAdapterWhatsappChatRecy viewHolderAdapterWhatsappChatRecy=new ViewHolderAdapterWhatsappChatRecy(view);

        return viewHolderAdapterWhatsappChatRecy;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWhatsappChatRecy.ViewHolderAdapterWhatsappChatRecy holder, int position) {
        holder.personName.setText(chatList.get(position).getPersonName());
        holder.messageTime.setText(chatList.get(position).getMessageTime());
        holder.personMessage.setText(chatList.get(position).getPersonMessage());

       holder.personProfile.setImageResource(chatList.get(position).getProfile());
        holder.sendMessage.setImageResource(chatList.get(position).getSend());

    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    class ViewHolderAdapterWhatsappChatRecy extends RecyclerView.ViewHolder {
        TextView personName,personMessage,messageTime;
        ImageView personProfile, sendMessage;

        public ViewHolderAdapterWhatsappChatRecy(@NonNull View itemView) {
            super(itemView);
            personName=itemView.findViewById(R.id.tvPersonName);
            personMessage=itemView.findViewById(R.id.tvPersonMessage);
            messageTime=itemView.findViewById(R.id.tvMessageTime);

            personProfile=itemView.findViewById(R.id.ivProfile);
            sendMessage=itemView.findViewById(R.id.ivSendMessage);
        }
    }
}
