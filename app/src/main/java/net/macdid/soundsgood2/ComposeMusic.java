package net.macdid.soundsgood2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayout;
import android.view.View;

/**
 * Created by user on 2016/6/18.
 */
public class ComposeMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_music);
        GridLayout Table = (GridLayout)findViewById(R.id.array);
        Table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                int positionX,positionY;
                if(id == R.id.button1_1){
                    positionX = 1;
                    positionY = 1;
                }else if(id == R.id.button1_2){
                    positionX = 1;
                    positionY = 1;
                }else

            }
        });
    }
}
