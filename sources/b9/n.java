package b9;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3385a = new a();

    public static class a implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ic.a<i> f3386b = new h(b.f3391c);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ic.a<b9.a> f3387c = new h(C0060a.f3390c);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ic.a<t> f3388d = new h(d.f3393c);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ic.a<s> f3389e = new h(c.f3392j);

        /* JADX INFO: renamed from: b9.n$a$a, reason: collision with other inner class name */
        public static final class C0060a extends vc.l implements uc.a<b9.a> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0060a f3390c = new C0060a();

            public C0060a() {
                super(0);
            }

            @Override // uc.a
            public b9.a invoke() {
                return new b9.a.C0058a();
            }
        }

        public /* synthetic */ class b extends vc.k implements uc.a<r> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f3391c = new b();

            public b() {
                super(0, r.class, "<init>", "<init>()V", 0);
            }

            @Override // uc.a
            public r invoke() {
                return new r();
            }
        }

        public /* synthetic */ class c extends vc.a implements uc.a<s> {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final c f3392j = new c();

            public c() {
                super(0, s.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
            }

            @Override // uc.a
            public s invoke() {
                return new s(null, null, null, null, 15, null);
            }
        }

        public /* synthetic */ class d extends vc.k implements uc.a<b9.d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f3393c = new d();

            public d() {
                super(0, b9.d.class, "<init>", "<init>()V", 0);
            }

            @Override // uc.a
            public b9.d invoke() {
                return new b9.d();
            }
        }

        @Override // b9.n
        public boolean a() {
            return false;
        }

        @Override // b9.n
        public ic.a<b9.a> b() {
            return this.f3387c;
        }

        @Override // b9.n
        public ic.a<i> c() {
            return this.f3386b;
        }

        @Override // b9.p
        public boolean d() {
            return false;
        }

        @Override // b9.p
        public boolean e() {
            return false;
        }

        @Override // b9.n
        public ic.a<t> f() {
            return this.f3388d;
        }

        @Override // b9.p
        public ic.a<s> g() {
            return this.f3389e;
        }

        @Override // b9.p
        public boolean h() {
            return false;
        }

        @Override // b9.p
        public boolean i() {
            return false;
        }
    }

    boolean a();

    ic.a<b9.a> b();

    ic.a<i> c();

    ic.a<t> f();
}
