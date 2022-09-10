package com.example.biodataku;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
        Uri uri = Uri.parse("geo:-6.8023676,110.8358745,16z");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);

    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:085290783525");
        Intent it = new Intent (Intent.ACTION_VIEW, uri );
        startActivity(it);

    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"eiffelputri@gmail.com"});

        try {
            startActivity(Intent.createChooser(intent, "Apakah Anda Ingin Mengirim Email?"));
        }catch(android.content.ActivityNotFoundException ignored) {

        }
    }
}