package com.yandex.mobile.ads.impl;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<ao0, yn0> f27373a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l81 f27374b = new l81();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27375c = 0;

    public static yn0 a(int i10, int i11, SSLSocketFactory sSLSocketFactory) throws NoSuchAlgorithmException, KeyStoreException {
        X509TrustManager x509TrustManagerA = f27374b.a();
        ao0 ao0Var = new ao0(i10, i11, (sSLSocketFactory == null || x509TrustManagerA == null) ? null : sSLSocketFactory);
        ConcurrentHashMap<ao0, yn0> concurrentHashMap = f27373a;
        if (!concurrentHashMap.containsKey(ao0Var)) {
            yn0.a aVar = new yn0.a();
            long j10 = i10;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yn0.a aVarA = aVar.a(j10, timeUnit).b(i11, timeUnit).a();
            if (sSLSocketFactory != null && x509TrustManagerA != null) {
                aVarA = aVarA.a(sSLSocketFactory, x509TrustManagerA);
            }
            concurrentHashMap.put(ao0Var, new yn0(aVarA));
        }
        yn0 yn0Var = concurrentHashMap.get(ao0Var);
        if (yn0Var != null) {
            return yn0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
