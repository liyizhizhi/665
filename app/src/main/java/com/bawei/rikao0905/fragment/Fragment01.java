package com.bawei.rikao0905.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bawei.rikao0905.R;
import com.bawei.rikao0905.activity.HuoActivity;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/9/5<p>
 * <p>更改时间：2019/9/5<p>
 */
public class Fragment01 extends Fragment {

    private Button dian;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment01, container, false);
        dian = inflate.findViewById(R.id.dian);
        dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), HuoActivity.class));
            }
        });
        return inflate;
    }
}
