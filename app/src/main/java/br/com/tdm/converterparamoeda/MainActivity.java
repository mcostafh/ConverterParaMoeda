package br.com.tdm.converterparamoeda;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button calcular;

    EditText edt_cotacao;
    EditText edt_qtde;
    TextView view_reais;


    private Double cotacao;
    private Double valorMoeda;
    private Double reais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = (Button) findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt_cotacao = (EditText) findViewById(R.id.edt_cotacao);
                edt_qtde =  (EditText) findViewById(R.id.edt_qtde);
                view_reais = (TextView) findViewById(R.id.txfld_moedareais);


                cotacao = Double.parseDouble( edt_cotacao.getText());
                valorMoeda = Double.parseDouble(edt_qtde.getText());

                reais  = valorMoeda / cotacao;

                view_reais.setText(reais.toString());


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
