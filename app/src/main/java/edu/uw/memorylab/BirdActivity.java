package edu.uw.memorylab;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.btnBirdNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BirdActivity.this, BlankBirdActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        /* Set up image */
        Drawable image = ContextCompat.getDrawable(this, R.drawable.hummingbird); //get the drawable resource
        ImageView birdView = (ImageView)findViewById(R.id.imgBird);
        birdView.setImageDrawable(image);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Drawable image = null;
        ImageView birdView = (ImageView)findViewById(R.id.imgBird);
        birdView.setImageDrawable(image);
    }
}
