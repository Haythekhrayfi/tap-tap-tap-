package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f38551e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38552f = "setColorAlpha";

    public static final class a extends vc.l implements uc.p<a9.a, Double, a9.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38553c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a9.a invoke(a9.a aVar, Double d10) {
            int i10 = aVar.f202a;
            return new a9.a(a9.a.f201b.a(l.a(d10.doubleValue()), (i10 >> 16) & 255, (i10 >> 8) & 255, i10 & 255));
        }
    }

    public f() {
        super(a.f38553c);
    }

    @Override // x8.h
    public String c() {
        return f38552f;
    }
}
