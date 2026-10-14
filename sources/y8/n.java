package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f38735e = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38736f = "setColorGreen";

    public static final class a extends vc.l implements uc.p<a9.a, Double, a9.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38737c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a9.a invoke(a9.a aVar, Double d10) {
            int i10 = aVar.f202a;
            return new a9.a(a9.a.f201b.a(i10 >>> 24, (i10 >> 16) & 255, l.a(d10.doubleValue()), i10 & 255));
        }
    }

    public n() {
        super(a.f38737c);
    }

    @Override // x8.h
    public String c() {
        return f38736f;
    }
}
