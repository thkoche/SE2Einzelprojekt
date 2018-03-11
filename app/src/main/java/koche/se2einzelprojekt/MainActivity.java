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

        EditText editPalindorm = (EditText) findViewById(R.id.editPalindrom);
        String palindrom = editPalindorm.getText().toString();

        TextView resultView = findViewById(R.id.resultView);

        if(palindrom.length() < 5 || palindrom == null){
            resultView.setTextColor(Color.RED);
            resultView.setText("Unzulässige Länge!");
        }else{

            if(isPladindrome(palindrom) == true){
                resultView.setTextColor(Color.GREEN);
                resultView.setText("Eingabe ist ein Palindrom!");
            }else{
                resultView.setTextColor(Color.RED);
                resultView.setText("Eingabe ist kein Palindrom!");
            }
        }
    }

    /**Check if string is a palindrom*/
    public static boolean isPladindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
