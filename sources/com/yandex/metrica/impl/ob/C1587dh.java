package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1587dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1545c0 f15957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2050w2 f15958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15959d = z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15960e = B2.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f15962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1682hc f15963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1657gc f15964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f15965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f15966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Qi f15967l;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dh$a */
    public static abstract class a<I, O> implements InterfaceC1562ch<I, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15970c;

        public a(String str, String str2, String str3) {
            this.f15968a = str;
            this.f15969b = str2;
            this.f15970c = str3;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dh$b */
    public static abstract class b<T extends C1587dh, A extends a> implements d<T, c<A>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15972b;

        public b(Context context, String str) {
            this.f15971a = context;
            this.f15972b = str;
        }

        public abstract T a();
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dh$c */
    public static class c<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Qi f15973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A f15974b;

        public c(Qi qi, A a10) {
            this.f15973a = qi;
            this.f15974b = a10;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dh$d */
    public interface d<T extends C1587dh, D> {
        T a(D d10);
    }

    private static String z() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb2.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb2.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb2.append("_");
        }
        return sb2.toString();
    }

    public C1657gc a() {
        return this.f15964i;
    }

    public void a(Qi qi) {
        this.f15967l = qi;
    }

    public void a(C1545c0 c1545c0) {
        this.f15957b = c1545c0;
    }

    public void a(C1657gc c1657gc) {
        this.f15964i = c1657gc;
    }

    public synchronized void a(C1682hc c1682hc) {
        this.f15963h = c1682hc;
    }

    public void a(C2050w2 c2050w2) {
        this.f15958c = c2050w2;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15962g = str;
    }

    public String b() {
        String str = this.f15962g;
        return str == null ? "" : str;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15961f = str;
    }

    public String c() {
        return this.f15960e;
    }

    public void c(String str) {
        this.f15965j = str;
    }

    public synchronized String d() {
        String strA;
        C1682hc c1682hc = this.f15963h;
        strA = c1682hc == null ? null : c1682hc.a();
        if (strA == null) {
            strA = "";
        }
        return strA;
    }

    public final void d(String str) {
        this.f15966k = str;
    }

    public synchronized String e() {
        String strA;
        C1682hc c1682hc = this.f15963h;
        strA = c1682hc == null ? null : c1682hc.b().a();
        if (strA == null) {
            strA = "";
        }
        return strA;
    }

    public void e(String str) {
        this.f15956a = str;
    }

    public String f() {
        String str = this.f15961f;
        return str == null ? "" : str;
    }

    public synchronized String g() {
        String strI;
        strI = this.f15967l.i();
        if (strI == null) {
            strI = "";
        }
        return strI;
    }

    public synchronized String h() {
        String strJ;
        strJ = this.f15967l.j();
        if (strJ == null) {
            strJ = "";
        }
        return strJ;
    }

    public String i() {
        return this.f15957b.f15869e;
    }

    public String j() {
        String str = this.f15965j;
        return str == null ? com.yandex.metrica.c.PHONE.a() : str;
    }

    public String k() {
        return this.f15959d;
    }

    public String l() {
        String str = this.f15966k;
        return str == null ? "" : str;
    }

    public String m() {
        String str = this.f15957b.f15865a;
        return str == null ? "" : str;
    }

    public String n() {
        return this.f15957b.f15866b;
    }

    public int o() {
        return this.f15957b.f15868d;
    }

    public String p() {
        return this.f15957b.f15867c;
    }

    public String q() {
        return this.f15956a;
    }

    public Ci r() {
        return this.f15967l.J();
    }

    public float s() {
        return this.f15958c.d();
    }

    public int t() {
        return this.f15958c.b();
    }

    public int u() {
        return this.f15958c.c();
    }

    public int v() {
        return this.f15958c.e();
    }

    public Qi w() {
        return this.f15967l;
    }

    public synchronized String x() {
        String strV;
        strV = this.f15967l.V();
        if (strV == null) {
            strV = "";
        }
        return strV;
    }

    public synchronized boolean y() {
        return Oi.a(this.f15967l);
    }
}
