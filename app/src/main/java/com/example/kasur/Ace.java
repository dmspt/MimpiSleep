package com.example.kasur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * dmspt
 *
 */

public class Ace extends AppCompatActivity {

    private CarouselView carouselView;
    private Button single, singlexl, doublee, king, queen, superking, minus, plus;
    private TextView txHarga, txTotal;
    private EditText edJumlah;
    private int jml = 1;

    private int[] gambar = {
            R.drawable.mimpiace,
            R.drawable.mimpiace1,
            R.drawable.mimpiace2,
            R.drawable.mimpiace3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ace);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(gambar.length);

        carouselView.setImageListener(imageListener);

        single = (Button)findViewById(R.id.btnSingle);
        singlexl = (Button)findViewById(R.id.btnSinglexl);
        doublee = (Button)findViewById(R.id.btnDouble);
        king = (Button)findViewById(R.id.btnKing);
        queen = (Button)findViewById(R.id.btnQueen);
        superking = (Button)findViewById(R.id.btnSuperking);
        minus = (Button)findViewById(R.id.btnMin);
        plus = (Button)findViewById(R.id.btnPlus);
        txHarga = (TextView)findViewById(R.id.txtHarga);
        txTotal = (TextView)findViewById(R.id.txtTotal);
        edJumlah = (EditText) findViewById(R.id.edtJumlah);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga1 = 3420000;

                txHarga.setText(""+harga1);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga1 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        singlexl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga2 = 3870000;

                txHarga.setText(""+harga2);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga2 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        doublee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga3 = 4590000;

                txHarga.setText(""+harga3);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga3 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga4 = 5850000;

                txHarga.setText(""+harga4);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga4 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga5 = 6570000;

                txHarga.setText(""+harga5);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga5 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        superking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga6 = 7020000;

                txHarga.setText(""+harga6);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga6 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jml--;

                edJumlah.setText(""+jml);

                int harga = Integer.parseInt(txHarga.getText().toString());
                int total = Integer.parseInt(txTotal.getText().toString());
                int hasil = total - harga;

                txTotal.setText(""+hasil);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jml++;

                edJumlah.setText("" + jml);

                int harga = Integer.parseInt(txHarga.getText().toString());
                int total = Integer.parseInt(txTotal.getText().toString());
                int hasil = total + harga;

                txTotal.setText("" + hasil);

            }
        });

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(gambar[position]);
        }
    };

}