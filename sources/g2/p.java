package g2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f29739s = x1.m.e("WorkSpec");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.h f29741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.c f29744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.c f29745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f29747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f29748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x1.b f29749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.work.a f29751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f29752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f29753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f29754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f29755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.work.g f29757r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.work.h f29759b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29759b != aVar.f29759b) {
                return false;
            }
            return this.f29758a.equals(aVar.f29758a);
        }

        public int hashCode() {
            return this.f29759b.hashCode() + (this.f29758a.hashCode() * 31);
        }
    }

    public p(p pVar) {
        this.f29741b = androidx.work.h.ENQUEUED;
        androidx.work.c cVar = androidx.work.c.f3118c;
        this.f29744e = cVar;
        this.f29745f = cVar;
        this.f29749j = x1.b.f37379i;
        this.f29751l = androidx.work.a.EXPONENTIAL;
        this.f29752m = 30000L;
        this.f29755p = -1L;
        this.f29757r = androidx.work.g.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f29740a = pVar.f29740a;
        this.f29742c = pVar.f29742c;
        this.f29741b = pVar.f29741b;
        this.f29743d = pVar.f29743d;
        this.f29744e = new androidx.work.c(pVar.f29744e);
        this.f29745f = new androidx.work.c(pVar.f29745f);
        this.f29746g = pVar.f29746g;
        this.f29747h = pVar.f29747h;
        this.f29748i = pVar.f29748i;
        this.f29749j = new x1.b(pVar.f29749j);
        this.f29750k = pVar.f29750k;
        this.f29751l = pVar.f29751l;
        this.f29752m = pVar.f29752m;
        this.f29753n = pVar.f29753n;
        this.f29754o = pVar.f29754o;
        this.f29755p = pVar.f29755p;
        this.f29756q = pVar.f29756q;
        this.f29757r = pVar.f29757r;
    }

    public p(String str, String str2) {
        this.f29741b = androidx.work.h.ENQUEUED;
        androidx.work.c cVar = androidx.work.c.f3118c;
        this.f29744e = cVar;
        this.f29745f = cVar;
        this.f29749j = x1.b.f37379i;
        this.f29751l = androidx.work.a.EXPONENTIAL;
        this.f29752m = 30000L;
        this.f29755p = -1L;
        this.f29757r = androidx.work.g.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f29740a = str;
        this.f29742c = str2;
    }

    public long a() {
        long jCurrentTimeMillis;
        long j10;
        if (this.f29741b == androidx.work.h.ENQUEUED && this.f29750k > 0) {
            boolean z10 = this.f29751l == androidx.work.a.LINEAR;
            long j11 = this.f29752m;
            long jScalb = z10 ? j11 * ((long) this.f29750k) : (long) Math.scalb(j11, this.f29750k - 1);
            j10 = this.f29753n;
            jCurrentTimeMillis = Math.min(18000000L, jScalb);
        } else {
            if (c()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j12 = this.f29753n;
                if (j12 == 0) {
                    j12 = this.f29746g + jCurrentTimeMillis2;
                }
                long j13 = this.f29748i;
                long j14 = this.f29747h;
                if (j13 != j14) {
                    return j12 + j14 + (j12 == 0 ? j13 * (-1) : 0L);
                }
                return j12 + (j12 != 0 ? j14 : 0L);
            }
            jCurrentTimeMillis = this.f29753n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j10 = this.f29746g;
        }
        return jCurrentTimeMillis + j10;
    }

    public boolean b() {
        return !x1.b.f37379i.equals(this.f29749j);
    }

    public boolean c() {
        return this.f29747h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f29746g != pVar.f29746g || this.f29747h != pVar.f29747h || this.f29748i != pVar.f29748i || this.f29750k != pVar.f29750k || this.f29752m != pVar.f29752m || this.f29753n != pVar.f29753n || this.f29754o != pVar.f29754o || this.f29755p != pVar.f29755p || this.f29756q != pVar.f29756q || !this.f29740a.equals(pVar.f29740a) || this.f29741b != pVar.f29741b || !this.f29742c.equals(pVar.f29742c)) {
            return false;
        }
        String str = this.f29743d;
        if (str == null ? pVar.f29743d == null : str.equals(pVar.f29743d)) {
            return this.f29744e.equals(pVar.f29744e) && this.f29745f.equals(pVar.f29745f) && this.f29749j.equals(pVar.f29749j) && this.f29751l == pVar.f29751l && this.f29757r == pVar.f29757r;
        }
        return false;
    }

    public int hashCode() {
        int iA = l1.e.a(this.f29742c, (this.f29741b.hashCode() + (this.f29740a.hashCode() * 31)) * 31, 31);
        String str = this.f29743d;
        int iHashCode = (this.f29745f.hashCode() + ((this.f29744e.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f29746g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f29747h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f29748i;
        int iHashCode2 = (this.f29751l.hashCode() + ((((this.f29749j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f29750k) * 31)) * 31;
        long j13 = this.f29752m;
        int i12 = (iHashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f29753n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f29754o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f29755p;
        return this.f29757r.hashCode() + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f29756q ? 1 : 0)) * 31);
    }

    public String toString() {
        return androidx.activity.k.a(defpackage.a.a("{WorkSpec: "), this.f29740a, "}");
    }
}
