package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import fd.j0;
import java.util.Objects;
import l8.a1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f13594d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Intent intent, uc.l lVar, String str) {
        this(new d(intent, str), lVar, a1.a("[AdInServiceConnectionController-", str, ']'), str, new w());
        j0.i(intent, "intent");
        j0.i(lVar, "converter");
        j0.i(str, "serviceShortTag");
    }

    public e(d dVar, uc.l lVar, String str, String str2, w wVar) {
        j0.i(dVar, "connection");
        j0.i(lVar, "converter");
        j0.i(str, "tag");
        j0.i(str2, "serviceShortTag");
        j0.i(wVar, "safePackageManager");
        this.f13591a = dVar;
        this.f13592b = lVar;
        this.f13593c = str2;
        this.f13594d = wVar;
    }

    public final Object a(Context context) throws j {
        ResolveInfo resolveInfoResolveService;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Intent intent = this.f13591a.f13588a;
        j0.h(intent, "connection.intent");
        Objects.requireNonNull(this.f13594d);
        IBinder iBinder = null;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            throw new m(androidx.activity.k.a(a.a("could not resolve "), this.f13593c, " services"));
        }
        try {
            d dVar = this.f13591a;
            if (context.bindService(dVar.f13588a, dVar, 1)) {
                d dVar2 = this.f13591a;
                if (dVar2.f13589b == null) {
                    synchronized (dVar2.f13590c) {
                        if (dVar2.f13589b == null) {
                            try {
                                dVar2.f13590c.wait(3000L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                }
                iBinder = dVar2.f13589b;
            }
        } catch (Throwable unused3) {
        }
        if (iBinder != null) {
            return this.f13592b.invoke(iBinder);
        }
        throw new j(androidx.activity.k.a(a.a("could not bind to "), this.f13593c, " services"));
    }
}
