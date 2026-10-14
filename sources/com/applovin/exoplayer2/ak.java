package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ak extends Exception implements g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g.a<ak> f4228k = com.applovin.exoplayer2.a.p.f3991g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4230j;

    public ak(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public ak(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f4229i = i10;
        this.f4230j = j10;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(a(3));
        String string2 = bundle.getString(a(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, ak.class.getClassLoader());
            Throwable thA = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (thA != null) {
                return thA;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    private static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }
}
