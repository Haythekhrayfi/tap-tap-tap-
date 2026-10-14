package com.applovin.impl.sdk.network;

import android.os.Process;
import android.os.SystemClock;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue<b> f10875a = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10876b;

    public static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue<b> f10877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f10878b;

        private a(BlockingQueue<b> blockingQueue, int i10, o oVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (oVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f10877a = blockingQueue;
            this.f10878b = oVar;
            setPriority(((Integer) oVar.a(com.applovin.impl.sdk.c.b.gF)).intValue());
        }

        private void a() throws InterruptedException {
            a(this.f10877a.take());
        }

        private void a(final b bVar) {
            HttpURLConnection httpURLConnectionB;
            InputStream inputStream;
            long jElapsedRealtime;
            InputStream errorStream;
            byte[] bArrA;
            byte[] bArrA2;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            byte[] bArr = null;
            int responseCode = 0;
            try {
                httpURLConnectionB = b(bVar);
                try {
                    if (bVar.f10886e != null && bVar.f10886e.length > 0) {
                        httpURLConnectionB.setDoOutput(true);
                        httpURLConnectionB.setFixedLengthStreamingMode(bVar.f10886e.length);
                        OutputStream outputStream = httpURLConnectionB.getOutputStream();
                        outputStream.write(bVar.f10886e);
                        outputStream.close();
                    }
                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    responseCode = httpURLConnectionB.getResponseCode();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (responseCode > 0) {
                        inputStream = httpURLConnectionB.getInputStream();
                        try {
                            bArrA2 = com.applovin.impl.sdk.utils.i.a(inputStream, this.f10878b);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                this.f10878b.F();
                                if (y.a()) {
                                    this.f10878b.F().a("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnectionB != null) {
                                    try {
                                        errorStream = httpURLConnectionB.getErrorStream();
                                        try {
                                            bArrA = com.applovin.impl.sdk.utils.i.a(errorStream, this.f10878b);
                                        } catch (Throwable unused) {
                                            bArrA = null;
                                            w.a((Closeable) inputStream, this.f10878b);
                                            w.a((Closeable) errorStream, this.f10878b);
                                            w.a(httpURLConnectionB, this.f10878b);
                                            final c cVarA = c.e().a(responseCode).a(bArr).b(bArrA).a(jElapsedRealtime - jElapsedRealtime2).a(th).a();
                                            bVar.f10889h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    bVar.f10888g.accept(cVarA);
                                                }
                                            });
                                        }
                                    } catch (Throwable unused2) {
                                        errorStream = null;
                                    }
                                } else {
                                    errorStream = null;
                                    bArrA = null;
                                }
                                w.a((Closeable) inputStream, this.f10878b);
                                w.a((Closeable) errorStream, this.f10878b);
                                w.a(httpURLConnectionB, this.f10878b);
                            } catch (Throwable th2) {
                                w.a((Closeable) inputStream, this.f10878b);
                                w.a((Closeable) null, this.f10878b);
                                w.a(httpURLConnectionB, this.f10878b);
                                throw th2;
                            }
                        }
                    } else {
                        inputStream = null;
                        bArrA2 = null;
                    }
                    w.a((Closeable) inputStream, this.f10878b);
                    w.a((Closeable) null, this.f10878b);
                    w.a(httpURLConnectionB, this.f10878b);
                    bArrA = null;
                    bArr = bArrA2;
                    jElapsedRealtime = jElapsedRealtime3;
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionB = null;
                inputStream = null;
            }
            final c cVarA2 = c.e().a(responseCode).a(bArr).b(bArrA).a(jElapsedRealtime - jElapsedRealtime2).a(th).a();
            bVar.f10889h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.f10888g.accept(cVarA2);
                }
            });
        }

        private HttpURLConnection b(b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f10883b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f10884c);
            httpURLConnection.setConnectTimeout(bVar.f10887f);
            httpURLConnection.setReadTimeout(bVar.f10887f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f10885d.isEmpty()) {
                for (Map.Entry entry : bVar.f10885d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f10882a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, String> f10885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f10886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f10887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o0.a<c> f10888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Executor f10889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f10890i;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map<String, String> f10893c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f10894d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f10895e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private o0.a<c> f10896f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f10897g;

            public a a(int i10) {
                this.f10895e = i10;
                return this;
            }

            public a a(String str) {
                this.f10891a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.f10893c.put(str, str2);
                return this;
            }

            public a a(Map<String, String> map) {
                if (map == null) {
                    map = new HashMap<>();
                }
                this.f10893c = map;
                return this;
            }

            public a a(Executor executor) {
                this.f10897g = executor;
                return this;
            }

            public a a(o0.a<c> aVar) {
                this.f10896f = aVar;
                return this;
            }

            public a a(byte[] bArr) {
                this.f10894d = bArr;
                return this;
            }

            public b a() {
                return new b(this);
            }

            public a b(String str) {
                this.f10892b = str;
                return this;
            }
        }

        private b(a aVar) {
            this.f10883b = aVar.f10891a;
            this.f10884c = aVar.f10892b;
            this.f10885d = aVar.f10893c != null ? aVar.f10893c : Collections.emptyMap();
            this.f10886e = aVar.f10894d;
            this.f10887f = aVar.f10895e;
            this.f10888g = aVar.f10896f;
            this.f10889h = aVar.f10897g;
            this.f10890i = f10882a.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f10890i - bVar.f10890i;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f10899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f10900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f10901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f10902e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f10903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f10904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f10905c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f10906d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f10907e;

            public a a(int i10) {
                this.f10903a = i10;
                return this;
            }

            public a a(long j10) {
                this.f10906d = j10;
                return this;
            }

            public a a(Throwable th) {
                this.f10907e = th;
                return this;
            }

            public a a(byte[] bArr) {
                this.f10904b = bArr;
                return this;
            }

            public c a() {
                return new c(this);
            }

            public a b(byte[] bArr) {
                this.f10905c = bArr;
                return this;
            }
        }

        private c(a aVar) {
            this.f10898a = aVar.f10903a;
            this.f10899b = aVar.f10904b;
            this.f10900c = aVar.f10905c;
            this.f10901d = aVar.f10906d;
            this.f10902e = aVar.f10907e;
        }

        public static a e() {
            return new a();
        }

        public int a() throws Throwable {
            Throwable th = this.f10902e;
            if (th == null) {
                return this.f10898a;
            }
            throw th;
        }

        public byte[] b() throws Throwable {
            Throwable th = this.f10902e;
            if (th == null) {
                return this.f10899b;
            }
            throw th;
        }

        public byte[] c() {
            return this.f10900c;
        }

        public long d() {
            return this.f10901d;
        }
    }

    public e(o oVar) {
        this.f10876b = oVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f10876b.a(com.applovin.impl.sdk.c.b.av)).intValue(); i10++) {
            new a(this.f10875a, i10, this.f10876b).start();
        }
    }

    public void a(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f10875a.add(bVar);
    }
}
