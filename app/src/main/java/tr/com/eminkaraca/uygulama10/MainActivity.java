package tr.com.eminkaraca.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Asker asker;
    public Tankci tankci;
    public Topcu topcu;
    String mesaj ="";
    Button buttonAsker , buttonTankci , buttonTopcu;
    TextView textViewSonuc;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker = new Asker();
        tankci = new Tankci();
        topcu = new Topcu();
        textViewSonuc=findViewById(R.id.textViewSonuc);
        buttonAsker=findViewById(R.id.buttonAsker);
        buttonTankci=findViewById(R.id.buttonTankci);
        buttonTopcu=findViewById(R.id.buttonTopcu);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = asker.atesEt();
                textViewSonuc.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = tankci.atesEt();
                textViewSonuc.setText(mesaj);
            }
        });
        buttonTopcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = topcu.atesEt();
                textViewSonuc.setText(mesaj);
            }
        });
    }
}