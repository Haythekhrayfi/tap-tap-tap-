package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class po extends ia0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.d0<Integer> f24152i = com.yandex.mobile.ads.embedded.guava.collect.d0.a(zn1.f27383k);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.d0<Integer> f24153j = com.yandex.mobile.ads.embedded.guava.collect.d0.a(fo1.f20772m);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final et.b f24155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f24157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f24158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ub f24159h;

    public static final class a extends g<a> implements Comparable<a> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f24161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f24162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final c f24163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f24164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f24168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f24169n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f24170o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f24171p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f24172q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f24173r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f24174s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f24175t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f24176u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f24177v;

        public a(int i10, h71 h71Var, int i11, c cVar, int i12, boolean z10, gs0<yv> gs0Var) {
            int i13;
            int iA;
            int iA2;
            super(i10, i11, h71Var);
            this.f24163h = cVar;
            this.f24162g = po.b(this.f24201d.f27106c);
            this.f24164i = po.a(false, i12);
            int i14 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i14 >= cVar.f23258n.size()) {
                    iA = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = po.a(this.f24201d, cVar.f23258n.get(i14), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f24166k = i14;
            this.f24165j = iA;
            this.f24167l = po.a(this.f24201d.f27108e, cVar.f23259o);
            yv yvVar = this.f24201d;
            int i15 = yvVar.f27108e;
            this.f24168m = i15 == 0 || (i15 & 1) != 0;
            this.f24171p = (yvVar.f27107d & 1) != 0;
            int i16 = yvVar.f27128y;
            this.f24172q = i16;
            this.f24173r = yvVar.f27129z;
            int i17 = yvVar.f27111h;
            this.f24174s = i17;
            this.f24161f = (i17 == -1 || i17 <= cVar.f23261q) && (i16 == -1 || i16 <= cVar.f23260p) && gs0Var.apply(yvVar);
            String[] strArrD = da1.d();
            int i18 = 0;
            while (true) {
                if (i18 >= strArrD.length) {
                    iA2 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = po.a(this.f24201d, strArrD[i18], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f24169n = i18;
            this.f24170o = iA2;
            for (int i19 = 0; i19 < cVar.f23262r.size(); i19++) {
                String str = this.f24201d.f27115l;
                if (str != null && str.equals(cVar.f23262r.get(i19))) {
                    i13 = i19;
                    break;
                }
            }
            this.f24175t = i13;
            this.f24176u = qv0.b(i12) == 128;
            this.f24177v = qv0.c(i12) == 64;
            this.f24160e = a(z10, i12);
        }

        public static int a(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }

        private int a(boolean z10, int i10) {
            if (!po.a(this.f24163h.L, i10)) {
                return 0;
            }
            if (!this.f24161f && !this.f24163h.F) {
                return 0;
            }
            if (po.a(false, i10) && this.f24161f && this.f24201d.f27111h != -1) {
                c cVar = this.f24163h;
                if (!cVar.f23268x && !cVar.f23267w && (cVar.N || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final int a() {
            return this.f24160e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            com.yandex.mobile.ads.embedded.guava.collect.d0 d0VarB = (this.f24161f && this.f24164i) ? po.f24152i : po.f24152i.b();
            tj tjVarA = tj.e().a(this.f24164i, aVar.f24164i).a(Integer.valueOf(this.f24166k), Integer.valueOf(aVar.f24166k), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f24165j, aVar.f24165j).a(this.f24167l, aVar.f24167l).a(this.f24171p, aVar.f24171p).a(this.f24168m, aVar.f24168m).a(Integer.valueOf(this.f24169n), Integer.valueOf(aVar.f24169n), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f24170o, aVar.f24170o).a(this.f24161f, aVar.f24161f).a(Integer.valueOf(this.f24175t), Integer.valueOf(aVar.f24175t), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(Integer.valueOf(this.f24174s), Integer.valueOf(aVar.f24174s), this.f24163h.f23267w ? po.f24152i.b() : po.f24153j).a(this.f24176u, aVar.f24176u).a(this.f24177v, aVar.f24177v).a(Integer.valueOf(this.f24172q), Integer.valueOf(aVar.f24172q), d0VarB).a(Integer.valueOf(this.f24173r), Integer.valueOf(aVar.f24173r), d0VarB);
            Integer numValueOf = Integer.valueOf(this.f24174s);
            Integer numValueOf2 = Integer.valueOf(aVar.f24174s);
            if (!da1.a(this.f24162g, aVar.f24162g)) {
                d0VarB = po.f24153j;
            }
            return tjVarA.a(numValueOf, numValueOf2, d0VarB).d();
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final boolean a(g gVar) {
            int i10;
            String str;
            int i11;
            a aVar = (a) gVar;
            c cVar = this.f24163h;
            if ((cVar.I || ((i11 = this.f24201d.f27128y) != -1 && i11 == aVar.f24201d.f27128y)) && (cVar.G || ((str = this.f24201d.f27115l) != null && TextUtils.equals(str, aVar.f24201d.f27115l)))) {
                c cVar2 = this.f24163h;
                if ((cVar2.H || ((i10 = this.f24201d.f27129z) != -1 && i10 == aVar.f24201d.f27129z)) && (cVar2.J || (this.f24176u == aVar.f24176u && this.f24177v == aVar.f24177v))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f24178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24179b;

        public b(yv yvVar, int i10) {
            this.f24178a = (yvVar.f27107d & 1) != 0;
            this.f24179b = po.a(false, i10);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            return tj.e().a(this.f24179b, bVar.f24179b).a(this.f24178a, bVar.f24178a).d();
        }
    }

    public static final class c extends n71 {
        public static final c Q = new a().a();
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        private final SparseArray<Map<i71, d>> O;
        private final SparseBooleanArray P;

        public static final class a extends n71.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<i71, d>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                b();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                b();
            }

            private a(Bundle bundle) {
                super(bundle);
                b();
                c cVar = c.Q;
                l(bundle.getBoolean(n71.a(1000), cVar.B));
                g(bundle.getBoolean(n71.a(1001), cVar.C));
                h(bundle.getBoolean(n71.a(1002), cVar.D));
                f(bundle.getBoolean(n71.a(1014), cVar.E));
                j(bundle.getBoolean(n71.a(1003), cVar.F));
                c(bundle.getBoolean(n71.a(1004), cVar.G));
                d(bundle.getBoolean(n71.a(WebSocketProtocol.CLOSE_NO_STATUS_CODE), cVar.H));
                a(bundle.getBoolean(n71.a(1006), cVar.I));
                b(bundle.getBoolean(n71.a(1015), cVar.J));
                i(bundle.getBoolean(n71.a(1016), cVar.K));
                k(bundle.getBoolean(n71.a(1007), cVar.L));
                m(bundle.getBoolean(n71.a(1008), cVar.M));
                e(bundle.getBoolean(n71.a(1009), cVar.N));
                this.N = new SparseArray<>();
                a(bundle);
                this.O = a(bundle.getIntArray(n71.a(1013)));
            }

            public /* synthetic */ a(Bundle bundle, int i10) {
                this(bundle);
            }

            private static SparseBooleanArray a(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void a(Bundle bundle) {
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                com.yandex.mobile.ads.embedded.guava.collect.p pVarI = parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xf.a(i71.f21618e, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    wf.a<d> aVar = d.f24180d;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i10 = 0; i10 < sparseParcelableArray.size(); i10++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i10), aVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i10)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != pVarI.size()) {
                    return;
                }
                for (int i11 = 0; i11 < intArray.length; i11++) {
                    int i12 = intArray[i11];
                    i71 i71Var = (i71) pVarI.get(i11);
                    d dVar = (d) sparseArray.get(i11);
                    Map<i71, d> map = this.N.get(i12);
                    if (map == null) {
                        map = new HashMap<>();
                        this.N.put(i12, map);
                    }
                    if (!map.containsKey(i71Var) || !da1.a(map.get(i71Var), dVar)) {
                        map.put(i71Var, dVar);
                    }
                }
            }

            private void b() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            @Override // com.yandex.mobile.ads.impl.n71.a
            public final n71.a a(int i10, int i11) {
                super.a(i10, i11);
                return this;
            }

            public final c a() {
                return new c(this, 0);
            }

            @Override // com.yandex.mobile.ads.impl.n71.a
            public final void a(Context context) {
                super.a(context);
            }

            public final void a(boolean z10) {
                this.H = z10;
            }

            @Override // com.yandex.mobile.ads.impl.n71.a
            public final void b(Context context) {
                super.b(context);
            }

            public final void b(boolean z10) {
                this.I = z10;
            }

            public final void c(boolean z10) {
                this.F = z10;
            }

            public final void d(boolean z10) {
                this.G = z10;
            }

            public final void e(boolean z10) {
                this.M = z10;
            }

            public final void f(boolean z10) {
                this.D = z10;
            }

            public final void g(boolean z10) {
                this.B = z10;
            }

            public final void h(boolean z10) {
                this.C = z10;
            }

            public final void i(boolean z10) {
                this.J = z10;
            }

            public final void j(boolean z10) {
                this.E = z10;
            }

            public final void k(boolean z10) {
                this.K = z10;
            }

            public final void l(boolean z10) {
                this.A = z10;
            }

            public final void m(boolean z10) {
                this.L = z10;
            }
        }

        static {
            dp1 dp1Var = dp1.f19967z;
        }

        private c(a aVar) {
            super(aVar);
            this.B = aVar.A;
            this.C = aVar.B;
            this.D = aVar.C;
            this.E = aVar.D;
            this.F = aVar.E;
            this.G = aVar.F;
            this.H = aVar.G;
            this.I = aVar.H;
            this.J = aVar.I;
            this.K = aVar.J;
            this.L = aVar.K;
            this.M = aVar.L;
            this.N = aVar.M;
            this.O = aVar.N;
            this.P = aVar.O;
        }

        public /* synthetic */ c(a aVar, int i10) {
            this(aVar);
        }

        public static c a(Context context) {
            return new a(context).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c b(Bundle bundle) {
            return new a(bundle, 0).a();
        }

        @Deprecated
        public final d a(int i10, i71 i71Var) {
            Map<i71, d> map = this.O.get(i10);
            if (map != null) {
                return map.get(i71Var);
            }
            return null;
        }

        public final boolean b(int i10) {
            return this.P.get(i10);
        }

        @Deprecated
        public final boolean b(int i10, i71 i71Var) {
            Map<i71, d> map = this.O.get(i10);
            return map != null && map.containsKey(i71Var);
        }

        @Override // com.yandex.mobile.ads.impl.n71
        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (super.equals(cVar) && this.B == cVar.B && this.C == cVar.C && this.D == cVar.D && this.E == cVar.E && this.F == cVar.F && this.G == cVar.G && this.H == cVar.H && this.I == cVar.I && this.J == cVar.J && this.K == cVar.K && this.L == cVar.L && this.M == cVar.M && this.N == cVar.N) {
                SparseBooleanArray sparseBooleanArray = this.P;
                SparseBooleanArray sparseBooleanArray2 = cVar.P;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            z10 = true;
                            break;
                        }
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            z10 = false;
                            break;
                        }
                        i10++;
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    SparseArray<Map<i71, d>> sparseArray = this.O;
                    SparseArray<Map<i71, d>> sparseArray2 = cVar.O;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < size2) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                if (iIndexOfKey >= 0) {
                                    Map<i71, d> mapValueAt = sparseArray.valueAt(i11);
                                    Map<i71, d> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        Iterator<Map.Entry<i71, d>> it = mapValueAt.entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z12 = true;
                                                break;
                                            }
                                            Map.Entry<i71, d> next = it.next();
                                            i71 key = next.getKey();
                                            if (!mapValueAt2.containsKey(key) || !da1.a(next.getValue(), mapValueAt2.get(key))) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        z12 = false;
                                        break;
                                    }
                                    if (z12) {
                                        i11++;
                                    }
                                }
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            break;
                        }
                    }
                    z11 = false;
                    break;
                    if (z11) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.n71
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0);
        }
    }

    public static final class d implements wf {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final wf.a<d> f24180d = yn1.f26966z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f24182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24183c;

        public d(int i10, int i11, int[] iArr) {
            this.f24181a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f24182b = iArrCopyOf;
            this.f24183c = i11;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(Integer.toString(0, 36), -1);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int i11 = bundle.getInt(Integer.toString(2, 36), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            pa.a(z10);
            Objects.requireNonNull(intArray);
            return new d(i10, i11, intArray);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24181a == dVar.f24181a && Arrays.equals(this.f24182b, dVar.f24182b) && this.f24183c == dVar.f24183c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f24182b) + (this.f24181a * 31)) * 31) + this.f24183c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f24184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f24185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f24186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f24187d;

        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ po f24188a;

            public a(po poVar) {
                this.f24188a = poVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                po.a(this.f24188a);
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                po.a(this.f24188a);
            }
        }

        private e(Spatializer spatializer) {
            this.f24184a = spatializer;
            this.f24185b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static e a(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new e(audioManager.getSpatializer());
        }

        public final void a(po poVar, Looper looper) {
            if (this.f24187d == null && this.f24186c == null) {
                this.f24187d = new a(poVar);
                Handler handler = new Handler(looper);
                this.f24186c = handler;
                this.f24184a.addOnSpatializerStateChangedListener(new com.applovin.exoplayer2.b.g0(handler, 2), this.f24187d);
            }
        }

        public final boolean a() {
            return this.f24184a.isAvailable();
        }

        public final boolean a(yv yvVar, ub ubVar) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(da1.a(("audio/eac3-joc".equals(yvVar.f27115l) && yvVar.f27128y == 16) ? 12 : yvVar.f27128y));
            int i10 = yvVar.f27129z;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f24184a.canBeSpatialized(ubVar.a().f25586a, channelMask.build());
        }

        public final boolean b() {
            return this.f24184a.isEnabled();
        }

        public final boolean c() {
            return this.f24185b;
        }

        public final void d() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f24187d;
            if (onSpatializerStateChangedListener == null || this.f24186c == null) {
                return;
            }
            this.f24184a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) da1.a(this.f24186c)).removeCallbacksAndMessages(null);
            this.f24186c = null;
            this.f24187d = null;
        }
    }

    public static final class f extends g<f> implements Comparable<f> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f24190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f24191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f24192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f24193i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24194j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24195k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24196l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f24197m;

        public f(int i10, h71 h71Var, int i11, c cVar, int i12, String str) {
            int iA;
            super(i10, i11, h71Var);
            int i13 = 0;
            this.f24190f = po.a(false, i12);
            int i14 = this.f24201d.f27107d & (~cVar.f23265u);
            this.f24191g = (i14 & 1) != 0;
            this.f24192h = (i14 & 2) != 0;
            int i15 = Integer.MAX_VALUE;
            com.yandex.mobile.ads.embedded.guava.collect.p<String> pVarA = cVar.f23263s.isEmpty() ? com.yandex.mobile.ads.embedded.guava.collect.p.a("") : cVar.f23263s;
            int i16 = 0;
            while (true) {
                if (i16 >= pVarA.size()) {
                    iA = 0;
                    break;
                }
                iA = po.a(this.f24201d, pVarA.get(i16), cVar.f23266v);
                if (iA > 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            this.f24193i = i15;
            this.f24194j = iA;
            int iA2 = po.a(this.f24201d.f27108e, cVar.f23264t);
            this.f24195k = iA2;
            this.f24197m = (this.f24201d.f27108e & 1088) != 0;
            int iA3 = po.a(this.f24201d, str, po.b(str) == null);
            this.f24196l = iA3;
            boolean z10 = iA > 0 || (cVar.f23263s.isEmpty() && iA2 > 0) || this.f24191g || (this.f24192h && iA3 > 0);
            if (po.a(cVar.L, i12) && z10) {
                i13 = 1;
            }
            this.f24189e = i13;
        }

        public static int a(List<f> list, List<f> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final int a() {
            return this.f24189e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            tj tjVarA = tj.e().a(this.f24190f, fVar.f24190f).a(Integer.valueOf(this.f24193i), Integer.valueOf(fVar.f24193i), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f24194j, fVar.f24194j).a(this.f24195k, fVar.f24195k).a(this.f24191g, fVar.f24191g).a(Boolean.valueOf(this.f24192h), Boolean.valueOf(fVar.f24192h), this.f24194j == 0 ? com.yandex.mobile.ads.embedded.guava.collect.d0.a() : com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(this.f24196l, fVar.f24196l);
            if (this.f24195k == 0) {
                tjVarA = tjVarA.b(this.f24197m, fVar.f24197m);
            }
            return tjVarA.d();
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final /* bridge */ /* synthetic */ boolean a(g gVar) {
            return false;
        }
    }

    public static abstract class g<T extends g<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h71 f24199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final yv f24201d;

        public interface a<T extends g<T>> {
            List<T> a(int i10, h71 h71Var, int[] iArr);
        }

        public g(int i10, int i11, h71 h71Var) {
            this.f24198a = i10;
            this.f24199b = h71Var;
            this.f24200c = i11;
            this.f24201d = h71Var.a(i11);
        }

        public abstract int a();

        public abstract boolean a(T t10);
    }

    public static final class h extends g<h> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f24202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f24203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f24204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f24205h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f24206i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f24207j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f24208k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24209l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f24210m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f24211n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f24212o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f24213p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f24214q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f24215r;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public h(int i10, h71 h71Var, int i11, c cVar, int i12, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            yv yvVar;
            int i14;
            int i15;
            int i16;
            yv yvVar2;
            int i17;
            int i18;
            int i19;
            super(i10, i11, h71Var);
            this.f24203f = cVar;
            int i20 = cVar.D ? 24 : 16;
            this.f24211n = cVar.C && (i13 & i20) != 0;
            if (!z10 || (((i17 = (yvVar2 = this.f24201d).f27120q) != -1 && i17 > cVar.f23245a) || ((i18 = yvVar2.f27121r) != -1 && i18 > cVar.f23246b))) {
                z11 = false;
            } else {
                float f10 = yvVar2.f27122s;
                if ((f10 == -1.0f || f10 <= cVar.f23247c) && ((i19 = yvVar2.f27111h) == -1 || i19 <= cVar.f23248d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f24202e = z11;
            if (!z10 || (((i14 = (yvVar = this.f24201d).f27120q) != -1 && i14 < cVar.f23249e) || ((i15 = yvVar.f27121r) != -1 && i15 < cVar.f23250f))) {
                z12 = false;
            } else {
                float f11 = yvVar.f27122s;
                if ((f11 == -1.0f || f11 >= cVar.f23251g) && ((i16 = yvVar.f27111h) == -1 || i16 >= cVar.f23252h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f24204g = z12;
            this.f24205h = po.a(false, i12);
            yv yvVar3 = this.f24201d;
            this.f24206i = yvVar3.f27111h;
            this.f24207j = yvVar3.b();
            this.f24209l = po.a(this.f24201d.f27108e, cVar.f23257m);
            int i21 = this.f24201d.f27108e;
            this.f24210m = i21 == 0 || (i21 & 1) != 0;
            int i22 = Integer.MAX_VALUE;
            for (int i23 = 0; i23 < cVar.f23256l.size(); i23++) {
                String str = this.f24201d.f27115l;
                if (str != null && str.equals(cVar.f23256l.get(i23))) {
                    i22 = i23;
                    break;
                }
            }
            this.f24208k = i22;
            this.f24213p = qv0.b(i12) == 128;
            this.f24214q = qv0.c(i12) == 64;
            this.f24215r = po.a(this.f24201d.f27115l);
            this.f24212o = a(i12, i20);
        }

        private int a(int i10, int i11) {
            if ((this.f24201d.f27108e & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !po.a(this.f24203f.L, i10)) {
                return 0;
            }
            if (!this.f24202e && !this.f24203f.B) {
                return 0;
            }
            if (po.a(false, i10) && this.f24204g && this.f24202e && this.f24201d.f27111h != -1) {
                c cVar = this.f24203f;
                if (!cVar.f23268x && !cVar.f23267w && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(h hVar, h hVar2) {
            tj tjVarA = tj.e().a(hVar.f24205h, hVar2.f24205h).a(hVar.f24209l, hVar2.f24209l).a(hVar.f24210m, hVar2.f24210m).a(hVar.f24202e, hVar2.f24202e).a(hVar.f24204g, hVar2.f24204g).a(Integer.valueOf(hVar.f24208k), Integer.valueOf(hVar2.f24208k), com.yandex.mobile.ads.embedded.guava.collect.d0.a().b()).a(hVar.f24213p, hVar2.f24213p).a(hVar.f24214q, hVar2.f24214q);
            if (hVar.f24213p && hVar.f24214q) {
                tjVarA = tjVarA.a(hVar.f24215r, hVar2.f24215r);
            }
            return tjVarA.d();
        }

        public static int a(List<h> list, List<h> list2) {
            return tj.e().a((h) Collections.max(list, zn1.f27379g), (h) Collections.max(list2, fo1.f20768i), zn1.f27380h).a(list.size(), list2.size()).a((h) Collections.max(list, fo1.f20769j), (h) Collections.max(list2, zn1.f27381i), fo1.f20770k).d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(h hVar, h hVar2) {
            com.yandex.mobile.ads.embedded.guava.collect.d0 d0VarB = (hVar.f24202e && hVar.f24205h) ? po.f24152i : po.f24152i.b();
            return tj.e().a(Integer.valueOf(hVar.f24206i), Integer.valueOf(hVar2.f24206i), hVar.f24203f.f23267w ? po.f24152i.b() : po.f24153j).a(Integer.valueOf(hVar.f24207j), Integer.valueOf(hVar2.f24207j), d0VarB).a(Integer.valueOf(hVar.f24206i), Integer.valueOf(hVar2.f24206i), d0VarB).d();
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final int a() {
            return this.f24212o;
        }

        @Override // com.yandex.mobile.ads.impl.po.g
        public final boolean a(g gVar) {
            h hVar = (h) gVar;
            return (this.f24211n || da1.a(this.f24201d.f27115l, hVar.f24201d.f27115l)) && (this.f24203f.E || (this.f24213p == hVar.f24213p && this.f24214q == hVar.f24214q));
        }
    }

    public po(Context context, c cVar, d7.b bVar) {
        this(cVar, bVar, context);
    }

    private po(c cVar, d7.b bVar, Context context) {
        this.f24154c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f24155d = bVar;
        this.f24157f = cVar;
        this.f24159h = ub.f25579g;
        boolean z10 = context != null && da1.d(context);
        this.f24156e = z10;
        if (!z10 && context != null && da1.f19803a >= 32) {
            this.f24158g = e.a(context);
        }
        if (this.f24157f.K && context == null) {
            p90.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(yv yvVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(yvVar.f27106c)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(yvVar.f27106c);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = da1.f19803a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static int a(String str) {
        if (str != null) {
            switch (str) {
                case "video/av01":
                    return 4;
                case "video/hevc":
                    return 3;
                case "video/avc":
                    return 1;
                case "video/x-vnd.on2.vp9":
                    return 2;
            }
        }
        return 0;
    }

    private static Pair a(int i10, ia0.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        ArrayList arrayList = new ArrayList();
        int iA = aVar.a();
        int i12 = 0;
        while (i12 < iA) {
            if (i10 == aVar.a(i12)) {
                i71 i71VarB = aVar.b(i12);
                for (int i13 = 0; i13 < i71VarB.f21619a; i13++) {
                    h71 h71VarA = i71VarB.a(i13);
                    List listA = aVar2.a(i12, h71VarA, iArr[i12][i13]);
                    boolean[] zArr = new boolean[h71VarA.f21329a];
                    int i14 = 0;
                    while (i14 < h71VarA.f21329a) {
                        g gVar = (g) listA.get(i14);
                        int iA2 = gVar.a();
                        if (zArr[i14] || iA2 == 0) {
                            i11 = iA;
                        } else {
                            if (iA2 == 1) {
                                randomAccessA = com.yandex.mobile.ads.embedded.guava.collect.p.a(gVar);
                                i11 = iA;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i15 = i14 + 1;
                                while (i15 < h71VarA.f21329a) {
                                    g gVar2 = (g) listA.get(i15);
                                    int i16 = iA;
                                    if (gVar2.a() == 2 && gVar.a(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iA = i16;
                                }
                                i11 = iA;
                                randomAccessA = arrayList2;
                            }
                            arrayList.add(randomAccessA);
                        }
                        i14++;
                        iA = i11;
                    }
                }
            }
            i12++;
            iA = iA;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((g) list.get(i17)).f24200c;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new et.a(0, gVar3.f24199b, iArr2), Integer.valueOf(gVar3.f24198a));
    }

    public static Pair a(ia0.a aVar, int[][][] iArr, c cVar, String str) throws ns {
        return a(3, aVar, iArr, new com.applovin.exoplayer2.a.e(cVar, str), zn1.f27378f);
    }

    public static Pair a(ia0.a aVar, int[][][] iArr, int[] iArr2, c cVar) throws ns {
        return a(2, aVar, iArr, new com.applovin.exoplayer2.a.e(cVar, iArr2), fo1.f20767h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List a(c cVar, String str, int i10, h71 h71Var, int[] iArr) {
        int i11 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (int i12 = 0; i12 < h71Var.f21329a; i12++) {
            aVar.b(new f(i10, h71Var, i12, cVar, iArr[i12], str));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(c cVar, boolean z10, int i10, h71 h71Var, int[] iArr) {
        gs0 gs0Var = new gs0() { // from class: com.yandex.mobile.ads.impl.np1
            @Override // com.yandex.mobile.ads.impl.gs0
            public final boolean apply(Object obj) {
                return this.f23527c.a((yv) obj);
            }
        };
        int i11 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (int i12 = 0; i12 < h71Var.f21329a; i12++) {
            aVar.b(new a(i10, h71Var, i12, cVar, iArr[i12], z10, gs0Var));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    public static List a(c cVar, int[] iArr, int i10, h71 h71Var, int[] iArr2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = iArr[i10];
        int i16 = cVar.f23253i;
        int i17 = cVar.f23254j;
        boolean z10 = cVar.f23255k;
        if (i16 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < h71Var.f21329a; i19++) {
                yv yvVarA = h71Var.a(i19);
                int i20 = yvVarA.f27120q;
                if (i20 > 0 && (i12 = yvVarA.f27121r) > 0) {
                    if (!z10) {
                        i13 = i16;
                        i14 = i17;
                    } else if ((i20 > i12) != (i16 > i17)) {
                        i14 = i16;
                        i13 = i17;
                    } else {
                        i13 = i16;
                        i14 = i17;
                    }
                    int i21 = i20 * i14;
                    int i22 = i12 * i13;
                    Point point = i21 >= i22 ? new Point(i13, da1.a(i22, i20)) : new Point(da1.a(i21, i12), i14);
                    int i23 = yvVarA.f27120q;
                    int i24 = yvVarA.f27121r;
                    int i25 = i23 * i24;
                    if (i23 >= ((int) (point.x * 0.98f)) && i24 >= ((int) (point.y * 0.98f)) && i25 < i18) {
                        i18 = i25;
                    }
                }
            }
            i11 = i18;
        }
        int i26 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (int i27 = 0; i27 < h71Var.f21329a; i27++) {
            int iB = h71Var.a(i27).b();
            aVar.b(new h(i10, h71Var, i27, cVar, iArr2[i27], i15, i11 == Integer.MAX_VALUE || (iB != -1 && iB <= i11)));
        }
        return aVar.a();
    }

    public static void a(po poVar) {
        boolean z10;
        e eVar;
        synchronized (poVar.f24154c) {
            z10 = poVar.f24157f.K && !poVar.f24156e && da1.f19803a >= 32 && (eVar = poVar.f24158g) != null && eVar.c();
        }
        if (z10) {
            poVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    public boolean a(yv yvVar) {
        boolean z10;
        boolean z11;
        e eVar;
        e eVar2;
        synchronized (this.f24154c) {
            z10 = false;
            if (!this.f24157f.K || this.f24156e) {
                z10 = true;
            } else {
                if (yvVar.f27128y <= 2) {
                    z10 = true;
                } else {
                    String str = yvVar.f27115l;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/ac3":
                            case "audio/ac4":
                            case "audio/eac3":
                                z11 = true;
                                break;
                            default:
                                z11 = false;
                                break;
                        }
                    } else {
                        z11 = false;
                    }
                    if ((z11 && (da1.f19803a < 32 || (eVar2 = this.f24158g) == null || !eVar2.c())) || (da1.f19803a >= 32 && (eVar = this.f24158g) != null && eVar.c() && this.f24158g.a() && this.f24158g.b() && this.f24158g.a(yvVar, this.f24159h))) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public static boolean a(boolean z10, int i10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public final Pair a(ia0.a aVar, int[][][] iArr, c cVar) throws ns {
        boolean z10 = false;
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            if (2 == aVar.a(i10) && aVar.b(i10).f21619a > 0) {
                z10 = true;
                break;
            }
        }
        return a(1, aVar, iArr, new i6.a(this, cVar, z10), fo1.f20766g);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0294  */
    /* JADX WARN: Code duplicated, block: B:188:0x0346  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ia0
    public final Pair a(ia0.a aVar, int[][][] iArr, int[] iArr2) throws ns {
        c cVar;
        String str;
        int i10;
        boolean z10;
        boolean z11;
        m71 m71Var;
        m71 m71Var2;
        h71 h71Var;
        e eVar;
        synchronized (this.f24154c) {
            cVar = this.f24157f;
            if (cVar.K && da1.f19803a >= 32 && (eVar = this.f24158g) != null) {
                eVar.a(this, (Looper) pa.b(Looper.myLooper()));
            }
        }
        int iA = aVar.a();
        int iA2 = aVar.a();
        et.a[] aVarArr = new et.a[iA2];
        Pair pairA = a(aVar, iArr, iArr2, cVar);
        if (pairA != null) {
            aVarArr[((Integer) pairA.second).intValue()] = (et.a) pairA.first;
        }
        Pair pairA2 = a(aVar, iArr, cVar);
        if (pairA2 != null) {
            aVarArr[((Integer) pairA2.second).intValue()] = (et.a) pairA2.first;
        }
        int i11 = 0;
        if (pairA2 == null) {
            str = null;
        } else {
            et.a aVar2 = (et.a) pairA2.first;
            str = aVar2.f20318a.a(aVar2.f20319b[0]).f27106c;
        }
        Pair pairA3 = a(aVar, iArr, cVar, str);
        if (pairA3 != null) {
            aVarArr[((Integer) pairA3.second).intValue()] = (et.a) pairA3.first;
        }
        int i12 = 0;
        while (i12 < iA2) {
            int iA3 = aVar.a(i12);
            if (iA3 != 2 && iA3 != 1 && iA3 != 3) {
                i71 i71VarB = aVar.b(i12);
                int[][] iArr3 = iArr[i12];
                int i13 = i11;
                int i14 = i13;
                h71 h71Var2 = null;
                b bVar = null;
                while (i13 < i71VarB.f21619a) {
                    h71 h71VarA = i71VarB.a(i13);
                    int[] iArr4 = iArr3[i13];
                    b bVar2 = bVar;
                    while (i11 < h71VarA.f21329a) {
                        i71 i71Var = i71VarB;
                        if (a(cVar.L, iArr4[i11])) {
                            h71Var = h71VarA;
                            b bVar3 = new b(h71VarA.a(i11), iArr4[i11]);
                            if (bVar2 == null || bVar3.compareTo(bVar2) > 0) {
                                i14 = i11;
                                bVar2 = bVar3;
                                h71Var2 = h71Var;
                            }
                        } else {
                            h71Var = h71VarA;
                        }
                        i11++;
                        i71VarB = i71Var;
                        h71VarA = h71Var;
                    }
                    i13++;
                    bVar = bVar2;
                    i11 = 0;
                }
                aVarArr[i12] = h71Var2 == null ? null : new et.a(0, h71Var2, new int[]{i14});
            }
            i12++;
            i11 = 0;
        }
        int iA4 = aVar.a();
        HashMap map = new HashMap();
        for (int i15 = 0; i15 < iA4; i15++) {
            i71 i71VarB2 = aVar.b(i15);
            for (int i16 = 0; i16 < i71VarB2.f21619a; i16++) {
                m71 m71Var3 = cVar.f23269y.get(i71VarB2.a(i16));
                if (m71Var3 != null && ((m71Var2 = (m71) map.get(Integer.valueOf(m71Var3.f22936a.f21331c))) == null || (m71Var2.f22937b.isEmpty() && !m71Var3.f22937b.isEmpty()))) {
                    map.put(Integer.valueOf(m71Var3.f22936a.f21331c), m71Var3);
                }
            }
        }
        i71 i71VarB3 = aVar.b();
        for (int i17 = 0; i17 < i71VarB3.f21619a; i17++) {
            m71 m71Var4 = cVar.f23269y.get(i71VarB3.a(i17));
            if (m71Var4 != null && ((m71Var = (m71) map.get(Integer.valueOf(m71Var4.f22936a.f21331c))) == null || (m71Var.f22937b.isEmpty() && !m71Var4.f22937b.isEmpty()))) {
                map.put(Integer.valueOf(m71Var4.f22936a.f21331c), m71Var4);
            }
        }
        for (int i18 = 0; i18 < iA4; i18++) {
            m71 m71Var5 = (m71) map.get(Integer.valueOf(aVar.a(i18)));
            if (m71Var5 != null) {
                aVarArr[i18] = (m71Var5.f22937b.isEmpty() || aVar.b(i18).a(m71Var5.f22936a) == -1) ? null : new et.a(0, m71Var5.f22936a, h70.a(m71Var5.f22937b));
            }
        }
        int iA5 = aVar.a();
        for (int i19 = 0; i19 < iA5; i19++) {
            i71 i71VarB4 = aVar.b(i19);
            if (cVar.b(i19, i71VarB4)) {
                d dVarA = cVar.a(i19, i71VarB4);
                aVarArr[i19] = (dVarA == null || dVarA.f24182b.length == 0) ? null : new et.a(dVarA.f24183c, i71VarB4.a(dVarA.f24181a), dVarA.f24182b);
            }
        }
        for (int i20 = 0; i20 < iA; i20++) {
            int iA6 = aVar.a(i20);
            if (cVar.b(i20) || cVar.f23270z.contains(Integer.valueOf(iA6))) {
                aVarArr[i20] = null;
            }
        }
        et.b bVar4 = this.f24155d;
        ad adVarA = a();
        Objects.requireNonNull((d7.b) bVar4);
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = d7.a(aVarArr);
        et[] etVarArr = new et[iA2];
        int i21 = 0;
        while (i21 < iA2) {
            et.a aVar3 = aVarArr[i21];
            if (aVar3 != null) {
                int[] iArr5 = aVar3.f20319b;
                if (iArr5.length == 0) {
                    aVarArr = aVarArr;
                    pVarA = pVarA;
                } else {
                    etVarArr[i21] = iArr5.length == 1 ? new iv(aVar3.f20318a, iArr5[0], aVar3.f20320c) : new d7(aVar3.f20318a, iArr5, aVar3.f20320c, adVarA, 10000, 25000, (com.yandex.mobile.ads.embedded.guava.collect.p) pVarA.get(i21), ki.f22415a);
                }
            } else {
                aVarArr = aVarArr;
                pVarA = pVarA;
            }
            i21++;
            aVarArr = aVarArr;
            pVarA = pVarA;
        }
        rv0[] rv0VarArr = new rv0[iA];
        for (int i22 = 0; i22 < iA; i22++) {
            rv0VarArr[i22] = !(cVar.b(i22) || cVar.f23270z.contains(Integer.valueOf(aVar.a(i22)))) && (aVar.a(i22) == -2 || etVarArr[i22] != null) ? rv0.f24876b : null;
        }
        if (cVar.M) {
            int i23 = 0;
            int i24 = -1;
            int i25 = -1;
            while (true) {
                if (i23 >= aVar.a()) {
                    i10 = -1;
                    z10 = true;
                    break;
                }
                int iA7 = aVar.a(i23);
                et etVar = etVarArr[i23];
                if (iA7 == 1 || iA7 == 2) {
                    if (etVar != null) {
                        int[][] iArr6 = iArr[i23];
                        int iA8 = aVar.b(i23).a(etVar.a());
                        int i26 = 0;
                        while (true) {
                            if (i26 >= etVar.length()) {
                                z11 = true;
                                break;
                            }
                            if ((iArr6[iA8][etVar.b(i26)] & 32) != 32) {
                                z11 = false;
                                break;
                            }
                            i26++;
                        }
                        if (z11) {
                            if (iA7 == 1) {
                                i10 = -1;
                                if (i25 != -1) {
                                    z10 = false;
                                    break;
                                }
                                i25 = i23;
                            } else {
                                i10 = -1;
                                if (i24 != -1) {
                                    z10 = false;
                                    break;
                                }
                                i24 = i23;
                            }
                        }
                    }
                }
                i23++;
            }
            if (z10 & ((i25 == i10 || i24 == i10) ? false : true)) {
                rv0 rv0Var = new rv0(true);
                rv0VarArr[i25] = rv0Var;
                rv0VarArr[i24] = rv0Var;
            }
        }
        return Pair.create(rv0VarArr, etVarArr);
    }

    @Override // com.yandex.mobile.ads.impl.o71
    public final void a(ub ubVar) {
        boolean z10;
        boolean z11;
        e eVar;
        synchronized (this.f24154c) {
            z10 = true;
            z11 = !this.f24159h.equals(ubVar);
            this.f24159h = ubVar;
        }
        if (z11) {
            synchronized (this.f24154c) {
                if (!this.f24157f.K || this.f24156e || da1.f19803a < 32 || (eVar = this.f24158g) == null || !eVar.c()) {
                    z10 = false;
                }
            }
            if (z10) {
                b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.o71
    public final void d() {
        e eVar;
        synchronized (this.f24154c) {
            if (da1.f19803a >= 32 && (eVar = this.f24158g) != null) {
                eVar.d();
            }
        }
        super.d();
    }
}
