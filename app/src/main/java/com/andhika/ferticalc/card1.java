package com.andhika.ferticalc;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class card1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Masa Subur adalah adalah saat indung telur (ovarium) melepaskan " +
                "sel telur (ovum) yang sudah siap dibuahi ke dalam saluran indung telur (tuba falopi)." +
                "\n\nMasa subur biasanya berlangsung 2 minggu usai wanita menstruasi. " +
                "Dalam satu bulan wanita melepaskan satu ovum, yang bisa berasal dari ovarium kanan atau kiri." +
                "\n\nMasa subur tidaklah berlangsung lama. umur sel telur hanya berkisar 12-24 jam usai dilepaskan. " +
                "Setelah waktu tersebut lewat ovum bersama jaringan dalam rahim yang sudah disipakan untuk menerima ovum yang berhasil dibuahi, " +
                "akan dibuang melalui tuba falopi. \n\nHal ini ditandai penurunan kadar progesteron dan esterogen dalam tubuh wanita, " +
                "dalam siklus yang disebut menstruasi. Siklus ini biasanya berlangsung dalam 28-35 hari, selama maksimal 15 hari. ");

        textView.setMovementMethod(new ScrollingMovementMethod());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
