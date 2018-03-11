package koche.se2einzelprojekt;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Called when the user taps the Check button */
    public void checkPladindrom(View view){

        EditText editPalindorm = findViewById(R.id.editPalindrom);
        String palindrom = editPalindorm.getText().toString();

        TextView resultView = findViewById(R.id.resultView);

        if(palindrom.length() < 5){
            resultView.setTextColor(Color.RED);
            resultView.setText(getString(R.string.wrong_palindrom));
        }else{

            if(isPladindrome(palindrom)){
                resultView.setTextColor(Color.GREEN);
                resultView.setText(getString(R.string.is_palindrom));
            }else{
                resultView.setTextColor(Color.RED);
                resultView.setText(getString(R.string.no_palindrom));
            }
        }
    }

    /**Check if string is a palindrom*/
    public static boolean isPladindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
