package rm76349.fiap.com.br.bancoonline;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AplicacaoFragment extends Fragment implements Button.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_aplicacao, container, false);
        Button btnAplicar = (Button)v.findViewById(R.id.btnAplicar);
        btnAplicar.setOnClickListener(this);

        Button btnResgatar = (Button)v.findViewById(R.id.btnResgatar);
        btnResgatar.setOnClickListener(this);
        return inflater.inflate(R.layout.fragment_aplicacao, container, false);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnAplicar){
            Log.i("EVENTO", "Botão APLICAR acionado");
        }else if(v.getId()==R.id.btnResgatar){
            Log.i("EVENTO", "Botão RESGATAR acionado");
        }
    }
}
