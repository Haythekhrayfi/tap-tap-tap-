package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f7392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f7396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f7397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7402k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f7403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f7406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f7407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f7409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f7410h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f7411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f7412j;

        public a() {
            this.f7405c = 1;
            this.f7407e = Collections.emptyMap();
            this.f7409g = -1L;
        }

        private a(l lVar) {
            this.f7403a = lVar.f7392a;
            this.f7404b = lVar.f7393b;
            this.f7405c = lVar.f7394c;
            this.f7406d = lVar.f7395d;
            this.f7407e = lVar.f7396e;
            this.f7408f = lVar.f7398g;
            this.f7409g = lVar.f7399h;
            this.f7410h = lVar.f7400i;
            this.f7411i = lVar.f7401j;
            this.f7412j = lVar.f7402k;
        }

        public a a(int i10) {
            this.f7405c = i10;
            return this;
        }

        public a a(long j10) {
            this.f7408f = j10;
            return this;
        }

        public a a(Uri uri) {
            this.f7403a = uri;
            return this;
        }

        public a a(String str) {
            this.f7403a = Uri.parse(str);
            return this;
        }

        public a a(Map<String, String> map) {
            this.f7407e = map;
            return this;
        }

        public a a(byte[] bArr) {
            this.f7406d = bArr;
            return this;
        }

        public l a() {
            com.applovin.exoplayer2.l.a.a(this.f7403a, "The uri must be set.");
            return new l(this.f7403a, this.f7404b, this.f7405c, this.f7406d, this.f7407e, this.f7408f, this.f7409g, this.f7410h, this.f7411i, this.f7412j);
        }

        public a b(int i10) {
            this.f7411i = i10;
            return this;
        }

        public a b(String str) {
            this.f7410h = str;
            return this;
        }
    }

    private l(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        com.applovin.exoplayer2.l.a.a(j13 >= 0);
        com.applovin.exoplayer2.l.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f7392a = uri;
        this.f7393b = j10;
        this.f7394c = i10;
        this.f7395d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f7396e = Collections.unmodifiableMap(new HashMap(map));
        this.f7398g = j11;
        this.f7397f = j13;
        this.f7399h = j12;
        this.f7400i = str;
        this.f7401j = i11;
        this.f7402k = obj;
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String a() {
        return a(this.f7394c);
    }

    public a b() {
        return new a();
    }

    public boolean b(int i10) {
        return (this.f7401j & i10) == i10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DataSpec[");
        sbA.append(a());
        sbA.append(" ");
        sbA.append(this.f7392a);
        sbA.append(", ");
        sbA.append(this.f7398g);
        sbA.append(", ");
        sbA.append(this.f7399h);
        sbA.append(", ");
        sbA.append(this.f7400i);
        sbA.append(", ");
        return android.support.v4.media.b.a(sbA, this.f7401j, "]");
    }
}
