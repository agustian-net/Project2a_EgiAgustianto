package vsga.mobile.project2a_egiagustianto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel
    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.inputAngkaPertama);
        angka_kedua =  findViewById(R.id.inputAngkaKedua);

        tambah = findViewById(R.id.btnTambah);
        kurang = findViewById(R.id.btnKurang);
        kali =  findViewById(R.id.btnKali);
        bagi =  findViewById(R.id.btnBagi);

        bersihkan = findViewById(R.id.btnBersihkan);

        hasil = findViewById(R.id.outHasil);

        tambah.setOnClickListener(v -> {
            if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 + angka2;
                hasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        kurang.setOnClickListener(v -> {
            if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 - angka2;
                hasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        kali.setOnClickListener(v -> {
            if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 * angka2;
                hasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        bagi.setOnClickListener(v -> {
            if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 / angka2;
                hasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        bersihkan.setOnClickListener(v -> {
            angka_pertama.setText("");
            angka_kedua.setText("");
            hasil.setText("");
            angka_pertama.requestFocus();
        });
    }
}