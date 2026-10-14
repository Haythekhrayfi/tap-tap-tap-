package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f9831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f9832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f9834e;

    public b() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (b.this.f9830a.as().c() == null || !b.this.f9830a.as().c().equals(bVar.h())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (b.this.f9830a.as().c() == null || !b.this.f9830a.as().c().equals(bVar.h())) {
                        return super.b();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    return StringUtils.createSpannedString(bVar.i(), c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9830a;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.c.b> list, final o oVar) {
        this.f9830a = oVar;
        this.f9831b = list;
        this.f9833d = a(list);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new e("TEST MODE NETWORKS");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return b.this.f9833d;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c n() {
                return new com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.SECTION_CENTERED).a("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f9832c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                String strH = ((com.applovin.impl.mediation.debugger.b.c.b) list.get(aVar.b())).h();
                String strC = oVar.as().c();
                if (StringUtils.isValidString(strH) && StringUtils.isValidString(strC) && strH.equals(strC)) {
                    oVar.as().a((String) null);
                } else {
                    oVar.as().a(strH);
                }
                b.this.f9832c.notifyDataSetChanged();
            }
        });
        this.f9832c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9834e = listView;
        listView.setAdapter((ListAdapter) this.f9832c);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f9833d = a(this.f9831b);
        this.f9832c.notifyDataSetChanged();
    }
}
