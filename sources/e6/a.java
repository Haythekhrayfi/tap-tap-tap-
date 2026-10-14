package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f29027p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f29032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f29036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f29037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f29038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f29039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f29040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f29041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f29042o;

    /* JADX INFO: renamed from: e6.a$a, reason: collision with other inner class name */
    public static final class C0249a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f29043a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f29044b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f29045c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f29046d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f29047e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f29048f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f29049g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f29050h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f29051i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b f29052j = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f29053k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f29054l = "";

        public a a() {
            return new a(this.f29043a, this.f29044b, this.f29045c, this.f29046d, this.f29047e, this.f29048f, this.f29049g, 0, this.f29050h, this.f29051i, 0L, this.f29052j, this.f29053k, 0L, this.f29054l);
        }
    }

    public enum b implements t5.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // t5.c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum c implements t5.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // t5.c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum d implements t5.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // t5.c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new C0249a().a();
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f29028a = j10;
        this.f29029b = str;
        this.f29030c = str2;
        this.f29031d = cVar;
        this.f29032e = dVar;
        this.f29033f = str3;
        this.f29034g = str4;
        this.f29035h = i10;
        this.f29036i = i11;
        this.f29037j = str5;
        this.f29038k = j11;
        this.f29039l = bVar;
        this.f29040m = str6;
        this.f29041n = j12;
        this.f29042o = str7;
    }
}
