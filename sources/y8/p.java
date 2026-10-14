package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f38776e = new p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38777f = "setColorRed";

    public static final class a extends vc.l implements uc.p<a9.a, Double, a9.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38778c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a9.a invoke(a9.a aVar, Double d10) {
            int i10 = aVar.f202a;
            return new a9.a(a9.a.f201b.a(i10 >>> 24, l.a(d10.doubleValue()), (i10 >> 8) & 255, i10 & 255));
        }
    }

    public p() {
        super(a.f38778c);
    }

    @Override // x8.h
    public String c() {
        return f38777f;
    }
}
