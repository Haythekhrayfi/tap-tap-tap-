package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class W1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rd f15365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Sd f15366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T1 f15367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1991tn f15368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V1 f15369e;

    public W1(Rd rd2, Sd sd2, T1 t10, InterfaceC1991tn interfaceC1991tn, V1 v10, String str) {
        this.f15365a = rd2;
        this.f15366b = sd2;
        this.f15367c = t10;
        this.f15368d = interfaceC1991tn;
        this.f15369e = v10;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0177 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x016c  */
    @Override // java.lang.Runnable
    public void run() {
        HttpsURLConnection httpsURLConnectionA;
        OutputStream outputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStream inputStream;
        boolean zQ;
        BufferedOutputStream bufferedOutputStream2;
        OutputStream outputStream2;
        InputStream inputStream2;
        Throwable th2;
        byte[] bArrG;
        boolean z10 = true;
        if (this.f15368d.c() && this.f15365a.a() && this.f15366b.a()) {
            boolean zN = this.f15367c.n();
            this.f15367c.d();
            Boolean boolValueOf = null;
            while (this.f15368d.c() && zN) {
                V1 v10 = this.f15369e;
                T1 t10 = this.f15367c;
                Objects.requireNonNull(v10);
                try {
                    if (t10.p()) {
                        httpsURLConnectionA = t10.d().a();
                        try {
                            for (Map.Entry<String, List<String>> entry : t10.f().entrySet()) {
                                httpsURLConnectionA.setRequestProperty(entry.getKey(), TextUtils.join(",", entry.getValue()));
                            }
                            if (2 != t10.e() || (bArrG = t10.g()) == null || bArrG.length <= 0) {
                                outputStream = null;
                                bufferedOutputStream = null;
                            } else {
                                Long lK = t10.k();
                                Integer numL = t10.l();
                                httpsURLConnectionA.setDoOutput(true);
                                if (lK != null) {
                                    httpsURLConnectionA.setRequestProperty("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(lK.longValue())));
                                }
                                if (numL != null) {
                                    httpsURLConnectionA.setRequestProperty("Send-Timezone", String.valueOf(numL));
                                }
                                outputStream = httpsURLConnectionA.getOutputStream();
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(outputStream, bArrG.length);
                                    try {
                                        bufferedOutputStream.write(t10.g());
                                        bufferedOutputStream.flush();
                                        U2.a((Closeable) outputStream);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        bufferedOutputStream2 = bufferedOutputStream;
                                        outputStream2 = outputStream;
                                        inputStream2 = null;
                                        bufferedInputStream = null;
                                        BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                                        th = th2;
                                        inputStream = inputStream2;
                                        outputStream = outputStream2;
                                        bufferedOutputStream = bufferedOutputStream3;
                                        try {
                                            t10.a(th);
                                            U2.a((Closeable) bufferedOutputStream);
                                            U2.a((Closeable) bufferedInputStream);
                                            U2.a((Closeable) outputStream);
                                            U2.a((Closeable) inputStream);
                                            U2.a(httpsURLConnectionA);
                                            zQ = false;
                                            boolValueOf = Boolean.valueOf(zQ);
                                            if (boolValueOf.booleanValue()) {
                                            }
                                        } catch (Throwable th4) {
                                            U2.a((Closeable) bufferedOutputStream);
                                            U2.a((Closeable) bufferedInputStream);
                                            U2.a((Closeable) outputStream);
                                            U2.a((Closeable) inputStream);
                                            U2.a(httpsURLConnectionA);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedOutputStream = null;
                                    bufferedInputStream = null;
                                    th = th;
                                    inputStream = null;
                                    t10.a(th);
                                    U2.a((Closeable) bufferedOutputStream);
                                    U2.a((Closeable) bufferedInputStream);
                                    U2.a((Closeable) outputStream);
                                    U2.a((Closeable) inputStream);
                                    U2.a(httpsURLConnectionA);
                                    zQ = false;
                                    boolValueOf = Boolean.valueOf(zQ);
                                    if (boolValueOf.booleanValue()) {
                                    }
                                }
                            }
                            int responseCode = httpsURLConnectionA.getResponseCode();
                            t10.a(responseCode);
                            t10.f15041g = httpsURLConnectionA.getHeaderFields();
                            if ((responseCode == 400 || responseCode == 500) ? false : true) {
                                inputStream = httpsURLConnectionA.getInputStream();
                                try {
                                    bufferedInputStream = new BufferedInputStream(inputStream, 8000);
                                    try {
                                        t10.b(V0.a(bufferedInputStream, Integer.MAX_VALUE));
                                        U2.a((Closeable) inputStream);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        t10.a(th);
                                        U2.a((Closeable) bufferedOutputStream);
                                        U2.a((Closeable) bufferedInputStream);
                                        U2.a((Closeable) outputStream);
                                        U2.a((Closeable) inputStream);
                                        U2.a(httpsURLConnectionA);
                                        zQ = false;
                                    }
                                } catch (Throwable th7) {
                                    OutputStream outputStream3 = outputStream;
                                    inputStream2 = inputStream;
                                    th2 = th7;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    outputStream2 = outputStream3;
                                    bufferedInputStream = null;
                                    BufferedOutputStream bufferedOutputStream4 = bufferedOutputStream2;
                                    th = th2;
                                    inputStream = inputStream2;
                                    outputStream = outputStream2;
                                    bufferedOutputStream = bufferedOutputStream4;
                                    t10.a(th);
                                    U2.a((Closeable) bufferedOutputStream);
                                    U2.a((Closeable) bufferedInputStream);
                                    U2.a((Closeable) outputStream);
                                    U2.a((Closeable) inputStream);
                                    U2.a(httpsURLConnectionA);
                                    zQ = false;
                                    boolValueOf = Boolean.valueOf(zQ);
                                    if (boolValueOf.booleanValue()) {
                                    }
                                }
                            } else {
                                bufferedInputStream = new BufferedInputStream(httpsURLConnectionA.getErrorStream(), 8000);
                                inputStream = null;
                            }
                            zQ = t10.q();
                            U2.a((Closeable) bufferedOutputStream);
                            U2.a((Closeable) bufferedInputStream);
                            U2.a((Closeable) outputStream);
                            U2.a((Closeable) inputStream);
                            U2.a(httpsURLConnectionA);
                        } catch (Throwable th8) {
                            th = th8;
                            outputStream = null;
                        }
                    } else {
                        t10.a((Throwable) null);
                        U2.a((Closeable) null);
                        U2.a((Closeable) null);
                        U2.a((Closeable) null);
                        U2.a((Closeable) null);
                        U2.a((HttpsURLConnection) null);
                        zQ = false;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    httpsURLConnectionA = null;
                    outputStream = null;
                }
                boolValueOf = Boolean.valueOf(zQ);
                zN = boolValueOf.booleanValue() && this.f15367c.A();
            }
            if (Boolean.TRUE.equals(boolValueOf)) {
                this.f15366b.c();
            } else if (Boolean.FALSE.equals(boolValueOf)) {
                this.f15366b.d();
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        this.f15367c.s();
    }
}
