package d8;

import fd.j0;
import java.util.Timer;
import java.util.TimerTask;
import jc.w;
import vc.z;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f28857q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l<Long, w> f28859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.l<Long, w> f28860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.l<Long, w> f28861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.l<Long, w> f28862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q8.d f28863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f28864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f28865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f28866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f28867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f28868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f28870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f28871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Timer f28872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TimerTask f28873p;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public enum b {
        STOPPED,
        WORKING,
        PAUSED
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28874a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.STOPPED.ordinal()] = 1;
            iArr[b.WORKING.ordinal()] = 2;
            iArr[b.PAUSED.ordinal()] = 3;
            f28874a = iArr;
        }
    }

    /* JADX INFO: renamed from: d8.d$d, reason: collision with other inner class name */
    public static final class C0246d extends TimerTask {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.a f28875c;

        public C0246d(uc.a aVar) {
            this.f28875c = aVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f28875c.invoke();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, uc.l<? super Long, w> lVar, uc.l<? super Long, w> lVar2, uc.l<? super Long, w> lVar3, uc.l<? super Long, w> lVar4, q8.d dVar) {
        j0.i(str, "name");
        j0.i(lVar, "onInterrupt");
        j0.i(lVar2, "onStart");
        j0.i(lVar3, "onEnd");
        j0.i(lVar4, "onTick");
        this.f28858a = str;
        this.f28859b = lVar;
        this.f28860c = lVar2;
        this.f28861d = lVar3;
        this.f28862e = lVar4;
        this.f28863f = dVar;
        this.f28868k = b.STOPPED;
        this.f28870m = -1L;
        this.f28871n = -1L;
    }

    public static /* synthetic */ void j(d dVar, long j10, long j11, uc.a aVar, int i10, Object obj) {
        dVar.i(j10, (i10 & 2) != 0 ? j10 : j11, aVar);
    }

    public void a() {
        int i10 = c.f28874a[this.f28868k.ordinal()];
        if (i10 == 2 || i10 == 3) {
            this.f28868k = b.STOPPED;
            b();
            this.f28859b.invoke(Long.valueOf(d()));
            f();
        }
    }

    public void b() {
        TimerTask timerTask = this.f28873p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f28873p = null;
    }

    public final void c() {
        Long l10 = this.f28864g;
        if (l10 != null) {
            this.f28862e.invoke(Long.valueOf(bd.e.c(d(), l10.longValue())));
        } else {
            this.f28862e.invoke(Long.valueOf(d()));
        }
    }

    public final long d() {
        return (this.f28870m == -1 ? 0L : System.currentTimeMillis() - this.f28870m) + this.f28869l;
    }

    public final void e(String str) {
        q8.d dVar = this.f28863f;
        if (dVar == null) {
            return;
        }
        dVar.a(new IllegalArgumentException(str));
    }

    public final void f() {
        this.f28870m = -1L;
        this.f28871n = -1L;
        this.f28869l = 0L;
    }

    public final void g() {
        Long l10 = this.f28867j;
        Long l11 = this.f28866i;
        if (l10 != null && this.f28871n != -1 && System.currentTimeMillis() - this.f28871n > l10.longValue()) {
            c();
        }
        if (l10 == null && l11 != null) {
            long jLongValue = l11.longValue();
            long jD = jLongValue - d();
            if (jD >= 0) {
                j(this, jD, 0L, new e(this, jLongValue), 2, null);
                return;
            } else {
                this.f28861d.invoke(Long.valueOf(jLongValue));
                f();
                return;
            }
        }
        if (l10 == null || l11 == null) {
            if (l10 == null || l11 != null) {
                return;
            }
            long jLongValue2 = l10.longValue();
            i(jLongValue2, jLongValue2 - (d() % jLongValue2), new f(this));
            return;
        }
        long jLongValue3 = l11.longValue();
        long jLongValue4 = l10.longValue();
        long jD2 = jLongValue4 - (d() % jLongValue4);
        z zVar = new z();
        zVar.f37007c = (jLongValue3 / jLongValue4) - (d() / jLongValue4);
        i(jLongValue4, jD2, new h(jLongValue3, this, zVar, jLongValue4, new i(zVar, this, jLongValue3)));
    }

    public final void h() {
        if (this.f28870m != -1) {
            this.f28869l += System.currentTimeMillis() - this.f28870m;
            this.f28871n = System.currentTimeMillis();
            this.f28870m = -1L;
        }
        b();
    }

    public void i(long j10, long j11, uc.a<w> aVar) {
        j0.i(aVar, "onTick");
        TimerTask timerTask = this.f28873p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f28873p = new C0246d(aVar);
        this.f28870m = System.currentTimeMillis();
        Timer timer = this.f28872o;
        if (timer == null) {
            return;
        }
        timer.scheduleAtFixedRate(this.f28873p, j11, j10);
    }

    public void k() {
        StringBuilder sbA;
        String str;
        String str2;
        int i10 = c.f28874a[this.f28868k.ordinal()];
        if (i10 == 1) {
            b();
            this.f28866i = this.f28864g;
            this.f28867j = this.f28865h;
            this.f28868k = b.WORKING;
            this.f28860c.invoke(Long.valueOf(d()));
            g();
            return;
        }
        if (i10 == 2) {
            sbA = defpackage.a.a("The timer '");
            str = this.f28858a;
            str2 = "' already working!";
        } else {
            if (i10 != 3) {
                return;
            }
            sbA = defpackage.a.a("The timer '");
            str = this.f28858a;
            str2 = "' paused!";
        }
        p7.i.a(sbA, str, str2, this);
    }
}
