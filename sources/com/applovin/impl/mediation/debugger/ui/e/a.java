package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.mediation.MaxDebuggerTcfVendorDetailListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f9755b;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a, reason: collision with other inner class name */
    public enum EnumC0136a {
        TC_DATA,
        VENDORS
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.mediation.debugger.ui.d.c> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(c());
        arrayList.add(d());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.applovin.impl.mediation.debugger.ui.d.c> b() {
        List<com.applovin.impl.b.b.c> listE = this.f9754a.ab().e();
        ArrayList arrayList = new ArrayList(listE.size());
        Iterator<com.applovin.impl.b.b.c> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL).a(it.next().b()).a(true).a(this).a());
        }
        return arrayList;
    }

    private com.applovin.impl.mediation.debugger.ui.d.c c() {
        String strD = this.f9754a.ab().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zA = com.applovin.impl.b.b.b.a(strD);
        if (zIsValidString && strD.length() > 35) {
            strD = strD.substring(0, 35) + "...";
        }
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL).a("IABTCF_TCString");
        if (!zIsValidString) {
            strD = "No value set";
        }
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA2 = aVarA.b(strD).b(zA ? -16777216 : -65536).a(zIsValidString);
        if (zIsValidString) {
            aVarA2.a(this);
        }
        return aVarA2.a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c d() {
        Integer numC = this.f9754a.ab().c();
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("IABTCF_gdprApplies").b(numC != null ? numC.toString() : "No value set").b(numC != null ? -16777216 : -65536).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9754a;
    }

    public void initialize(final o oVar) {
        this.f9754a = oVar;
        final List<com.applovin.impl.b.b.c> listE = oVar.ab().e();
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                if (i10 == EnumC0136a.TC_DATA.ordinal()) {
                    return 2;
                }
                return listE.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return i10 == EnumC0136a.TC_DATA.ordinal() ? new e("TC DATA") : new e("VENDORS (GOOGLE SUPPORT ONLY)");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return i10 == EnumC0136a.TC_DATA.ordinal() ? a.this.a() : a.this.b();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return EnumC0136a.values().length;
            }
        };
        this.f9755b = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void onClick(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (aVar.a() == EnumC0136a.TC_DATA.ordinal()) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTcfStringActivity.class, oVar.E(), new com.applovin.impl.sdk.utils.b.a<MaxDebuggerTcfStringActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2.1
                        @Override // com.applovin.impl.sdk.utils.b.a
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onActivityCreated(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                            maxDebuggerTcfStringActivity.initialize(oVar);
                        }
                    });
                } else {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTcfVendorDetailListActivity.class, oVar.E(), new com.applovin.impl.sdk.utils.b.a<MaxDebuggerTcfVendorDetailListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2.2
                        @Override // com.applovin.impl.sdk.utils.b.a
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onActivityCreated(MaxDebuggerTcfVendorDetailListActivity maxDebuggerTcfVendorDetailListActivity) {
                            maxDebuggerTcfVendorDetailListActivity.initialize((com.applovin.impl.b.b.c) listE.get(aVar.b()), oVar);
                        }
                    });
                }
            }
        });
        this.f9755b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9755b);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d dVar = this.f9755b;
        if (dVar != null) {
            dVar.a((d.a) null);
        }
    }
}
