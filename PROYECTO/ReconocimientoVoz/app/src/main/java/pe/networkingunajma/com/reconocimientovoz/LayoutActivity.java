package pe.networkingunajma.com.reconocimientovoz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 07/07/2015.
 */
public class LayoutActivity extends Activity{



    private EditText userNameEditText;
    private EditText passwordEditText;

    private Button  loginButton;

    @Override
    public void onCreate(Bundle savedInstance ) {

        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        userNameEditText = (EditText) findViewById(R.id.editTextUsername);
        passwordEditText = (EditText) findViewById(R.id.editTextPassword);
        loginButton = (Button) findViewById(R.id.buttonLogin);

       loginButton.setOnClickListener(new View.OnClickListener() {
           @Override
       public void onClick(View view){

                if(userNameEditText.getText().toString().equals("bop") &&
                        passwordEditText.getText().toString().equals("bop")){

                   finish();
                }else{

                    Log.d("login","error user/password");
                }
           }



       });

    }
}
