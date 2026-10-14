package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q71 extends jz implements w20.a, b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f24333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AdResponse<?> f24334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mn0 f24335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y6 f24336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v20 f24337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w20 f24338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a0 f24339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mv0 f24340l;

    public class a implements s71 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.s71
        public final la1 a(int i10) {
            la1.a aVar;
            if (q71.b(q71.this)) {
                aVar = la1.a.f22666l;
            } else if (q71.this.k()) {
                aVar = !q71.this.j() ? la1.a.f22663i : la1.a.f22656b;
            } else {
                aVar = la1.a.f22668n;
            }
            return new la1(aVar, new u4());
        }

        @Override // com.yandex.mobile.ads.impl.s71
        public final la1 b(int i10) {
            la1.a aVar;
            if (q71.this.d()) {
                aVar = la1.a.f22657c;
            } else if (q71.b(q71.this)) {
                aVar = la1.a.f22666l;
            } else if (q71.this.k()) {
                aVar = (q71.this.a(i10) && q71.this.j()) ? la1.a.f22656b : la1.a.f22663i;
            } else {
                aVar = la1.a.f22668n;
            }
            return new la1(aVar, new u4());
        }
    }

    public q71(Context context, y6 y6Var, AdResponse<String> adResponse, k2 k2Var) {
        super(context, adResponse);
        a aVar = new a();
        this.f24333e = context;
        this.f24334f = adResponse;
        this.f24336h = y6Var;
        m3 m3Var = new m3(new kz(adResponse));
        z20 z20Var = new z20(context, k2Var);
        v20 v20Var = new v20();
        this.f24337i = v20Var;
        this.f24338j = x20.a(context, this, z20Var, m3Var, v20Var);
        mn0 mn0VarA = nn0.a(context, k2Var, z20Var, aVar, t6.a(this));
        this.f24335g = mn0VarA;
        mn0VarA.a(v20Var);
        v20Var.a(new ln0(mn0VarA));
        this.f24339k = new a0(context, k2Var, this);
        this.f24340l = new mv0(context, new t4(context, y6Var, new oz()), adResponse, k2Var, m3Var, v20Var, null, adResponse.j());
    }

    public static boolean b(q71 q71Var) {
        return !q71Var.f24336h.b();
    }

    @Override // com.yandex.mobile.ads.impl.kq0.a
    public final void a(Intent intent) {
        StringBuilder sbA = v60.a("onPhoneStateChanged(), intent.getAction = ");
        sbA.append(intent.getAction());
        sbA.append(", isAdVisible = ");
        sbA.append(this.f24336h.b());
        x60.d(sbA.toString(), new Object[0]);
        this.f24335g.a(intent, this.f24336h.b());
    }

    public final void a(Map<String, String> map) {
        x60.d("startHtmlAdTracking(), clazz = " + this, new Object[0]);
        ArrayList arrayListA = t6.a(this.f24334f, map);
        this.f24338j.a(arrayListA, this.f24334f.z());
        this.f24335g.a(this.f24334f, arrayListA);
        this.f24339k.a(this.f24334f.y());
        l();
    }

    public abstract boolean a(int i10);

    public final void b(int i10) {
        x60.d(u60.a("onVisibilityChanged(), visibility = ", i10), new Object[0]);
        nz0 nz0VarA = i01.b().a(this.f24333e);
        if (!(nz0VarA != null && nz0VarA.L()) ? this.f24336h.b() : i10 == 0) {
            this.f24335g.a();
        } else {
            this.f24335g.b();
        }
        x60.d("View's ground is changed for controller <%s>, mode: %d", getClass().toString(), Integer.valueOf(i10));
    }

    @Override // com.yandex.mobile.ads.impl.jz
    public final void g() {
        x60.d("cleanOut(), clazz = " + this, new Object[0]);
        super.g();
        this.f24335g.a();
        this.f24340l.c();
    }

    public final v20 i() {
        return this.f24337i;
    }

    public abstract boolean j();

    public abstract boolean k();

    public final synchronized void l() {
        x60.d("trackAdOnDisplayed(), clazz = " + this, new Object[0]);
        this.f24335g.b();
        this.f24340l.b();
    }

    public void onReceiveResult(int i10, Bundle bundle) {
        x60.d(u60.a("onReceiveResult(), resultCode = ", i10), new Object[0]);
        if (i10 == 14) {
            this.f24337i.d();
        }
        if (i10 == 15) {
            this.f24337i.b();
            return;
        }
        switch (i10) {
            case 6:
                onLeftApplication();
                this.f24339k.f();
                break;
            case 7:
                onLeftApplication();
                this.f24339k.d();
                break;
            case 8:
                this.f24339k.e();
                break;
            case 9:
                x60.d("onAdOpenUrl()", new Object[0]);
                this.f24339k.a();
                this.f24337i.a();
                break;
        }
    }
}
