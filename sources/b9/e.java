package b9;

import android.os.SystemClock;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.a<d9.a> f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.a<s> f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f3365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f3366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f3367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f3368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f3369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f3370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f3371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jc.e f3372l;

    public /* synthetic */ class a extends vc.k implements uc.a<c9.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f3373c = new a();

        public a() {
            super(0, c9.a.class, "<init>", "<init>()V", 0);
        }

        @Override // uc.a
        public c9.a invoke() {
            return new c9.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(uc.a<? extends d9.a> aVar, uc.a<s> aVar2) {
        j0.i(aVar, "histogramReporter");
        j0.i(aVar2, "renderConfig");
        this.f3361a = aVar;
        this.f3362b = aVar2;
        this.f3372l = jc.f.a(kotlin.a.NONE, a.f3373c);
    }

    public final c9.a a() {
        return (c9.a) this.f3372l.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    public final void b() {
        long jUptimeMillis;
        Long l10 = this.f3365e;
        Long l11 = this.f3366f;
        Long l12 = this.f3367g;
        c9.a aVarA = a();
        if (l10 != null) {
            if (l11 != null && l12 != null) {
                jUptimeMillis = l11.longValue() + (SystemClock.uptimeMillis() - l12.longValue());
            } else if (l11 == null && l12 == null) {
                jUptimeMillis = SystemClock.uptimeMillis();
            } else {
                int i10 = e9.a.f29114a;
            }
            long jLongValue = jUptimeMillis - l10.longValue();
            aVarA.f3646a = jLongValue;
            d9.a.a(this.f3361a.invoke(), "Div.Binding", jLongValue, this.f3363c, null, null, 24, null);
        } else {
            int i11 = e9.a.f29114a;
        }
        this.f3365e = null;
        this.f3366f = null;
        this.f3367g = null;
    }

    public final void c() {
        Long l10 = this.f3371k;
        if (l10 != null) {
            a().f3650e += d(l10.longValue());
        }
        if (this.f3364d) {
            c9.a aVarA = a();
            d9.a aVarInvoke = this.f3361a.invoke();
            s sVarInvoke = this.f3362b.invoke();
            d9.a.a(aVarInvoke, "Div.Render.Total", aVarA.f3650e + Math.max(aVarA.f3646a, aVarA.f3647b) + aVarA.f3648c + aVarA.f3649d, this.f3363c, null, sVarInvoke.f3402d, 8, null);
            d9.a.a(aVarInvoke, "Div.Render.Measure", aVarA.f3648c, this.f3363c, null, sVarInvoke.f3399a, 8, null);
            d9.a.a(aVarInvoke, "Div.Render.Layout", aVarA.f3649d, this.f3363c, null, sVarInvoke.f3400b, 8, null);
            d9.a.a(aVarInvoke, "Div.Render.Draw", aVarA.f3650e, this.f3363c, null, sVarInvoke.f3401c, 8, null);
        }
        this.f3364d = false;
        this.f3370j = null;
        this.f3369i = null;
        this.f3371k = null;
        c9.a aVarA2 = a();
        aVarA2.f3648c = 0L;
        aVarA2.f3649d = 0L;
        aVarA2.f3650e = 0L;
        aVarA2.f3646a = 0L;
        aVarA2.f3647b = 0L;
    }

    public final long d(long j10) {
        return SystemClock.uptimeMillis() - j10;
    }
}
