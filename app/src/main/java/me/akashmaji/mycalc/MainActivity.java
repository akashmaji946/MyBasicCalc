package me.akashmaji.mycalc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double firstValue, secondValue;
                    firstValue = Double.parseDouble(etFirstValue.getText().toString());
                    secondValue = Double.parseDouble(etSecondValue.getText().toString());
                    double ans = firstValue + secondValue;
                    tvAns.setText("The sum is:\n" + String.format("%.4f", ans));
                } catch(Exception e){
                    tvAns.setText("Input(s) error for Add!!\n");
                }

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double firstValue, secondValue;
                    firstValue = Double.parseDouble(etFirstValue.getText().toString());
                    secondValue = Double.parseDouble(etSecondValue.getText().toString());
                    double ans = firstValue - secondValue;
                    tvAns.setText("The difference is:\n" + String.format("%.4f", ans));
                }catch(Exception e){
                    tvAns.setText("Input(s) error for Subtract!!\n");
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    double firstValue, secondValue;
                    firstValue = Double.parseDouble(etFirstValue.getText().toString());
                    secondValue = Double.parseDouble(etSecondValue.getText().toString());
                    double ans = firstValue * secondValue;
                    tvAns.setText("The product is:\n" + String.format("%.4f", ans));

                }catch(Exception e){
                    tvAns.setText("Input(s) error for Multiply!!\n");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double firstValue, secondValue;
                    firstValue = Double.parseDouble(etFirstValue.getText().toString());
                    secondValue = Double.parseDouble(etSecondValue.getText().toString());
                    double ans = firstValue / secondValue;
                    tvAns.setText("The quotient is:\n" + String.format("%.4f", ans));
                }catch (Exception e){
                    tvAns.setText("Input(s) error for Divide\n");
                }

            }
        });

        Button btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Exit");
                builder.setMessage("Do you want to exit ??");

                builder.setPositiveButton("YES😊", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();
                    }
                });

                builder.setNegativeButton("NO😒", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}