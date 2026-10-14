package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class em1 extends w5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f20283k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5 f20284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x5 f20285b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private im1 f20287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b6 f20288e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20293j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f20286c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20289f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20290g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20291h = UUID.randomUUID().toString();

    public em1(x5 x5Var, y5 y5Var) {
        b6 jm1Var;
        this.f20285b = x5Var;
        this.f20284a = y5Var;
        b(null);
        if (y5Var.a() == z5.f27218b || y5Var.a() == z5.f27220d) {
            jm1Var = new jm1(y5Var.h());
        } else {
            jm1Var = new nm1(y5Var.e(), y5Var.d());
        }
        this.f20288e = jm1Var;
        this.f20288e.a();
        fm1.a().a(this);
        this.f20288e.a(x5Var);
    }

    private void b(View view) {
        this.f20287d = new im1(view);
    }

    @Override // com.yandex.mobile.ads.impl.w5
    public final void a() {
        if (this.f20290g) {
            return;
        }
        this.f20287d.clear();
        if (!this.f20290g) {
            this.f20286c.clear();
        }
        this.f20290g = true;
        hn1.a(this.f20288e.e());
        fm1.a().c(this);
        this.f20288e.b();
        this.f20288e = null;
    }

    @Override // com.yandex.mobile.ads.impl.w5
    public final void a(View view) {
        if (this.f20290g || e() == view) {
            return;
        }
        b(view);
        this.f20288e.f();
        Collection<em1> collectionB = fm1.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (em1 em1Var : collectionB) {
            if (em1Var != this && em1Var.e() == view) {
                em1Var.f20287d.clear();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.w5
    public final void a(View view, gw gwVar, String str) {
        wm1 wm1Var;
        if (this.f20290g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f20283k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f20286c.iterator();
        do {
            if (!it.hasNext()) {
                wm1Var = null;
                break;
            }
            wm1Var = (wm1) it.next();
        } while (wm1Var.a().get() != view);
        if (wm1Var == null) {
            this.f20286c.add(new wm1(view, gwVar, str));
        }
    }

    public final void a(JSONObject jSONObject) {
        if (this.f20293j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        hn1.b(this.f20288e.e(), jSONObject);
        this.f20293j = true;
    }

    @Override // com.yandex.mobile.ads.impl.w5
    public final void b() {
        if (this.f20289f) {
            return;
        }
        this.f20289f = true;
        fm1.a().b(this);
        hn1.a(this.f20288e.e(), nn1.a().d());
        this.f20288e.a(this, this.f20284a);
    }

    public final ArrayList c() {
        return this.f20286c;
    }

    public final void d() {
        if (this.f20292i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        hn1.b(this.f20288e.e());
        this.f20292i = true;
    }

    public final View e() {
        return this.f20287d.get();
    }

    public final boolean f() {
        return this.f20289f && !this.f20290g;
    }

    public final boolean g() {
        return this.f20289f;
    }

    public final String h() {
        return this.f20291h;
    }

    public final b6 i() {
        return this.f20288e;
    }

    public final boolean j() {
        return this.f20290g;
    }

    public final boolean k() {
        return this.f20285b.b();
    }

    public final boolean l() {
        return this.f20285b.c();
    }
}
