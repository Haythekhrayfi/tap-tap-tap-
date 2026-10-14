package x1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f37379i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.work.f f37380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f37385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f37387h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.work.f f37390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f37392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f37393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f37394g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f37395h;

        public a() {
            this.f37388a = false;
            this.f37389b = false;
            this.f37390c = androidx.work.f.NOT_REQUIRED;
            this.f37391d = false;
            this.f37392e = false;
            this.f37393f = -1L;
            this.f37394g = -1L;
            this.f37395h = new c();
        }

        public a(b bVar) {
            this.f37388a = false;
            this.f37389b = false;
            this.f37390c = androidx.work.f.NOT_REQUIRED;
            this.f37391d = false;
            this.f37392e = false;
            this.f37393f = -1L;
            this.f37394g = -1L;
            this.f37395h = new c();
            this.f37388a = bVar.f37381b;
            this.f37389b = bVar.f37382c;
            this.f37390c = bVar.f37380a;
            this.f37391d = bVar.f37383d;
            this.f37392e = bVar.f37384e;
            this.f37393f = bVar.f37385f;
            this.f37394g = bVar.f37386g;
            this.f37395h = bVar.f37387h;
        }

        public b a() {
            return new b(this);
        }
    }

    public b() {
        this.f37380a = androidx.work.f.NOT_REQUIRED;
        this.f37385f = -1L;
        this.f37386g = -1L;
        this.f37387h = new c();
    }

    public b(a aVar) {
        this.f37380a = androidx.work.f.NOT_REQUIRED;
        this.f37385f = -1L;
        this.f37386g = -1L;
        this.f37387h = new c();
        this.f37381b = aVar.f37388a;
        this.f37382c = aVar.f37389b;
        this.f37380a = aVar.f37390c;
        this.f37383d = aVar.f37391d;
        this.f37384e = aVar.f37392e;
        this.f37387h = aVar.f37395h;
        this.f37385f = aVar.f37393f;
        this.f37386g = aVar.f37394g;
    }

    public b(b bVar) {
        this.f37380a = androidx.work.f.NOT_REQUIRED;
        this.f37385f = -1L;
        this.f37386g = -1L;
        this.f37387h = new c();
        this.f37381b = bVar.f37381b;
        this.f37382c = bVar.f37382c;
        this.f37380a = bVar.f37380a;
        this.f37383d = bVar.f37383d;
        this.f37384e = bVar.f37384e;
        this.f37387h = bVar.f37387h;
    }

    public boolean a() {
        return this.f37387h.a() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f37381b == bVar.f37381b && this.f37382c == bVar.f37382c && this.f37383d == bVar.f37383d && this.f37384e == bVar.f37384e && this.f37385f == bVar.f37385f && this.f37386g == bVar.f37386g && this.f37380a == bVar.f37380a) {
            return this.f37387h.equals(bVar.f37387h);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f37380a.hashCode() * 31) + (this.f37381b ? 1 : 0)) * 31) + (this.f37382c ? 1 : 0)) * 31) + (this.f37383d ? 1 : 0)) * 31) + (this.f37384e ? 1 : 0)) * 31;
        long j10 = this.f37385f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f37386g;
        return this.f37387h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
