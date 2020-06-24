package com.example.e_upsunas;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText EditTextNamaa;
    private EditText EditTextNpmm;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        textView = (TextView) findViewById(R.id.info);
        String text = "Pembayaran UPS (Uang Paket Semester) untuk tahun ajaran 2020/2021 pada semester Ganjil dimulai pada tanggal 17 Agustus 2020 - 12 September 2020.";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 108, 144, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_bayar:
                        startActivity(new Intent(getApplicationContext(), PaymentMenu.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_verify:
                        startActivity(new Intent(getApplicationContext(), VerifyMenu.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), ProfileMenu.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_home:
                        return true;
                }
                return false;
            }
        });

        EditTextNamaa = (EditText) findViewById(R.id.nama);
        EditTextNpmm = (EditText) findViewById(R.id.npm);
        Button btnAmbil = (Button) findViewById(R.id.btnAmbil);

        btnAmbil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, Antrian.class);
                startActivity(intent);
                daftarAntrianLoketSatu();
                EditTextNamaa.setText("");
                EditTextNpmm.setText("");
            }
        });
    }

    private void daftarAntrianLoketSatu(){
        final String nama = this.EditTextNamaa.getText().toString().trim();
        final String npm = this.EditTextNpmm.getText().toString().trim();

        class DaftarAntrianLoketSatu extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            RequestHandler rh = new RequestHandler();

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(DashboardActivity.this, "Menambahkan...", "Tunggu....", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(DashboardActivity.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> params = new HashMap<>();
                params.put(Konfigurasi.KEY_NAMA, nama);
                params.put(Konfigurasi.KEY_NPM, npm);

                String result = rh.sendPostRequest(Konfigurasi.URL_ADD_LOKET_SATU,params);
                return result;
            }
        }
        DaftarAntrianLoketSatu da = new DaftarAntrianLoketSatu();
        da.execute();
    }
    @Override
    public void onClick(View view) {
    }
}
