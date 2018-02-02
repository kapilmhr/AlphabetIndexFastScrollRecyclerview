package fastscroll.app.alphabetindex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fastscroll.app.fastscrollalphabetindex.AlphabetIndexFastScrollRecyclerView;

public class MainActivity extends AppCompatActivity {
    AlphabetIndexFastScrollRecyclerView recyclerView;
    List<Data> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dataList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        initData();
        Collections.sort(dataList,Data.titleNameComparator);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);
        recyclerView.setIndexTextSize(12);
        recyclerView.setIndexBarTextColor("#000000");
        recyclerView.setIndexBarColor("#cdced2");
        recyclerView.setIndexbarHighLateTextColor("#FF4081");
        recyclerView.setIndexBarHighLateTextVisibility(true);
        recyclerView.setIndexBarTransparentValue((float) 1.0);





    }

    private void initData() {
        dataList.add(new Data("Apple"));
        dataList.add(new Data("Ant"));
        dataList.add(new Data("Bpple"));
        dataList.add(new Data("BDnt"));
        dataList.add(new Data("Cpple"));
        dataList.add(new Data("Cnt"));
        dataList.add(new Data("Dpple"));
        dataList.add(new Data("DDnt"));
        dataList.add(new Data("Epple"));
        dataList.add(new Data("Ent"));
        dataList.add(new Data("Fpple"));
        dataList.add(new Data("FDnt"));
        dataList.add(new Data("Gpple"));
        dataList.add(new Data("Gnt"));
        dataList.add(new Data("Hpple"));
        dataList.add(new Data("HDnt"));
        dataList.add(new Data("Ipple"));
        dataList.add(new Data("int"));
        dataList.add(new Data("Jpple"));
        dataList.add(new Data("JDnt"));
        dataList.add(new Data("Kpple"));
        dataList.add(new Data("Knt"));
        dataList.add(new Data("Lpple"));
        dataList.add(new Data("LDnt"));
        dataList.add(new Data("Mpple"));
        dataList.add(new Data("Mnt"));
        dataList.add(new Data("Npple"));
        dataList.add(new Data("NDnt"));
        dataList.add(new Data("Opple"));
        dataList.add(new Data("Ont"));
        dataList.add(new Data("Ppple"));
        dataList.add(new Data("PDnt"));
        dataList.add(new Data("Qpple"));
        dataList.add(new Data("Qnt"));
        dataList.add(new Data("Rpple"));
        dataList.add(new Data("RDnt"));
        dataList.add(new Data("Spple"));
        dataList.add(new Data("Snt"));
        dataList.add(new Data("Tpple"));
        dataList.add(new Data("TDnt"));
        dataList.add(new Data("Upple"));
        dataList.add(new Data("Unt"));
        dataList.add(new Data("Vpple"));
        dataList.add(new Data("VDnt"));
        dataList.add(new Data("Wpple"));
        dataList.add(new Data("Wnt"));
        dataList.add(new Data("Xpple"));
        dataList.add(new Data("XDnt"));
        dataList.add(new Data("Ypple"));
        dataList.add(new Data("Ynt"));
        dataList.add(new Data("Zpple"));
        dataList.add(new Data("ZDnt"));
        dataList.add(new Data("kpple"));
        dataList.add(new Data("ant"));
        dataList.add(new Data("ppple"));
        dataList.add(new Data("iDnt"));
        dataList.add(new Data("fpple"));
        dataList.add(new Data("rnt"));
        dataList.add(new Data("apple"));
        dataList.add(new Data("nDnt"));
        dataList.add(new Data("tpple"));
        dataList.add(new Data("int"));
        dataList.add(new Data("cpple"));
        dataList.add(new Data("lDnt"));
    }

}
