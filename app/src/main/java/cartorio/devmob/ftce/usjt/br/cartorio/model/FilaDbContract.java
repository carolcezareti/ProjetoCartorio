package cartorio.devmob.ftce.usjt.br.cartorio.model;

import android.provider.BaseColumns;

/**
 * Created by carol on 01/05/2018.
 */

public class FilaDbContract {
    public FilaDbContract(){

    }
    public static abstract class FilaBanco implements BaseColumns {
        public static final String TABLE_ATENDIMENTO = "Atendimento";
        public static final String ID_ATENDIMENTO = "id_atendimento";
        public static final String DATA_INICIO = "data_inicio";
        public static final String DATA_TERMINO = "data_termino";
        public static final String PREVISAO_INICIO = "previsao_inicio";
        public static final String PREVISAO_TERMINO = "previsao_termino";
        public static final String STATUS = "status";
        public static final String ID_SENHA = "id_senha";
        public static final String ID_SUBSERVICO = "id_subservico";

        public static final String TABLE_SENHA = "Senha";
        public static final String ID = "id";
        public static final String CODIGO = "codigo";
        public static final String DATA_ABERTURA = "data_abertura";
        public static final String DATA_FECHAMENTO = "data_fechamento";
        public static final String NUMERO = "numero";
        public static final String ID_FILA = "id_fila";

    }
}
