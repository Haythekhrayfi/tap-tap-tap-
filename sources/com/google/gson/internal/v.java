package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f12892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12893b;

    public v(Method method, Object obj) {
        this.f12892a = method;
        this.f12893b = obj;
    }

    @Override // com.google.gson.internal.z
    public <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f12892a.invoke(this.f12893b, cls);
    }
}
