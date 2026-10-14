package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.embedded.guava.collect.m0;
import com.yandex.mobile.ads.embedded.guava.collect.q0;
import com.yandex.mobile.ads.impl.cg;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.ew;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.te0;
import com.yandex.mobile.ads.impl.u80;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.yv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.yandex.mobile.ads.exo.drm.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f18449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.c f18450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f18451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f18452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f18454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f18456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u80 f18457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f18458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f18459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f18460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<e> f18461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<com.yandex.mobile.ads.exo.drm.b> f18462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f18464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.yandex.mobile.ads.exo.drm.b f18465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.yandex.mobile.ads.exo.drm.b f18466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f18467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f18468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f18470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private gr0 f18471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile HandlerC0193c f18472y;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18476d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18478f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f18473a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f18474b = cg.f19501d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.c f18475c = n.f18507e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private eo f18479g = new eo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f18477e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f18480h = 300000;

        public final a a(UUID uuid, m.c cVar) {
            Objects.requireNonNull(uuid);
            this.f18474b = uuid;
            Objects.requireNonNull(cVar);
            this.f18475c = cVar;
            return this;
        }

        public final a a(boolean z10) {
            this.f18476d = z10;
            return this;
        }

        public final a a(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                pa.a(z10);
            }
            this.f18477e = (int[]) iArr.clone();
            return this;
        }

        public final c a(o oVar) {
            return new c(this.f18474b, this.f18475c, oVar, this.f18473a, this.f18476d, this.f18477e, this.f18478f, this.f18479g, this.f18480h, 0);
        }

        public final a b(boolean z10) {
            this.f18478f = z10;
            return this;
        }
    }

    public class b implements m.b {
        private b() {
        }

        public /* synthetic */ b(c cVar, int i10) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.yandex.mobile.ads.exo.drm.c$c, reason: collision with other inner class name */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC0193c extends Handler {
        public HandlerC0193c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.yandex.mobile.ads.exo.drm.b bVar : c.this.f18460m) {
                if (bVar.a(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }

        public /* synthetic */ d(UUID uuid, int i10) {
            this(uuid);
        }
    }

    public class e implements com.yandex.mobile.ads.exo.drm.g.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.exo.drm.f.a f18483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.yandex.mobile.ads.exo.drm.e f18484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18485d;

        public e(com.yandex.mobile.ads.exo.drm.f.a aVar) {
            this.f18483b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f18485d) {
                return;
            }
            com.yandex.mobile.ads.exo.drm.e eVar = this.f18484c;
            if (eVar != null) {
                eVar.a(this.f18483b);
            }
            c.this.f18461n.remove(this);
            this.f18485d = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yv yvVar) {
            if (c.this.f18463p == 0 || this.f18485d) {
                return;
            }
            c cVar = c.this;
            Looper looper = cVar.f18467t;
            Objects.requireNonNull(looper);
            this.f18484c = c.a(cVar, looper, this.f18483b, yvVar);
            c.this.f18461n.add(this);
        }

        public final void a(yv yvVar) {
            Handler handler = c.this.f18468u;
            Objects.requireNonNull(handler);
            handler.post(new r(this, yvVar));
        }

        @Override // com.yandex.mobile.ads.exo.drm.g.b
        public final void release() {
            Handler handler = c.this.f18468u;
            Objects.requireNonNull(handler);
            da1.a(handler, (Runnable) new q(this));
        }
    }

    public class f implements com.yandex.mobile.ads.exo.drm.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashSet f18487a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.yandex.mobile.ads.exo.drm.b f18488b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            this.f18488b = null;
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) this.f18487a);
            this.f18487a.clear();
            q0 q0VarListIterator = pVarA.listIterator(0);
            while (q0VarListIterator.hasNext()) {
                ((com.yandex.mobile.ads.exo.drm.b) q0VarListIterator.next()).a();
            }
        }

        public final void a(com.yandex.mobile.ads.exo.drm.b bVar) {
            this.f18487a.remove(bVar);
            if (this.f18488b == bVar) {
                this.f18488b = null;
                if (this.f18487a.isEmpty()) {
                    return;
                }
                com.yandex.mobile.ads.exo.drm.b bVar2 = (com.yandex.mobile.ads.exo.drm.b) this.f18487a.iterator().next();
                this.f18488b = bVar2;
                bVar2.i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z10) {
            this.f18488b = null;
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) this.f18487a);
            this.f18487a.clear();
            q0 q0VarListIterator = pVarA.listIterator(0);
            while (q0VarListIterator.hasNext()) {
                ((com.yandex.mobile.ads.exo.drm.b) q0VarListIterator.next()).a(exc, z10);
            }
        }

        public final void b(com.yandex.mobile.ads.exo.drm.b bVar) {
            this.f18487a.add(bVar);
            if (this.f18488b != null) {
                return;
            }
            this.f18488b = bVar;
            bVar.i();
        }
    }

    public class g implements com.yandex.mobile.ads.exo.drm.b.InterfaceC0192b {
        private g() {
        }

        public /* synthetic */ g(c cVar, int i10) {
            this();
        }

        public final void a(com.yandex.mobile.ads.exo.drm.b bVar, int i10) {
            if (i10 == 1 && c.this.f18463p > 0 && c.this.f18459l != -9223372036854775807L) {
                c.this.f18462o.add(bVar);
                Handler handler = c.this.f18468u;
                Objects.requireNonNull(handler);
                handler.postAtTime(new q(bVar), bVar, c.this.f18459l + SystemClock.uptimeMillis());
            } else if (i10 == 0) {
                c.this.f18460m.remove(bVar);
                if (c.this.f18465r == bVar) {
                    c.this.f18465r = null;
                }
                if (c.this.f18466s == bVar) {
                    c.this.f18466s = null;
                }
                c.this.f18456i.a(bVar);
                if (c.this.f18459l != -9223372036854775807L) {
                    Handler handler2 = c.this.f18468u;
                    Objects.requireNonNull(handler2);
                    handler2.removeCallbacksAndMessages(bVar);
                    c.this.f18462o.remove(bVar);
                }
            }
            c.d(c.this);
        }
    }

    private c(UUID uuid, m.c cVar, o oVar, HashMap map, boolean z10, int[] iArr, boolean z11, eo eoVar, long j10) {
        pa.a(uuid);
        pa.a("Use C.CLEARKEY_UUID instead", !cg.f19499b.equals(uuid));
        this.f18449b = uuid;
        this.f18450c = cVar;
        this.f18451d = oVar;
        this.f18452e = map;
        this.f18453f = z10;
        this.f18454g = iArr;
        this.f18455h = z11;
        this.f18457j = eoVar;
        this.f18456i = new f();
        this.f18458k = new g(this, 0);
        this.f18469v = 0;
        this.f18460m = new ArrayList();
        this.f18461n = m0.a();
        this.f18462o = m0.a();
        this.f18459l = j10;
    }

    public /* synthetic */ c(UUID uuid, m.c cVar, o oVar, HashMap map, boolean z10, int[] iArr, boolean z11, eo eoVar, long j10, int i10) {
        this(uuid, cVar, oVar, map, z10, iArr, z11, eoVar, j10);
    }

    private com.yandex.mobile.ads.exo.drm.b a(List<DrmInitData.SchemeData> list, boolean z10, com.yandex.mobile.ads.exo.drm.f.a aVar) {
        Objects.requireNonNull(this.f18464q);
        boolean z11 = this.f18455h | z10;
        UUID uuid = this.f18449b;
        m mVar = this.f18464q;
        f fVar = this.f18456i;
        g gVar = this.f18458k;
        int i10 = this.f18469v;
        byte[] bArr = this.f18470w;
        HashMap<String, String> map = this.f18452e;
        p pVar = this.f18451d;
        Looper looper = this.f18467t;
        Objects.requireNonNull(looper);
        u80 u80Var = this.f18457j;
        gr0 gr0Var = this.f18471x;
        Objects.requireNonNull(gr0Var);
        com.yandex.mobile.ads.exo.drm.b bVar = new com.yandex.mobile.ads.exo.drm.b(uuid, mVar, fVar, gVar, list, i10, z11, z10, bArr, map, pVar, looper, u80Var, gr0Var);
        bVar.b(aVar);
        if (this.f18459l != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0186  */
    /* JADX WARN: Code duplicated, block: B:134:0x0200  */
    /* JADX WARN: Code duplicated, block: B:153:0x024f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    private com.yandex.mobile.ads.exo.drm.e a(Looper looper, com.yandex.mobile.ads.exo.drm.f.a aVar, yv yvVar, boolean z10) {
        ArrayList arrayList;
        com.yandex.mobile.ads.exo.drm.b bVarA;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f18472y == null) {
            this.f18472y = new HandlerC0193c(looper);
        }
        DrmInitData drmInitData = yvVar.f27118o;
        int i10 = 0;
        boolean z14 = true;
        if (drmInitData == null) {
            int iA = te0.a(yvVar.f27115l);
            m mVar = this.f18464q;
            Objects.requireNonNull(mVar);
            if (mVar.b() == 2 && ew.f20343d) {
                return null;
            }
            int[] iArr = this.f18454g;
            int i11 = 0;
            while (true) {
                if (i11 >= iArr.length) {
                    i11 = -1;
                    break;
                }
                if (iArr[i11] == iA) {
                    break;
                }
                i11++;
            }
            if (i11 == -1 || mVar.b() == 1) {
                return null;
            }
            com.yandex.mobile.ads.exo.drm.b bVar = this.f18465r;
            if (bVar == null) {
                List<DrmInitData.SchemeData> listI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
                com.yandex.mobile.ads.exo.drm.b bVarA2 = a(listI, true, null);
                if (bVarA2.c() != 1) {
                    z13 = false;
                } else {
                    if (da1.f19803a >= 19) {
                        com.yandex.mobile.ads.exo.drm.e.a aVarG = bVarA2.g();
                        Objects.requireNonNull(aVarG);
                        if (!(aVarG.getCause() instanceof ResourceBusyException)) {
                            z13 = false;
                        }
                    }
                    z13 = true;
                }
                if (z13 && !this.f18462o.isEmpty()) {
                    Iterator itG = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18462o).iterator();
                    while (itG.hasNext()) {
                        ((com.yandex.mobile.ads.exo.drm.e) itG.next()).a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    }
                    bVarA2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    if (this.f18459l != -9223372036854775807L) {
                        bVarA2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    }
                    bVarA2 = a(listI, true, null);
                }
                if (bVarA2.c() == 1) {
                    if (da1.f19803a >= 19) {
                        com.yandex.mobile.ads.exo.drm.e.a aVarG2 = bVarA2.g();
                        Objects.requireNonNull(aVarG2);
                        if (aVarG2.getCause() instanceof ResourceBusyException) {
                            i10 = 1;
                        }
                    } else {
                        i10 = 1;
                    }
                }
                if (i10 != 0 && z10 && !this.f18461n.isEmpty()) {
                    Iterator itG2 = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18461n).iterator();
                    while (itG2.hasNext()) {
                        ((e) itG2.next()).release();
                    }
                    if (!this.f18462o.isEmpty()) {
                        Iterator itG3 = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18462o).iterator();
                        while (itG3.hasNext()) {
                            ((com.yandex.mobile.ads.exo.drm.e) itG3.next()).a((com.yandex.mobile.ads.exo.drm.f.a) null);
                        }
                    }
                    bVarA2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    if (this.f18459l != -9223372036854775807L) {
                        bVarA2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    }
                    bVarA2 = a(listI, true, null);
                }
                this.f18460m.add(bVarA2);
                this.f18465r = bVarA2;
            } else {
                bVar.b(null);
            }
            return this.f18465r;
        }
        if (this.f18470w == null) {
            UUID uuid = this.f18449b;
            arrayList = new ArrayList(drmInitData.f18412d);
            for (int i12 = 0; i12 < drmInitData.f18412d; i12++) {
                DrmInitData.SchemeData schemeDataA = drmInitData.a(i12);
                Objects.requireNonNull(schemeDataA);
                UUID uuid2 = cg.f19498a;
                if (!(uuid2.equals(schemeDataA.f18414b) || uuid.equals(schemeDataA.f18414b))) {
                    if (cg.f19500c.equals(uuid)) {
                        z12 = uuid2.equals(schemeDataA.f18414b) || cg.f19499b.equals(schemeDataA.f18414b);
                    }
                }
                if (z12 && schemeDataA.f18417e != null) {
                    arrayList.add(schemeDataA);
                }
            }
            if (arrayList.isEmpty()) {
                d dVar = new d(this.f18449b, i10);
                p90.a("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new l(new com.yandex.mobile.ads.exo.drm.e.a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayList = null;
        }
        if (this.f18453f) {
            Iterator it = this.f18460m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVarA = null;
                    break;
                }
                com.yandex.mobile.ads.exo.drm.b bVar2 = (com.yandex.mobile.ads.exo.drm.b) it.next();
                if (da1.a(bVar2.f18418a, arrayList)) {
                    bVarA = bVar2;
                    break;
                }
            }
        } else {
            bVarA = this.f18466s;
        }
        if (bVarA == null) {
            bVarA = a(arrayList, false, aVar);
            if (bVarA.c() != 1) {
                z11 = false;
            } else {
                if (da1.f19803a >= 19) {
                    com.yandex.mobile.ads.exo.drm.e.a aVarG3 = bVarA.g();
                    Objects.requireNonNull(aVarG3);
                    if (!(aVarG3.getCause() instanceof ResourceBusyException)) {
                        z11 = false;
                    }
                }
                z11 = true;
            }
            if (z11 && !this.f18462o.isEmpty()) {
                Iterator itG4 = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18462o).iterator();
                while (itG4.hasNext()) {
                    ((com.yandex.mobile.ads.exo.drm.e) itG4.next()).a((com.yandex.mobile.ads.exo.drm.f.a) null);
                }
                bVarA.a(aVar);
                if (this.f18459l != -9223372036854775807L) {
                    bVarA.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                }
                bVarA = a(arrayList, false, aVar);
            }
            if (bVarA.c() != 1) {
                z14 = false;
            } else if (da1.f19803a >= 19) {
                com.yandex.mobile.ads.exo.drm.e.a aVarG4 = bVarA.g();
                Objects.requireNonNull(aVarG4);
                if (!(aVarG4.getCause() instanceof ResourceBusyException)) {
                    z14 = false;
                }
            }
            if (z14 && z10 && !this.f18461n.isEmpty()) {
                Iterator itG5 = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18461n).iterator();
                while (itG5.hasNext()) {
                    ((e) itG5.next()).release();
                }
                if (!this.f18462o.isEmpty()) {
                    Iterator itG6 = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18462o).iterator();
                    while (itG6.hasNext()) {
                        ((com.yandex.mobile.ads.exo.drm.e) itG6.next()).a((com.yandex.mobile.ads.exo.drm.f.a) null);
                    }
                }
                bVarA.a(aVar);
                if (this.f18459l != -9223372036854775807L) {
                    bVarA.a((com.yandex.mobile.ads.exo.drm.f.a) null);
                }
                bVarA = a(arrayList, false, aVar);
            }
            if (!this.f18453f) {
                this.f18466s = bVarA;
            }
            this.f18460m.add(bVarA);
        } else {
            bVarA.b(aVar);
        }
        return bVarA;
    }

    public static /* synthetic */ com.yandex.mobile.ads.exo.drm.e a(c cVar, Looper looper, com.yandex.mobile.ads.exo.drm.f.a aVar, yv yvVar) {
        return cVar.a(looper, aVar, yvVar, false);
    }

    public static void d(c cVar) {
        if (cVar.f18464q != null && cVar.f18463p == 0 && cVar.f18460m.isEmpty() && cVar.f18461n.isEmpty()) {
            m mVar = cVar.f18464q;
            Objects.requireNonNull(mVar);
            mVar.release();
            cVar.f18464q = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.exo.drm.g
    public final int a(yv yvVar) {
        String str;
        boolean z10;
        m mVar = this.f18464q;
        Objects.requireNonNull(mVar);
        int iB = mVar.b();
        DrmInitData drmInitData = yvVar.f27118o;
        boolean z11 = false;
        if (drmInitData == null) {
            int iA = te0.a(yvVar.f27115l);
            int[] iArr = this.f18454g;
            int i10 = 0;
            while (i10 < iArr.length) {
                if (iArr[i10] == iA) {
                    if (i10 != -1) {
                        return iB;
                    }
                    return 0;
                }
                i10++;
            }
            i10 = -1;
            if (i10 != -1) {
                return iB;
            }
            return 0;
        }
        if (this.f18470w != null) {
            z11 = true;
        } else {
            UUID uuid = this.f18449b;
            ArrayList arrayList = new ArrayList(drmInitData.f18412d);
            for (int i11 = 0; i11 < drmInitData.f18412d; i11++) {
                DrmInitData.SchemeData schemeDataA = drmInitData.a(i11);
                Objects.requireNonNull(schemeDataA);
                UUID uuid2 = cg.f19498a;
                if (!(uuid2.equals(schemeDataA.f18414b) || uuid.equals(schemeDataA.f18414b))) {
                    if (cg.f19500c.equals(uuid)) {
                        z10 = uuid2.equals(schemeDataA.f18414b) || cg.f19499b.equals(schemeDataA.f18414b);
                    }
                }
                if (z10) {
                    arrayList.add(schemeDataA);
                }
            }
            if (!arrayList.isEmpty()) {
                str = drmInitData.f18411c;
                if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : da1.f19803a >= 25)) {
                    z11 = true;
                }
            } else if (drmInitData.f18412d == 1) {
                DrmInitData.SchemeData schemeDataA2 = drmInitData.a(0);
                UUID uuid3 = cg.f19499b;
                Objects.requireNonNull(schemeDataA2);
                if (cg.f19498a.equals(schemeDataA2.f18414b) || uuid3.equals(schemeDataA2.f18414b)) {
                    StringBuilder sbA = v60.a("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                    sbA.append(this.f18449b);
                    p90.d("DefaultDrmSessionMgr", sbA.toString());
                    str = drmInitData.f18411c;
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                }
            }
        }
        if (z11) {
            return iB;
        }
        return 1;
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final com.yandex.mobile.ads.exo.drm.e a(com.yandex.mobile.ads.exo.drm.f.a aVar, yv yvVar) {
        pa.b(this.f18463p > 0);
        pa.b(this.f18467t);
        return a(this.f18467t, aVar, yvVar, true);
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void a(Looper looper, gr0 gr0Var) {
        synchronized (this) {
            Looper looper2 = this.f18467t;
            if (looper2 == null) {
                this.f18467t = looper;
                this.f18468u = new Handler(looper);
            } else {
                pa.b(looper2 == looper);
                Objects.requireNonNull(this.f18468u);
            }
        }
        this.f18471x = gr0Var;
    }

    public final void a(byte[] bArr) {
        pa.b(this.f18460m.isEmpty());
        this.f18469v = 0;
        this.f18470w = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final com.yandex.mobile.ads.exo.drm.g.b b(com.yandex.mobile.ads.exo.drm.f.a aVar, yv yvVar) {
        pa.b(this.f18463p > 0);
        pa.b(this.f18467t);
        e eVar = new e(aVar);
        eVar.a(yvVar);
        return eVar;
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void prepare() {
        int i10 = this.f18463p;
        this.f18463p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        if (this.f18464q == null) {
            m mVarA = this.f18450c.a(this.f18449b);
            this.f18464q = mVarA;
            mVarA.a(new b(this, i11));
        } else if (this.f18459l != -9223372036854775807L) {
            while (i11 < this.f18460m.size()) {
                ((com.yandex.mobile.ads.exo.drm.b) this.f18460m.get(i11)).b(null);
                i11++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void release() {
        int i10 = this.f18463p - 1;
        this.f18463p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f18459l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f18460m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.yandex.mobile.ads.exo.drm.b) arrayList.get(i11)).a((com.yandex.mobile.ads.exo.drm.f.a) null);
            }
        }
        Iterator itG = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f18461n).iterator();
        while (itG.hasNext()) {
            ((e) itG.next()).release();
        }
        if (this.f18464q != null && this.f18463p == 0 && this.f18460m.isEmpty() && this.f18461n.isEmpty()) {
            m mVar = this.f18464q;
            Objects.requireNonNull(mVar);
            mVar.release();
            this.f18464q = null;
        }
    }
}
