package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uw implements b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<String> f25751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rz f25752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f25753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zk f25754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b81 f25755e;

    public uw(Context context, k2 k2Var, AdResponse<String> adResponse, AdResultReceiver adResultReceiver) {
        this.f25751a = adResponse;
        boolean zR = k2Var.r();
        this.f25752b = new rz(context, k2Var);
        this.f25753c = new z0(context, zR, adResultReceiver);
    }

    public final void a(b81 b81Var) {
        this.f25755e = b81Var;
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(kp0 kp0Var, Map map) {
        b81 b81Var = this.f25755e;
        if (b81Var != null) {
            b81Var.a(map);
        }
        zk zkVar = this.f25754d;
        if (zkVar != null) {
            zkVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(t2 t2Var) {
        zk zkVar = this.f25754d;
        if (zkVar != null) {
            zkVar.a(t2Var);
        }
    }

    public final void a(zk zkVar) {
        this.f25754d = zkVar;
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(String str) {
        this.f25752b.a(str, this.f25751a, this.f25753c);
    }

    @Override // com.yandex.mobile.ads.impl.b00
    public final void a(boolean z10) {
    }
}
