package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class wq0 extends Exception implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26345b;

    static {
        yn1 yn1Var = yn1.G;
    }

    public wq0(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public wq0(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f26344a = i10;
        this.f26345b = j10;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, wq0.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }
}
