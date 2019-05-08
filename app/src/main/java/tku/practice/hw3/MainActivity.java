package tku.practice.hw3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView red, green, blue, color;
    private Button bt1;
    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = findViewById(R.id.textView3);
        green = findViewById(R.id.textView4);
        blue = findViewById(R.id.textView5);
        color = findViewById(R.id.textView6);
        bt1 = findViewById(R.id.button);
    }

    public void colorful(View v){
        Random x = new Random();
        int r = x.nextInt(255), g = x.nextInt(255), b =x.nextInt(255);
        red.setText("Red : "  + r);
        red.setTextColor(Color.rgb(r, 0, 0));

        green.setText("Green : "  + g);
        green.setTextColor(Color.rgb(0, g, 0));

        blue.setText("Red : "  + r);
        blue.setTextColor(Color.rgb(0, 0, b));

        result += r + " , " + g + " , " + b + "\n";
        color.setTextSize(20);
        color.setText(result);
        color.setMovementMethod(new ScrollingMovementMethod());
        color.setBackgroundColor(Color.rgb(r, g, b));
    }
}
