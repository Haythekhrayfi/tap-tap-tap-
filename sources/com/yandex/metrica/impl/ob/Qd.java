package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14778a;

    public interface a {
        void a();

        void a(String str, byte[] bArr);

        String b();

        void c();
    }

    public static class b {
    }

    public Qd() {
        this(new b());
    }

    public Qd(b bVar) {
        this.f14778a = bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(java.lang.String r5, com.yandex.metrica.impl.ob.Qd.a r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.yandex.metrica.impl.ob.Qd$b r2 = r4.f14778a     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r6.b()     // Catch: java.lang.Throwable -> L63
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L63
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.ob.P0.i()     // Catch: java.lang.Throwable -> L36
            com.yandex.metrica.impl.ob.Zd r2 = r2.x()     // Catch: java.lang.Throwable -> L36
            javax.net.ssl.HttpsURLConnection r5 = r2.a(r5)     // Catch: java.lang.Throwable -> L36
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L22
            java.lang.String r2 = "If-None-Match"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L36
        L22:
            r5.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = com.yandex.metrica.impl.ob.Vd.a.f15234a     // Catch: java.lang.Throwable -> L36
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L36
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L36
            r5.connect()     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L63
            int r2 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L63
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L4a
            r5 = 304(0x130, float:4.26E-43)
            if (r2 == r5) goto L46
            goto L63
        L46:
            r6.a()     // Catch: java.lang.Throwable -> L63
            goto L64
        L4a:
            java.lang.String r2 = "ETag"
            java.lang.String r2 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = com.yandex.metrica.impl.ob.O2.b(r2)     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r5 = r5.getInputStream()
            r3 = 2147483647(0x7fffffff, float:NaN)
            byte[] r5 = com.yandex.metrica.impl.ob.V0.a(r5, r3)
            r6.a(r2, r5)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L69
            r6.c()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Qd.a(java.lang.String, com.yandex.metrica.impl.ob.Qd$a):void");
    }
}
