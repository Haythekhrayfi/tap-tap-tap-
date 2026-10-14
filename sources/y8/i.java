package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f38622e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38623f = "setColorBlue";

    public static final class a extends vc.l implements uc.p<a9.a, Double, a9.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38624c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public a9.a invoke(a9.a aVar, Double d10) {
            int i10 = aVar.f202a;
            return new a9.a(a9.a.f201b.a(i10 >>> 24, (i10 >> 16) & 255, (i10 >> 8) & 255, l.a(d10.doubleValue())));
        }
    }

    public i() {
        super(a.f38624c);
    }

    @Override // x8.h
    public String c() {
        return f38623f;
    }
}
