package com.example.rindubetario.aplikasideteksidm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.DecimalFormat;

public class periksa extends AppCompatActivity {
    float hasil_deteksi;
    float tp;
    float n_pertanyaan = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periksa);

        Button button_deteksi = (Button) findViewById(R.id.button_calc);
        final CheckBox chk[] = new CheckBox[31];
        chk[0] = (CheckBox) findViewById(R.id.checkBox1);
        chk[1] = (CheckBox) findViewById(R.id.checkBox2);
        chk[2] = (CheckBox) findViewById(R.id.checkBox3);
        chk[3] = (CheckBox) findViewById(R.id.checkBox4);
        chk[4] = (CheckBox) findViewById(R.id.checkBox5);
        chk[5] = (CheckBox) findViewById(R.id.checkBox6);
        chk[6] = (CheckBox) findViewById(R.id.checkBox7);
        chk[7] = (CheckBox) findViewById(R.id.checkBox8);
        chk[8] = (CheckBox) findViewById(R.id.checkBox9);
        chk[9] = (CheckBox) findViewById(R.id.checkBox10);
        chk[10] = (CheckBox) findViewById(R.id.checkBox11);
        chk[11] = (CheckBox) findViewById(R.id.checkBox12);
        chk[12] = (CheckBox) findViewById(R.id.checkBox13);
        chk[13] = (CheckBox) findViewById(R.id.checkBox14);
        chk[14] = (CheckBox) findViewById(R.id.checkBox15);
        chk[15] = (CheckBox) findViewById(R.id.checkBox16);
        chk[16] = (CheckBox) findViewById(R.id.checkBox17);
        chk[17] = (CheckBox) findViewById(R.id.checkBox18);
        chk[18] = (CheckBox) findViewById(R.id.checkBox19);
        chk[19] = (CheckBox) findViewById(R.id.checkBox20);
        chk[20] = (CheckBox) findViewById(R.id.checkBox21);
        chk[21] = (CheckBox) findViewById(R.id.checkBox22);
        chk[22] = (CheckBox) findViewById(R.id.checkBox23);
        chk[23] = (CheckBox) findViewById(R.id.checkBox24);
        chk[24] = (CheckBox) findViewById(R.id.checkBox25);
        chk[25] = (CheckBox) findViewById(R.id.checkBox26);
        chk[26] = (CheckBox) findViewById(R.id.checkBox27);
        chk[27] = (CheckBox) findViewById(R.id.checkBox28);
        chk[28] = (CheckBox) findViewById(R.id.checkBox29);
        chk[29] = (CheckBox) findViewById(R.id.checkBox30);
        chk[30] = (CheckBox) findViewById(R.id.checkBox31);
        final DecimalFormat formatter = new DecimalFormat("#.##");
        final TextView hasiloutput = (TextView) findViewById(R.id.txtHasil);

        // Rule 34
        String G01 = "Tekanan Darah Tinggi";
        String G02 = "Konsumsi makan tetapi berad badan tidak meningkat";
        String G03 = "Penurunan berat badan secara tiba – tiba";
        String G04 = "Mengalami gangguan massa pertumbuhan";
        String G05 = "Metabolisme menuruni";
        String T01 = "Tekanan Darah Tinggi";
        String T02 = "Tekanan Darah Tinggi";
        String T03 = "Tekanan Darah Tinggi";
        String T04 = "Tekanan Darah Tinggi";
        String T05 = "Tekanan Darah Tinggi";
        String T06 = "Tekanan Darah Tinggi";
        String G06 = "Tekanan Darah Tinggi";
        String G07 = "Tekanan Darah Tinggi";
        String G08 = "Tekanan Darah Tinggi";
        String G09 = "Tekanan Darah Tinggi";
        String G10 = "Tekanan Darah Tinggi";
        String G11 = "Tekanan Darah Tinggi";
        String G12 = "Tekanan Darah Tinggi";
        String G13 = "Tekanan Darah Tinggi";
        String G14 = "Tekanan Darah Tinggi";
        String G15 = "Tekanan Darah Tinggi";
        String G16 = "Tekanan Darah Tinggi";
        String G17 = "Tekanan Darah Tinggi";
        String T07 = "Tekanan Darah Tinggi";
        String T08 = "Tekanan Darah Tinggi";
        String T09 = "Tekanan Darah Tinggi";
        String T10 = "Tekanan Darah Tinggi";
        String T11 = "Tekanan Darah Tinggi";
        String T12 = "Tekanan Darah Tinggi";
        String T13 = "Tekanan Darah Tinggi";
        String T14 = "Tekanan Darah Tinggi";

        // Gejala Lanjutan
        String p1 = "Gejala diabetes mellitus tipe 1";
        String p2 = "Tanda diabetes mellitus tipe1";
        String p3 = "Gejala diabetes mellitus tipe 2";
        String p4 = "Tanda diabetes mellitus tipe 2";

        String k01 = "Diabetes melitus";
            button_deteksi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tp = 0f;
                    for (CheckBox chek: chk) {
                        if(chek.isChecked()){
                            tp++;
                        }
                    }
                    Log.d("test", String.valueOf(tp));
                    hasil_deteksi = ((tp/n_pertanyaan)*100);
                    String output = formatter.format(hasil_deteksi) + "% \n" + defineDM(hasil_deteksi);
                    Log.d("test-output", String.valueOf(tp));
                    hasiloutput.setText(output);
                }
            });
    }

    public String defineDM(float hd){
        String temp = "";
        if(hd <= 20.0f){
            temp = "Anda tidak mengalami Diabetes Mellitus";
        } else if(hd > 20.0f && hd <= 80.0f){
            temp = "Anda mengalami Pre-Diabetes Mellitus";
        } else if (hd > 80.0) {
            temp = "Anda mengalami Positive Diabetes Mellitus, maka periksalah kedokter";
        } else {
            temp = "error";
        }
        return temp;

    }
}
