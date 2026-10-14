package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.cg;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.jj1;
import com.yandex.mobile.ads.impl.kl;
import com.yandex.mobile.ads.impl.l91;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.tb0;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.u80;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.v80;
import com.yandex.mobile.ads.impl.yl;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import y9.k8;
import y9.l8;

/* JADX INFO: loaded from: classes.dex */
final class b implements com.yandex.mobile.ads.exo.drm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DrmInitData.SchemeData> f18418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f18419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f18420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0192b f18421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f18425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kl<com.yandex.mobile.ads.exo.drm.f.a> f18426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u80 f18427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final gr0 f18428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f18429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f18430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f18431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f18434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f18435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private yl f18436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.yandex.mobile.ads.exo.drm.e.a f18437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte[] f18438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f18439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private m.a f18440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m.d f18441x;

    public interface a {
    }

    /* JADX INFO: renamed from: com.yandex.mobile.ads.exo.drm.b$b, reason: collision with other inner class name */
    public interface InterfaceC0192b {
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18442a;

        public c(Looper looper) {
            super(looper);
        }

        public final synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f18442a = true;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            boolean z10 = true;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    objA = ((o) b.this.f18429l).a((m.d) dVar.f18446c);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    b bVar = b.this;
                    objA = ((o) bVar.f18429l).a(bVar.f18430m, (m.a) dVar.f18446c);
                }
            } catch (tb0 e10) {
                d dVar2 = (d) message.obj;
                if (dVar2.f18445b) {
                    int i11 = dVar2.f18447d + 1;
                    dVar2.f18447d = i11;
                    if (i11 > b.this.f18427j.a(3)) {
                        z10 = false;
                    } else {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jA = b.this.f18427j.a(new u80.a(e10.getCause() instanceof IOException ? (IOException) e10.getCause() : new f(e10.getCause()), dVar2.f18447d));
                        if (jA == -9223372036854775807L) {
                            z10 = false;
                        } else {
                            synchronized (this) {
                                if (this.f18442a) {
                                    z10 = false;
                                } else {
                                    sendMessageDelayed(Message.obtain(message), jA);
                                }
                            }
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                } else {
                    objA = e10;
                }
            } catch (Exception e11) {
                p90.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            u80 u80Var = b.this.f18427j;
            long j10 = dVar.f18444a;
            Objects.requireNonNull(u80Var);
            synchronized (this) {
                if (!this.f18442a) {
                    b.this.f18431n.obtainMessage(message.what, Pair.create(dVar.f18446c, objA)).sendToTarget();
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f18446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18447d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f18444a = j10;
            this.f18445b = z10;
            this.f18446c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                b.a(b.this, obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                b.this.a(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC0192b interfaceC0192b, List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, u80 u80Var, gr0 gr0Var) {
        List<DrmInitData.SchemeData> listUnmodifiableList;
        if (i10 == 1 || i10 == 3) {
            pa.a(bArr);
        }
        this.f18430m = uuid;
        this.f18420c = aVar;
        this.f18421d = interfaceC0192b;
        this.f18419b = mVar;
        this.f18422e = i10;
        this.f18423f = z10;
        this.f18424g = z11;
        if (bArr != null) {
            this.f18439v = bArr;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList((List) pa.a(list));
        }
        this.f18418a = listUnmodifiableList;
        this.f18425h = map;
        this.f18429l = pVar;
        this.f18426i = new kl<>();
        this.f18427j = u80Var;
        this.f18428k = gr0Var;
        this.f18432o = 2;
        this.f18431n = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i10, com.yandex.mobile.ads.exo.drm.f.a aVar) {
        aVar.a(i10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    private void a(int i10, Exception exc) {
        int iB;
        int i11 = da1.f19803a;
        if (i11 >= 21 && i.a(exc)) {
            iB = i.b(exc);
        } else if (i11 >= 23 && j.a(exc)) {
            iB = 6006;
        } else if (i11 >= 18 && h.b(exc)) {
            iB = AdError.ICONVIEW_MISSING_ERROR_CODE;
        } else if (i11 >= 18 && h.a(exc)) {
            iB = 6007;
        } else if (exc instanceof l91) {
            iB = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        } else if (exc instanceof com.yandex.mobile.ads.exo.drm.c.d) {
            iB = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        } else if (exc instanceof u70) {
            iB = 6008;
        } else if (i10 == 1) {
            iB = 6006;
        } else if (i10 == 2) {
            iB = 6004;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException();
            }
            iB = AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        this.f18437t = new com.yandex.mobile.ads.exo.drm.e.a(exc, iB);
        p90.a("DefaultDrmSession", "DRM session error", exc);
        Iterator<com.yandex.mobile.ads.exo.drm.f.a> it = this.f18426i.a().iterator();
        while (it.hasNext()) {
            a(exc, it.next());
        }
        if (this.f18432o != 4) {
            this.f18432o = 1;
        }
    }

    public static void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f18441x) {
            int i10 = bVar.f18432o;
            if (i10 != 2) {
                if (!(i10 == 3 || i10 == 4)) {
                    return;
                }
            }
            bVar.f18441x = null;
            if (obj2 instanceof Exception) {
                ((com.yandex.mobile.ads.exo.drm.c.f) bVar.f18420c).a((Exception) obj2, false);
                return;
            }
            try {
                bVar.f18419b.c((byte[]) obj2);
                ((com.yandex.mobile.ads.exo.drm.c.f) bVar.f18420c).a();
            } catch (Exception e10) {
                ((com.yandex.mobile.ads.exo.drm.c.f) bVar.f18420c).a(e10, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Exception exc, com.yandex.mobile.ads.exo.drm.f.a aVar) {
        aVar.a(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f18440w) {
            int i10 = this.f18432o;
            if (i10 == 3 || i10 == 4) {
                this.f18440w = null;
                if (obj2 instanceof Exception) {
                    Exception exc = (Exception) obj2;
                    if (exc instanceof NotProvisionedException) {
                        ((com.yandex.mobile.ads.exo.drm.c.f) this.f18420c).b(this);
                        return;
                    } else {
                        a(2, exc);
                        return;
                    }
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (this.f18422e == 3) {
                        m mVar = this.f18419b;
                        byte[] bArr2 = this.f18439v;
                        int i11 = da1.f19803a;
                        mVar.b(bArr2, bArr);
                        k8 k8Var = k8.f41150v;
                        for (com.yandex.mobile.ads.exo.drm.f.a aVar : this.f18426i.a()) {
                            Objects.requireNonNull(k8Var);
                            aVar.b();
                        }
                        return;
                    }
                    byte[] bArrB = this.f18419b.b(this.f18438u, bArr);
                    int i12 = this.f18422e;
                    if ((i12 == 2 || (i12 == 0 && this.f18439v != null)) && bArrB != null && bArrB.length != 0) {
                        this.f18439v = bArrB;
                    }
                    this.f18432o = 4;
                    l8 l8Var = l8.f41383x;
                    Iterator<com.yandex.mobile.ads.exo.drm.f.a> it = this.f18426i.a().iterator();
                    while (it.hasNext()) {
                        l8Var.accept(it.next());
                    }
                } catch (Exception e10) {
                    if (e10 instanceof NotProvisionedException) {
                        ((com.yandex.mobile.ads.exo.drm.c.f) this.f18420c).b(this);
                    } else {
                        a(1, e10);
                    }
                }
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    private void a(boolean z10) {
        long jMin;
        if (this.f18424g) {
            return;
        }
        byte[] bArr = this.f18438u;
        int i10 = da1.f19803a;
        int i11 = this.f18422e;
        boolean z11 = false;
        if (i11 == 0 || i11 == 1) {
            byte[] bArr2 = this.f18439v;
            if (bArr2 == null) {
                a(bArr, 1, z10);
                return;
            }
            if (this.f18432o != 4) {
                try {
                    this.f18419b.a(bArr, bArr2);
                    z11 = true;
                } catch (Exception e10) {
                    a(1, e10);
                }
                if (!z11) {
                    return;
                }
            }
            if (cg.f19501d.equals(this.f18430m)) {
                Pair<Long, Long> pairA = jj1.a(this);
                Objects.requireNonNull(pairA);
                jMin = Math.min(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue());
            } else {
                jMin = RecyclerView.FOREVER_NS;
            }
            if (this.f18422e != 0 || jMin > 60) {
                if (jMin <= 0) {
                    a(2, new u70());
                    return;
                }
                this.f18432o = 4;
                l8 l8Var = l8.f41382w;
                Iterator<com.yandex.mobile.ads.exo.drm.f.a> it = this.f18426i.a().iterator();
                while (it.hasNext()) {
                    l8Var.accept(it.next());
                }
                return;
            }
            p90.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                Objects.requireNonNull(this.f18439v);
                Objects.requireNonNull(this.f18438u);
                a(this.f18439v, 3, z10);
                return;
            }
            byte[] bArr3 = this.f18439v;
            if (bArr3 != null) {
                try {
                    this.f18419b.a(bArr, bArr3);
                    z11 = true;
                } catch (Exception e11) {
                    a(1, e11);
                }
                if (!z11) {
                    return;
                }
            }
        }
        a(bArr, 2, z10);
    }

    private void a(byte[] bArr, int i10, boolean z10) {
        try {
            m.a aVarA = this.f18419b.a(bArr, this.f18418a, i10, this.f18425h);
            this.f18440w = aVarA;
            c cVar = this.f18435r;
            int i11 = da1.f19803a;
            Objects.requireNonNull(aVarA);
            Objects.requireNonNull(cVar);
            cVar.obtainMessage(1, new d(v80.a(), z10, SystemClock.elapsedRealtime(), aVarA)).sendToTarget();
        } catch (Exception e10) {
            if (e10 instanceof NotProvisionedException) {
                ((com.yandex.mobile.ads.exo.drm.c.f) this.f18420c).b(this);
            } else {
                a(1, e10);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean b() {
        int i10 = this.f18432o;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        try {
            byte[] bArrC = this.f18419b.c();
            this.f18438u = bArrC;
            this.f18419b.a(bArrC, this.f18428k);
            this.f18436s = this.f18419b.d(this.f18438u);
            this.f18432o = 3;
            Iterator<com.yandex.mobile.ads.exo.drm.f.a> it = this.f18426i.a().iterator();
            while (it.hasNext()) {
                a(3, it.next());
            }
            Objects.requireNonNull(this.f18438u);
            return true;
        } catch (NotProvisionedException unused) {
            ((com.yandex.mobile.ads.exo.drm.c.f) this.f18420c).b(this);
            return false;
        } catch (Exception e10) {
            a(1, e10);
            return false;
        }
    }

    public final void a() {
        if (b()) {
            a(true);
        }
    }

    public final void a(int i10) {
        if (i10 == 2 && this.f18422e == 0 && this.f18432o == 4) {
            int i11 = da1.f19803a;
            a(false);
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void a(com.yandex.mobile.ads.exo.drm.f.a aVar) {
        int i10 = this.f18433p;
        if (i10 <= 0) {
            p90.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f18433p = i11;
        if (i11 == 0) {
            this.f18432o = 0;
            e eVar = this.f18431n;
            int i12 = da1.f19803a;
            eVar.removeCallbacksAndMessages(null);
            this.f18435r.a();
            this.f18435r = null;
            this.f18434q.quit();
            this.f18434q = null;
            this.f18436s = null;
            this.f18437t = null;
            this.f18440w = null;
            this.f18441x = null;
            byte[] bArr = this.f18438u;
            if (bArr != null) {
                this.f18419b.b(bArr);
                this.f18438u = null;
            }
        }
        if (aVar != null) {
            this.f18426i.c(aVar);
            if (this.f18426i.b(aVar) == 0) {
                aVar.d();
            }
        }
        ((com.yandex.mobile.ads.exo.drm.c.g) this.f18421d).a(this, this.f18433p);
    }

    public final void a(Exception exc, boolean z10) {
        a(z10 ? 1 : 3, exc);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean a(String str) {
        return this.f18419b.a(str, (byte[]) pa.b(this.f18438u));
    }

    public final boolean a(byte[] bArr) {
        return Arrays.equals(this.f18438u, bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void b(com.yandex.mobile.ads.exo.drm.f.a aVar) {
        if (this.f18433p < 0) {
            StringBuilder sbA = v60.a("Session reference count less than zero: ");
            sbA.append(this.f18433p);
            p90.b("DefaultDrmSession", sbA.toString());
            this.f18433p = 0;
        }
        if (aVar != null) {
            this.f18426i.a(aVar);
        }
        int i10 = this.f18433p + 1;
        this.f18433p = i10;
        if (i10 == 1) {
            pa.b(this.f18432o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f18434q = handlerThread;
            handlerThread.start();
            this.f18435r = new c(this.f18434q.getLooper());
            if (b()) {
                a(true);
            }
        } else if (aVar != null) {
            int i11 = this.f18432o;
            if ((i11 == 3 || i11 == 4) && this.f18426i.b(aVar) == 1) {
                aVar.a(this.f18432o);
            }
        }
        com.yandex.mobile.ads.exo.drm.c.g gVar = (com.yandex.mobile.ads.exo.drm.c.g) this.f18421d;
        if (com.yandex.mobile.ads.exo.drm.c.this.f18459l != -9223372036854775807L) {
            com.yandex.mobile.ads.exo.drm.c.this.f18462o.remove(this);
            Handler handler = com.yandex.mobile.ads.exo.drm.c.this.f18468u;
            Objects.requireNonNull(handler);
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final int c() {
        return this.f18432o;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean d() {
        return this.f18423f;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final Map<String, String> e() {
        byte[] bArr = this.f18438u;
        if (bArr == null) {
            return null;
        }
        return this.f18419b.a(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final UUID f() {
        return this.f18430m;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final com.yandex.mobile.ads.exo.drm.e.a g() {
        if (this.f18432o == 1) {
            return this.f18437t;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final yl h() {
        return this.f18436s;
    }

    public final void i() {
        m.d dVarA = this.f18419b.a();
        this.f18441x = dVarA;
        c cVar = this.f18435r;
        int i10 = da1.f19803a;
        Objects.requireNonNull(dVarA);
        Objects.requireNonNull(cVar);
        cVar.obtainMessage(0, new d(v80.a(), true, SystemClock.elapsedRealtime(), dVarA)).sendToTarget();
    }
}
