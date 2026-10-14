package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f12894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12895b;

    public w(Method method, int i10) {
        this.f12894a = method;
        this.f12895b = i10;
    }

    @Override // com.google.gson.internal.z
    public <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f12894a.invoke(null, cls, Integer.valueOf(this.f12895b));
    }
}
