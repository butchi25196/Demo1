package com.example.ninjaturtle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choiceClicked(View view) {
        TextView descTV = findViewById(R.id.turtleDescriptionTV);
        ImageView turtleView = findViewById(R.id.turtleIMV);
        switch (view.getId()){
            case R.id.donRB:
                descTV.setText("This is Red Ranger");
                turtleView.setImageDrawable(getResources().getDrawable(R.drawable.red));
                break;
            case R.id.mikeRB:
                descTV.setText("This is Yellow Ranger");
                turtleView.setImageDrawable(getResources().getDrawable(R.drawable.yellow));
                break;
            case R.id.leoRB:
                descTV.setText("This is Blue Ranger");
                turtleView.setImageDrawable(getResources().getDrawable(R.drawable.blue));
                break;
            case R.id.raphRB:
                descTV.setText("This is Silver Ranger");
                turtleView.setImageDrawable(getResources().getDrawable(R.drawable.silver));
                break;
            default:
                break;
        }
    }
    public void displayImageClick(View view) {
        Switch theDisplayButton= findViewById(R.id.displayImageSW);
        ImageView turtleView = findViewById(R.id.turtleIMV);
        if(theDisplayButton.isChecked()){
            turtleView.setVisibility(View.VISIBLE);
        }
        else{
            turtleView.setVisibility((View.INVISIBLE));
        }
    }
}
