package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wd<T> implements kq0.a, vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kq0 f26255b = kq0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdResponse<T> f26256c;

    public wd(Context context, AdResponse<T> adResponse) {
        this.f26254a = context;
        this.f26256c = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.vh
    public final synchronized boolean a() {
        return false;
    }

    public final AdResponse<T> b() {
        return this.f26256c;
    }

    public final Context c() {
        return this.f26254a;
    }

    public final boolean d() {
        return !this.f26255b.b(this.f26254a);
    }

    public final void e() {
        StringBuilder sbA = v60.a("registerPhoneStateTracker(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        this.f26255b.a(this.f26254a, this);
    }

    public final void f() {
        StringBuilder sbA = v60.a("unregisterPhoneStateTracker(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        this.f26255b.b(this.f26254a, this);
    }
}
