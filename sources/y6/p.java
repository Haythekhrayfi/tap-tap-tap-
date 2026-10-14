package y6;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k6.b("appVersion")
    private final int f38352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k6.b("name")
    private String f38353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k6.b("screenWidth")
    private final int f38354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k6.b("screenHeight")
    private final int f38355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k6.b("type")
    private final String f38356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k6.b("date")
    private final long f38357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k6.b("data")
    private final String f38358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient u6.a f38359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient v6.a f38360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient t6.a f38361j;

    public p(int i10, String str, int i11, int i12, String str2, long j10, String str3) {
        fd.j0.i(str, "name");
        fd.j0.i(str2, "type");
        fd.j0.i(str3, "data");
        this.f38352a = i10;
        this.f38353b = str;
        this.f38354c = i11;
        this.f38355d = i12;
        this.f38356e = str2;
        this.f38357f = j10;
        this.f38358g = str3;
    }

    public final int a() {
        return this.f38352a;
    }

    public final String b() {
        return this.f38358g;
    }

    public final int c() {
        return this.f38355d;
    }

    public final int d() {
        return this.f38354c;
    }

    public final String e() {
        return this.f38356e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f38352a == pVar.f38352a && fd.j0.d(this.f38353b, pVar.f38353b) && this.f38354c == pVar.f38354c && this.f38355d == pVar.f38355d && fd.j0.d(this.f38356e, pVar.f38356e) && this.f38357f == pVar.f38357f && fd.j0.d(this.f38358g, pVar.f38358g);
    }

    public int hashCode() {
        return this.f38358g.hashCode() + r6.b.a(this.f38357f, l1.e.a(this.f38356e, r6.a.a(this.f38355d, r6.a.a(this.f38354c, l1.e.a(this.f38353b, Integer.hashCode(this.f38352a) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ExportedSettings(appVersion=");
        sbA.append(this.f38352a);
        sbA.append(", name=");
        sbA.append(this.f38353b);
        sbA.append(", screenWidth=");
        sbA.append(this.f38354c);
        sbA.append(", screenHeight=");
        sbA.append(this.f38355d);
        sbA.append(", type=");
        sbA.append(this.f38356e);
        sbA.append(", date=");
        sbA.append(this.f38357f);
        sbA.append(", data=");
        return s.a.a(sbA, this.f38358g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
