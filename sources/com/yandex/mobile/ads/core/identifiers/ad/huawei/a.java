package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.x60;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cz0 f18283b = new cz0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f18284c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f18285d = new d();

    public a(Context context) {
        this.f18282a = context.getApplicationContext();
    }

    public final f8 a() {
        ResolveInfo resolveInfoResolveService;
        Objects.requireNonNull(this.f18285d);
        Intent intentA = d.a();
        cz0 cz0Var = this.f18283b;
        Context context = this.f18282a;
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
                b bVar = new b();
                if (this.f18282a.bindService(intentA, bVar, 1)) {
                    f8VarA = this.f18284c.a(bVar);
                    this.f18282a.unbindService(bVar);
                } else {
                    x60.b("Can't bind to Huawei identifiers service", new Object[0]);
                }
            } catch (Throwable th2) {
                x60.a(th2, "Exception during advertising info GMS service binding", new Object[0]);
            }
        }
        return f8VarA;
    }
}
