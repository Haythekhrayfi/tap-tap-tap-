package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pm {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f24100k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f24101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f24104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f24105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f24107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f24110j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f24111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f24114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f24115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f24116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f24117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f24118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f24119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f24120j;

        public a() {
            this.f24113c = 1;
            this.f24115e = Collections.emptyMap();
            this.f24117g = -1L;
        }

        private a(pm pmVar) {
            this.f24111a = pmVar.f24101a;
            this.f24112b = pmVar.f24102b;
            this.f24113c = pmVar.f24103c;
            this.f24114d = pmVar.f24104d;
            this.f24115e = pmVar.f24105e;
            this.f24116f = pmVar.f24106f;
            this.f24117g = pmVar.f24107g;
            this.f24118h = pmVar.f24108h;
            this.f24119i = pmVar.f24109i;
            this.f24120j = pmVar.f24110j;
        }

        public /* synthetic */ a(pm pmVar, int i10) {
            this(pmVar);
        }

        public final a a(int i10) {
            this.f24119i = i10;
            return this;
        }

        public final a a(long j10) {
            this.f24117g = j10;
            return this;
        }

        public final a a(Uri uri) {
            this.f24111a = uri;
            return this;
        }

        public final a a(String str) {
            this.f24118h = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f24115e = map;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f24114d = bArr;
            return this;
        }

        public final pm a() {
            if (this.f24111a != null) {
                return new pm(this.f24111a, this.f24112b, this.f24113c, this.f24114d, this.f24115e, this.f24116f, this.f24117g, this.f24118h, this.f24119i, this.f24120j, 0);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public final a b() {
            this.f24113c = 2;
            return this;
        }

        public final a b(long j10) {
            this.f24116f = j10;
            return this;
        }

        public final a b(String str) {
            this.f24111a = Uri.parse(str);
            return this;
        }

        public final a c(long j10) {
            this.f24112b = j10;
            return this;
        }
    }

    static {
        us.a("goog.exo.datasource");
    }

    private pm(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        pa.a(j10 + j11 >= 0);
        pa.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        pa.a(z10);
        this.f24101a = uri;
        this.f24102b = j10;
        this.f24103c = i10;
        this.f24104d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f24105e = Collections.unmodifiableMap(new HashMap(map));
        this.f24106f = j11;
        this.f24107g = j12;
        this.f24108h = str;
        this.f24109i = i11;
        this.f24110j = obj;
    }

    public /* synthetic */ pm(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, int i12) {
        this(uri, j10, i10, bArr, map, j11, j12, str, i11, obj);
    }

    public final a a() {
        return new a(this, 0);
    }

    public final pm a(long j10) {
        return this.f24107g == j10 ? this : new pm(this.f24101a, this.f24102b, this.f24103c, this.f24104d, this.f24105e, 0 + this.f24106f, j10, this.f24108h, this.f24109i, this.f24110j);
    }

    public final boolean a(int i10) {
        return (this.f24109i & i10) == i10;
    }

    public final String b() {
        int i10 = this.f24103c;
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

    public final String toString() {
        String str;
        StringBuilder sbA = v60.a("DataSpec[");
        int i10 = this.f24103c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sbA.append(str);
        sbA.append(" ");
        sbA.append(this.f24101a);
        sbA.append(", ");
        sbA.append(this.f24106f);
        sbA.append(", ");
        sbA.append(this.f24107g);
        sbA.append(", ");
        sbA.append(this.f24108h);
        sbA.append(", ");
        return android.support.v4.media.b.a(sbA, this.f24109i, "]");
    }
}
