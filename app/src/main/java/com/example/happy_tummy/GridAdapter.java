package com.example.happy_tummy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] itemName;
    int[] image;
    int[] prices;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] itemName, int[] image,int[] prices) {
        this.context = context;
        this.itemName = itemName;
        this.image = image;
        this.prices=prices;
    }

    @Override
    public int getCount() {
        return itemName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView = inflater.inflate(R.layout.grid_item,null);

        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = (TextView)convertView.findViewById(R.id.item_name);
        TextView textView1 = (TextView)convertView.findViewById(R.id.item_price);

        imageView.setImageResource(image[position]);
        textView.setText(itemName[position]+"");
        textView1.setText(prices[position]+"");

        return convertView;
    }
}














//    List<String> itemName;
//    List<Integer> imageList;
//    List<Integer> priceitem;
//    Context context;
//
//    LayoutInflater inflator;
//    public GridAdapter(Context context,List<String> itemName,List<Integer> imageList,List<Integer> priceitem){
//        this.context=context;
//        this.itemName=itemName;
//        this.imageList=imageList;
//        this.priceitem=priceitem;
//        this.inflator = LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return itemName.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if(inflator==null) {
//            inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        }
//            if(convertView==null){
//                convertView=inflator.inflate(R.layout.grid_item.xml,null);
//            }
//            ImageView imageView= convertView.findViewById(R.id.itempicture);
//            TextView textView1 = convertView.findViewById(R.id.itemname);
//            TextView textView2 = convertView.findViewById(R.id.itemprice);
//
//            imageView.setImageResource(imageList.get(position));
//            textView1.setText(itemName.get(position));
//            textView2.setText(priceitem.get(position));
//
//
//
//        return convertView;
//    }

