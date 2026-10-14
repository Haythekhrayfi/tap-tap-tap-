package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yv implements wf {
    private static final yv G = new a().a();
    public static final wf.a<yv> H = jq1.f22127d;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Metadata f27113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f27114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<byte[]> f27117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DrmInitData f27118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f27119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f27120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f27122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f27123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f27124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f27125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f27126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nj f27127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f27128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f27129z;

    public static final class a {
        private int A;
        private int B;
        private int C;
        private int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f27137h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Metadata f27138i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f27139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f27140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27141l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<byte[]> f27142m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private DrmInitData f27143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f27144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f27145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f27146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f27147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f27148s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f27149t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte[] f27150u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f27151v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private nj f27152w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f27153x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f27154y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f27155z;

        public a() {
            this.f27135f = -1;
            this.f27136g = -1;
            this.f27141l = -1;
            this.f27144o = RecyclerView.FOREVER_NS;
            this.f27145p = -1;
            this.f27146q = -1;
            this.f27147r = -1.0f;
            this.f27149t = 1.0f;
            this.f27151v = -1;
            this.f27153x = -1;
            this.f27154y = -1;
            this.f27155z = -1;
            this.C = -1;
            this.D = 0;
        }

        private a(yv yvVar) {
            this.f27130a = yvVar.f27104a;
            this.f27131b = yvVar.f27105b;
            this.f27132c = yvVar.f27106c;
            this.f27133d = yvVar.f27107d;
            this.f27134e = yvVar.f27108e;
            this.f27135f = yvVar.f27109f;
            this.f27136g = yvVar.f27110g;
            this.f27137h = yvVar.f27112i;
            this.f27138i = yvVar.f27113j;
            this.f27139j = yvVar.f27114k;
            this.f27140k = yvVar.f27115l;
            this.f27141l = yvVar.f27116m;
            this.f27142m = yvVar.f27117n;
            this.f27143n = yvVar.f27118o;
            this.f27144o = yvVar.f27119p;
            this.f27145p = yvVar.f27120q;
            this.f27146q = yvVar.f27121r;
            this.f27147r = yvVar.f27122s;
            this.f27148s = yvVar.f27123t;
            this.f27149t = yvVar.f27124u;
            this.f27150u = yvVar.f27125v;
            this.f27151v = yvVar.f27126w;
            this.f27152w = yvVar.f27127x;
            this.f27153x = yvVar.f27128y;
            this.f27154y = yvVar.f27129z;
            this.f27155z = yvVar.A;
            this.A = yvVar.B;
            this.B = yvVar.C;
            this.C = yvVar.D;
            this.D = yvVar.E;
        }

        public /* synthetic */ a(yv yvVar, int i10) {
            this(yvVar);
        }

        public final a a(float f10) {
            this.f27147r = f10;
            return this;
        }

        public final a a(int i10) {
            this.C = i10;
            return this;
        }

        public final a a(long j10) {
            this.f27144o = j10;
            return this;
        }

        public final a a(DrmInitData drmInitData) {
            this.f27143n = drmInitData;
            return this;
        }

        public final a a(Metadata metadata) {
            this.f27138i = metadata;
            return this;
        }

        public final a a(nj njVar) {
            this.f27152w = njVar;
            return this;
        }

        public final a a(String str) {
            this.f27137h = str;
            return this;
        }

        public final a a(List<byte[]> list) {
            this.f27142m = list;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f27150u = bArr;
            return this;
        }

        public final yv a() {
            return new yv(this, 0);
        }

        public final a b(float f10) {
            this.f27149t = f10;
            return this;
        }

        public final a b(int i10) {
            this.f27135f = i10;
            return this;
        }

        public final a b(String str) {
            this.f27139j = str;
            return this;
        }

        public final a c(int i10) {
            this.f27153x = i10;
            return this;
        }

        public final a c(String str) {
            this.f27130a = str;
            return this;
        }

        public final a d(int i10) {
            this.D = i10;
            return this;
        }

        public final a d(String str) {
            this.f27131b = str;
            return this;
        }

        public final a e(int i10) {
            this.A = i10;
            return this;
        }

        public final a e(String str) {
            this.f27132c = str;
            return this;
        }

        public final a f(int i10) {
            this.B = i10;
            return this;
        }

        public final a f(String str) {
            this.f27140k = str;
            return this;
        }

        public final a g(int i10) {
            this.f27146q = i10;
            return this;
        }

        public final a h(int i10) {
            this.f27130a = Integer.toString(i10);
            return this;
        }

        public final a i(int i10) {
            this.f27141l = i10;
            return this;
        }

        public final a j(int i10) {
            this.f27155z = i10;
            return this;
        }

        public final a k(int i10) {
            this.f27136g = i10;
            return this;
        }

        public final a l(int i10) {
            this.f27134e = i10;
            return this;
        }

        public final a m(int i10) {
            this.f27148s = i10;
            return this;
        }

        public final a n(int i10) {
            this.f27154y = i10;
            return this;
        }

        public final a o(int i10) {
            this.f27133d = i10;
            return this;
        }

        public final a p(int i10) {
            this.f27151v = i10;
            return this;
        }

        public final a q(int i10) {
            this.f27145p = i10;
            return this;
        }
    }

    private yv(a aVar) {
        this.f27104a = aVar.f27130a;
        this.f27105b = aVar.f27131b;
        this.f27106c = da1.d(aVar.f27132c);
        this.f27107d = aVar.f27133d;
        this.f27108e = aVar.f27134e;
        int i10 = aVar.f27135f;
        this.f27109f = i10;
        int i11 = aVar.f27136g;
        this.f27110g = i11;
        this.f27111h = i11 != -1 ? i11 : i10;
        this.f27112i = aVar.f27137h;
        this.f27113j = aVar.f27138i;
        this.f27114k = aVar.f27139j;
        this.f27115l = aVar.f27140k;
        this.f27116m = aVar.f27141l;
        this.f27117n = aVar.f27142m == null ? Collections.emptyList() : aVar.f27142m;
        DrmInitData drmInitData = aVar.f27143n;
        this.f27118o = drmInitData;
        this.f27119p = aVar.f27144o;
        this.f27120q = aVar.f27145p;
        this.f27121r = aVar.f27146q;
        this.f27122s = aVar.f27147r;
        this.f27123t = aVar.f27148s == -1 ? 0 : aVar.f27148s;
        this.f27124u = aVar.f27149t == -1.0f ? 1.0f : aVar.f27149t;
        this.f27125v = aVar.f27150u;
        this.f27126w = aVar.f27151v;
        this.f27127x = aVar.f27152w;
        this.f27128y = aVar.f27153x;
        this.f27129z = aVar.f27154y;
        this.A = aVar.f27155z;
        this.B = aVar.A == -1 ? 0 : aVar.A;
        this.C = aVar.B != -1 ? aVar.B : 0;
        this.D = aVar.C;
        this.E = (aVar.D != 0 || drmInitData == null) ? aVar.D : 1;
    }

    public /* synthetic */ yv(a aVar, int i10) {
        this(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yv a(Bundle bundle) {
        a aVar = new a();
        if (bundle != null) {
            ClassLoader classLoader = xf.class.getClassLoader();
            int i10 = da1.f19803a;
            bundle.setClassLoader(classLoader);
        }
        int i11 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        yv yvVar = G;
        String str = yvVar.f27104a;
        if (string == null) {
            string = str;
        }
        a aVarC = aVar.c(string);
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = yvVar.f27105b;
        if (string2 == null) {
            string2 = str2;
        }
        a aVarD = aVarC.d(string2);
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = yvVar.f27106c;
        if (string3 == null) {
            string3 = str3;
        }
        a aVarK = aVarD.e(string3).o(bundle.getInt(Integer.toString(3, 36), yvVar.f27107d)).l(bundle.getInt(Integer.toString(4, 36), yvVar.f27108e)).b(bundle.getInt(Integer.toString(5, 36), yvVar.f27109f)).k(bundle.getInt(Integer.toString(6, 36), yvVar.f27110g));
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = yvVar.f27112i;
        if (string4 == null) {
            string4 = str4;
        }
        a aVarA = aVarK.a(string4);
        Metadata metadata = (Metadata) bundle.getParcelable(Integer.toString(8, 36));
        Metadata metadata2 = yvVar.f27113j;
        if (metadata == null) {
            metadata = metadata2;
        }
        a aVarA2 = aVarA.a(metadata);
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = yvVar.f27114k;
        if (string5 == null) {
            string5 = str5;
        }
        a aVarB = aVarA2.b(string5);
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = yvVar.f27115l;
        if (string6 == null) {
            string6 = str6;
        }
        aVarB.f(string6).i(bundle.getInt(Integer.toString(11, 36), yvVar.f27116m));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i11, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i11++;
        }
        a aVarA3 = aVar.a(arrayList).a((DrmInitData) bundle.getParcelable(Integer.toString(13, 36)));
        String string7 = Integer.toString(14, 36);
        yv yvVar2 = G;
        aVarA3.a(bundle.getLong(string7, yvVar2.f27119p)).q(bundle.getInt(Integer.toString(15, 36), yvVar2.f27120q)).g(bundle.getInt(Integer.toString(16, 36), yvVar2.f27121r)).a(bundle.getFloat(Integer.toString(17, 36), yvVar2.f27122s)).m(bundle.getInt(Integer.toString(18, 36), yvVar2.f27123t)).b(bundle.getFloat(Integer.toString(19, 36), yvVar2.f27124u)).a(bundle.getByteArray(Integer.toString(20, 36))).p(bundle.getInt(Integer.toString(21, 36), yvVar2.f27126w));
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            aVar.a((nj) nj.f23395f.fromBundle(bundle2));
        }
        aVar.c(bundle.getInt(Integer.toString(23, 36), yvVar2.f27128y)).n(bundle.getInt(Integer.toString(24, 36), yvVar2.f27129z)).j(bundle.getInt(Integer.toString(25, 36), yvVar2.A)).e(bundle.getInt(Integer.toString(26, 36), yvVar2.B)).f(bundle.getInt(Integer.toString(27, 36), yvVar2.C)).a(bundle.getInt(Integer.toString(28, 36), yvVar2.D)).d(bundle.getInt(Integer.toString(29, 36), yvVar2.E));
        return aVar.a();
    }

    public final a a() {
        return new a(this, 0);
    }

    public final boolean a(yv yvVar) {
        if (this.f27117n.size() != yvVar.f27117n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27117n.size(); i10++) {
            if (!Arrays.equals(this.f27117n.get(i10), yvVar.f27117n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        int i10;
        int i11 = this.f27120q;
        if (i11 == -1 || (i10 = this.f27121r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || yv.class != obj.getClass()) {
            return false;
        }
        yv yvVar = (yv) obj;
        int i11 = this.F;
        if (i11 == 0 || (i10 = yvVar.F) == 0 || i11 == i10) {
            return this.f27107d == yvVar.f27107d && this.f27108e == yvVar.f27108e && this.f27109f == yvVar.f27109f && this.f27110g == yvVar.f27110g && this.f27116m == yvVar.f27116m && this.f27119p == yvVar.f27119p && this.f27120q == yvVar.f27120q && this.f27121r == yvVar.f27121r && this.f27123t == yvVar.f27123t && this.f27126w == yvVar.f27126w && this.f27128y == yvVar.f27128y && this.f27129z == yvVar.f27129z && this.A == yvVar.A && this.B == yvVar.B && this.C == yvVar.C && this.D == yvVar.D && this.E == yvVar.E && Float.compare(this.f27122s, yvVar.f27122s) == 0 && Float.compare(this.f27124u, yvVar.f27124u) == 0 && da1.a(this.f27104a, yvVar.f27104a) && da1.a(this.f27105b, yvVar.f27105b) && da1.a(this.f27112i, yvVar.f27112i) && da1.a(this.f27114k, yvVar.f27114k) && da1.a(this.f27115l, yvVar.f27115l) && da1.a(this.f27106c, yvVar.f27106c) && Arrays.equals(this.f27125v, yvVar.f27125v) && da1.a(this.f27113j, yvVar.f27113j) && da1.a(this.f27127x, yvVar.f27127x) && da1.a(this.f27118o, yvVar.f27118o) && a(yvVar);
        }
        return false;
    }

    public final int hashCode() {
        if (this.F == 0) {
            String str = this.f27104a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f27105b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f27106c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f27107d) * 31) + this.f27108e) * 31) + this.f27109f) * 31) + this.f27110g) * 31;
            String str4 = this.f27112i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f27113j;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f27114k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f27115l;
            this.F = ((((((((((((((((Float.floatToIntBits(this.f27124u) + ((((Float.floatToIntBits(this.f27122s) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f27116m) * 31) + ((int) this.f27119p)) * 31) + this.f27120q) * 31) + this.f27121r) * 31)) * 31) + this.f27123t) * 31)) * 31) + this.f27126w) * 31) + this.f27128y) * 31) + this.f27129z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        }
        return this.F;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Format(");
        sbA.append(this.f27104a);
        sbA.append(", ");
        sbA.append(this.f27105b);
        sbA.append(", ");
        sbA.append(this.f27114k);
        sbA.append(", ");
        sbA.append(this.f27115l);
        sbA.append(", ");
        sbA.append(this.f27112i);
        sbA.append(", ");
        sbA.append(this.f27111h);
        sbA.append(", ");
        sbA.append(this.f27106c);
        sbA.append(", [");
        sbA.append(this.f27120q);
        sbA.append(", ");
        sbA.append(this.f27121r);
        sbA.append(", ");
        sbA.append(this.f27122s);
        sbA.append("], [");
        sbA.append(this.f27128y);
        sbA.append(", ");
        return android.support.v4.media.b.a(sbA, this.f27129z, "])");
    }
}
