package com.yandex.mobile.ads.impl;

import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class j41 extends i9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f21949h = 0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static j41 a() {
            int i10 = j41.f21949h;
            try {
                return new j41(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            } catch (Exception e10) {
                int i11 = qq0.f24561c;
                Objects.requireNonNull(qq0.a.b());
                qq0.a(5, "unable to load android socket classes", e10);
                return null;
            }
        }
    }

    static {
        new a(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        fd.j0.i(cls, "sslSocketClass");
        fd.j0.i(cls2, "sslSocketFactoryClass");
        fd.j0.i(cls3, "paramClass");
    }
}
