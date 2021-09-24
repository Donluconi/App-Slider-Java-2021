package com.example.sliderprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //não precisamos usar o SetContent, esse arquivo será substituido pelo slides.
        //setContentView(R.layout.activity_main);

         //removendo os botões
        setButtonBackVisible(false);
        setButtonNextVisible(false);


            addSlide(new FragmentSlide.Builder()
              .background(android.R.color.white)
              .fragment(R.layout.intro_1_xml)
              .build()
            );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2_xml)
                .build()
        );












        /*//removendo os botões
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descrição")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Descrição2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );
        addSlide(new SimpleSlide.Builder()
                .title("Titulo3")
                .description("Descrição3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );
*/
    }
}