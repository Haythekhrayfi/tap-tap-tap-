package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.al0;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.d11;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.impl.ev0;
import com.yandex.mobile.ads.impl.f2;
import com.yandex.mobile.ads.impl.f30;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.g20;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.jm0;
import com.yandex.mobile.ads.impl.jt;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.kj0;
import com.yandex.mobile.ads.impl.kq0;
import com.yandex.mobile.ads.impl.l6;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.impl.lk0;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.ln0;
import com.yandex.mobile.ads.impl.m3;
import com.yandex.mobile.ads.impl.mb;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.mn0;
import com.yandex.mobile.ads.impl.mv0;
import com.yandex.mobile.ads.impl.nn0;
import com.yandex.mobile.ads.impl.nv0;
import com.yandex.mobile.ads.impl.of;
import com.yandex.mobile.ads.impl.ov0;
import com.yandex.mobile.ads.impl.p3;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.qk0;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.sh0;
import com.yandex.mobile.ads.impl.t4;
import com.yandex.mobile.ads.impl.t6;
import com.yandex.mobile.ads.impl.v20;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.vi0;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.impl.wh0;
import com.yandex.mobile.ads.impl.x20;
import com.yandex.mobile.ads.impl.x60;
import com.yandex.mobile.ads.impl.xa;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.impl.yp;
import com.yandex.mobile.ads.impl.z20;
import com.yandex.mobile.ads.impl.z71;
import com.yandex.mobile.ads.impl.zj0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {
    private final kq0.a A = new a();
    private final mb B;
    private final ev0 C;
    private w D;
    private final xa E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jm0 f27765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final al0 f27766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lm0 f27767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mn0 f27768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z71 f27769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f27770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final pi0 f27771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.b f27772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f2 f27773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k2 f27774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdResponse f27775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r0 f27776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final jt f27777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final df f27778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ht f27779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final sh0 f27780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v20 f27781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z20 f27782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final db f27783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final nv0 f27784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final lk0 f27785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.yandex.mobile.ads.nativeads.video.a f27786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zj0 f27787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<yp> f27788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final d11 f27789z;

    public class a implements kq0.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.kq0.a
        public final void a(Intent intent) {
            boolean z10 = !((v) l0.this.f27766c).a();
            StringBuilder sbA = v60.a("onPhoneStateChanged(), intent.getAction = ");
            sbA.append(intent.getAction());
            sbA.append(", isNativeAdViewShown = ");
            sbA.append(z10);
            sbA.append(", clazz = ");
            sbA.append(a.class);
            x60.d(sbA.toString(), new Object[0]);
            l0.this.f27768e.a(intent, z10);
        }
    }

    public class b implements s71 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.s71
        public final la1 a(int i10) {
            return ((v) l0.this.f27766c).b(l0.this.f27764a, i10);
        }

        @Override // com.yandex.mobile.ads.impl.s71
        public final la1 b(int i10) {
            return ((v) l0.this.f27766c).a(l0.this.f27764a, i10);
        }
    }

    public l0(Context context, com.yandex.mobile.ads.nativeads.a aVar) {
        b bVar = new b();
        this.f27764a = context;
        this.f27765b = aVar.g();
        al0 al0VarF = aVar.f();
        this.f27766c = al0VarF;
        lm0 lm0VarH = aVar.h();
        this.f27767d = lm0VarH;
        zj0 zj0Var = new zj0();
        this.f27787x = zj0Var;
        this.f27786w = new com.yandex.mobile.ads.nativeads.video.a(zj0Var);
        wh0 wh0VarD = aVar.d();
        k2 k2VarA = wh0VarD.a();
        this.f27774k = k2VarA;
        AdResponse adResponseB = wh0VarD.b();
        this.f27775l = adResponseB;
        l6 l6VarB = k2VarA.b();
        String strA = lm0VarH.a();
        pi0 pi0VarE = aVar.e();
        this.f27771h = pi0VarE;
        k kVarA = pi0VarE.b().a(context, k2VarA);
        this.f27770g = kVarA;
        m3 m3Var = new m3(new vi0(lm0VarH.a()));
        z20 z20Var = new z20(context, k2VarA);
        this.f27782s = z20Var;
        v20 v20Var = new v20();
        this.f27781r = v20Var;
        w20 w20VarA = x20.a(context, kVarA, z20Var, m3Var, v20Var);
        List<g11> listE = lm0VarH.e();
        w20VarA.a(listE, lm0VarH.c());
        r0 r0Var = new r0();
        this.f27776m = r0Var;
        f2 f2Var = new f2(context, adResponseB, k2VarA, kVarA, r0Var);
        this.f27773j = f2Var;
        xj0 xj0VarB = aVar.b();
        mn0 mn0VarA = nn0.a(context, k2VarA, z20Var, bVar, t6.a(this));
        this.f27768e = mn0VarA;
        xj0VarB.a(v20Var);
        v20Var.a(new ln0(mn0VarA));
        ov0 ov0Var = new ov0();
        this.f27772i = new com.yandex.mobile.ads.nativeads.b(f2Var, ov0Var, v20Var);
        z71 z71VarA = pi0VarE.e().a(mn0VarA, new mv0(context, new t4(context, new e0(al0VarF), aVar.a()), adResponseB, k2VarA, m3Var, v20Var, ov0Var, lm0VarH.d()), new f30(al0VarF, listE), kq0.a());
        this.f27769f = z71VarA;
        z71VarA.a(v20Var);
        z71VarA.a(adResponseB, listE);
        List<qa<?>> listB = lm0VarH.b();
        db dbVar = new db(listB);
        this.f27783t = dbVar;
        this.f27784u = new nv0(listB);
        p3 p3VarA = pi0VarE.a();
        this.f27778o = new df(context, p3VarA, l6VarB, strA);
        this.f27779p = new ht(context, p3VarA, l6VarB, strA);
        this.f27780q = new sh0(context, p3VarA, l6VarB, strA);
        this.C = new ev0(context, p3VarA, l6VarB, strA);
        this.f27777n = new jt(listB);
        this.f27785v = new mk0(dbVar).a();
        cj0 cj0VarC = wh0VarD.c();
        this.f27789z = cj0VarC.g();
        this.f27788y = cj0VarC.c();
        this.B = new mb(listB);
        qh0 qh0VarC = aVar.c();
        this.E = new xa(listB, f2Var, ov0Var, v20Var, qh0VarC != null ? qh0VarC.e() : null);
    }

    public final lk0 a() {
        return this.f27785v;
    }

    public void a(Context context) {
        g();
        w wVar = this.D;
        if (wVar != null) {
            this.f27765b.a(wVar);
            this.f27769f.a(this.D);
            this.B.a(null);
        }
    }

    public final void a(View view, g20 g20Var, kj0 kj0Var, yh yhVar) throws NativeAdException {
        c cVar = c.f27721a;
        a0 a0VarA = a0.a();
        l0 l0VarA = a0VarA.a(view);
        if (equals(l0VarA)) {
            return;
        }
        Context context = view.getContext();
        if (l0VarA != null) {
            l0VarA.a(context);
        }
        if (a0VarA.a(this)) {
            a(context);
        }
        a0VarA.a(view, this);
        w<View> wVar = new w<>(view, kj0Var, this.f27774k, g20Var, this.f27781r, cVar, this.f27771h, this.f27783t, this.f27785v, this.f27787x, this.f27767d, this.f27789z);
        wVar.a();
        this.D = wVar;
        this.B.a(wVar);
        ((v) this.f27766c).a(wVar);
        this.f27765b.a(wVar);
        yhVar.a(this.E.a(cVar, wVar));
        this.f27765b.a(wVar, this.f27772i);
        this.f27780q.a(this.f27784u.a(wVar), fw0.b.G);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("renderAdView(), BIND, clazz = ");
        int i10 = t6.f25286b;
        sb2.append(toString());
        x60.d(sb2.toString(), new Object[0]);
        f();
    }

    public final <T extends View> void a(T t10, g20 g20Var, kj0<T> kj0Var, c cVar) throws NativeAdException {
        a0 a0VarA = a0.a();
        l0 l0VarA = a0VarA.a(t10);
        if (equals(l0VarA)) {
            return;
        }
        Context context = t10.getContext();
        if (l0VarA != null) {
            l0VarA.a(context);
        }
        if (a0VarA.a(this)) {
            a(context);
        }
        a0VarA.a(t10, this);
        w<?> wVar = new w<>(t10, kj0Var, this.f27774k, g20Var, this.f27781r, cVar, this.f27771h, this.f27783t, this.f27785v, this.f27787x, this.f27767d, this.f27789z);
        wVar.a();
        this.C.a();
        this.f27780q.a(of.a(wVar), fw0.b.F);
        ArrayList arrayListA = this.f27777n.a(wVar);
        if (!arrayListA.isEmpty()) {
            this.f27779p.a(arrayListA);
        }
        this.D = wVar;
        this.B.a(wVar);
        ((v) this.f27766c).a(wVar);
        m0 m0VarA = ((v) this.f27766c).f27971a.a();
        if (!m0VarA.b()) {
            String strA = m0VarA.a();
            this.f27778o.a(strA);
            throw new NativeAdException(String.format("Resource for required view %s is not present", strA));
        }
        this.f27765b.a(wVar);
        this.f27765b.a(wVar, this.f27772i);
        this.f27780q.a(this.f27784u.a(wVar), fw0.b.G);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("renderAdView(), BIND, clazz = ");
        int i10 = t6.f25286b;
        sb2.append(toString());
        x60.d(sb2.toString(), new Object[0]);
        f();
    }

    public final void a(fw0.a aVar) {
        this.f27773j.a(aVar);
        this.f27782s.a(aVar);
        this.f27770g.a(aVar);
        this.f27769f.a(new qk0(aVar, this.B));
        this.f27778o.a(aVar);
        this.f27779p.a(aVar);
        this.f27780q.a(aVar);
        this.C.a(aVar);
    }

    public final List<yp> b() {
        return this.f27788y;
    }

    public final al0 d() {
        return this.f27766c;
    }

    public final void destroy() {
        w wVar = this.D;
        if (wVar != null) {
            wVar.b();
        }
    }

    public final lm0 e() {
        return this.f27767d;
    }

    public final void f() {
        boolean z10 = !((v) this.f27766c).a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("registerTrackers(), isNativeAdViewShown = ");
        sb2.append(z10);
        sb2.append(", clazz = ");
        int i10 = t6.f25286b;
        sb2.append(toString());
        x60.d(sb2.toString(), new Object[0]);
        this.f27769f.a(this.f27764a, this.A, this.D);
    }

    public final void g() {
        StringBuilder sbA = v60.a("unregisterTrackers(), clazz = ");
        int i10 = t6.f25286b;
        sbA.append(toString());
        x60.d(sbA.toString(), new Object[0]);
        this.f27769f.a(this.f27764a, this.A);
    }

    public final void setCustomClickHandler(CustomClickHandler customClickHandler) {
        this.f27776m.a(customClickHandler);
    }

    public void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f27770g.a(nativeAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z10) {
        this.f27774k.b(z10);
    }
}
