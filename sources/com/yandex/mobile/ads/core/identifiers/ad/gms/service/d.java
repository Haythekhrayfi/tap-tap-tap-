package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.x60;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cz0 f18276b = new cz0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f18277c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f18278d = new f();

    public d(Context context) {
        this.f18275a = context.getApplicationContext();
    }

    public final f8 a() {
        ResolveInfo resolveInfoResolveService;
        Objects.requireNonNull(this.f18278d);
        Intent intentA = f.a();
        cz0 cz0Var = this.f18276b;
        Context context = this.f18275a;
        Objects.requireNonNull(cz0Var);
        f8 f8VarA = null;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intentA, 0);
        } catch (Throwable th) {
            x60.a(th, th.getMessage(), new Object[0]);
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService != null) {
            try {
                c cVar = new c();
                if (this.f18275a.bindService(intentA, cVar, 1)) {
                    f8VarA = this.f18277c.a(cVar);
                    this.f18275a.unbindService(cVar);
                } else {
                    x60.b("Can't bind to GMS identifiers service", new Object[0]);
                }
            } catch (Throwable th2) {
                x60.a(th2, "Exception during advertising info GMS service binding", new Object[0]);
            }
        }
        return f8VarA;
    }
}
