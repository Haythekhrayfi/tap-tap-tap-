package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1727j8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1727j8 f16399c = new C1727j8(new J7());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J7 f16400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f16401b = a.BLANK;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j8$a */
    public enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    public C1727j8(J7 j10) {
        this.f16400a = j10;
    }

    public static C1727j8 a() {
        return f16399c;
    }

    public synchronized boolean b() {
        a aVar = this.f16401b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            Objects.requireNonNull(this.f16400a);
            System.loadLibrary("appmetrica-service-native");
            this.f16401b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.f16401b = a.LOADING_ERROR;
            return false;
        }
    }
}
