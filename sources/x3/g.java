package x3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import b4.j;
import g3.l;
import g3.p;
import g3.q;
import g3.u;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import y3.h;

/* JADX INFO: loaded from: classes.dex */
public final class g<R> implements x3.b, y3.g, f, c4.a.d {
    public static final o0.e<g<?>> E = c4.a.a(150, new a());
    public static final boolean F = Log.isLoggable("Request", 2);
    public Drawable A;
    public int B;
    public int C;
    public RuntimeException D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4.d f37451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d<R> f37452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f37453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f37454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a3.e f37455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f37456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<R> f37457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x3.a<?> f37458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a3.g f37461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h<R> f37462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<d<R>> f37463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f37464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z3.c<? super R> f37465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Executor f37466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u<R> f37467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l.d f37468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f37469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f37470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f37471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f37472z;

    public class a implements c4.a.b<g<?>> {
        @Override // c4.a.b
        public g<?> a() {
            return new g<>();
        }
    }

    public enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public g() {
        this.f37450d = F ? String.valueOf(hashCode()) : null;
        this.f37451e = new c4.d.b();
    }

    @Override // x3.b
    public synchronized void a() {
        g();
        this.f37454h = null;
        this.f37455i = null;
        this.f37456j = null;
        this.f37457k = null;
        this.f37458l = null;
        this.f37459m = -1;
        this.f37460n = -1;
        this.f37462p = null;
        this.f37463q = null;
        this.f37452f = null;
        this.f37453g = null;
        this.f37465s = null;
        this.f37468v = null;
        this.f37471y = null;
        this.f37472z = null;
        this.A = null;
        this.B = -1;
        this.C = -1;
        this.D = null;
        ((c4.a.c) E).a(this);
    }

