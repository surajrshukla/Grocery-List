package com.digitalstar.suraj.grocerylist.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.digitalstar.suraj.grocerylist.R;

public class DetailsActivity extends AppCompatActivity {

    private TextView itemdet;
    private TextView qtydet;
    private TextView dateDet;
    private int groceryid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        itemdet = (TextView) findViewById(R.id.itemDet);
        qtydet = (TextView) findViewById(R.id.itemQty);
        dateDet = (TextView) findViewById(R.id.itemDate);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            itemdet.setText(bundle.getString("name"));
            qtydet.setText(bundle.getString("quantity"));
            dateDet.setText(bundle.getString("date"));
            groceryid = bundle.getInt("id");
        }
    }
}
