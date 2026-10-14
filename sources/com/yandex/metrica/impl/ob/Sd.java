package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Sd implements Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Td f15001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ci f15002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R2 f15003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Om f15004f;

    public Sd(Td td2, Ci ci) {
        this(td2, ci, new R2(), new Nm());
    }

    public Sd(Td td2, Ci ci, R2 r10, Om om) {
        this.f15002d = ci;
        this.f15001c = td2;
        this.f15003e = r10;
        this.f15004f = om;
        b();
    }

    private void b() {
        this.f15000b = this.f15001c.b();
        this.f14999a = this.f15001c.a();
    }

    @Override // com.yandex.metrica.impl.ob.Ud
    public boolean a() {
        Ci ci = this.f15002d;
        if (ci != null) {
            long j10 = this.f14999a;
            if (j10 != 0) {
                R2 r10 = this.f15003e;
                int i10 = ((1 << (this.f15000b - 1)) - 1) * ci.f13776b;
                int i11 = ci.f13775a;
                if (i10 > i11) {
                    i10 = i11;
                }
                return r10.b(j10, i10, "last send attempt");
            }
        }
        return true;
    }

    public void c() {
        this.f15000b = 1;
        this.f14999a = 0L;
        this.f15001c.a(1);
        this.f15001c.a(this.f14999a);
    }

    public void d() {
        long jB = this.f15004f.b();
        this.f14999a = jB;
        this.f15000b++;
        this.f15001c.a(jB);
        this.f15001c.a(this.f15000b);
    }
}
