package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class h implements s<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Constructor f12863a;

    public h(g gVar, Constructor constructor) {
        this.f12863a = constructor;
    }

    @Override // com.google.gson.internal.s
    public Object a() {
        try {
            return this.f12863a.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InstantiationException e11) {
            StringBuilder sbA = defpackage.a.a("Failed to invoke ");
            sbA.append(this.f12863a);
            sbA.append(" with no args");
            throw new RuntimeException(sbA.toString(), e11);
        } catch (InvocationTargetException e12) {
            StringBuilder sbA2 = defpackage.a.a("Failed to invoke ");
            sbA2.append(this.f12863a);
            sbA2.append(" with no args");
            throw new RuntimeException(sbA2.toString(), e12.getTargetException());
        }
    }
}
