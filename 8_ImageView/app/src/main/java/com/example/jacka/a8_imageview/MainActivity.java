package com.example.jacka.a8_imageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static Button switchImageButton;

    private static ImageView imageView;

    private static int imagesIndex = 0;
    private static int[] images = {R.mipmap.and_bear, R.mipmap.android};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToSwitchButton();
    }

    private void addListenerToSwitchButton() {

        imageView = (ImageView) findViewById(R.id.imageViewBear);
        switchImageButton = (Button) findViewById(R.id.switchImageButton);

        switchImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagesIndex++;
                imagesIndex = imagesIndex % images.length;

                imageView.setImageResource(images[imagesIndex]);

            }
        });

    }
}
