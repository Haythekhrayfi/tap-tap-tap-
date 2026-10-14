package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxErrorCode;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hg implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg f21369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lm f21370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e61 f21371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lm f21372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pg f21373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f21377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private pm f21378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private pm f21379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private lm f21380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f21381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f21382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private qg f21384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f21387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f21388t;

    public interface a {
        void a();

        void b();
    }

    public static final class b implements lm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private dg f21389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zu.b f21390b = new zu.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private pg f21391c = pg.f24057a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private lm.a f21392d;

        public final b a(dg dgVar) {
            this.f21389a = dgVar;
            return this;
        }

        public final b a(lm.a aVar) {
            this.f21392d = aVar;
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.lm.a
        public final lm a() {
            lm.a aVar = this.f21392d;
            lm lmVarA = aVar != null ? aVar.a() : null;
            int i10 = 0;
            int i11 = 0;
            dg dgVar = this.f21389a;
            Objects.requireNonNull(dgVar);
            gg ggVarA = lmVarA != null ? new gg.b().a(dgVar).a() : null;
            Objects.requireNonNull(this.f21390b);
            return new hg(dgVar, lmVarA, new zu(), ggVarA, this.f21391c, i10, i11, 0);
        }

        public final hg b() {
            lm.a aVar = this.f21392d;
            lm lmVarA = aVar != null ? aVar.a() : null;
            int i10 = 1;
            int i11 = MaxErrorCode.NETWORK_ERROR;
            dg dgVar = this.f21389a;
            Objects.requireNonNull(dgVar);
            gg ggVarA = lmVarA != null ? new gg.b().a(dgVar).a() : null;
            Objects.requireNonNull(this.f21390b);
            return new hg(dgVar, lmVarA, new zu(), ggVarA, this.f21391c, i10, i11, 0);
        }
    }

    private hg(dg dgVar, lm lmVar, zu zuVar, gg ggVar, pg pgVar, int i10, int i11) {
        this.f21369a = dgVar;
        this.f21370b = zuVar;
        this.f21373e = pgVar == null ? pg.f24057a : pgVar;
        this.f21374f = (i10 & 1) != 0;
        this.f21375g = (i10 & 2) != 0;
        this.f21376h = (i10 & 4) != 0;
        e61 e61Var = null;
        if (lmVar != null) {
            this.f21372d = lmVar;
            if (ggVar != null) {
                e61Var = new e61(lmVar, ggVar);
            }
        } else {
            this.f21372d = oq0.f23873a;
        }
        this.f21371c = e61Var;
    }

    public /* synthetic */ hg(dg dgVar, lm lmVar, zu zuVar, gg ggVar, pg pgVar, int i10, int i11, int i12) {
        this(dgVar, lmVar, zuVar, ggVar, pgVar, i10, i11);
    }

    private void a(pm pmVar, boolean z10) throws IOException {
        qg qgVarE;
        pm pmVarA;
        lm lmVar;
        String str = pmVar.f24108h;
        int i10 = da1.f19803a;
        if (this.f21386r) {
            qgVarE = null;
        } else if (this.f21374f) {
            try {
                qgVarE = this.f21369a.e(str, this.f21382n, this.f21383o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            qgVarE = this.f21369a.c(str, this.f21382n, this.f21383o);
        }
        if (qgVarE == null) {
            lmVar = this.f21372d;
            pmVarA = pmVar.a().b(this.f21382n).a(this.f21383o).a();
        } else if (qgVarE.f24486d) {
            Uri uriFromFile = Uri.fromFile(qgVarE.f24487e);
            long j10 = qgVarE.f24484b;
            long j11 = this.f21382n - j10;
            long jMin = qgVarE.f24485c - j11;
            long j12 = this.f21383o;
            if (j12 != -1) {
                jMin = Math.min(jMin, j12);
            }
            pmVarA = pmVar.a().a(uriFromFile).c(j10).b(j11).a(jMin).a();
            lmVar = this.f21370b;
        } else {
            long jMin2 = qgVarE.f24485c;
            if (jMin2 == -1) {
                jMin2 = this.f21383o;
            } else {
                long j13 = this.f21383o;
                if (j13 != -1) {
                    jMin2 = Math.min(jMin2, j13);
                }
            }
            pmVarA = pmVar.a().b(this.f21382n).a(jMin2).a();
            lmVar = this.f21371c;
            if (lmVar == null) {
                lmVar = this.f21372d;
                this.f21369a.b(qgVarE);
                qgVarE = null;
            }
        }
        this.f21388t = (this.f21386r || lmVar != this.f21372d) ? RecyclerView.FOREVER_NS : this.f21382n + 102400;
        if (z10) {
            pa.b(this.f21380l == this.f21372d);
            if (lmVar == this.f21372d) {
                return;
            }
            try {
                f();
            } catch (Throwable th) {
                if (!(!qgVarE.f24486d)) {
                    throw th;
                }
                this.f21369a.b(qgVarE);
                throw th;
            }
        }
        if (qgVarE != null && (!qgVarE.f24486d)) {
            this.f21384p = qgVarE;
        }
        this.f21380l = lmVar;
        this.f21379k = pmVarA;
        this.f21381m = 0L;
        long jA = lmVar.a(pmVarA);
        yk ykVar = new yk();
        if (pmVarA.f24107g == -1 && jA != -1) {
            this.f21383o = jA;
            yk.a(ykVar, this.f21382n + jA);
        }
        if (i()) {
            Uri uriD = lmVar.d();
            this.f21377i = uriD;
            yk.a(ykVar, pmVar.f24101a.equals(uriD) ^ true ? this.f21377i : null);
        }
        if (this.f21380l == this.f21371c) {
            this.f21369a.a(str, ykVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f() throws IOException {
        lm lmVar = this.f21380l;
        if (lmVar == null) {
            return;
        }
        try {
            lmVar.close();
        } finally {
            this.f21379k = null;
            this.f21380l = null;
            qg qgVar = this.f21384p;
            if (qgVar != null) {
                this.f21369a.b(qgVar);
                this.f21384p = null;
            }
        }
    }

    private boolean i() {
        return !(this.f21380l == this.f21370b);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final long a(pm pmVar) throws IOException {
        byte b10;
        try {
            String strA = this.f21373e.a(pmVar);
            pm pmVarA = pmVar.a().a(strA).a();
            this.f21378j = pmVarA;
            dg dgVar = this.f21369a;
            Uri uri = pmVarA.f24101a;
            String strC = dgVar.b(strA).c();
            Uri uri2 = strC == null ? null : Uri.parse(strC);
            if (uri2 != null) {
                uri = uri2;
            }
            this.f21377i = uri;
            this.f21382n = pmVar.f24106f;
            if (this.f21375g && this.f21385q) {
                b10 = 0;
            } else {
                b10 = (this.f21376h && pmVar.f24107g == -1) ? (byte) 1 : (byte) -1;
            }
            boolean z10 = b10 != -1;
            this.f21386r = z10;
            if (z10) {
                this.f21383o = -1L;
            } else {
                long jB = this.f21369a.b(strA).b();
                this.f21383o = jB;
                if (jB != -1) {
                    long j10 = jB - pmVar.f24106f;
                    this.f21383o = j10;
                    if (j10 < 0) {
                        throw new mm(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            long jMin = pmVar.f24107g;
            if (jMin != -1) {
                long j11 = this.f21383o;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f21383o = jMin;
            }
            long j12 = this.f21383o;
            if (j12 > 0 || j12 == -1) {
                a(pmVarA, false);
            }
            long j13 = pmVar.f24107g;
            return j13 != -1 ? j13 : this.f21383o;
        } catch (Throwable th) {
            if ((this.f21380l == this.f21370b) || (th instanceof dg.a)) {
                this.f21385q = true;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        this.f21370b.a(g81Var);
        this.f21372d.a(g81Var);
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Map<String, List<String>> b() {
        return i() ? this.f21372d.b() : Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void close() throws IOException {
        this.f21378j = null;
        this.f21377i = null;
        this.f21382n = 0L;
        try {
            f();
        } catch (Throwable th) {
            if ((this.f21380l == this.f21370b) || (th instanceof dg.a)) {
                this.f21385q = true;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final Uri d() {
        return this.f21377i;
    }

    public final dg g() {
        return this.f21369a;
    }

    public final pg h() {
        return this.f21373e;
    }

    @Override // com.yandex.mobile.ads.impl.im
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        if (this.f21383o == 0) {
            return -1;
        }
        pm pmVar = this.f21378j;
        Objects.requireNonNull(pmVar);
        pm pmVar2 = this.f21379k;
        Objects.requireNonNull(pmVar2);
        try {
            if (this.f21382n >= this.f21388t) {
                a(pmVar, true);
            }
            lm lmVar = this.f21380l;
            Objects.requireNonNull(lmVar);
            int i13 = lmVar.read(bArr, i10, i11);
            if (i13 != -1) {
                if (this.f21380l == this.f21370b) {
                    this.f21387s += (long) i13;
                }
                long j10 = i13;
                this.f21382n += j10;
                this.f21381m += j10;
                long j11 = this.f21383o;
                if (j11 != -1) {
                    this.f21383o = j11 - j10;
                }
                return i13;
            }
            if (i()) {
                long j12 = pmVar2.f24107g;
                if (j12 != -1) {
                    i12 = i13;
                    if (this.f21381m < j12) {
                    }
                } else {
                    i12 = i13;
                }
                String str = pmVar.f24108h;
                int i14 = da1.f19803a;
                this.f21383o = 0L;
                if (!(this.f21380l == this.f21371c)) {
                    return i12;
                }
                yk ykVar = new yk();
                yk.a(ykVar, this.f21382n);
                this.f21369a.a(str, ykVar);
                return i12;
            }
            i12 = i13;
            long j13 = this.f21383o;
            if (j13 <= 0 && j13 != -1) {
                return i12;
            }
            f();
            a(pmVar, false);
            return read(bArr, i10, i11);
        } catch (Throwable th) {
            if ((this.f21380l == this.f21370b) || (th instanceof dg.a)) {
                this.f21385q = true;
            }
            throw th;
        }
    }
}