    @Override // y3.g
    public synchronized void b(int i10, int i11) throws Throwable {
        int iRound = i10;
        synchronized (this) {
            try {
                this.f37451e.a();
                boolean z10 = F;
                if (z10) {
                    n("Got onSizeReady in " + b4.f.a(this.f37469w));
                }
                if (this.f37470x != b.WAITING_FOR_SIZE) {
                    return;
                }
                b bVar = b.RUNNING;
                this.f37470x = bVar;
                float f10 = this.f37458l.f37426d;
                if (iRound != Integer.MIN_VALUE) {
                    iRound = Math.round(iRound * f10);
                }
                this.B = iRound;
                this.C = i11 == Integer.MIN_VALUE ? i11 : Math.round(f10 * i11);
                if (z10) {
                    n("finished setup for calling load in " + b4.f.a(this.f37469w));
                }
                l lVar = this.f37464r;
                a3.e eVar = this.f37455i;
                Object obj = this.f37456j;
                x3.a<?> aVar = this.f37458l;
                try {
                    try {
                        this.f37468v = lVar.a(eVar, obj, aVar.f37436n, this.B, this.C, aVar.f37443u, this.f37457k, this.f37461o, aVar.f37427e, aVar.f37442t, aVar.f37437o, aVar.A, aVar.f37441s, aVar.f37433k, aVar.f37447y, aVar.B, aVar.f37448z, this, this.f37466t);
                        if (this.f37470x != bVar) {
                            this.f37468v = null;
                        }
                        if (z10) {
                            n("finished onSizeReady in " + b4.f.a(this.f37469w));
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    @Override // x3.b
    public synchronized boolean c() {
        return this.f37470x == b.CLEARED;
    }

    @Override // x3.b
    public synchronized void clear() {
        g();
        this.f37451e.a();
        b bVar = this.f37470x;
        b bVar2 = b.CLEARED;
        if (bVar == bVar2) {
            return;
        }
        h();
        u<R> uVar = this.f37467u;
        if (uVar != null) {
            s(uVar);
        }
        c cVar = this.f37453g;
        if (cVar == null || cVar.c(this)) {
            this.f37462p.h(j());
        }
        this.f37470x = bVar2;
    }

    @Override // x3.b
    public synchronized void d() {
        g();
        this.f37451e.a();
        int i10 = b4.f.f3299b;
        this.f37469w = SystemClock.elapsedRealtimeNanos();
        if (this.f37456j == null) {
            if (j.i(this.f37459m, this.f37460n)) {
                this.B = this.f37459m;
                this.C = this.f37460n;
            }
            p(new q("Received null model"), i() == null ? 5 : 3);
            return;
        }
        b bVar = this.f37470x;
        b bVar2 = b.RUNNING;
        if (bVar == bVar2) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (bVar == b.COMPLETE) {
            q(this.f37467u, com.bumptech.glide.load.a.MEMORY_CACHE);
            return;
        }
        b bVar3 = b.WAITING_FOR_SIZE;
        this.f37470x = bVar3;
        if (j.i(this.f37459m, this.f37460n)) {
            b(this.f37459m, this.f37460n);
        } else {
            this.f37462p.a(this);
        }
        b bVar4 = this.f37470x;
        if (bVar4 == bVar2 || bVar4 == bVar3) {
            c cVar = this.f37453g;
            if (cVar == null || cVar.e(this)) {
                this.f37462p.f(j());
            }
        }
        if (F) {
            n("finished run method in " + b4.f.a(this.f37469w));
        }
    }

    @Override // x3.b
    public synchronized boolean e() {
        return this.f37470x == b.COMPLETE;
    }

    @Override // c4.a.d
    public c4.d f() {
        return this.f37451e;
    }

    public final void g() {
        if (this.f37449c) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void h() {
        g();
        this.f37451e.a();
        this.f37462p.e(this);
        l.d dVar = this.f37468v;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.f29884a.h(dVar.f29885b);
            }
            this.f37468v = null;
        }
    }

    public final Drawable i() {
        int i10;
        if (this.A == null) {
            x3.a<?> aVar = this.f37458l;
            Drawable drawable = aVar.f37439q;
            this.A = drawable;
            if (drawable == null && (i10 = aVar.f37440r) > 0) {
                this.A = m(i10);
            }
        }
        return this.A;
    }

    @Override // x3.b
    public synchronized boolean isRunning() {
        b bVar;
        bVar = this.f37470x;
        return bVar == b.RUNNING || bVar == b.WAITING_FOR_SIZE;
    }

    public final Drawable j() {
        int i10;
        if (this.f37472z == null) {
            x3.a<?> aVar = this.f37458l;
            Drawable drawable = aVar.f37431i;
            this.f37472z = drawable;
            if (drawable == null && (i10 = aVar.f37432j) > 0) {
                this.f37472z = m(i10);
            }
        }
        return this.f37472z;
    }

    public synchronized boolean k(x3.b bVar) {
        boolean zA;
        boolean z10 = false;
        if (!(bVar instanceof g)) {
            return false;
        }
        g gVar = (g) bVar;
        synchronized (gVar) {
            if (this.f37459m == gVar.f37459m && this.f37460n == gVar.f37460n) {
                Object obj = this.f37456j;
                Object obj2 = gVar.f37456j;
                char[] cArr = j.f3307a;
                if (obj == null) {
                    zA = obj2 == null;
                } else {
                    zA = obj instanceof l3.l ? ((l3.l) obj).a(obj2) : obj.equals(obj2);
                }
                if (zA && this.f37457k.equals(gVar.f37457k) && this.f37458l.equals(gVar.f37458l) && this.f37461o == gVar.f37461o) {
                    synchronized (this) {
                        synchronized (gVar) {
                            List<d<R>> list = this.f37463q;
                            int size = list == null ? 0 : list.size();
                            List<d<R>> list2 = gVar.f37463q;
                            boolean z11 = size == (list2 == null ? 0 : list2.size());
                            if (z11) {
                                z10 = true;
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final boolean l() {
        c cVar = this.f37453g;
        return cVar == null || !cVar.a();
    }

    public final Drawable m(int i10) {
        Resources.Theme theme = this.f37458l.f37445w;
        if (theme == null) {
            theme = this.f37454h.getTheme();
        }
        a3.e eVar = this.f37455i;
        return q3.a.a(eVar, eVar, i10, theme);
    }

    public final void n(String str) {
        StringBuilder sbA = android.support.v4.media.c.a(str, " this: ");
        sbA.append(this.f37450d);
        Log.v("Request", sbA.toString());
    }

    public synchronized void o(q qVar) {
        p(qVar, 5);
    }

    public final synchronized void p(q qVar, int i10) {
        boolean zA;
        this.f37451e.a();
        Objects.requireNonNull(qVar);
        int i11 = this.f37455i.f45i;
        if (i11 <= i10) {
            Log.w("Glide", "Load failed for " + this.f37456j + " with size [" + this.B + "x" + this.C + "]", qVar);
            if (i11 <= 4) {
                qVar.e("Glide");
            }
        }
        this.f37468v = null;
        this.f37470x = b.FAILED;
        boolean z10 = true;
        this.f37449c = true;
        try {
            List<d<R>> list = this.f37463q;
            if (list != null) {
                Iterator<d<R>> it = list.iterator();
                zA = false;
                while (it.hasNext()) {
                    zA |= it.next().a(qVar, this.f37456j, this.f37462p, l());
                }
            } else {
                zA = false;
            }
            d<R> dVar = this.f37452f;
            if (dVar == null || !dVar.a(qVar, this.f37456j, this.f37462p, l())) {
                z10 = false;
            }
            if (!(zA | z10)) {
                t();
            }
            this.f37449c = false;
            c cVar = this.f37453g;
            if (cVar != null) {
                cVar.f(this);
            }
        } catch (Throwable th) {
            this.f37449c = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void q(u<?> uVar, com.bumptech.glide.load.a aVar) {
        this.f37451e.a();
        this.f37468v = null;
        if (uVar == null) {
            o(new q("Expected to receive a Resource<R> with an object of " + this.f37457k + " inside, but instead got null."));
            return;
        }
        Object obj = uVar.get();
        if (obj != null && this.f37457k.isAssignableFrom(obj.getClass())) {
            c cVar = this.f37453g;
            if (cVar == null || cVar.d(this)) {
                r(uVar, obj, aVar);
                return;
            } else {
                s(uVar);
                this.f37470x = b.COMPLETE;
                return;
            }
        }
        s(uVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected to receive an object of ");
        sb2.append(this.f37457k);
        sb2.append(" but instead got ");
        sb2.append(obj != null ? obj.getClass() : "");
        sb2.append("{");
        sb2.append(obj);
        sb2.append("} inside Resource{");
        sb2.append(uVar);
        sb2.append("}.");
        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        o(new q(sb2.toString()));
    }

    public final synchronized void r(u<R> uVar, R r10, com.bumptech.glide.load.a aVar) {
        boolean zB;
        boolean zL = l();
        this.f37470x = b.COMPLETE;
        this.f37467u = uVar;
        if (this.f37455i.f45i <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f37456j + " with size [" + this.B + "x" + this.C + "] in " + b4.f.a(this.f37469w) + " ms");
        }
        boolean z10 = true;
        this.f37449c = true;
        try {
            List<d<R>> list = this.f37463q;
            if (list != null) {
                Iterator<d<R>> it = list.iterator();
                zB = false;
                while (it.hasNext()) {
                    zB |= it.next().b(r10, this.f37456j, this.f37462p, aVar, zL);
                }
            } else {
                zB = false;
            }
            d<R> dVar = this.f37452f;
            if (dVar == null || !dVar.b(r10, this.f37456j, this.f37462p, aVar, zL)) {
                z10 = false;
            }
            if (!(z10 | zB)) {
                Objects.requireNonNull((z3.a.C0483a) this.f37465s);
                this.f37462p.b(r10, z3.a.f45015a);
            }
            this.f37449c = false;
            c cVar = this.f37453g;
            if (cVar != null) {
                cVar.b(this);
            }
        } catch (Throwable th) {
            this.f37449c = false;
            throw th;
        }
    }

    public final void s(u<?> uVar) {
        Objects.requireNonNull(this.f37464r);
        if (!(uVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) uVar).d();
        this.f37467u = null;
    }

    public final synchronized void t() {
        int i10;
        c cVar = this.f37453g;
        if (cVar == null || cVar.e(this)) {
            Drawable drawableI = this.f37456j == null ? i() : null;
            if (drawableI == null) {
                if (this.f37471y == null) {
                    x3.a<?> aVar = this.f37458l;
                    Drawable drawable = aVar.f37429g;
                    this.f37471y = drawable;
                    if (drawable == null && (i10 = aVar.f37430h) > 0) {
                        this.f37471y = m(i10);
                    }
                }
                drawableI = this.f37471y;
            }
            if (drawableI == null) {
                drawableI = j();
            }
            this.f37462p.c(drawableI);
        }
    }
}
