package com.example.frenchteacher;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        blackBtn = findViewById(R.id.button1) ;
        greenBtn = findViewById(R.id.button2) ;
        purpleBtn = findViewById(R.id.button3) ;
        redBtn = findViewById(R.id.button4) ;
        yellowBtn = findViewById(R.id.button5) ;

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        // Find the button by ID and play the correct sound
        int clickedBtn = v.getId() ;

        if(clickedBtn == R.id.button1){ playSound(R.raw.black) ;  }
        else if(clickedBtn == R.id.button2){ playSound(R.raw.green) ;  }
        else if(clickedBtn == R.id.button3){ playSound(R.raw.purple) ;  }
        else if(clickedBtn == R.id.button4){ playSound(R.raw.red) ;  }
        else if(clickedBtn == R.id.button5){ playSound(R.raw.yellow) ;  }
    }

    private void playSound(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }


}





