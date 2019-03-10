package mx.ipn.reserva_danielor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info_App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__app);
    }

    public void Menu(View V)
    {
        Intent Men = new Intent(this, Login.class);
        startActivity(Men);
    }
}
