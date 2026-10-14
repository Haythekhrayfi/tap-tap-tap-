package com.applovin.impl.mediation.debugger.ui.f;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.a.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f9779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f9780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListView f9783g;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.f.a$a, reason: collision with other inner class name */
    public enum EnumC0137a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return (aVar.a() == EnumC0137a.BIDDERS.ordinal() ? this.f9778b : this.f9779c).get(aVar.b());
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final c cVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(cVar.c(), this) { // from class: com.applovin.impl.mediation.debugger.ui.f.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (a.this.f9777a.as().c() == null || !a.this.f9777a.as().c().equals(cVar.a())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (a.this.f9777a.as().c() == null || !a.this.f9777a.as().c().equals(cVar.a())) {
                        return super.b();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    return StringUtils.createSpannedString(cVar.b(), c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9777a;
    }

    public void initialize(List<c> list, List<c> list2, final o oVar) {
        this.f9777a = oVar;
        this.f9778b = list;
        this.f9779c = list2;
        this.f9781e = a(list);
        this.f9782f = a(list2);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.f.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return (i10 == EnumC0137a.BIDDERS.ordinal() ? a.this.f9781e : a.this.f9782f).size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return i10 == EnumC0137a.BIDDERS.ordinal() ? new e("BIDDERS") : new e("WATERFALL");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return i10 == EnumC0137a.BIDDERS.ordinal() ? a.this.f9781e : a.this.f9782f;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return EnumC0137a.COUNT.ordinal();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c n() {
                return new com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f9780d = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.f.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                c cVarA = a.this.a(aVar);
                if (StringUtils.isValidString(cVarA.a()) && StringUtils.isValidString(oVar.as().c()) && cVarA.a().equals(oVar.as().c())) {
                    oVar.as().a((String) null);
                } else {
                    oVar.as().a(cVarA.a());
                }
                a.this.f9780d.notifyDataSetChanged();
            }
        });
        this.f9780d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9783g = listView;
        listView.setAdapter((ListAdapter) this.f9780d);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f9781e = a(this.f9778b);
        this.f9782f = a(this.f9779c);
        this.f9780d.m();
    }
}
