package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.developer.filepicker.model.DialogConfigs;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d8 f24897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xr f24898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wz0 f24899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sz0 f24900e = sz0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vw0 f24901f = vw0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uz0 f24902g = new uz0();

    public interface a {
        void a();

        void a(bi1 bi1Var);
    }

    public rz0(Context context, d8 d8Var, xr xrVar) {
        this.f24896a = context.getApplicationContext();
        this.f24897b = d8Var;
        this.f24898c = xrVar;
        this.f24899d = new wz0(context);
    }

    public final void a() {
        vw0 vw0Var = this.f24901f;
        Context context = this.f24896a;
        Objects.requireNonNull(vw0Var);
        vw0.a(context, this);
    }

    public final void a(w01 w01Var, a aVar) {
        String strA;
        if (!this.f24899d.a()) {
            aVar.a();
            return;
        }
        xz0 xz0Var = new xz0(this.f24896a, this.f24900e, aVar);
        wr wrVarA = this.f24898c.a();
        Context context = this.f24896a;
        String strA2 = wrVarA.a();
        if (TextUtils.isEmpty(strA2)) {
            strA = null;
        } else {
            strA = w0.a.a(new StringBuilder(strA2), strA2.endsWith(DialogConfigs.DIRECTORY_SEPERATOR) ? "" : DialogConfigs.DIRECTORY_SEPERATOR, "v1/startup", CallerData.NA, this.f24902g.a(context, w01Var, this.f24897b, wrVarA));
        }
        if (TextUtils.isEmpty(strA)) {
            xz0Var.a((bi1) new p2(null, 11));
            return;
        }
        vz0 vz0Var = new vz0(this.f24896a, strA, this.f24899d, wrVarA.c(), xz0Var);
        vz0Var.b(this);
        vw0 vw0Var = this.f24901f;
        Context context2 = this.f24896a;
        synchronized (vw0Var) {
            gn0.a(context2).a(vz0Var);
        }
    }
}
