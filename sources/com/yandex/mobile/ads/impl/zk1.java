package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xy0 f27355a;

    public /* synthetic */ zk1() {
        this(wy0.a());
    }

    public zk1(xy0 xy0Var) {
        fd.j0.i(xy0Var, "sslSocketFactoryCreator");
        this.f27355a = xy0Var;
    }

    public final al1 a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String strA = r8.a().a(context);
        SSLSocketFactory sSLSocketFactoryA = this.f27355a.a(context);
        nz0 nz0VarA = i01.b().a(context);
        return new al1(strA, sSLSocketFactoryA, nz0VarA != null && nz0VarA.Z());
    }
}
