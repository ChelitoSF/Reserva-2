package mx.ipn.reserva_danielor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Inf_App(View V)
    {
        Intent InfAp = new Intent(this , Info_App.class);
        startActivity(InfAp);
    }

    public void Rent_Lib(View V)
    {
        Intent InfAp = new Intent(this, Prest_Lib.class);
        startActivity(InfAp);
    }

}
