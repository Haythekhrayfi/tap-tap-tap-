package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1670h0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1595e0<T> f16246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1620f0<T> f16247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O0 f16248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16249d;

    public C1670h0(InterfaceC1595e0<T> interfaceC1595e0, InterfaceC1620f0<T> interfaceC1620f0, O0 o10, String str) {
        this.f16246a = interfaceC1595e0;
        this.f16247b = interfaceC1620f0;
        this.f16248c = o10;
        this.f16249d = str;
    }

    public final void a(Context context, ContentValues contentValues) {
        try {
            T tInvoke = this.f16246a.invoke(contentValues);
            if (tInvoke != null) {
                this.f16248c.a(context);
                if (this.f16247b.invoke(tInvoke).booleanValue()) {
                    B2.a("Successfully saved " + this.f16249d, new Object[0]);
                } else {
                    B2.b("Did not save " + this.f16249d + " because data is already present", new Object[0]);
                }
            }
        } catch (Throwable th) {
            B2.a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
