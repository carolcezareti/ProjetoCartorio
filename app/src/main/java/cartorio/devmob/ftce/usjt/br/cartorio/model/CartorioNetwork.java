package cartorio.devmob.ftce.usjt.br.cartorio.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by carol on 15/04/2018.
 */

public class CartorioNetwork {
    /*public static ArrayList<Fila> _filas = null;

    public static ArrayList<Fila> getFilas(String urlRest, String urlImg) throws IOException {
        if (_filas == null) {
            _filas = buscarFilas(urlRest);

        }
        for(Fila fila: _filas){
            fila.setImagem(getFigura(urlImg));
        }
        return _filas;
    }


    public static ArrayList<Cartorio> buscarChamados(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();

        /*try {
            JSONArray lista = new JSONArray(json);
            for (int i = 0; i < lista.length(); i++) {
                JSONObject item = (JSONObject) lista.get(i);
                Cartorio cartorios = new Cartorio();
                Fila fila = new Fila();
                cartorios.setSenha(item.getString("senha"));

                String sDataInicio = (item.getString("data_Inicio"));
                try {
                    cartorios.setData_inicio((Date) formatter.parse(sDataInicio));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                JSONObject filaItem = item.getJSONObject("fila");
                Fila fila = new Fila();
                fila.setId(filaItem.getInt("id"));
                fila.setNome(filaItem.getString("nome"));
                fila.setSigla(filaItem.getString("sigla"));
                cartorios.setFila(fila);

            }
        } catch (JSONException e) {
            e.printStackTrace();
            throw new IOException(e);
        }

    }*/}