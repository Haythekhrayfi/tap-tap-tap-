package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ab f4045a = new b().a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<ab> f4046g = k0.f7554e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f4048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f4049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac f4050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f4051f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f4052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4053b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4052a.equals(aVar.f4052a) && com.applovin.exoplayer2.l.ai.a(this.f4053b, aVar.f4053b);
        }

        public int hashCode() {
            int iHashCode = this.f4052a.hashCode() * 31;
            Object obj = this.f4053b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f4055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4061h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d.a f4062i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Object> f4063j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f4064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<Object> f4065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f4066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f4067n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ac f4068o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private e.a f4069p;

        public b() {
            this.f4058e = Long.MIN_VALUE;
            this.f4062i = new d.a();
            this.f4063j = Collections.emptyList();
            this.f4065l = Collections.emptyList();
            this.f4069p = new e.a();
        }

        private b(ab abVar) {
            this();
            c cVar = abVar.f4051f;
            this.f4058e = cVar.f4072b;
            this.f4059f = cVar.f4073c;
            this.f4060g = cVar.f4074d;
            this.f4057d = cVar.f4071a;
            this.f4061h = cVar.f4075e;
            this.f4054a = abVar.f4047b;
            this.f4068o = abVar.f4050e;
            this.f4069p = abVar.f4049d.a();
            f fVar = abVar.f4048c;
            if (fVar != null) {
                this.f4064k = fVar.f4109f;
                this.f4056c = fVar.f4105b;
                this.f4055b = fVar.f4104a;
                this.f4063j = fVar.f4108e;
                this.f4065l = fVar.f4110g;
                this.f4067n = fVar.f4111h;
                d dVar = fVar.f4106c;
                this.f4062i = dVar != null ? dVar.b() : new d.a();
                this.f4066m = fVar.f4107d;
            }
        }

        public b a(Uri uri) {
            this.f4055b = uri;
            return this;
        }

        public b a(Object obj) {
            this.f4067n = obj;
            return this;
        }

        public b a(String str) {
            this.f4054a = (String) com.applovin.exoplayer2.l.a.b(str);
            return this;
        }

        public ab a() {
            f fVar;
            com.applovin.exoplayer2.l.a.b(this.f4062i.f4085b == null || this.f4062i.f4084a != null);
            Uri uri = this.f4055b;
            if (uri != null) {
                fVar = new f(uri, this.f4056c, this.f4062i.f4084a != null ? this.f4062i.a() : null, this.f4066m, this.f4063j, this.f4064k, this.f4065l, this.f4067n);
            } else {
                fVar = null;
            }
            String str = this.f4054a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            c cVar = new c(this.f4057d, this.f4058e, this.f4059f, this.f4060g, this.f4061h);
            e eVarA = this.f4069p.a();
            ac acVar = this.f4068o;
            if (acVar == null) {
                acVar = ac.f4112a;
            }
            return new ab(str2, cVar, fVar, eVarA, acVar);
        }

        public b b(String str) {
            this.f4064k = str;
            return this;
        }
    }

    public static final class c implements g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g.a<c> f4070f = com.applovin.exoplayer2.a.p.f3989e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f4075e;

        private c(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f4071a = j10;
            this.f4072b = j11;
            this.f4073c = z10;
            this.f4074d = z11;
            this.f4075e = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c a(Bundle bundle) {
            return new c(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4071a == cVar.f4071a && this.f4072b == cVar.f4072b && this.f4073c == cVar.f4073c && this.f4074d == cVar.f4074d && this.f4075e == cVar.f4075e;
        }

        public int hashCode() {
            long j10 = this.f4071a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f4072b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f4073c ? 1 : 0)) * 31) + (this.f4074d ? 1 : 0)) * 31) + (this.f4075e ? 1 : 0);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f4076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f4077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.common.a.u<String, String> f4078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f4080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f4081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.applovin.exoplayer2.common.a.s<Integer> f4082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f4083h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f4084a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f4085b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.applovin.exoplayer2.common.a.u<String, String> f4086c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f4087d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f4088e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f4089f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.applovin.exoplayer2.common.a.s<Integer> f4090g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f4091h;

            @Deprecated
            private a() {
                this.f4086c = com.applovin.exoplayer2.common.a.u.a();
                this.f4090g = com.applovin.exoplayer2.common.a.s.g();
            }

            private a(d dVar) {
                this.f4084a = dVar.f4076a;
                this.f4085b = dVar.f4077b;
                this.f4086c = dVar.f4078c;
                this.f4087d = dVar.f4079d;
                this.f4088e = dVar.f4080e;
                this.f4089f = dVar.f4081f;
                this.f4090g = dVar.f4082g;
                this.f4091h = dVar.f4083h;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            com.applovin.exoplayer2.l.a.b((aVar.f4089f && aVar.f4085b == null) ? false : true);
            this.f4076a = (UUID) com.applovin.exoplayer2.l.a.b(aVar.f4084a);
            this.f4077b = aVar.f4085b;
            this.f4078c = aVar.f4086c;
            this.f4079d = aVar.f4087d;
            this.f4081f = aVar.f4089f;
            this.f4080e = aVar.f4088e;
            this.f4082g = aVar.f4090g;
            this.f4083h = aVar.f4091h != null ? Arrays.copyOf(aVar.f4091h, aVar.f4091h.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.f4083h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f4076a.equals(dVar.f4076a) && com.applovin.exoplayer2.l.ai.a(this.f4077b, dVar.f4077b) && com.applovin.exoplayer2.l.ai.a(this.f4078c, dVar.f4078c) && this.f4079d == dVar.f4079d && this.f4081f == dVar.f4081f && this.f4080e == dVar.f4080e && this.f4082g.equals(dVar.f4082g) && Arrays.equals(this.f4083h, dVar.f4083h);
        }

        public int hashCode() {
            int iHashCode = this.f4076a.hashCode() * 31;
            Uri uri = this.f4077b;
            return Arrays.hashCode(this.f4083h) + ((this.f4082g.hashCode() + ((((((((this.f4078c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f4079d ? 1 : 0)) * 31) + (this.f4081f ? 1 : 0)) * 31) + (this.f4080e ? 1 : 0)) * 31)) * 31);
        }
    }

    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4092a = new a().a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g.a<e> f4093g = k0.f7555f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f4096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f4097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f4098f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f4099a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f4100b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f4101c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f4102d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f4103e;

            public a() {
                this.f4099a = -9223372036854775807L;
                this.f4100b = -9223372036854775807L;
                this.f4101c = -9223372036854775807L;
                this.f4102d = -3.4028235E38f;
                this.f4103e = -3.4028235E38f;
            }

            private a(e eVar) {
                this.f4099a = eVar.f4094b;
                this.f4100b = eVar.f4095c;
                this.f4101c = eVar.f4096d;
                this.f4102d = eVar.f4097e;
                this.f4103e = eVar.f4098f;
            }

            public e a() {
                return new e(this);
            }
        }

        @Deprecated
        public e(long j10, long j11, long j12, float f10, float f11) {
            this.f4094b = j10;
            this.f4095c = j11;
            this.f4096d = j12;
            this.f4097e = f10;
            this.f4098f = f11;
        }

        private e(a aVar) {
            this(aVar.f4099a, aVar.f4100b, aVar.f4101c, aVar.f4102d, aVar.f4103e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            return new e(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f4094b == eVar.f4094b && this.f4095c == eVar.f4095c && this.f4096d == eVar.f4096d && this.f4097e == eVar.f4097e && this.f4098f == eVar.f4098f;
        }

        public int hashCode() {
            long j10 = this.f4094b;
            long j11 = this.f4095c;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f4096d;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f4097e;
            int iFloatToIntBits = (i11 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f4098f;
            return iFloatToIntBits + (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f11) : 0);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f4104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f4106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f4107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<Object> f4108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f4109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<Object> f4110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f4111h;

        private f(Uri uri, String str, d dVar, a aVar, List<Object> list, String str2, List<Object> list2, Object obj) {
            this.f4104a = uri;
            this.f4105b = str;
            this.f4106c = dVar;
            this.f4107d = aVar;
            this.f4108e = list;
            this.f4109f = str2;
            this.f4110g = list2;
            this.f4111h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f4104a.equals(fVar.f4104a) && com.applovin.exoplayer2.l.ai.a((Object) this.f4105b, (Object) fVar.f4105b) && com.applovin.exoplayer2.l.ai.a(this.f4106c, fVar.f4106c) && com.applovin.exoplayer2.l.ai.a(this.f4107d, fVar.f4107d) && this.f4108e.equals(fVar.f4108e) && com.applovin.exoplayer2.l.ai.a((Object) this.f4109f, (Object) fVar.f4109f) && this.f4110g.equals(fVar.f4110g) && com.applovin.exoplayer2.l.ai.a(this.f4111h, fVar.f4111h);
        }

        public int hashCode() {
            int iHashCode = this.f4104a.hashCode() * 31;
            String str = this.f4105b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f4106c;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            a aVar = this.f4107d;
            int iHashCode4 = (this.f4108e.hashCode() + ((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            String str2 = this.f4109f;
            int iHashCode5 = (this.f4110g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f4111h;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    private ab(String str, c cVar, f fVar, e eVar, ac acVar) {
        this.f4047b = str;
        this.f4048c = fVar;
        this.f4049d = eVar;
        this.f4050e = acVar;
        this.f4051f = cVar;
    }

    public static ab a(Uri uri) {
        return new b().a(uri).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ab a(Bundle bundle) {
        String str = (String) com.applovin.exoplayer2.l.a.b(bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        e eVar = bundle2 == null ? e.f4092a : (e) e.f4093g.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(a(2));
        ac acVar = bundle3 == null ? ac.f4112a : (ac) ac.H.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(a(3));
        return new ab(str, bundle4 == null ? new c(0L, Long.MIN_VALUE, false, false, false) : (c) c.f4070f.fromBundle(bundle4), null, eVar, acVar);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return com.applovin.exoplayer2.l.ai.a((Object) this.f4047b, (Object) abVar.f4047b) && this.f4051f.equals(abVar.f4051f) && com.applovin.exoplayer2.l.ai.a(this.f4048c, abVar.f4048c) && com.applovin.exoplayer2.l.ai.a(this.f4049d, abVar.f4049d) && com.applovin.exoplayer2.l.ai.a(this.f4050e, abVar.f4050e);
    }

    public int hashCode() {
        int iHashCode = this.f4047b.hashCode() * 31;
        f fVar = this.f4048c;
        return this.f4050e.hashCode() + ((this.f4051f.hashCode() + ((this.f4049d.hashCode() + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
