package com.applovin.exoplayer2.h;

import android.net.Uri;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class t implements com.applovin.exoplayer2.e.j, n, w.c, com.applovin.exoplayer2.k.w.a<a>, com.applovin.exoplayer2.k.w.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f6619b = t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.applovin.exoplayer2.v f6620c = new com.applovin.exoplayer2.v.a().a("icy").f("application/x-icy").a();
    private e A;
    private com.applovin.exoplayer2.e.v B;
    private boolean D;
    private boolean F;
    private boolean G;
    private int H;
    private long J;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f6621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f6622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.h f6623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f6624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q.a f6625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.g.a f6626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f6627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f6628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f6629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f6630m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s f6632o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f6634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f6635r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n.a f6637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.g.d.b f6638u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6642y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6643z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.w f6631n = new com.applovin.exoplayer2.k.w("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f6633p = new com.applovin.exoplayer2.l.g();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f6636s = ai.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d[] f6640w = new d[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w[] f6639v = new w[0];
    private long K = -9223372036854775807L;
    private long I = -1;
    private long C = -9223372036854775807L;
    private int E = 1;

    public final class a implements i.a, com.applovin.exoplayer2.k.w.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f6646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.applovin.exoplayer2.k.z f6647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final s f6648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.j f6649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.g f6650g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f6652i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f6654k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.applovin.exoplayer2.e.x f6657n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f6658o;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.u f6651h = new com.applovin.exoplayer2.e.u();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f6653j = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f6656m = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6645b = j.a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.applovin.exoplayer2.k.l f6655l = a(0);

        public a(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.e.j jVar, com.applovin.exoplayer2.l.g gVar) {
            this.f6646c = uri;
            this.f6647d = new com.applovin.exoplayer2.k.z(iVar);
            this.f6648e = sVar;
            this.f6649f = jVar;
            this.f6650g = gVar;
        }

        private com.applovin.exoplayer2.k.l a(long j10) {
            return new com.applovin.exoplayer2.k.l.a().a(this.f6646c).a(j10).b(t.this.f6629l).b(6).a(t.f6619b).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f6651h.f6134a = j10;
            this.f6654k = j11;
            this.f6653j = true;
            this.f6658o = false;
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void a() {
            this.f6652i = true;
        }

        @Override // com.applovin.exoplayer2.h.i.a
        public void a(com.applovin.exoplayer2.l.y yVar) {
            long jMax = !this.f6658o ? this.f6654k : Math.max(t.this.q(), this.f6654k);
            int iA = yVar.a();
            com.applovin.exoplayer2.e.x xVar = (com.applovin.exoplayer2.e.x) com.applovin.exoplayer2.l.a.b(this.f6657n);
            xVar.a(yVar, iA);
            xVar.a(jMax, 1, iA, 0, null);
            this.f6658o = true;
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void b() throws IOException {
            int iA = 0;
            while (iA == 0 && !this.f6652i) {
                try {
                    long j10 = this.f6651h.f6134a;
                    com.applovin.exoplayer2.k.l lVarA = a(j10);
                    this.f6655l = lVarA;
                    long jA = this.f6647d.a(lVarA);
                    this.f6656m = jA;
                    if (jA != -1) {
                        this.f6656m = jA + j10;
                    }
                    t.this.f6638u = com.applovin.exoplayer2.g.d.b.a(this.f6647d.b());
                    com.applovin.exoplayer2.k.g iVar = this.f6647d;
                    if (t.this.f6638u != null && t.this.f6638u.f6345f != -1) {
                        iVar = new i(this.f6647d, t.this.f6638u.f6345f, this);
                        com.applovin.exoplayer2.e.x xVarJ = t.this.j();
                        this.f6657n = xVarJ;
                        xVarJ.a(t.f6620c);
                    }
                    long jC = j10;
                    this.f6648e.a(iVar, this.f6646c, this.f6647d.b(), j10, this.f6656m, this.f6649f);
                    if (t.this.f6638u != null) {
                        this.f6648e.b();
                    }
                    if (this.f6653j) {
                        this.f6648e.a(jC, this.f6654k);
                        this.f6653j = false;
                    }
                    while (true) {
                        long j11 = jC;
                        while (true) {
                            if (iA != 0 || this.f6652i) {
                                break;
                            }
                            try {
                                this.f6650g.c();
                                iA = this.f6648e.a(this.f6651h);
                                jC = this.f6648e.c();
                                if (jC > t.this.f6630m + j11) {
                                    this.f6650g.b();
                                    t.this.f6636s.post(t.this.f6635r);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (this.f6648e.c() != -1) {
                        this.f6651h.f6134a = this.f6648e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f6647d);
                } catch (Throwable th) {
                    if (iA != 1 && this.f6648e.c() != -1) {
                        this.f6651h.f6134a = this.f6648e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f6647d);
                    throw th;
                }
            }
        }
    }

    public interface b {
        void a(long j10, boolean z10, boolean z11);
    }

    public final class c implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6660b;

        public c(int i10) {
            this.f6660b = i10;
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j10) {
            return t.this.a(this.f6660b, j10);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
            return t.this.a(this.f6660b, wVar, gVar, i10);
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            return t.this.a(this.f6660b);
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            t.this.b(this.f6660b);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6662b;

        public d(int i10, boolean z10) {
            this.f6661a = i10;
            this.f6662b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f6661a == dVar.f6661a && this.f6662b == dVar.f6662b;
        }

        public int hashCode() {
            return (this.f6661a * 31) + (this.f6662b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ad f6663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f6664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f6665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f6666d;

        public e(ad adVar, boolean[] zArr) {
            this.f6663a = adVar;
            this.f6664b = zArr;
            int i10 = adVar.f6511b;
            this.f6665c = new boolean[i10];
            this.f6666d = new boolean[i10];
        }
    }

    public t(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.d.g.a aVar, com.applovin.exoplayer2.k.v vVar, q.a aVar2, b bVar, com.applovin.exoplayer2.k.b bVar2, String str, int i10) {
        this.f6621d = uri;
        this.f6622e = iVar;
        this.f6623f = hVar;
        this.f6626i = aVar;
        this.f6624g = vVar;
        this.f6625h = aVar2;
        this.f6627j = bVar;
        this.f6628k = bVar2;
        this.f6629l = str;
        this.f6630m = i10;
        this.f6632o = sVar;
        final int i11 = 0;
        this.f6634q = new Runnable(this) { // from class: com.applovin.exoplayer2.h.e0

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ t f6552d;

            {
                this.f6552d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f6552d.n();
                        break;
                    default:
                        this.f6552d.u();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f6635r = new Runnable(this) { // from class: com.applovin.exoplayer2.h.e0

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ t f6552d;

            {
                this.f6552d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f6552d.n();
                        break;
                    default:
                        this.f6552d.u();
                        break;
                }
            }
        };
    }

    private com.applovin.exoplayer2.e.x a(d dVar) {
        int length = this.f6639v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f6640w[i10])) {
                return this.f6639v[i10];
            }
        }
        w wVarA = w.a(this.f6628k, this.f6636s.getLooper(), this.f6623f, this.f6626i);
        wVarA.a(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f6640w, i11);
        dVarArr[length] = dVar;
        this.f6640w = (d[]) ai.a((Object[]) dVarArr);
        w[] wVarArr = (w[]) Arrays.copyOf(this.f6639v, i11);
        wVarArr[length] = wVarA;
        this.f6639v = (w[]) ai.a((Object[]) wVarArr);
        return wVarA;
    }

    private void a(a aVar) {
        if (this.I == -1) {
            this.I = aVar.f6656m;
        }
    }

    private boolean a(a aVar, int i10) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.I != -1 || ((vVar = this.B) != null && vVar.b() != -9223372036854775807L)) {
            this.M = i10;
            return true;
        }
        if (this.f6642y && !m()) {
            this.L = true;
            return false;
        }
        this.G = this.f6642y;
        this.J = 0L;
        this.M = 0;
        for (w wVar : this.f6639v) {
            wVar.b();
        }
        aVar.a(0L, 0L);
        return true;
    }

    private boolean a(boolean[] zArr, long j10) {
        int length = this.f6639v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f6639v[i10].a(j10, false) && (zArr[i10] || !this.f6643z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(com.applovin.exoplayer2.e.v vVar) {
        this.B = this.f6638u == null ? vVar : new com.applovin.exoplayer2.e.v.b(-9223372036854775807L);
        this.C = vVar.b();
        boolean z10 = this.I == -1 && vVar.b() == -9223372036854775807L;
        this.D = z10;
        this.E = z10 ? 7 : 1;
        this.f6627j.a(this.C, vVar.a(), this.D);
        if (this.f6642y) {
            return;
        }
        n();
    }

    private void c(int i10) {
        s();
        e eVar = this.A;
        boolean[] zArr = eVar.f6666d;
        if (zArr[i10]) {
            return;
        }
        com.applovin.exoplayer2.v vVarA = eVar.f6663a.a(i10).a(0);
        this.f6625h.a(com.applovin.exoplayer2.l.u.e(vVarA.f8198l), vVarA, 0, (Object) null, this.J);
        zArr[i10] = true;
    }

    private void d(int i10) {
        s();
        boolean[] zArr = this.A.f6664b;
        if (this.L && zArr[i10]) {
            if (this.f6639v[i10].b(false)) {
                return;
            }
            this.K = 0L;
            this.L = false;
            this.G = true;
            this.J = 0L;
            this.M = 0;
            for (w wVar : this.f6639v) {
                wVar.b();
            }
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f6637t)).a(this);
        }
    }

    private boolean m() {
        return this.G || r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.O || this.f6642y || !this.f6641x || this.B == null) {
            return;
        }
        for (w wVar : this.f6639v) {
            if (wVar.g() == null) {
                return;
            }
        }
        this.f6633p.b();
        int length = this.f6639v.length;
        ac[] acVarArr = new ac[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            com.applovin.exoplayer2.v vVarA = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.f6639v[i10].g());
            String str = vVarA.f8198l;
            boolean zA = com.applovin.exoplayer2.l.u.a(str);
            boolean z10 = zA || com.applovin.exoplayer2.l.u.b(str);
            zArr[i10] = z10;
            this.f6643z = z10 | this.f6643z;
            com.applovin.exoplayer2.g.d.b bVar = this.f6638u;
            if (bVar != null) {
                if (zA || this.f6640w[i10].f6662b) {
                    com.applovin.exoplayer2.g.a aVar = vVarA.f8196j;
                    vVarA = vVarA.a().a(aVar == null ? new com.applovin.exoplayer2.g.a(bVar) : aVar.a(bVar)).a();
                }
                if (zA && vVarA.f8192f == -1 && vVarA.f8193g == -1 && bVar.f6340a != -1) {
                    vVarA = vVarA.a().d(bVar.f6340a).a();
                }
            }
            acVarArr[i10] = new ac(vVarA.a(this.f6623f.a(vVarA)));
        }
        this.A = new e(new ad(acVarArr), zArr);
        this.f6642y = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f6637t)).a((n) this);
    }

    private void o() {
        a aVar = new a(this.f6621d, this.f6622e, this.f6632o, this, this.f6633p);
        if (this.f6642y) {
            com.applovin.exoplayer2.l.a.b(r());
            long j10 = this.C;
            if (j10 != -9223372036854775807L && this.K > j10) {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
            aVar.a(((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.b(this.B)).a(this.K).f6135a.f6141c, this.K);
            for (w wVar : this.f6639v) {
                wVar.a(this.K);
            }
            this.K = -9223372036854775807L;
        }
        this.M = p();
        this.f6625h.a(new j(aVar.f6645b, aVar.f6655l, this.f6631n.a(aVar, this, this.f6624g.a(this.E))), 1, -1, null, 0, null, aVar.f6654k, this.C);
    }

    private int p() {
        int iC = 0;
        for (w wVar : this.f6639v) {
            iC += wVar.c();
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        long jMax = Long.MIN_VALUE;
        for (w wVar : this.f6639v) {
            jMax = Math.max(jMax, wVar.h());
        }
        return jMax;
    }

    private boolean r() {
        return this.K != -9223372036854775807L;
    }

    private void s() {
        com.applovin.exoplayer2.l.a.b(this.f6642y);
        com.applovin.exoplayer2.l.a.b(this.A);
        com.applovin.exoplayer2.l.a.b(this.B);
    }

    private static Map<String, String> t() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (this.O) {
            return;
        }
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f6637t)).a(this);
    }

    public int a(int i10, long j10) {
        if (m()) {
            return 0;
        }
        c(i10);
        w wVar = this.f6639v[i10];
        int iB = wVar.b(j10, this.N);
        wVar.a(iB);
        if (iB == 0) {
            d(i10);
        }
        return iB;
    }

    public int a(int i10, com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i11) {
        if (m()) {
            return -3;
        }
        c(i10);
        int iA = this.f6639v[i10].a(wVar, gVar, i11, this.N);
        if (iA == -3) {
            d(i10);
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        s();
        if (!this.B.a()) {
            return 0L;
        }
        com.applovin.exoplayer2.e.v.a aVarA = this.B.a(j10);
        return avVar.a(j10, aVarA.f6135a.f6140b, aVarA.f6136b.f6140b);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j10) {
        s();
        e eVar = this.A;
        ad adVar = eVar.f6663a;
        boolean[] zArr3 = eVar.f6665c;
        int i10 = this.H;
        int i11 = 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            if (xVarArr[i12] != null && (dVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) xVarArr[i12]).f6660b;
                com.applovin.exoplayer2.l.a.b(zArr3[i13]);
                this.H--;
                zArr3[i13] = false;
                xVarArr[i12] = null;
            }
        }
        boolean z10 = !this.F ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < dVarArr.length; i14++) {
            if (xVarArr[i14] == null && dVarArr[i14] != null) {
                com.applovin.exoplayer2.j.d dVar = dVarArr[i14];
                com.applovin.exoplayer2.l.a.b(dVar.e() == 1);
                com.applovin.exoplayer2.l.a.b(dVar.b(0) == 0);
                int iA = adVar.a(dVar.d());
                com.applovin.exoplayer2.l.a.b(!zArr3[iA]);
                this.H++;
                zArr3[iA] = true;
                xVarArr[i14] = new c(iA);
                zArr2[i14] = true;
                if (!z10) {
                    w wVar = this.f6639v[iA];
                    z10 = (wVar.a(j10, true) || wVar.f() == 0) ? false : true;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.G = false;
            if (this.f6631n.c()) {
                w[] wVarArr = this.f6639v;
                int length = wVarArr.length;
                while (i11 < length) {
                    wVarArr[i11].k();
                    i11++;
                }
                this.f6631n.d();
            } else {
                w[] wVarArr2 = this.f6639v;
                int length2 = wVarArr2.length;
                while (i11 < length2) {
                    wVarArr2[i11].b();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = b(j10);
            while (i11 < xVarArr.length) {
                if (xVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.F = true;
        return j10;
    }

    @Override // com.applovin.exoplayer2.e.j
    public com.applovin.exoplayer2.e.x a(int i10, int i11) {
        return a(new d(i10, false));
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public com.applovin.exoplayer2.k.w.b a(a aVar, long j10, long j11, IOException iOException, int i10) {
        com.applovin.exoplayer2.k.w.b bVarA;
        a(aVar);
        com.applovin.exoplayer2.k.z zVar = aVar.f6647d;
        j jVar = new j(aVar.f6645b, aVar.f6655l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        long jA = this.f6624g.a(new com.applovin.exoplayer2.k.v.a(jVar, new m(1, -1, null, 0, null, com.applovin.exoplayer2.h.a(aVar.f6654k), com.applovin.exoplayer2.h.a(this.C)), iOException, i10));
        if (jA == -9223372036854775807L) {
            bVarA = com.applovin.exoplayer2.k.w.f7513d;
        } else {
            int iP = p();
            bVarA = a(aVar, iP) ? com.applovin.exoplayer2.k.w.a(iP > this.M, jA) : com.applovin.exoplayer2.k.w.f7512c;
        }
        boolean z10 = !bVarA.a();
        this.f6625h.a(jVar, 1, -1, null, 0, null, aVar.f6654k, this.C, iOException, z10);
        if (z10) {
            this.f6624g.a(aVar.f6645b);
        }
        return bVarA;
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.f6641x = true;
        this.f6636s.post(this.f6634q);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        s();
        if (r()) {
            return;
        }
        boolean[] zArr = this.A.f6665c;
        int length = this.f6639v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f6639v[i10].a(j10, z10, zArr[i10]);
        }
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final com.applovin.exoplayer2.e.v vVar) {
        this.f6636s.post(new Runnable() { // from class: com.applovin.exoplayer2.h.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6561c.c(vVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f6637t = aVar;
        this.f6633p.a();
        o();
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j10, long j11) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.C == -9223372036854775807L && (vVar = this.B) != null) {
            boolean zA = vVar.a();
            long jQ = q();
            long j12 = jQ == Long.MIN_VALUE ? 0L : jQ + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.C = j12;
            this.f6627j.a(j12, zA, this.D);
        }
        com.applovin.exoplayer2.k.z zVar = aVar.f6647d;
        j jVar = new j(aVar.f6645b, aVar.f6655l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        this.f6624g.a(aVar.f6645b);
        this.f6625h.b(jVar, 1, -1, null, 0, null, aVar.f6654k, this.C);
        a(aVar);
        this.N = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f6637t)).a(this);
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j10, long j11, boolean z10) {
        com.applovin.exoplayer2.k.z zVar = aVar.f6647d;
        j jVar = new j(aVar.f6645b, aVar.f6655l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        this.f6624g.a(aVar.f6645b);
        this.f6625h.c(jVar, 1, -1, null, 0, null, aVar.f6654k, this.C);
        if (z10) {
            return;
        }
        a(aVar);
        for (w wVar : this.f6639v) {
            wVar.b();
        }
        if (this.H > 0) {
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f6637t)).a(this);
        }
    }

    @Override // com.applovin.exoplayer2.h.w.c
    public void a(com.applovin.exoplayer2.v vVar) {
        this.f6636s.post(this.f6634q);
    }

    public boolean a(int i10) {
        return !m() && this.f6639v[i10].b(this.N);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j10) {
        s();
        boolean[] zArr = this.A.f6664b;
        if (!this.B.a()) {
            j10 = 0;
        }
        int i10 = 0;
        this.G = false;
        this.J = j10;
        if (r()) {
            this.K = j10;
            return j10;
        }
        if (this.E != 7 && a(zArr, j10)) {
            return j10;
        }
        this.L = false;
        this.K = j10;
        this.N = false;
        if (this.f6631n.c()) {
            w[] wVarArr = this.f6639v;
            int length = wVarArr.length;
            while (i10 < length) {
                wVarArr[i10].k();
                i10++;
            }
            this.f6631n.d();
        } else {
            this.f6631n.b();
            w[] wVarArr2 = this.f6639v;
            int length2 = wVarArr2.length;
            while (i10 < length2) {
                wVarArr2[i10].b();
                i10++;
            }
        }
        return j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        s();
        return this.A.f6663a;
    }

    public void b(int i10) throws IOException {
        this.f6639v[i10].e();
        i();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.N && p() <= this.M) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.J;
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        if (this.N || this.f6631n.a() || this.L) {
            return false;
        }
        if (this.f6642y && this.H == 0) {
            return false;
        }
        boolean zA = this.f6633p.a();
        if (this.f6631n.c()) {
            return zA;
        }
        o();
        return true;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long jQ;
        s();
        boolean[] zArr = this.A.f6664b;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.K;
        }
        if (this.f6643z) {
            int length = this.f6639v.length;
            jQ = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f6639v[i10].j()) {
                    jQ = Math.min(jQ, this.f6639v[i10].h());
                }
            }
        } else {
            jQ = Long.MAX_VALUE;
        }
        if (jQ == RecyclerView.FOREVER_NS) {
            jQ = q();
        }
        return jQ == Long.MIN_VALUE ? this.J : jQ;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        if (this.H == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        i();
        if (this.N && !this.f6642y) {
            throw com.applovin.exoplayer2.ai.b("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.f6631n.c() && this.f6633p.e();
    }

    public void g() {
        if (this.f6642y) {
            for (w wVar : this.f6639v) {
                wVar.d();
            }
        }
        this.f6631n.a(this);
        this.f6636s.removeCallbacksAndMessages(null);
        this.f6637t = null;
        this.O = true;
    }

    @Override // com.applovin.exoplayer2.k.w.e
    public void h() {
        for (w wVar : this.f6639v) {
            wVar.a();
        }
        this.f6632o.a();
    }

    public void i() throws IOException {
        this.f6631n.a(this.f6624g.a(this.E));
    }

    public com.applovin.exoplayer2.e.x j() {
        return a(new d(0, true));
    }
}
