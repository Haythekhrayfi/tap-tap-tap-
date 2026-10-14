package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"StaticFieldLeak"})
public final class i90 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f21643f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile i90 f21644g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l90 f21646b = new l90();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k90 f21647c = new k90();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i01 f21648d = i01.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w01 f21649e = new w01();

    private i90(Context context) {
        this.f21645a = context.getApplicationContext();
    }

    public static i90 a(Context context) {
        if (f21644g == null) {
            synchronized (f21643f) {
                if (f21644g == null) {
                    f21644g = new i90(context);
                }
            }
        }
        return f21644g;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    public final Location a() {
        Location locationA;
        synchronized (f21643f) {
            if (this.f21648d.f()) {
                w01 w01Var = this.f21649e;
                Context context = this.f21645a;
                Objects.requireNonNull(w01Var);
                if (!w01.a(context)) {
                    k90 k90Var = this.f21647c;
                    Context context2 = this.f21645a;
                    Objects.requireNonNull(k90Var);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new x70(context2));
                    nz0 nz0VarA = i01.b().a(context2);
                    if (nz0VarA != null && !nz0VarA.F()) {
                        arrayList.add(hy.a(context2));
                        arrayList.add(vy.a(context2));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Location locationA2 = ((j90) it.next()).a();
                        if (locationA2 != null) {
                            arrayList2.add(locationA2);
                        }
                    }
                    locationA = this.f21646b.a(arrayList2);
                } else {
                    locationA = null;
                }
            } else {
                locationA = null;
            }
        }
        return locationA;
    }
}
