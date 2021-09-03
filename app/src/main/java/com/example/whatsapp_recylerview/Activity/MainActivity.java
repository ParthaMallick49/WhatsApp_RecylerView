package com.example.whatsapp_recylerview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.whatsapp_recylerview.Adapter.AdapterWhatsappChatRecy;
import com.example.whatsapp_recylerview.Model.ModelWhatsappChat;
import com.example.whatsapp_recylerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ModelWhatsappChat> chatlist;
    private AdapterWhatsappChatRecy adapter;
    private RecyclerView recyclerViewWhatsappChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewWhatsappChat=findViewById(R.id.whatsappChatListRecy);

        initList();
        adapter=new AdapterWhatsappChatRecy(chatlist,MainActivity.this);
        recyclerViewWhatsappChat.setAdapter(adapter);
        recyclerViewWhatsappChat.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void initList(){
        chatlist=new ArrayList<>();
        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man1,
                R.drawable.icon_sendmessage,
                "Dipto",
                "Hi, Buddy!",
                "4.35 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man2,
                R.drawable.icon_sendmessage,
                "Apu",
                "How are u?",
                "5.00 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man3,
                R.drawable.icon_sendmessage,
                "Akash Saha",
                "Ki khbor",
                "10:34 pm"
        ));

        chatlist.add(new ModelWhatsappChat(
                R.drawable.man5,
                R.drawable.icon_sendmessage,
                "Pappu",
                "Dada!!",
                "6.19 pm"
        ));
    }
}