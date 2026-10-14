package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f38528e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38529f = "getColorAlpha";

    public static final class a extends vc.l implements uc.l<a9.a, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38530c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Integer invoke(a9.a aVar) {
            int i10 = aVar.f202a;
            a9.a.C0007a c0007a = a9.a.f201b;
            return Integer.valueOf(i10 >>> 24);
        }
    }

    public e() {
        super(a.f38530c);
    }

    @Override // x8.h
    public String c() {
        return f38529f;
    }
}
