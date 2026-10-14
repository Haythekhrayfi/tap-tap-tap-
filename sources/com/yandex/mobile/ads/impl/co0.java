package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.upstream.HttpUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class co0 extends ee {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vg.a f19591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s00 f19592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fg f19594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s00 f19595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Predicate<String> f19596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private pm f19597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ex0 f19598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f19599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f19602p;

    static {
        us.a("goog.exo.okhttp");
    }

    public co0(yn0 yn0Var, String str, s00 s00Var) {
        super(true);
        this.f19591e = (vg.a) Assertions.checkNotNull(yn0Var);
        this.f19593g = str;
        this.f19594h = null;
        this.f19595i = s00Var;
        this.f19596j = null;
        this.f19592f = new s00();
    }

    private void a(long j10) throws p00 {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            try {
                int i10 = ((InputStream) Util.castNonNull(this.f19599m)).read(bArr, 0, (int) Math.min(j10, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i10 == -1) {
                    throw new p00(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                j10 -= (long) i10;
                c(i10);
            } catch (IOException e10) {
                if (!(e10 instanceof p00)) {
                    throw new p00(2000);
                }
                throw ((p00) e10);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws p00 {
        this.f19597k = pmVar;
        long j10 = 0;
        this.f19602p = 0L;
        this.f19601o = 0L;
        b(pmVar);
        long j11 = pmVar.f24106f;
        long j12 = pmVar.f24107g;
        d10 d10VarA = d10.a(pmVar.f24101a.toString());
        if (d10VarA == null) {
            throw new p00("Malformed URL", 1004);
        }
        nw0.a aVarA = new nw0.a().a(d10VarA);
        fg fgVar = this.f19594h;
        if (fgVar != null) {
            aVarA.a(fgVar);
        }
        HashMap map = new HashMap();
        s00 s00Var = this.f19595i;
        if (s00Var != null) {
            map.putAll(s00Var.a());
        }
        map.putAll(this.f19592f.a());
        map.putAll(pmVar.f24105e);
        for (Map.Entry entry : map.entrySet()) {
            aVarA.b((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j11, j12);
        if (strBuildRangeRequestHeader != null) {
            aVarA.a("Range", strBuildRangeRequestHeader);
        }
        String str = this.f19593g;
        if (str != null) {
            aVarA.a("User-Agent", str);
        }
        if (!pmVar.a(1)) {
            aVarA.a("Accept-Encoding", "identity");
        }
        byte[] bArr = pmVar.f24104d;
        aVarA.a(pmVar.b(), bArr != null ? qw0.a(bArr) : pmVar.f24103c == 2 ? qw0.a(Util.EMPTY_BYTE_ARRAY) : null);
        wu0 wu0VarA = this.f19591e.a(aVarA.a());
        try {
            SettableFuture settableFutureCreate = SettableFuture.create();
            wu0VarA.a(new bo0(settableFutureCreate));
            try {
                ex0 ex0Var = (ex0) settableFutureCreate.get();
                this.f19598l = ex0Var;
                ix0 ix0Var = (ix0) Assertions.checkNotNull(ex0Var.a());
                this.f19599m = ix0Var.a();
                int iE = ex0Var.e();
                if (!ex0Var.i()) {
                    if (iE == 416) {
                        if (pmVar.f24106f == e10.a(ex0Var.h().a("Content-Range"))) {
                            this.f19600n = true;
                            c(pmVar);
                            long j13 = pmVar.f24107g;
                            if (j13 != -1) {
                                return j13;
                            }
                            return 0L;
                        }
                    }
                    try {
                        Util.toByteArray((InputStream) Assertions.checkNotNull(this.f19599m));
                    } catch (IOException unused) {
                        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
                    }
                    TreeMap treeMapC = ex0Var.h().c();
                    ex0 ex0Var2 = this.f19598l;
                    if (ex0Var2 != null) {
                        ((ix0) Assertions.checkNotNull(ex0Var2.a())).close();
                        this.f19598l = null;
                    }
                    this.f19599m = null;
                    throw new r00(iE, iE == 416 ? new mm(AdError.REMOTE_ADS_SERVICE_ERROR) : null, treeMapC);
                }
                tc0 tc0VarC = ix0Var.c();
                String string = tc0VarC != null ? tc0VarC.toString() : "";
                Predicate<String> predicate = this.f19596j;
                if (predicate != null && !predicate.apply(string)) {
                    ex0 ex0Var3 = this.f19598l;
                    if (ex0Var3 != null) {
                        ((ix0) Assertions.checkNotNull(ex0Var3.a())).close();
                        this.f19598l = null;
                    }
                    this.f19599m = null;
                    throw new q00(string);
                }
                if (iE == 200) {
                    long j14 = pmVar.f24106f;
                    if (j14 != 0) {
                        j10 = j14;
                    }
                }
                long j15 = pmVar.f24107g;
                if (j15 != -1) {
                    this.f19601o = j15;
                } else {
                    long jB = ix0Var.b();
                    this.f19601o = jB != -1 ? jB - j10 : -1L;
                }
                this.f19600n = true;
                c(pmVar);
                try {
                    a(j10);
                    return this.f19601o;
                } catch (p00 e10) {
                    ex0 ex0Var4 = this.f19598l;
                    if (ex0Var4 != null) {
                        ((ix0) Assertions.checkNotNull(ex0Var4.a())).close();
                        this.f19598l = null;
                    }
                    this.f19599m = null;
                    throw e10;
                }
            } catch (InterruptedException unused2) {
                wu0VarA.a();
                throw new InterruptedIOException();
            } catch (ExecutionException e11) {
                throw new IOException(e11);
            }
        } catch (IOException e12) {
            throw p00.a(e12, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        ex0 ex0Var = this.f19598l;
        return ex0Var == null ? Collections.emptyMap() : ex0Var.h().c();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() {
        if (this.f19600n) {
            this.f19600n = false;
            f();
            ex0 ex0Var = this.f19598l;
            if (ex0Var != null) {
                ((ix0) Assertions.checkNotNull(ex0Var.a())).close();
                this.f19598l = null;
            }
            this.f19599m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        ex0 ex0Var = this.f19598l;
        if (ex0Var == null) {
            return null;
        }
        return Uri.parse(ex0Var.p().h().toString());
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws p00 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f19601o;
            if (j10 != -1) {
                long j11 = j10 - this.f19602p;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            int i12 = ((InputStream) Util.castNonNull(this.f19599m)).read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f19602p += (long) i12;
            c(i12);
            return i12;
        } catch (IOException e10) {
            throw p00.a(e10, 2);
        }
    }
}
