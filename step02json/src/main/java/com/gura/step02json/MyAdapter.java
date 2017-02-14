package com.gura.step02json;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 2017-02-14.
 */

public class MyAdapter extends BaseAdapter {

    // 필요한 맴버필드 정의하기
    private Context context;
    private int layoutRes;   // 리소스 아이디
    private List<MyDto> list;
    // 레이아웃 전개자 객체
    LayoutInflater inflater;

    // 생성자
    public MyAdapter(Context context, int layoutRes, List<MyDto> list) {
        this.context = context;
        this.layoutRes = layoutRes;
        this.list = list;

        // 레이아웃 전개자 객체를 맴버필드에 저장한다.
        inflater = LayoutInflater.from(context);
    }

    // 모델의 갯수를 리턴해준다.
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            // 레이아웃 전개자 객체를 이용해서 layoutRes 에 해당하는
            // View 객체를 만든다.
            // 필요한 최소한의 뷰 개수 만큼 다시 들어온다.
            convertView = inflater.inflate(layoutRes, parent, false);
        }

        TextView num = (TextView)
                convertView.findViewById(R.id.num);

        TextView name = (TextView)
                convertView.findViewById(R.id.name);

        TextView addr = (TextView)
                convertView.findViewById(R.id.addr);

        MyDto dto = list.get(position);

        num.setText(Integer.toString(dto.getNum()));
        name.setText(dto.getName());
        addr.setText(dto.getAddr());

        return convertView;
    }
}
