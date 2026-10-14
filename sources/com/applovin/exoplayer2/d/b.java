package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class b implements com.applovin.exoplayer2.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.applovin.exoplayer2.d.e.a> f5054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f5055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f5056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f5057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f5058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f5059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0080b f5060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f5063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, String> f5064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.i<g.a> f5065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f5066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HandlerThread f5069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f5070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.applovin.exoplayer2.c.b f5071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f.a f5072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte[] f5073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte[] f5074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private m.a f5075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private m.d f5076w;

    public interface a {
        void a();

        void a(b bVar);

        void a(Exception exc, boolean z10);
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.b$b, reason: collision with other inner class name */
    public interface InterfaceC0080b {
        void a(b bVar, int i10);

        void b(b bVar, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5078b;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, s sVar) {
            d dVar = (d) message.obj;
            if (!dVar.f5080b) {
                return false;
            }
            int i10 = dVar.f5083e + 1;
            dVar.f5083e = i10;
            if (i10 > b.this.f5066m.a(3)) {
                return false;
            }
            long jA = b.this.f5066m.a(new com.applovin.exoplayer2.k.v.a(new com.applovin.exoplayer2.h.j(dVar.f5079a, sVar.f5168a, sVar.f5169b, sVar.f5170c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f5081c, sVar.f5171d), new com.applovin.exoplayer2.h.m(3), sVar.getCause() instanceof IOException ? (IOException) sVar.getCause() : new f(sVar.getCause()), dVar.f5083e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f5078b) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f5078b = true;
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(com.applovin.exoplayer2.h.j.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    b bVar = b.this;
                    objA = bVar.f5055b.a(bVar.f5056c, (m.d) dVar.f5082d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    b bVar2 = b.this;
                    objA = bVar2.f5055b.a(bVar2.f5056c, (m.a) dVar.f5082d);
                }
            } catch (s e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                com.applovin.exoplayer2.l.q.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            b.this.f5066m.a(dVar.f5079a);
            synchronized (this) {
                if (!this.f5078b) {
                    b.this.f5057d.obtainMessage(message.what, Pair.create(dVar.f5082d, objA)).sendToTarget();
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f5082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5083e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f5079a = j10;
            this.f5080b = z10;
            this.f5081c = j11;
            this.f5082d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                b.this.a(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                b.this.b(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC0080b interfaceC0080b, List<com.applovin.exoplayer2.d.e.a> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, r rVar, Looper looper, com.applovin.exoplayer2.k.v vVar) {
        List<com.applovin.exoplayer2.d.e.a> listUnmodifiableList;
        if (i10 == 1 || i10 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.f5056c = uuid;
        this.f5059f = aVar;
        this.f5060g = interfaceC0080b;
        this.f5058e = mVar;
        this.f5061h = i10;
        this.f5062i = z10;
        this.f5063j = z11;
        if (bArr != null) {
            this.f5074u = bArr;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList((List) com.applovin.exoplayer2.l.a.b(list));
        }
        this.f5054a = listUnmodifiableList;
        this.f5064k = map;
        this.f5055b = rVar;
        this.f5065l = new com.applovin.exoplayer2.l.i<>();
        this.f5066m = vVar;
        this.f5067n = 2;
        this.f5057d = new e(looper);
    }

    private void a(com.applovin.exoplayer2.l.h<g.a> hVar) {
        Iterator<g.a> it = this.f5065l.a().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    private void a(final Exception exc, int i10) {
        this.f5072s = new com.applovin.exoplayer2.d.f.a(exc, j.a(exc, i10));
        com.applovin.exoplayer2.l.q.c("DefaultDrmSession", "DRM session error", exc);
        a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.w
            @Override // com.applovin.exoplayer2.l.h
            public final void accept(Object obj) {
                ((g.a) obj).a(exc);
            }
        });
        if (this.f5067n != 4) {
            this.f5067n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f5076w) {
            if (this.f5067n == 2 || m()) {
                this.f5076w = null;
                if (obj2 instanceof Exception) {
                    this.f5059f.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f5058e.b((byte[]) obj2);
                    this.f5059f.a();
                } catch (Exception e10) {
                    this.f5059f.a(e10, true);
                }
            }
        }
    }

    private void a(boolean z10) {
        if (this.f5063j) {
            return;
        }
        byte[] bArr = (byte[]) ai.a(this.f5073t);
        int i10 = this.f5061h;
        if (i10 == 0 || i10 == 1) {
            if (this.f5074u == null) {
                a(bArr, 1, z10);
                return;
            }
            if (this.f5067n != 4 && !j()) {
                return;
            }
            long jK = k();
            if (this.f5061h != 0 || jK > 60) {
                if (jK <= 0) {
                    a(new q(), 2);
                    return;
                } else {
                    this.f5067n = 4;
                    a(com.applovin.exoplayer2.b.z.f4650f);
                    return;
                }
            }
            com.applovin.exoplayer2.l.q.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jK);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                com.applovin.exoplayer2.l.a.b(this.f5074u);
                com.applovin.exoplayer2.l.a.b(this.f5073t);
                a(this.f5074u, 3, z10);
                return;
            }
            if (this.f5074u != null && !j()) {
                return;
            }
        }
        a(bArr, 2, z10);
    }

    private void a(byte[] bArr, int i10, boolean z10) {
        try {
            this.f5075v = this.f5058e.a(bArr, this.f5054a, i10, this.f5064k);
            ((c) ai.a(this.f5070q)).a(1, com.applovin.exoplayer2.l.a.b(this.f5075v), z10);
        } catch (Exception e10) {
            b(e10, true);
        }
    }

    private void b(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f5059f.a(this);
        } else {
            a(exc, z10 ? 1 : 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        com.applovin.exoplayer2.l.h<g.a> hVar;
        if (obj == this.f5075v && m()) {
            this.f5075v = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f5061h == 3) {
                    this.f5058e.a((byte[]) ai.a(this.f5074u), bArr);
                    hVar = com.applovin.exoplayer2.b.z.f4649e;
                } else {
                    byte[] bArrA = this.f5058e.a(this.f5073t, bArr);
                    int i10 = this.f5061h;
                    if ((i10 == 2 || (i10 == 0 && this.f5074u != null)) && bArrA != null && bArrA.length != 0) {
                        this.f5074u = bArrA;
                    }
                    this.f5067n = 4;
                    hVar = com.applovin.exoplayer2.a.p.f3997m;
                }
                a(hVar);
            } catch (Exception e10) {
                b(e10, true);
            }
        }
    }

    private boolean i() {
        if (m()) {
            return true;
        }
        try {
            byte[] bArrA = this.f5058e.a();
            this.f5073t = bArrA;
            this.f5071r = this.f5058e.d(bArrA);
            final int i10 = 3;
            this.f5067n = 3;
            a(new com.applovin.exoplayer2.l.h(i10) { // from class: com.applovin.exoplayer2.d.v
                @Override // com.applovin.exoplayer2.l.h
                public final void accept(Object obj) {
                    ((g.a) obj).a(3);
                }
            });
            com.applovin.exoplayer2.l.a.b(this.f5073t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f5059f.a(this);
            return false;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    private boolean j() {
        try {
            this.f5058e.b(this.f5073t, this.f5074u);
            return true;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    private long k() {
        if (!com.applovin.exoplayer2.h.f6460d.equals(this.f5056c)) {
            return RecyclerView.FOREVER_NS;
        }
        Pair pair = (Pair) com.applovin.exoplayer2.l.a.b(u.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void l() {
        if (this.f5061h == 0 && this.f5067n == 4) {
            ai.a(this.f5073t);
            a(false);
        }
    }

    private boolean m() {
        int i10 = this.f5067n;
        return i10 == 3 || i10 == 4;
    }

    public void a() {
        this.f5076w = this.f5058e.b();
        ((c) ai.a(this.f5070q)).a(0, com.applovin.exoplayer2.l.a.b(this.f5076w), true);
    }

    public void a(int i10) {
        if (i10 != 2) {
            return;
        }
        l();
    }

    @Override // com.applovin.exoplayer2.d.f
    public void a(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f5068o >= 0);
        if (aVar != null) {
            this.f5065l.a(aVar);
        }
        int i10 = this.f5068o + 1;
        this.f5068o = i10;
        if (i10 == 1) {
            com.applovin.exoplayer2.l.a.b(this.f5067n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f5069p = handlerThread;
            handlerThread.start();
            this.f5070q = new c(this.f5069p.getLooper());
            if (i()) {
                a(true);
            }
        } else if (aVar != null && m() && this.f5065l.c(aVar) == 1) {
            aVar.a(this.f5067n);
        }
        this.f5060g.a(this, this.f5068o);
    }

    public void a(Exception exc, boolean z10) {
        a(exc, z10 ? 1 : 3);
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean a(String str) {
        return this.f5058e.a((byte[]) com.applovin.exoplayer2.l.a.a(this.f5073t), str);
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f5073t, bArr);
    }

    public void b() {
        if (i()) {
            a(true);
        }
    }

    @Override // com.applovin.exoplayer2.d.f
    public void b(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f5068o > 0);
        int i10 = this.f5068o - 1;
        this.f5068o = i10;
        if (i10 == 0) {
            this.f5067n = 0;
            ((e) ai.a(this.f5057d)).removeCallbacksAndMessages(null);
            ((c) ai.a(this.f5070q)).a();
            this.f5070q = null;
            ((HandlerThread) ai.a(this.f5069p)).quit();
            this.f5069p = null;
            this.f5071r = null;
            this.f5072s = null;
            this.f5075v = null;
            this.f5076w = null;
            byte[] bArr = this.f5073t;
            if (bArr != null) {
                this.f5058e.a(bArr);
                this.f5073t = null;
            }
        }
        if (aVar != null) {
            this.f5065l.b(aVar);
            if (this.f5065l.c(aVar) == 0) {
                aVar.d();
            }
        }
        this.f5060g.b(this, this.f5068o);
    }

    @Override // com.applovin.exoplayer2.d.f
    public final int c() {
        return this.f5067n;
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean d() {
        return this.f5062i;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final com.applovin.exoplayer2.d.f.a e() {
        if (this.f5067n == 1) {
            return this.f5072s;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final UUID f() {
        return this.f5056c;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final com.applovin.exoplayer2.c.b g() {
        return this.f5071r;
    }

    @Override // com.applovin.exoplayer2.d.f
    public Map<String, String> h() {
        byte[] bArr = this.f5073t;
        if (bArr == null) {
            return null;
        }
        return this.f5058e.c(bArr);
    }
}
