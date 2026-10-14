package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2042vj {
    private C2141zi A;
    private C1542bm B;
    private Kl C;
    private Kl D;
    private Kl E;
    private C1868p F;
    private boolean G;
    private Vi H;
    private C1887pi I;
    private Xa J;
    private List<String> K;
    private C1862oi L;
    private G0 M;
    private C2011ui N;
    private Ti O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f17708a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f17710c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f17712e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f17714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f17715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f17716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f17717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f17718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f17719l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<Wc> f17722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Ed f17723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f17724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Bi> f17725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<String> f17727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<String> f17728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map<String, List<String>> f17729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Ui f17730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Di f17731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Ci f17732y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1961si f17709b = new C1961si.a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17711d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17713f = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Ei f17720m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ai f17721n = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<C1709ie> f17733z = new ArrayList();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vj$a */
    public enum a {
        BAD,
        OK
    }

    public Ci A() {
        return this.f17732y;
    }

    public Di B() {
        return this.f17731x;
    }

    public String C() {
        return this.f17715h;
    }

    public Ei D() {
        return this.f17720m;
    }

    public Ti E() {
        return this.O;
    }

    public List<String> F() {
        return this.f17710c;
    }

    public Ui G() {
        return this.f17730w;
    }

    public Vi H() {
        return this.H;
    }

    public Kl I() {
        return this.E;
    }

    public Kl J() {
        return this.C;
    }

    public C1542bm K() {
        return this.B;
    }

    public Kl L() {
        return this.D;
    }

    public Long M() {
        return this.f17724q;
    }

    public Ed N() {
        return this.f17723p;
    }

    public boolean O() {
        return this.G;
    }

    public C1862oi a() {
        return this.L;
    }

    public void a(Ai ai) {
        this.f17721n = ai;
    }

    public void a(Ci ci) {
        this.f17732y = ci;
    }

    public void a(Di di) {
        this.f17731x = di;
    }

    public void a(Ed ed2) {
        this.f17723p = ed2;
    }

    public void a(Ei ei) {
        this.f17720m = ei;
    }

    public void a(G0 g10) {
        this.M = g10;
    }

    public void a(Kl kl) {
        this.E = kl;
    }

    public void a(Ti ti) {
        this.O = ti;
    }

    public void a(Ui ui) {
        this.f17730w = ui;
    }

    public void a(Vi vi) {
        this.H = vi;
    }

    public void a(Xa xa2) {
        this.J = xa2;
    }

    public void a(C1542bm c1542bm) {
        this.B = c1542bm;
    }

    public void a(C1862oi c1862oi) {
        this.L = c1862oi;
    }

    public void a(C1868p c1868p) {
        this.F = c1868p;
    }

    public void a(C1887pi c1887pi) {
        this.I = c1887pi;
    }

    public void a(C1961si c1961si) {
        this.f17709b = c1961si;
    }

    public void a(C2011ui c2011ui) {
        this.N = c2011ui;
    }

    public void a(a aVar) {
        this.f17708a = aVar;
    }

    public void a(C2141zi c2141zi) {
        this.A = c2141zi;
    }

    public void a(Long l10) {
        this.f17724q = l10;
    }

    public void a(String str) {
        this.f17716i = str;
    }

    public void a(String str, boolean z10) {
        this.f17733z.add(new C1709ie(str, z10));
    }

    public void a(List<String> list) {
        this.f17727t = list;
    }

    public void a(Map<String, List<String>> map) {
        this.f17729v = map;
    }

    public void a(boolean z10) {
        this.G = z10;
    }

    public C1868p b() {
        return this.F;
    }

    public void b(Kl kl) {
        this.C = kl;
    }

    public void b(String str) {
        this.f17726s = str;
    }

    public void b(List<Wc> list) {
        this.f17722o = list;
    }

    public C1887pi c() {
        return this.I;
    }

    public void c(Kl kl) {
        this.D = kl;
    }

    public void c(String str) {
        this.f17718k = str;
    }

    public void c(List<String> list) {
        this.f17714g = list;
    }

    public String d() {
        return this.f17716i;
    }

    public void d(String str) {
        this.f17717j = str;
    }

    public void d(List<String> list) {
        this.K = list;
    }

    public C1961si e() {
        return this.f17709b;
    }

    public void e(String str) {
        this.f17719l = str;
    }

    public void e(List<String> list) {
        this.f17728u = list;
    }

    public String f() {
        return this.f17726s;
    }

    public void f(String str) {
        this.f17711d = str;
    }

    public void f(List<String> list) {
        this.f17712e = list;
    }

    public Map<String, List<String>> g() {
        return this.f17729v;
    }

    public void g(String str) {
        this.f17713f = str;
    }

    public void g(List<Bi> list) {
        this.f17725r = list;
    }

    public String h() {
        return this.f17718k;
    }

    public void h(String str) {
        this.f17715h = str;
    }

    public void h(List<String> list) {
        this.f17710c = list;
    }

    public String i() {
        return this.f17717j;
    }

    public List<String> j() {
        return this.f17727t;
    }

    public Xa k() {
        return this.J;
    }

    public G0 l() {
        return this.M;
    }

    public C2011ui m() {
        return this.N;
    }

    public String n() {
        return this.f17719l;
    }

    public String o() {
        return this.f17711d;
    }

    public C2141zi p() {
        return this.A;
    }

    public List<Wc> q() {
        return this.f17722o;
    }

    public List<String> r() {
        return this.f17714g;
    }

    public List<String> s() {
        return this.K;
    }

    public List<String> t() {
        return this.f17728u;
    }

    public List<C1709ie> u() {
        return this.f17733z;
    }

    public Ai v() {
        return this.f17721n;
    }

    public String w() {
        return this.f17713f;
    }

    public List<String> x() {
        return this.f17712e;
    }

    public List<Bi> y() {
        return this.f17725r;
    }

    public a z() {
        return this.f17708a;
    }
}
