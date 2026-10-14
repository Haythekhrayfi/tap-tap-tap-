package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b extends com.applovin.impl.mediation.debugger.ui.d.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.a f9559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.b f9560b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.e f9561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f9563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f9564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f9565h;

    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b, reason: collision with other inner class name */
    public class C0131b extends com.applovin.impl.mediation.debugger.ui.b.a.a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final com.applovin.impl.mediation.debugger.b.a.e f9572o;

        public C0131b(com.applovin.impl.mediation.debugger.b.a.e eVar, String str, boolean z10) {
            super(eVar.a().c(), b.this.f9751c);
            this.f9572o = eVar;
            this.f9717d = StringUtils.createSpannedString(eVar.a().b(), -16777216, 18, 1);
            this.f9718e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f9716c = z10;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean c() {
            return this.f9716c;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int e() {
            return -12303292;
        }

        public com.applovin.impl.mediation.debugger.b.a.e i_() {
            return this.f9572o;
        }
    }

    public b(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, com.applovin.impl.mediation.debugger.b.a.e eVar, Context context) {
        super(context);
        this.f9559a = aVar;
        this.f9561d = eVar;
        this.f9560b = bVar != null ? bVar : aVar.e();
        this.f9562e = bVar != null ? bVar.a() : aVar.b();
        this.f9563f = c();
        this.f9564g = d();
        this.f9565h = f();
        notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(h());
        if (this.f9560b.b() != null) {
            arrayList.add(i());
        }
        if (this.f9561d != null) {
            arrayList.add(j());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        com.applovin.impl.mediation.debugger.b.a.e eVar = this.f9561d;
        if (eVar != null && !eVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.e> listD = this.f9560b.d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (com.applovin.impl.mediation.debugger.b.a.e eVar2 : listD) {
            com.applovin.impl.mediation.debugger.b.a.e eVar3 = this.f9561d;
            if (eVar3 == null || eVar3.a().a().equals(eVar2.a().a())) {
                arrayList.add(new C0131b(eVar2, eVar2.b() != null ? eVar2.b().a() : "", this.f9561d == null));
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> f() {
        com.applovin.impl.mediation.debugger.b.a.e eVar = this.f9561d;
        if (eVar != null && eVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.e> listE = this.f9560b.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (com.applovin.impl.mediation.debugger.b.a.e eVar2 : listE) {
            com.applovin.impl.mediation.debugger.b.a.e eVar3 = this.f9561d;
            if (eVar3 == null || eVar3.a().a().equals(eVar2.a().a())) {
                arrayList.add(new C0131b(eVar2, null, this.f9561d == null));
                for (com.applovin.impl.mediation.debugger.b.a.d dVar : eVar2.d()) {
                    arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a(dVar.a()).b(dVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    private com.applovin.impl.mediation.debugger.ui.d.c g() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("ID").b(this.f9559a.a()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c h() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Format").b(this.f9559a.c()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c i() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("AB Test Experiment Name").b(b().b()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c j() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.f9561d.a().b()).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        List<com.applovin.impl.mediation.debugger.ui.d.c> list;
        if (i10 == a.INFO.ordinal()) {
            list = this.f9563f;
        } else {
            list = i10 == a.BIDDERS.ordinal() ? this.f9564g : this.f9565h;
        }
        return list.size();
    }

    public String a() {
        return this.f9562e;
    }

    public com.applovin.impl.mediation.debugger.b.a.b b() {
        return this.f9560b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("INFO");
        }
        return i10 == a.BIDDERS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("BIDDERS") : new com.applovin.impl.mediation.debugger.ui.d.e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f9563f;
        }
        return i10 == a.BIDDERS.ordinal() ? this.f9564g : this.f9565h;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return a.COUNT.ordinal();
    }
}
