package com.applovin.impl.mediation.debugger.ui.a;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f9595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f9596c;

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL).a(it.next().replace("1:", "+").replace("0:", "-")).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9595b;
    }

    public void initialize(String str, List<String> list, o oVar) {
        this.f9594a = str;
        this.f9595b = oVar;
        final List<com.applovin.impl.mediation.debugger.ui.d.c> listA = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.f.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return listA.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new com.applovin.impl.mediation.debugger.ui.d.e("KEYWORDS");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return listA;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return 1;
            }
        };
        this.f9596c = dVar;
        dVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f9594a);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f9596c);
        listView.setDividerHeight(0);
    }
}
