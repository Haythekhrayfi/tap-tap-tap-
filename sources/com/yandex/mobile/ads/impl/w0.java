package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements l0, uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f26117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f26118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.u f26119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mx f26120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jw f26121f;

    public w0(Context context, RelativeLayout relativeLayout, Window window, com.yandex.mobile.ads.nativeads.u uVar, AdResponse adResponse, a1 a1Var, q0 q0Var, int i10) {
        this.f26116a = context;
        this.f26118c = window;
        this.f26117b = a1Var;
        this.f26119d = uVar;
        this.f26120e = new tx(context, adResponse, relativeLayout, this, q0Var, i10, a1Var, 0).a(context, uVar, this);
        this.f26121f = new jw(context);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void a() {
        ((a1) this.f26117b).a(2, null);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void b() {
        ((a1) this.f26117b).a(3, null);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void c() {
        this.f26120e.c();
        ((a1) this.f26117b).a(0, null);
        ((a1) this.f26117b).a(5, null);
        x60.d("Fullscreen Native Ad is being displayed", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void d() {
        this.f26120e.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.uk
    public final void e() {
        ((a1) this.f26117b).a();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final boolean f() {
        return this.f26121f.a();
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void g() {
        ((a1) this.f26117b).a(this.f26116a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f26118c.requestFeature(1);
        this.f26118c.addFlags(1024);
        this.f26118c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (u6.a(28)) {
            this.f26118c.setBackgroundDrawableResource(R.color.transparent);
            this.f26118c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.l0
    public final void onAdClosed() {
        this.f26119d.destroy();
        ((a1) this.f26117b).a(4, null);
    }
}
