package rm76349.fiap.com.br.bancoonline;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private AplicacaoFragment aplicacaoFrag;
    private ContaCorrenteFragment ccFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aplicacaoFrag = new AplicacaoFragment();
        ccFrag = new ContaCorrenteFragment();

        ListView lstMenu= (ListView)findViewById(R.id.lstMenu);
        lstMenu.setOnItemClickListener(this);
    }

    void mostrarAplicacao(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frgPrincipal,aplicacaoFrag);
        t.commit();
    }

    void mostrarContaCorrente(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frgPrincipal,ccFrag);
        t.commit();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:{
                mostrarContaCorrente();
                break;
            }
            case 1:{
                mostrarAplicacao();
                break;
            }
            default:{
                finish();
            }
        }
    }
}
