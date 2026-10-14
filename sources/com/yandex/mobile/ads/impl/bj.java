package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bj extends p7.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aj f19273a;

    public bj(aj ajVar) {
        this.f19273a = ajVar;
    }

    private boolean a(String str) {
        Objects.requireNonNull(str);
        if (str.equals("close_dialog")) {
            this.f19273a.b();
            return true;
        }
        if (!str.equals("close_ad")) {
            return false;
        }
        this.f19273a.a();
        return true;
    }

    @Override // p7.j
    public final boolean handleAction(y9.q qVar, p7.f1 f1Var) {
        v9.b<Uri> bVar = qVar.f42101f;
        boolean zA = bVar != null ? a(bVar.b(v9.d.f36763a).toString()) : false;
        return zA ? zA : super.handleAction(qVar, f1Var);
    }
}
