package com.yandex.metrica.impl.ob;

import java.io.Closeable;
import java.io.InputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ob f14866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qb f14867b;

    public Rb(Ob ob2, Qb qb2) {
        this.f14866a = ob2;
        this.f14867b = qb2;
    }

    public final void a() {
        int responseCode;
        Throwable th;
        HttpsURLConnection httpsURLConnectionA = this.f14866a.a();
        if (httpsURLConnectionA == null) {
            this.f14867b.a();
            return;
        }
        InputStream inputStream = null;
        try {
            httpsURLConnectionA.connect();
            responseCode = httpsURLConnectionA.getResponseCode();
            try {
                inputStream = httpsURLConnectionA.getInputStream();
                fd.j0.h(inputStream, "inputStream");
                int length = h9.d.p(inputStream).length;
                httpsURLConnectionA.disconnect();
                U2.a((Closeable) inputStream);
                this.f14867b.a(new Qb.a(responseCode == 200, responseCode, length, null, 8));
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.f14867b.a(new Qb.a(false, responseCode, 0, ((vc.e) vc.b0.a(th.getClass())).d() + ": " + th.getLocalizedMessage(), 5));
                } finally {
                    httpsURLConnectionA.disconnect();
                    U2.a((Closeable) inputStream);
                }
            }
        } catch (Throwable th3) {
            responseCode = 0;
            th = th3;
        }
    }
}
