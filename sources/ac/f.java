package ac;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class f extends AtomicInteger implements me.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public me.c f339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<me.c> f341e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f342f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f343g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f346j;

    public f(boolean z10) {
        this.f344h = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void b() {
        int iAddAndGet = 1;
        me.c cVar = null;
        long jB = 0;
        do {
            me.c andSet = this.f341e.get();
            if (andSet != null) {
                andSet = this.f341e.getAndSet(null);
            }
            long andSet2 = this.f342f.get();
            if (andSet2 != 0) {
                andSet2 = this.f342f.getAndSet(0L);
            }
            long andSet3 = this.f343g.get();
            if (andSet3 != 0) {
                andSet3 = this.f343g.getAndSet(0L);
            }
            me.c cVar2 = this.f339c;
            if (this.f345i) {
                if (cVar2 != null) {
                    cVar2.cancel();
                    this.f339c = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jB2 = this.f340d;
                if (jB2 != RecyclerView.FOREVER_NS) {
                    jB2 = h9.d.b(jB2, andSet2);
                    if (jB2 != RecyclerView.FOREVER_NS) {
                        jB2 -= andSet3;
                        if (jB2 < 0) {
                            g.reportMoreProduced(jB2);
                            jB2 = 0;
                        }
                    }
                    this.f340d = jB2;
                }
                if (andSet != null) {
                    if (cVar2 != null && this.f344h) {
                        cVar2.cancel();
                    }
                    this.f339c = andSet;
                    if (jB2 != 0) {
                        jB = h9.d.b(jB, jB2);
                        cVar = andSet;
                    }
                } else if (cVar2 != null && andSet2 != 0) {
                    jB = h9.d.b(jB, andSet2);
                    cVar = cVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            cVar.request(jB);
        }
    }

    @Override // me.c
    public void cancel() {
        if (this.f345i) {
            return;
        }
        this.f345i = true;
        a();
    }

    @Override // me.c
    public final void request(long j10) {
        if (!g.validate(j10) || this.f346j) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            h9.d.a(this.f342f, j10);
            a();
            return;
        }
        long j11 = this.f340d;
        if (j11 != RecyclerView.FOREVER_NS) {
            long jB = h9.d.b(j11, j10);
            this.f340d = jB;
            if (jB == RecyclerView.FOREVER_NS) {
                this.f346j = true;
            }
        }
        me.c cVar = this.f339c;
        if (decrementAndGet() != 0) {
            b();
        }
        if (cVar != null) {
            cVar.request(j10);
        }
    }
}
