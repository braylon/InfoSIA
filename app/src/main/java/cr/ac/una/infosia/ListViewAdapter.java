package cr.ac.una.infosia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juaco_000 on 5/15/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    Activity activity;
    List<Noticia> lstNoticia;
    LayoutInflater inflater;


    public  ListViewAdapter(Activity activity, List<Noticia>lstNoticia) {


        this.activity = activity;
        this.lstNoticia = lstNoticia;


    }


    @Override
    public int getCount() {return lstNoticia.size();}

    @Override
    public Object getItem(int i) {
        return lstNoticia.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {//View view



        inflater= (LayoutInflater)activity.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listview_item,null);
        TextView txtNoticias = (TextView)itemView.findViewById(R.id.textView_2);
      //  Spinner spinner = (Spinner)itemView.findViewById(R.id.spinnerr);
            //txtNoticias.setText(noti.getDescripcion());
        txtNoticias.setText(lstNoticia.get(i).getDescripcion());

        return itemView;

    }
}
