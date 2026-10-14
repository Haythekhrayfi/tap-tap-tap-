package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.exo.offline.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class bc0 implements wf {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wf.a<bc0> f19170g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f19172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ec0 f19174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f19175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f19176f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f19178b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f19182f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b.a f19179c = new b.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f19180d = new d.a(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<StreamKey> f19181e = Collections.emptyList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<j> f19183g = com.yandex.mobile.ads.embedded.guava.collect.p.i();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e.a f19184h = new e.a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h f19185i = h.f19227c;

        public final a a(Uri uri) {
            this.f19178b = uri;
            return this;
        }

        public final a a(String str) {
            this.f19182f = str;
            return this;
        }

        public final a a(List<StreamKey> list) {
            this.f19181e = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public final bc0 a() {
            g gVar;
            d dVar;
            int i10 = 0;
            pa.b(d.a.e(this.f19180d) == null || d.a.f(this.f19180d) != null);
            Uri uri = this.f19178b;
            if (uri != null) {
                String str = null;
                if (d.a.f(this.f19180d) != null) {
                    d.a aVar = this.f19180d;
                    Objects.requireNonNull(aVar);
                    dVar = new d(aVar, i10);
                } else {
                    dVar = null;
                }
                gVar = new g(uri, str, dVar, this.f19181e, this.f19182f, this.f19183g, null, 0);
            } else {
                gVar = null;
            }
            String str2 = this.f19177a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar2 = this.f19179c;
            Objects.requireNonNull(aVar2);
            return new bc0(str3, new c(aVar2, i10), gVar, this.f19184h.a(), ec0.G, this.f19185i, 0);
        }

        public final a b(String str) {
            Objects.requireNonNull(str);
            this.f19177a = str;
            return this;
        }

        public final a c(String str) {
            this.f19178b = str == null ? null : Uri.parse(str);
            return this;
        }
    }

    public static class b implements wf {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final wf.a<c> f19186f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19191e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f19192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f19193b = Long.MIN_VALUE;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f19194c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f19195d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f19196e;

            public final a a(long j10) {
                pa.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f19193b = j10;
                return this;
            }

            public final a a(boolean z10) {
                this.f19195d = z10;
                return this;
            }

            public final a b(long j10) {
                pa.a(j10 >= 0);
                this.f19192a = j10;
                return this;
            }

            public final a b(boolean z10) {
                this.f19194c = z10;
                return this;
            }

            public final a c(boolean z10) {
                this.f19196e = z10;
                return this;
            }
        }

        static {
            new c(new a(), 0);
            f19186f = yn1.f26947g;
        }

        private b(a aVar) {
            this.f19187a = aVar.f19192a;
            this.f19188b = aVar.f19193b;
            this.f19189c = aVar.f19194c;
            this.f19190d = aVar.f19195d;
            this.f19191e = aVar.f19196e;
        }

        public /* synthetic */ b(a aVar, int i10) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            return new c(new a().b(bundle.getLong(Integer.toString(0, 36), 0L)).a(bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE)).b(bundle.getBoolean(Integer.toString(2, 36), false)).a(bundle.getBoolean(Integer.toString(3, 36), false)).c(bundle.getBoolean(Integer.toString(4, 36), false)), 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19187a == bVar.f19187a && this.f19188b == bVar.f19188b && this.f19189c == bVar.f19189c && this.f19190d == bVar.f19190d && this.f19191e == bVar.f19191e;
        }

        public final int hashCode() {
            long j10 = this.f19187a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f19188b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f19189c ? 1 : 0)) * 31) + (this.f19190d ? 1 : 0)) * 31) + (this.f19191e ? 1 : 0);
        }
    }

    @Deprecated
    public static final class c extends b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f19197g = new c(new b.a(), 0);

        private c(b.a aVar) {
            super(aVar, 0);
        }

        public /* synthetic */ c(b.a aVar, int i10) {
            this(aVar);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f19198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f19199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.q<String, String> f19200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f19203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f19204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f19205h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private com.yandex.mobile.ads.embedded.guava.collect.q<String, String> f19206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f19207b;

            @Deprecated
            private a() {
                this.f19206a = com.yandex.mobile.ads.embedded.guava.collect.q.h();
                this.f19207b = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            }

            public /* synthetic */ a(int i10) {
                this();
            }

            public static /* synthetic */ boolean a(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }

            public static /* synthetic */ boolean b(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }

            public static /* synthetic */ byte[] d(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            public static /* synthetic */ Uri e(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            public static /* synthetic */ UUID f(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            public static /* synthetic */ boolean g(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }
        }

        private d(a aVar) {
            pa.b((a.g(aVar) && a.e(aVar) == null) ? false : true);
            this.f19198a = (UUID) pa.a(a.f(aVar));
            this.f19199b = a.e(aVar);
            this.f19200c = aVar.f19206a;
            this.f19201d = a.a(aVar);
            this.f19203f = a.g(aVar);
            this.f19202e = a.b(aVar);
            this.f19204g = aVar.f19207b;
            this.f19205h = a.d(aVar) != null ? Arrays.copyOf(a.d(aVar), a.d(aVar).length) : null;
        }

        public /* synthetic */ d(a aVar, int i10) {
            this(aVar);
        }

        public final byte[] a() {
            byte[] bArr = this.f19205h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19198a.equals(dVar.f19198a) && da1.a(this.f19199b, dVar.f19199b) && da1.a(this.f19200c, dVar.f19200c) && this.f19201d == dVar.f19201d && this.f19203f == dVar.f19203f && this.f19202e == dVar.f19202e && this.f19204g.equals(dVar.f19204g) && Arrays.equals(this.f19205h, dVar.f19205h);
        }

        public final int hashCode() {
            int iHashCode = this.f19198a.hashCode() * 31;
            Uri uri = this.f19199b;
            return Arrays.hashCode(this.f19205h) + ((this.f19204g.hashCode() + ((((((((this.f19200c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f19201d ? 1 : 0)) * 31) + (this.f19203f ? 1 : 0)) * 31) + (this.f19202e ? 1 : 0)) * 31)) * 31);
        }
    }

    public static final class e implements wf {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f19208f = new a().a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final wf.a<e> f19209g = dp1.f19948g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19214e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f19215a = -9223372036854775807L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f19216b = -9223372036854775807L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f19217c = -9223372036854775807L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f19218d = -3.4028235E38f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f19219e = -3.4028235E38f;

            public final e a() {
                return new e(this, 0);
            }
        }

        @Deprecated
        public e(long j10, long j11, long j12, float f10, float f11) {
            this.f19210a = j10;
            this.f19211b = j11;
            this.f19212c = j12;
            this.f19213d = f10;
            this.f19214e = f11;
        }

        private e(a aVar) {
            this(aVar.f19215a, aVar.f19216b, aVar.f19217c, aVar.f19218d, aVar.f19219e);
        }

        public /* synthetic */ e(a aVar, int i10) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f19210a == eVar.f19210a && this.f19211b == eVar.f19211b && this.f19212c == eVar.f19212c && this.f19213d == eVar.f19213d && this.f19214e == eVar.f19214e;
        }

        public final int hashCode() {
            long j10 = this.f19210a;
            long j11 = this.f19211b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f19212c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f19213d;
            int iFloatToIntBits = (i11 + (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f19214e;
            return iFloatToIntBits + (f11 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? Float.floatToIntBits(f11) : 0);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f19222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<StreamKey> f19223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f19224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.yandex.mobile.ads.embedded.guava.collect.p<j> f19225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f19226g;

        /* JADX WARN: Multi-variable type inference failed */
        private f(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj) {
            this.f19220a = uri;
            this.f19221b = str;
            this.f19222c = dVar;
            this.f19223d = list;
            this.f19224e = str2;
            this.f19225f = pVar;
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVarH = com.yandex.mobile.ads.embedded.guava.collect.p.h();
            for (int i10 = 0; i10 < pVar.size(); i10++) {
                aVarH.b(j.a.a(((j) pVar.get(i10)).a()));
            }
            aVarH.a();
            this.f19226g = obj;
        }

        public /* synthetic */ f(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj, int i10) {
            this(uri, str, dVar, list, str2, pVar, obj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f19220a.equals(fVar.f19220a) && da1.a(this.f19221b, fVar.f19221b) && da1.a(this.f19222c, fVar.f19222c) && da1.a((Object) null, (Object) null) && this.f19223d.equals(fVar.f19223d) && da1.a(this.f19224e, fVar.f19224e) && this.f19225f.equals(fVar.f19225f) && da1.a(this.f19226g, fVar.f19226g);
        }

        public final int hashCode() {
            int iHashCode = this.f19220a.hashCode() * 31;
            String str = this.f19221b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f19222c;
            int iHashCode3 = (this.f19223d.hashCode() + ((((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + 0) * 31)) * 31;
            String str2 = this.f19224e;
            int iHashCode4 = (this.f19225f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f19226g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class g extends f {
        private g(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj) {
            super(uri, str, dVar, list, str2, pVar, obj, 0);
        }

        public /* synthetic */ g(Uri uri, String str, d dVar, List list, String str2, com.yandex.mobile.ads.embedded.guava.collect.p pVar, Object obj, int i10) {
            this(uri, str, dVar, list, str2, pVar, obj);
        }
    }

    public static final class h implements wf {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f19227c = new h(new a(), 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final wf.a<h> f19228d = yn1.f26948h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19230b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f19231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f19232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f19233c;

            public final a a(Uri uri) {
                this.f19231a = uri;
                return this;
            }

            public final a a(Bundle bundle) {
                this.f19233c = bundle;
                return this;
            }

            public final a a(String str) {
                this.f19232b = str;
                return this;
            }
        }

        private h(a aVar) {
            this.f19229a = aVar.f19231a;
            this.f19230b = aVar.f19232b;
            Bundle unused = aVar.f19233c;
        }

        public /* synthetic */ h(a aVar, int i10) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h a(Bundle bundle) {
            return new h(new a().a((Uri) bundle.getParcelable(Integer.toString(0, 36))).a(bundle.getString(Integer.toString(1, 36))).a(bundle.getBundle(Integer.toString(2, 36))), 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return da1.a(this.f19229a, hVar.f19229a) && da1.a(this.f19230b, hVar.f19230b);
        }

        public final int hashCode() {
            Uri uri = this.f19229a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f19230b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends j {
        private i(j.a aVar) {
            super(aVar, 0);
        }

        public /* synthetic */ i(j.a aVar, int i10) {
            this(aVar);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f19239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f19240g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f19241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f19242b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f19243c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19244d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f19245e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f19246f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f19247g;

            private a(j jVar) {
                this.f19241a = jVar.f19234a;
                this.f19242b = jVar.f19235b;
                this.f19243c = jVar.f19236c;
                this.f19244d = jVar.f19237d;
                this.f19245e = jVar.f19238e;
                this.f19246f = jVar.f19239f;
                this.f19247g = jVar.f19240g;
            }

            public /* synthetic */ a(j jVar, int i10) {
                this(jVar);
            }

            public static i a(a aVar) {
                return new i(aVar, 0);
            }
        }

        private j(a aVar) {
            this.f19234a = aVar.f19241a;
            this.f19235b = aVar.f19242b;
            this.f19236c = aVar.f19243c;
            this.f19237d = aVar.f19244d;
            this.f19238e = aVar.f19245e;
            this.f19239f = aVar.f19246f;
            this.f19240g = aVar.f19247g;
        }

        public /* synthetic */ j(a aVar, int i10) {
            this(aVar);
        }

        public final a a() {
            return new a(this, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f19234a.equals(jVar.f19234a) && da1.a(this.f19235b, jVar.f19235b) && da1.a(this.f19236c, jVar.f19236c) && this.f19237d == jVar.f19237d && this.f19238e == jVar.f19238e && da1.a(this.f19239f, jVar.f19239f) && da1.a(this.f19240g, jVar.f19240g);
        }

        public final int hashCode() {
            int iHashCode = this.f19234a.hashCode() * 31;
            String str = this.f19235b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19236c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19237d) * 31) + this.f19238e) * 31;
            String str3 = this.f19239f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f19240g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    static {
        new a().a();
        f19170g = dp1.f19947f;
    }

    private bc0(String str, c cVar, g gVar, e eVar, ec0 ec0Var, h hVar) {
        this.f19171a = str;
        this.f19172b = gVar;
        this.f19173c = eVar;
        this.f19174d = ec0Var;
        this.f19175e = cVar;
        this.f19176f = hVar;
    }

    public /* synthetic */ bc0(String str, c cVar, g gVar, e eVar, ec0 ec0Var, h hVar, int i10) {
        this(str, cVar, gVar, eVar, ec0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bc0 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        Objects.requireNonNull(string);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        e eVar = bundle2 == null ? e.f19208f : (e) e.f19209g.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        ec0 ec0Var = bundle3 == null ? ec0.G : (ec0) ec0.H.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        c cVar = bundle4 == null ? c.f19197g : (c) b.f19186f.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new bc0(string, cVar, null, eVar, ec0Var, bundle5 == null ? h.f19227c : (h) h.f19228d.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        return da1.a(this.f19171a, bc0Var.f19171a) && this.f19175e.equals(bc0Var.f19175e) && da1.a(this.f19172b, bc0Var.f19172b) && da1.a(this.f19173c, bc0Var.f19173c) && da1.a(this.f19174d, bc0Var.f19174d) && da1.a(this.f19176f, bc0Var.f19176f);
    }

    public final int hashCode() {
        int iHashCode = this.f19171a.hashCode() * 31;
        g gVar = this.f19172b;
        return this.f19176f.hashCode() + ((this.f19174d.hashCode() + ((this.f19175e.hashCode() + ((this.f19173c.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
