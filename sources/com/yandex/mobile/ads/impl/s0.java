package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements l0, uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout f24906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse<String> f24907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f24908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v0 f24909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dl1 f24910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bp0 f24911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jw f24912g;

    public s0(Context context, RelativeLayout relativeLayout, a1 a1Var, Window window, sw swVar) {
        this.f24906a = relativeLayout;
        this.f24908c = window;
        this.f24909d = a1Var;
        AdResponse<String> adResponseA = swVar.a();
        this.f24907b = adResponseA;
        dl1 dl1VarB = swVar.b();
        this.f24910e = dl1VarB;
        dl1VarB.a(this);
        this.f24911f = new bp0(context, adResponseA, a1Var);
        this.f24912g = new jw(context);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void a() {
        ((a1) this.f24909d).a(2, null);
        this.f24910e.h();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void b() {
        ((a1) this.f24909d).a(3, null);
        this.f24910e.f();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void c() {
        this.f24910e.a(this.f24906a);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_tracking_parameters", (Serializable) this.f24910e.e().a());
        ((a1) this.f24909d).a(0, bundle);
        ((a1) this.f24909d).a(5, null);
        x60.d("Fullscreen Ad is being displayed", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void d() {
        this.f24910e.d();
    }

    @Override // com.yandex.mobile.ads.impl.uk
    public final void e() {
        ((a1) this.f24909d).a();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final boolean f() {
        if (this.f24912g.a()) {
            if (!(this.f24910e.e().b() && this.f24907b.J())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void g() {
        this.f24908c.requestFeature(1);
        this.f24908c.addFlags(1024);
        this.f24908c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (u6.a(28)) {
            this.f24908c.setBackgroundDrawableResource(R.color.black);
            this.f24908c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.f24911f.a();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void onAdClosed() {
        ((a1) this.f24909d).a(4, null);
    }
}
