package com.example.kasur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Original extends AppCompatActivity {

    private CarouselView carouselView;
    private Button single, singlexl, doublee, king, queen, superking, minus, plus;
    private TextView txHarga, txTotal;
    private EditText edJumlah;

    private int jml = 1;

    private int[] gambar = {
            R.drawable.mimpioriginal,
            R.drawable.mimpioriginal1,
            R.drawable.mimpioriginal2,
            R.drawable.mimpioriginal3,
            R.drawable.mimpioriginal4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_original);
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
        edJumlah = (EditText)findViewById(R.id.edtJumlah);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga1 = 4350000;

                txHarga.setText(""+harga1);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga1 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        singlexl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga2 = 4725000;

                txHarga.setText(""+harga2);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga2 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        doublee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga3 = 5700000;

                txHarga.setText(""+harga3);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga3 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga4 = 7350000;

                txHarga.setText(""+harga4);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga4 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga5 = 8100000;

                txHarga.setText(""+harga5);

                int jumlah = Integer.parseInt(edJumlah.getText().toString());
                int hasil = harga5 * jumlah;

                txTotal.setText(""+hasil);

            }
        });

        superking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int harga6 = 8850000;

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

                edJumlah.setText(""+jml);

                int harga = Integer.parseInt(txHarga.getText().toString());
                int total = Integer.parseInt(txTotal.getText().toString());
                int hasil = total + harga;

                txTotal.setText(""+hasil);

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