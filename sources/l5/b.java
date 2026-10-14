package l5;

import c5.d;
import com.applovin.exoplayer2.a.f;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.tasks.TaskCompletionSource;
import f5.b0;
import f5.k0;
import h5.a0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f32215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f32216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockingQueue<Runnable> f32219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f32220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Transport<a0> f32221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f32222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32224j;

    /* JADX INFO: renamed from: l5.b$b, reason: collision with other inner class name */
    public final class RunnableC0338b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f32225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TaskCompletionSource<b0> f32226d;

        public RunnableC0338b(b0 b0Var, TaskCompletionSource taskCompletionSource, a aVar) {
            this.f32225c = b0Var;
            this.f32226d = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.f32225c, this.f32226d);
            b.this.f32222h.f29292b.set(0);
            b bVar = b.this;
            double dMin = Math.min(3600000.0d, Math.pow(bVar.f32216b, bVar.a()) * (60000.0d / bVar.f32215a));
            d dVar = d.f3604c;
            StringBuilder sbA = defpackage.a.a("Delay for: ");
            sbA.append(String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)));
            sbA.append(" s for report: ");
            sbA.append(this.f32225c.c());
            dVar.b(sbA.toString());
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public b(Transport<a0> transport, m5.d dVar, k0 k0Var) {
        double d10 = dVar.f33198d;
        double d11 = dVar.f33199e;
        long j10 = ((long) dVar.f33200f) * 1000;
        this.f32215a = d10;
        this.f32216b = d11;
        this.f32217c = j10;
        this.f32221g = transport;
        this.f32222h = k0Var;
        int i10 = (int) d10;
        this.f32218d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f32219e = arrayBlockingQueue;
        this.f32220f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f32223i = 0;
        this.f32224j = 0L;
    }

    public final int a() {
        if (this.f32224j == 0) {
            this.f32224j = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f32224j) / this.f32217c);
        int iMin = this.f32219e.size() == this.f32218d ? Math.min(100, this.f32223i + iCurrentTimeMillis) : Math.max(0, this.f32223i - iCurrentTimeMillis);
        if (this.f32223i != iMin) {
            this.f32223i = iMin;
            this.f32224j = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(b0 b0Var, TaskCompletionSource<b0> taskCompletionSource) {
        d dVar = d.f3604c;
        StringBuilder sbA = defpackage.a.a("Sending report through Google DataTransport: ");
        sbA.append(b0Var.c());
        dVar.b(sbA.toString());
        this.f32221g.schedule(Event.ofUrgent(b0Var.a()), new f(this, taskCompletionSource, b0Var));
    }
}
