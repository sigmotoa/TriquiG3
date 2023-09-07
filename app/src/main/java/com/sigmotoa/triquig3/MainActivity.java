package com.sigmotoa.triquig3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgJugador1 = findViewById(R.id.img_jugador_1);
        ImageView imgJugador2 = findViewById(R.id.img_jugador_2);

        ImageButton btn00 = findViewById(R.id.ib_00);







        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setImageDrawable(getDrawable(R.drawable.twotone_circle_24));
                btn00.setBackgroundColor(getColor(R.color.green_moss));
            }
        });
        btn00.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn00.setImageDrawable(getDrawable(R.drawable.twotone_add_24));
                return true;
            }
        });




        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Lionel_Messi_WC2022.jpg/580px-Lionel_Messi_WC2022.jpg")
                .error(R.drawable.parky_001)
                .placeholder(R.drawable.parky_001)
                .circleCrop()
                .into(imgJugador1);

        Glide.with(this)
                .load("https://www.planetafutbol.com/wordpress/wp-content/uploads/2018/01/Ronaldo-Nazario-1170x702.jpg")
                .error(R.drawable.parky_001)
                .placeholder(R.drawable.parky_001)
                .circleCrop()
                .into(imgJugador2);








    }
}