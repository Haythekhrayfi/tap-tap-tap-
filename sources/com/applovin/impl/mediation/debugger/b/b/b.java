package com.applovin.impl.mediation.debugger.b.b;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9483g;

    public b(String str) {
        this(str, -1);
    }

    public b(String str, int i10) {
        this.f9481e = str;
        this.f9482f = i10;
        String[] strArrSplit = str.split(",");
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f9483g = z10;
        String strA = "";
        if (z10) {
            this.f9477a = a(strArrSplit[0]);
            this.f9478b = a(strArrSplit[1]);
            this.f9479c = a(strArrSplit[2]);
            if (strArrSplit.length == 4) {
                strA = a(strArrSplit[3]);
            }
        } else {
            this.f9477a = "";
            this.f9478b = "";
            this.f9479c = "";
        }
        this.f9480d = strA;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public boolean a() {
        return this.f9477a.equals("applovin.com");
    }

    public boolean a(Object obj) {
        return obj instanceof b;
    }

    public String b() {
        return this.f9477a;
    }

    public String c() {
        return this.f9478b;
    }

    public String d() {
        return this.f9479c;
    }

    public String e() {
        return this.f9480d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = bVar.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = bVar.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = bVar.d();
        if (strD != null ? !strD.equals(strD2) : strD2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = bVar.e();
        return strE != null ? strE.equals(strE2) : strE2 == null;
    }

    public String f() {
        return this.f9481e;
    }

    public int g() {
        return this.f9482f;
    }

    public boolean h() {
        return this.f9483g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strD = d();
        int iHashCode3 = (iHashCode2 * 59) + (strD == null ? 43 : strD.hashCode());
        String strE = e();
        return (iHashCode3 * 59) + (strE != null ? strE.hashCode() : 43);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppAdsTxtEntry(domainName=");
        sbA.append(b());
        sbA.append(", publisherId=");
        sbA.append(c());
        sbA.append(", relationship=");
        sbA.append(d());
        sbA.append(", certificateAuthorityId=");
        sbA.append(e());
        sbA.append(", rawValue=");
        sbA.append(f());
        sbA.append(", rowNumber=");
        sbA.append(g());
        sbA.append(", valid=");
        sbA.append(h());
        sbA.append(")");
        return sbA.toString();
    }
}
