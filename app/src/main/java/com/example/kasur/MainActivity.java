package com.example.kasur;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    private CarouselView carouselView;

    private int[] gambar = {
            R.drawable.mimpiluxury3,
            R.drawable.mimpiace3,
            R.drawable.mimpiluxury2,
            R.drawable.mimpioriginal2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(gambar.length);

        carouselView.setImageListener(imageListener);

        CardView cardAce = findViewById(R.id.cardMimpiAce);
        CardView cardOri = findViewById(R.id.cardMimpiOriginal);
        CardView cardLux = findViewById(R.id.cardMimpiLuxury);

        cardAce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ace = new Intent(MainActivity.this, Ace.class);
                startActivity(ace);
            }
        });

        cardOri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ori = new Intent(MainActivity.this, Original.class);
                startActivity(ori);
            }
        });

        cardLux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lux = new Intent(MainActivity.this, Luxury.class);
                startActivity(lux);
            }
        });

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(gambar[position]);
        }
    };

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah Anda yakin ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}