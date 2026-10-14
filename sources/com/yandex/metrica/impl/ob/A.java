package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Gm f13613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ln f13616d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13618b;

        public a(String str, long j10) {
            this.f13617a = str;
            this.f13618b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f13618b != aVar.f13618b) {
                return false;
            }
            String str = this.f13617a;
            String str2 = aVar.f13617a;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f13617a;
            int iHashCode = str != null ? str.hashCode() : 0;
            long j10 = this.f13618b;
            return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
    }

    public A(String str, long j10, Im im) {
        this(str, j10, new Ln(im, "[App Environment]"));
    }

    public A(String str, long j10, Ln ln) {
        this.f13614b = j10;
        try {
            this.f13613a = new Gm(str);
        } catch (Throwable unused) {
            this.f13613a = new Gm();
        }
        this.f13616d = ln;
    }

    public synchronized a a() {
        if (this.f13615c) {
            this.f13614b++;
            this.f13615c = false;
        }
        return new a(C2120ym.g(this.f13613a), this.f13614b);
    }

    public synchronized void a(Pair<String, String> pair) {
        if (this.f13616d.b(this.f13613a, (String) pair.first, (String) pair.second)) {
            this.f13615c = true;
        }
    }

    public synchronized void b() {
        this.f13613a = new Gm();
    }

    public synchronized String toString() {
        return "Map size " + this.f13613a.size() + ". Is changed " + this.f13615c + ". Current revision " + this.f13614b;
    }
}
