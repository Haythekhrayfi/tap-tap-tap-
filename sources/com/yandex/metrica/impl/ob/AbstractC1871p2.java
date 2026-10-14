package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1871p2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17035c;

    public AbstractC1871p2(Context context, String str, String str2) {
        this.f17033a = context;
        this.f17034b = str;
        this.f17035c = str2;
    }

    public T a() {
        int identifier = this.f17033a.getResources().getIdentifier(this.f17034b, this.f17035c, this.f17033a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract T a(int i10);
}
