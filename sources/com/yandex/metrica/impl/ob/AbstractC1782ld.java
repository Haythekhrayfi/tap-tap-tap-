package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1782ld<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f16818e = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1659ge f16820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f16821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Looper f16822d;

    public AbstractC1782ld(Context context, LocationListener locationListener, InterfaceC1659ge interfaceC1659ge, Looper looper) {
        this.f16819a = context;
        this.f16821c = locationListener;
        this.f16820b = interfaceC1659ge;
        this.f16822d = looper;
    }

    public abstract void a();

    public abstract boolean a(T t10);

    public abstract void b();
}
