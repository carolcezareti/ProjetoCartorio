package cartorio.devmob.ftce.usjt.br.cartorio.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import cartorio.devmob.ftce.usjt.br.cartorio.R;

/**
 * Created by carol on 15/04/2018.
 */

public class CartorioAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Cartorio> cartorios;
    private String servico;

    public CartorioAdapter(Context context, ArrayList<Cartorio> cartorios) {
        this.context = context;
        this.cartorios = cartorios;
    }
    @Override
    public int getCount() {
        return cartorios.size();
    }

    @Override
    public Object getItem(int position) {
        return cartorios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_detalhe_senha, parent, false);


            TextView nome = (TextView) view.findViewById(R.id.nome_servico);
            TextView tipo = (TextView) view.findViewById(R.id.tipo_servico);
            TextView senha = (TextView) view.findViewById(R.id.senha);
            TextView cadastro = (TextView) view.findViewById(R.id.cadastro);
            TextView previsao_inicio = (TextView) view.findViewById(R.id.previsao_inicio);
            TextView previsaoT = (TextView) view.findViewById(R.id.previsao_termino);


            ViewHolder viewHolder = new ViewHolder();
            viewHolder.setServico(servico);
            view.setTag(viewHolder);
        }

        Cartorio cartorio = cartorios.get(position);

        ViewHolder viewHolder = (ViewHolder)view.getTag();

        viewHolder.getPrevisao_inicio().setDate(Integer.parseInt(String.format("Previsão de Início: %previsao_inicio",
                cartorio.getPrevisao_inicio(), cartorio.getPrevisao_termino())));
        viewHolder.getNome_servico().equals(viewHolder.getNome_servico());

        viewHolder.getPrevisao_termino().setDate(Integer.parseInt(String.format("Previsão de Término: %previsao_termino",
                cartorio.getPrevisao_inicio(), cartorio.getPrevisao_termino())));
        viewHolder.getNome_servico().equals(viewHolder.getNome_servico());

        return view;

    }
}
