package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f12896a;

    public x(Method method) {
        this.f12896a = method;
    }

    @Override // com.google.gson.internal.z
    public <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f12896a.invoke(null, cls, Object.class);
    }
}
