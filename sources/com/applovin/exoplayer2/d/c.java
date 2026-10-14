package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile HandlerC0081c f5086a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UUID f5087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m.c f5088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f5089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f5090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f5092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f5093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f5094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f5095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g f5096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f5097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.d.b> f5098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<e> f5099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set<com.applovin.exoplayer2.d.b> f5100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private m f5102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.d.b f5103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.d.b f5104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Looper f5105v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Handler f5106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private byte[] f5108y;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5112d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5114f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f5109a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f5110b = com.applovin.exoplayer2.h.f6460d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.c f5111c = o.f5160a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.applovin.exoplayer2.k.v f5115g = new com.applovin.exoplayer2.k.r();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f5113e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5116h = 300000;

        public a a(UUID uuid, m.c cVar) {
            this.f5110b = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f5111c = (m.c) com.applovin.exoplayer2.l.a.b(cVar);
            return this;
        }

        public a a(boolean z10) {
            this.f5112d = z10;
            return this;
        }

        public a a(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                com.applovin.exoplayer2.l.a.a(z10);
            }
            this.f5113e = (int[]) iArr.clone();
            return this;
        }

        public c a(r rVar) {
            return new c(this.f5110b, this.f5111c, rVar, this.f5109a, this.f5112d, this.f5113e, this.f5114f, this.f5115g, this.f5116h);
        }

        public a b(boolean z10) {
            this.f5114f = z10;
            return this;
        }
    }

    public class b implements m.b {
        private b() {
        }

        @Override // com.applovin.exoplayer2.d.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((HandlerC0081c) com.applovin.exoplayer2.l.a.b(c.this.f5086a)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.c$c, reason: collision with other inner class name */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC0081c extends Handler {
        public HandlerC0081c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.applovin.exoplayer2.d.b bVar : c.this.f5098o) {
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
    }

    public class e implements h.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.d.g.a f5120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.d.f f5121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5122e;

        public e(com.applovin.exoplayer2.d.g.a aVar) {
            this.f5120c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f5122e) {
                return;
            }
            com.applovin.exoplayer2.d.f fVar = this.f5121d;
            if (fVar != null) {
                fVar.b(this.f5120c);
            }
            c.this.f5099p.remove(this);
            this.f5122e = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar) {
            if (c.this.f5101r == 0 || this.f5122e) {
                return;
            }
            c cVar = c.this;
            this.f5121d = cVar.a((Looper) com.applovin.exoplayer2.l.a.b(cVar.f5105v), this.f5120c, vVar, false);
            c.this.f5099p.add(this);
        }

        public void a(com.applovin.exoplayer2.v vVar) {
            ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f5106w)).post(new y(this, vVar));
        }

        @Override // com.applovin.exoplayer2.d.h.a
        public void release() {
            ai.a((Handler) com.applovin.exoplayer2.l.a.b(c.this.f5106w), (Runnable) new x(this));
        }
    }

    public class f implements com.applovin.exoplayer2.d.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<com.applovin.exoplayer2.d.b> f5124b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.d.b f5125c;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a() {
            this.f5125c = null;
            com.applovin.exoplayer2.common.a.s sVarA = com.applovin.exoplayer2.common.a.s.a((Collection) this.f5124b);
            this.f5124b.clear();
            ax it = sVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).b();
            }
        }

        @Override // com.applovin.exoplayer2.d.b.a
        public void a(com.applovin.exoplayer2.d.b bVar) {
            this.f5124b.add(bVar);
            if (this.f5125c != null) {
                return;
            }
            this.f5125c = bVar;
            bVar.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a(Exception exc, boolean z10) {
            this.f5125c = null;
            com.applovin.exoplayer2.common.a.s sVarA = com.applovin.exoplayer2.common.a.s.a((Collection) this.f5124b);
            this.f5124b.clear();
            ax it = sVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).a(exc, z10);
            }
        }

        public void b(com.applovin.exoplayer2.d.b bVar) {
            this.f5124b.remove(bVar);
            if (this.f5125c == bVar) {
                this.f5125c = null;
                if (this.f5124b.isEmpty()) {
                    return;
                }
                com.applovin.exoplayer2.d.b next = this.f5124b.iterator().next();
                this.f5125c = next;
                next.a();
            }
        }
    }

    public class g implements com.applovin.exoplayer2.d.b.InterfaceC0080b {
        private g() {
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0080b
        public void a(com.applovin.exoplayer2.d.b bVar, int i10) {
            if (c.this.f5097n != -9223372036854775807L) {
                c.this.f5100q.remove(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f5106w)).removeCallbacksAndMessages(bVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0080b
        public void b(com.applovin.exoplayer2.d.b bVar, int i10) {
            if (i10 == 1 && c.this.f5101r > 0 && c.this.f5097n != -9223372036854775807L) {
                c.this.f5100q.add(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f5106w)).postAtTime(new x(bVar), bVar, c.this.f5097n + SystemClock.uptimeMillis());
            } else if (i10 == 0) {
                c.this.f5098o.remove(bVar);
                if (c.this.f5103t == bVar) {
                    c.this.f5103t = null;
                }
                if (c.this.f5104u == bVar) {
                    c.this.f5104u = null;
                }
                c.this.f5094k.b(bVar);
                if (c.this.f5097n != -9223372036854775807L) {
                    ((Handler) com.applovin.exoplayer2.l.a.b(c.this.f5106w)).removeCallbacksAndMessages(bVar);
                    c.this.f5100q.remove(bVar);
                }
            }
            c.this.e();
        }
    }

    private c(UUID uuid, m.c cVar, r rVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, com.applovin.exoplayer2.k.v vVar, long j10) {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.f6458b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5087d = uuid;
        this.f5088e = cVar;
        this.f5089f = rVar;
        this.f5090g = map;
        this.f5091h = z10;
        this.f5092i = iArr;
        this.f5093j = z11;
        this.f5095l = vVar;
        this.f5094k = new f();
        this.f5096m = new g();
        this.f5107x = 0;
        this.f5098o = new ArrayList();
        this.f5099p = aq.b();
        this.f5100q = aq.b();
        this.f5097n = j10;
    }

    private com.applovin.exoplayer2.d.b a(List<com.applovin.exoplayer2.d.e.a> list, boolean z10, com.applovin.exoplayer2.d.g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f5102s);
        com.applovin.exoplayer2.d.b bVar = new com.applovin.exoplayer2.d.b(this.f5087d, this.f5102s, this.f5094k, this.f5096m, list, this.f5107x, this.f5093j | z10, z10, this.f5108y, this.f5090g, this.f5089f, (Looper) com.applovin.exoplayer2.l.a.b(this.f5105v), this.f5095l);
        bVar.a(aVar);
        if (this.f5097n != -9223372036854775807L) {
            bVar.a((com.applovin.exoplayer2.d.g.a) null);
        }
        return bVar;
    }

    private com.applovin.exoplayer2.d.b a(List<com.applovin.exoplayer2.d.e.a> list, boolean z10, com.applovin.exoplayer2.d.g.a aVar, boolean z11) {
        com.applovin.exoplayer2.d.b bVarA = a(list, z10, aVar);
        if (a(bVarA) && !this.f5100q.isEmpty()) {
            c();
            a(bVarA, aVar);
            bVarA = a(list, z10, aVar);
        }
        if (!a(bVarA) || !z11 || this.f5099p.isEmpty()) {
            return bVarA;
        }
        d();
        if (!this.f5100q.isEmpty()) {
            c();
        }
        a(bVarA, aVar);
        return a(list, z10, aVar);
    }

    private com.applovin.exoplayer2.d.f a(int i10, boolean z10) {
        m mVar = (m) com.applovin.exoplayer2.l.a.b(this.f5102s);
        if ((mVar.d() == 2 && n.f5156a) || ai.a(this.f5092i, i10) == -1 || mVar.d() == 1) {
            return null;
        }
        com.applovin.exoplayer2.d.b bVar = this.f5103t;
        if (bVar == null) {
            com.applovin.exoplayer2.d.b bVarA = a((List<com.applovin.exoplayer2.d.e.a>) com.applovin.exoplayer2.common.a.s.g(), true, (com.applovin.exoplayer2.d.g.a) null, z10);
            this.f5098o.add(bVarA);
            this.f5103t = bVarA;
        } else {
            bVar.a((com.applovin.exoplayer2.d.g.a) null);
        }
        return this.f5103t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public com.applovin.exoplayer2.d.f a(Looper looper, com.applovin.exoplayer2.d.g.a aVar, com.applovin.exoplayer2.v vVar, boolean z10) {
        List<com.applovin.exoplayer2.d.e.a> listA;
        b(looper);
        com.applovin.exoplayer2.d.e eVar = vVar.f8201o;
        if (eVar == null) {
            return a(com.applovin.exoplayer2.l.u.e(vVar.f8198l), z10);
        }
        com.applovin.exoplayer2.d.b bVarA = null;
        Object[] objArr = 0;
        if (this.f5108y == null) {
            listA = a((com.applovin.exoplayer2.d.e) com.applovin.exoplayer2.l.a.b(eVar), this.f5087d, false);
            if (listA.isEmpty()) {
                d dVar = new d(this.f5087d);
                com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new l(new com.applovin.exoplayer2.d.f.a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listA = null;
        }
        if (this.f5091h) {
            for (com.applovin.exoplayer2.d.b bVar : this.f5098o) {
                if (ai.a(bVar.f5054a, listA)) {
                    bVarA = bVar;
                    break;
                }
            }
        } else {
            bVarA = this.f5104u;
        }
        if (bVarA == null) {
            bVarA = a(listA, false, aVar, z10);
            if (!this.f5091h) {
                this.f5104u = bVarA;
            }
            this.f5098o.add(bVarA);
        } else {
            bVarA.a(aVar);
        }
        return bVarA;
    }

    private static List<com.applovin.exoplayer2.d.e.a> a(com.applovin.exoplayer2.d.e eVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.f5133b);
        for (int i10 = 0; i10 < eVar.f5133b; i10++) {
            com.applovin.exoplayer2.d.e.a aVarA = eVar.a(i10);
            if ((aVarA.a(uuid) || (com.applovin.exoplayer2.h.f6459c.equals(uuid) && aVarA.a(com.applovin.exoplayer2.h.f6458b))) && (aVarA.f5139d != null || z10)) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.f5105v;
        if (looper2 == null) {
            this.f5105v = looper;
            this.f5106w = new Handler(looper);
        } else {
            com.applovin.exoplayer2.l.a.b(looper2 == looper);
            com.applovin.exoplayer2.l.a.b(this.f5106w);
        }
    }

    private void a(com.applovin.exoplayer2.d.f fVar, com.applovin.exoplayer2.d.g.a aVar) {
        fVar.b(aVar);
        if (this.f5097n != -9223372036854775807L) {
            fVar.b(null);
        }
    }

    private boolean a(com.applovin.exoplayer2.d.e eVar) {
        if (this.f5108y != null) {
            return true;
        }
        if (a(eVar, this.f5087d, true).isEmpty()) {
            if (eVar.f5133b != 1 || !eVar.a(0).a(com.applovin.exoplayer2.h.f6458b)) {
                return false;
            }
            StringBuilder sbA = defpackage.a.a("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sbA.append(this.f5087d);
            com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", sbA.toString());
        }
        String str = eVar.f5132a;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return ai.f7595a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private static boolean a(com.applovin.exoplayer2.d.f fVar) {
        return fVar.c() == 1 && (ai.f7595a < 19 || (((com.applovin.exoplayer2.d.f.a) com.applovin.exoplayer2.l.a.b(fVar.e())).getCause() instanceof ResourceBusyException));
    }

    private void b(Looper looper) {
        if (this.f5086a == null) {
            this.f5086a = new HandlerC0081c(looper);
        }
    }

    private void c() {
        ax it = com.applovin.exoplayer2.common.a.w.a((Collection) this.f5100q).iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.d.f) it.next()).b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        ax it = com.applovin.exoplayer2.common.a.w.a((Collection) this.f5099p).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f5102s != null && this.f5101r == 0 && this.f5098o.isEmpty() && this.f5099p.isEmpty()) {
            ((m) com.applovin.exoplayer2.l.a.b(this.f5102s)).c();
            this.f5102s = null;
        }
    }

    @Override // com.applovin.exoplayer2.d.h
    public int a(com.applovin.exoplayer2.v vVar) {
        int iD = ((m) com.applovin.exoplayer2.l.a.b(this.f5102s)).d();
        com.applovin.exoplayer2.d.e eVar = vVar.f8201o;
        if (eVar != null) {
            if (a(eVar)) {
                return iD;
            }
            return 1;
        }
        if (ai.a(this.f5092i, com.applovin.exoplayer2.l.u.e(vVar.f8198l)) != -1) {
            return iD;
        }
        return 0;
    }

    @Override // com.applovin.exoplayer2.d.h
    public h.a a(Looper looper, com.applovin.exoplayer2.d.g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.f5101r > 0);
        a(looper);
        e eVar = new e(aVar);
        eVar.a(vVar);
        return eVar;
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void a() {
        int i10 = this.f5101r;
        this.f5101r = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f5102s == null) {
            m mVarAcquireExoMediaDrm = this.f5088e.acquireExoMediaDrm(this.f5087d);
            this.f5102s = mVarAcquireExoMediaDrm;
            mVarAcquireExoMediaDrm.a(new b());
        } else if (this.f5097n != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f5098o.size(); i11++) {
                this.f5098o.get(i11).a((com.applovin.exoplayer2.d.g.a) null);
            }
        }
    }

    public void a(int i10, byte[] bArr) {
        com.applovin.exoplayer2.l.a.b(this.f5098o.isEmpty());
        if (i10 == 1 || i10 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.f5107x = i10;
        this.f5108y = bArr;
    }

    @Override // com.applovin.exoplayer2.d.h
    public com.applovin.exoplayer2.d.f b(Looper looper, com.applovin.exoplayer2.d.g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.f5101r > 0);
        a(looper);
        return a(looper, aVar, vVar, true);
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void b() {
        int i10 = this.f5101r - 1;
        this.f5101r = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f5097n != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f5098o);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.applovin.exoplayer2.d.b) arrayList.get(i11)).b(null);
            }
        }
        d();
        e();
    }
}
