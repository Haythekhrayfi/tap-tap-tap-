package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ai;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.exoplayer2.j.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f7183a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ai<Integer> f7184b = ai.a(m0.d.f33127f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ai<Integer> f7185c = ai.a(l.f7310e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.d.b f7186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<C0103c> f7187e;

    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0103c f7190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f7197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f7198k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f7199l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f7200m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7201n;

        public a(v vVar, C0103c c0103c, int i10) {
            int i11;
            int iA;
            int iA2;
            this.f7190c = c0103c;
            this.f7189b = c.a(vVar.f8189c);
            this.f7191d = c.a(i10, false);
            int i12 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i12 >= c0103c.C.size()) {
                    iA = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA = c.a(vVar, c0103c.C.get(i12), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f7193f = i12;
            this.f7192e = iA;
            this.f7194g = Integer.bitCount(vVar.f8191e & c0103c.D);
            boolean z10 = true;
            this.f7197j = (vVar.f8190d & 1) != 0;
            int i13 = vVar.f8211y;
            this.f7198k = i13;
            this.f7199l = vVar.f8212z;
            int i14 = vVar.f8194h;
            this.f7200m = i14;
            if ((i14 != -1 && i14 > c0103c.F) || (i13 != -1 && i13 > c0103c.E)) {
                z10 = false;
            }
            this.f7188a = z10;
            String[] strArrD = com.applovin.exoplayer2.l.ai.d();
            int i15 = 0;
            while (true) {
                if (i15 >= strArrD.length) {
                    iA2 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iA2 = c.a(vVar, strArrD[i15], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f7195h = i15;
            this.f7196i = iA2;
            for (int i16 = 0; i16 < c0103c.G.size(); i16++) {
                String str = vVar.f8198l;
                if (str != null && str.equals(c0103c.G.get(i16))) {
                    i11 = i16;
                    break;
                }
            }
            this.f7201n = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            ai aiVarA = (this.f7188a && this.f7191d) ? c.f7184b : c.f7184b.a();
            n nVarA = n.a().b(this.f7191d, aVar.f7191d).a(Integer.valueOf(this.f7193f), Integer.valueOf(aVar.f7193f), ai.b().a()).a(this.f7192e, aVar.f7192e).a(this.f7194g, aVar.f7194g).b(this.f7188a, aVar.f7188a).a(Integer.valueOf(this.f7201n), Integer.valueOf(aVar.f7201n), ai.b().a()).a(Integer.valueOf(this.f7200m), Integer.valueOf(aVar.f7200m), this.f7190c.K ? c.f7184b.a() : c.f7185c).b(this.f7197j, aVar.f7197j).a(Integer.valueOf(this.f7195h), Integer.valueOf(aVar.f7195h), ai.b().a()).a(this.f7196i, aVar.f7196i).a(Integer.valueOf(this.f7198k), Integer.valueOf(aVar.f7198k), aiVarA).a(Integer.valueOf(this.f7199l), Integer.valueOf(aVar.f7199l), aiVarA);
            Integer numValueOf = Integer.valueOf(this.f7200m);
            Integer numValueOf2 = Integer.valueOf(aVar.f7200m);
            if (!com.applovin.exoplayer2.l.ai.a((Object) this.f7189b, (Object) aVar.f7189b)) {
                aiVarA = c.f7185c;
            }
            return nVarA.a(numValueOf, numValueOf2, aiVarA).b();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f7202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7203b;

        public b(v vVar, int i10) {
            this.f7202a = (vVar.f8190d & 1) != 0;
            this.f7203b = c.a(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return n.a().b(this.f7203b, bVar.f7203b).b(this.f7202a, bVar.f7202a).b();
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.j.c$c, reason: collision with other inner class name */
    public static final class C0103c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0103c f7204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public static final C0103c f7205b;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final com.applovin.exoplayer2.g.a<C0103c> f7206n;
        private final SparseArray<Map<ad, e>> O;
        private final SparseBooleanArray P;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f7208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f7209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f7210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f7211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f7212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f7213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f7214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f7215k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f7216l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f7217m;

        static {
            C0103c c0103cB = new d().b();
            f7204a = c0103cB;
            f7205b = c0103cB;
            f7206n = z.f4660p;
        }

        private C0103c(d dVar) {
            super(dVar);
            this.f7208d = dVar.f7218a;
            this.f7209e = dVar.f7219b;
            this.f7210f = dVar.f7220c;
            this.f7211g = dVar.f7221d;
            this.f7212h = dVar.f7222e;
            this.f7213i = dVar.f7223f;
            this.f7214j = dVar.f7224g;
            this.f7207c = dVar.f7225h;
            this.f7215k = dVar.f7226i;
            this.f7216l = dVar.f7227j;
            this.f7217m = dVar.f7228k;
            this.O = dVar.f7229l;
            this.P = dVar.f7230m;
        }

        public static C0103c a(Context context) {
            return new d(context).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0103c a(Bundle bundle) {
            return new d(bundle).b();
        }

        private static boolean a(SparseArray<Map<ad, e>> sparseArray, SparseArray<Map<ad, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !a(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<ad, e> map, Map<ad, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<ad, e> entry : map.entrySet()) {
                ad key = entry.getKey();
                if (!map2.containsKey(key) || !com.applovin.exoplayer2.l.ai.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public final boolean a(int i10) {
            return this.P.get(i10);
        }

        public final boolean a(int i10, ad adVar) {
            Map<ad, e> map = this.O.get(i10);
            return map != null && map.containsKey(adVar);
        }

        public final e b(int i10, ad adVar) {
            Map<ad, e> map = this.O.get(i10);
            if (map != null) {
                return map.get(adVar);
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.j.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0103c.class != obj.getClass()) {
                return false;
            }
            C0103c c0103c = (C0103c) obj;
            return super.equals(c0103c) && this.f7208d == c0103c.f7208d && this.f7209e == c0103c.f7209e && this.f7210f == c0103c.f7210f && this.f7211g == c0103c.f7211g && this.f7212h == c0103c.f7212h && this.f7213i == c0103c.f7213i && this.f7214j == c0103c.f7214j && this.f7207c == c0103c.f7207c && this.f7215k == c0103c.f7215k && this.f7216l == c0103c.f7216l && this.f7217m == c0103c.f7217m && a(this.P, c0103c.P) && a(this.O, c0103c.O);
        }

        @Override // com.applovin.exoplayer2.j.i
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f7208d ? 1 : 0)) * 31) + (this.f7209e ? 1 : 0)) * 31) + (this.f7210f ? 1 : 0)) * 31) + (this.f7211g ? 1 : 0)) * 31) + (this.f7212h ? 1 : 0)) * 31) + (this.f7213i ? 1 : 0)) * 31) + (this.f7214j ? 1 : 0)) * 31) + this.f7207c) * 31) + (this.f7215k ? 1 : 0)) * 31) + (this.f7216l ? 1 : 0)) * 31) + (this.f7217m ? 1 : 0);
        }
    }

    public static final class d extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f7226i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f7227j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f7228k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final SparseArray<Map<ad, e>> f7229l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final SparseBooleanArray f7230m;

        @Deprecated
        public d() {
            this.f7229l = new SparseArray<>();
            this.f7230m = new SparseBooleanArray();
            c();
        }

        public d(Context context) {
            super(context);
            this.f7229l = new SparseArray<>();
            this.f7230m = new SparseBooleanArray();
            c();
        }

        private d(Bundle bundle) {
            super(bundle);
            C0103c c0103c = C0103c.f7204a;
            a(bundle.getBoolean(C0103c.d(1000), c0103c.f7208d));
            b(bundle.getBoolean(C0103c.d(1001), c0103c.f7209e));
            c(bundle.getBoolean(C0103c.d(1002), c0103c.f7210f));
            d(bundle.getBoolean(C0103c.d(1003), c0103c.f7211g));
            e(bundle.getBoolean(C0103c.d(1004), c0103c.f7212h));
            f(bundle.getBoolean(C0103c.d(WebSocketProtocol.CLOSE_NO_STATUS_CODE), c0103c.f7213i));
            g(bundle.getBoolean(C0103c.d(1006), c0103c.f7214j));
            a(bundle.getInt(C0103c.d(1007), c0103c.f7207c));
            h(bundle.getBoolean(C0103c.d(1008), c0103c.f7215k));
            i(bundle.getBoolean(C0103c.d(1009), c0103c.f7216l));
            j(bundle.getBoolean(C0103c.d(1010), c0103c.f7217m));
            this.f7229l = new SparseArray<>();
            a(bundle);
            this.f7230m = a(bundle.getIntArray(C0103c.d(1014)));
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C0103c.d(1011));
            List listA = com.applovin.exoplayer2.l.c.a(ad.f6510c, bundle.getParcelableArrayList(C0103c.d(1012)), s.g());
            SparseArray sparseArrayA = com.applovin.exoplayer2.l.c.a(e.f7231e, (SparseArray<Bundle>) bundle.getSparseParcelableArray(C0103c.d(1013)), new SparseArray());
            if (intArray == null || intArray.length != listA.size()) {
                return;
            }
            for (int i10 = 0; i10 < intArray.length; i10++) {
                a(intArray[i10], (ad) listA.get(i10), (e) sparseArrayA.get(i10));
            }
        }

        private void c() {
            this.f7218a = true;
            this.f7219b = false;
            this.f7220c = true;
            this.f7221d = true;
            this.f7222e = false;
            this.f7223f = false;
            this.f7224g = false;
            this.f7225h = 0;
            this.f7226i = true;
            this.f7227j = false;
            this.f7228k = true;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0103c b() {
            return new C0103c(this);
        }

        public d a(int i10) {
            this.f7225h = i10;
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(int i10, int i11, boolean z10) {
            super.b(i10, i11, z10);
            return this;
        }

        public final d a(int i10, ad adVar, e eVar) {
            Map<ad, e> map = this.f7229l.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.f7229l.put(i10, map);
            }
            if (map.containsKey(adVar) && com.applovin.exoplayer2.l.ai.a(map.get(adVar), eVar)) {
                return this;
            }
            map.put(adVar, eVar);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(Context context) {
            super.b(context);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(Context context, boolean z10) {
            super.b(context, z10);
            return this;
        }

        public d a(boolean z10) {
            this.f7218a = z10;
            return this;
        }

        public d b(boolean z10) {
            this.f7219b = z10;
            return this;
        }

        public d c(boolean z10) {
            this.f7220c = z10;
            return this;
        }

        public d d(boolean z10) {
            this.f7221d = z10;
            return this;
        }

        public d e(boolean z10) {
            this.f7222e = z10;
            return this;
        }

        public d f(boolean z10) {
            this.f7223f = z10;
            return this;
        }

        public d g(boolean z10) {
            this.f7224g = z10;
            return this;
        }

        public d h(boolean z10) {
            this.f7226i = z10;
            return this;
        }

        public d i(boolean z10) {
            this.f7227j = z10;
            return this;
        }

        public d j(boolean z10) {
            this.f7228k = z10;
            return this;
        }
    }

    public static final class e implements com.applovin.exoplayer2.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final com.applovin.exoplayer2.g.a<e> f7231e = p.f4010z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7235d;

        public e(int i10, int[] iArr, int i11) {
            this.f7232a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7233b = iArrCopyOf;
            this.f7234c = iArr.length;
            this.f7235d = i11;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i11 = bundle.getInt(a(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            com.applovin.exoplayer2.l.a.a(z10);
            com.applovin.exoplayer2.l.a.b(intArray);
            return new e(i10, intArray, i11);
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7232a == eVar.f7232a && Arrays.equals(this.f7233b, eVar.f7233b) && this.f7235d == eVar.f7235d;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f7233b) + (this.f7232a * 31)) * 31) + this.f7235d;
        }
    }

    public static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f7238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7243h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f7244i;

        public f(v vVar, C0103c c0103c, int i10, String str) {
            int iA;
            boolean z10 = false;
            this.f7237b = c.a(i10, false);
            int i11 = vVar.f8190d & (~c0103c.f7207c);
            this.f7238c = (i11 & 1) != 0;
            this.f7239d = (i11 & 2) != 0;
            int i12 = Integer.MAX_VALUE;
            s<String> sVarA = c0103c.H.isEmpty() ? s.a("") : c0103c.H;
            int i13 = 0;
            while (true) {
                if (i13 >= sVarA.size()) {
                    iA = 0;
                    break;
                }
                iA = c.a(vVar, sVarA.get(i13), c0103c.J);
                if (iA > 0) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            this.f7240e = i12;
            this.f7241f = iA;
            int iBitCount = Integer.bitCount(vVar.f8191e & c0103c.I);
            this.f7242g = iBitCount;
            this.f7244i = (vVar.f8191e & 1088) != 0;
            int iA2 = c.a(vVar, str, c.a(str) == null);
            this.f7243h = iA2;
            if (iA > 0 || ((c0103c.H.isEmpty() && iBitCount > 0) || this.f7238c || (this.f7239d && iA2 > 0))) {
                z10 = true;
            }
            this.f7236a = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            n nVarA = n.a().b(this.f7237b, fVar.f7237b).a(Integer.valueOf(this.f7240e), Integer.valueOf(fVar.f7240e), ai.b().a()).a(this.f7241f, fVar.f7241f).a(this.f7242g, fVar.f7242g).b(this.f7238c, fVar.f7238c).a(Boolean.valueOf(this.f7239d), Boolean.valueOf(fVar.f7239d), this.f7241f == 0 ? ai.b() : ai.b().a()).a(this.f7243h, fVar.f7243h);
            if (this.f7242g == 0) {
                nVarA = nVarA.a(this.f7244i, fVar.f7244i);
            }
            return nVarA.b();
        }
    }

    public static final class g implements Comparable<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0103c f7246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f7247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7251g;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public g(v vVar, C0103c c0103c, int i10, boolean z10) {
            boolean z11;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            this.f7246b = c0103c;
            boolean z12 = true;
            if (!z10 || (((i14 = vVar.f8203q) != -1 && i14 > c0103c.f7270q) || ((i15 = vVar.f8204r) != -1 && i15 > c0103c.f7271r))) {
                z11 = false;
            } else {
                float f10 = vVar.f8205s;
                if ((f10 == -1.0f || f10 <= c0103c.f7272s) && ((i16 = vVar.f8194h) == -1 || i16 <= c0103c.f7273t)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f7245a = z11;
            if (!z10 || (((i11 = vVar.f8203q) != -1 && i11 < c0103c.f7274u) || ((i12 = vVar.f8204r) != -1 && i12 < c0103c.f7275v))) {
                z12 = false;
            } else {
                float f11 = vVar.f8205s;
                if ((f11 != -1.0f && f11 < c0103c.f7276w) || ((i13 = vVar.f8194h) != -1 && i13 < c0103c.f7277x)) {
                    z12 = false;
                }
            }
            this.f7247c = z12;
            this.f7248d = c.a(i10, false);
            this.f7249e = vVar.f8194h;
            this.f7250f = vVar.b();
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 0; i18 < c0103c.B.size(); i18++) {
                String str = vVar.f8198l;
                if (str != null && str.equals(c0103c.B.get(i18))) {
                    i17 = i18;
                    break;
                }
            }
            this.f7251g = i17;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            ai aiVarA = (this.f7245a && this.f7248d) ? c.f7184b : c.f7184b.a();
            return n.a().b(this.f7248d, gVar.f7248d).b(this.f7245a, gVar.f7245a).b(this.f7247c, gVar.f7247c).a(Integer.valueOf(this.f7251g), Integer.valueOf(gVar.f7251g), ai.b().a()).a(Integer.valueOf(this.f7249e), Integer.valueOf(gVar.f7249e), this.f7246b.K ? c.f7184b.a() : c.f7185c).a(Integer.valueOf(this.f7250f), Integer.valueOf(gVar.f7250f), aiVarA).a(Integer.valueOf(this.f7249e), Integer.valueOf(gVar.f7249e), aiVarA).b();
        }
    }

    @Deprecated
    public c() {
        this(C0103c.f7204a, new com.applovin.exoplayer2.j.a.b());
    }

    public c(Context context) {
        this(context, new com.applovin.exoplayer2.j.a.b());
    }

    public c(Context context, com.applovin.exoplayer2.j.d.b bVar) {
        this(C0103c.a(context), bVar);
    }

    public c(C0103c c0103c, com.applovin.exoplayer2.j.d.b bVar) {
        this.f7186d = bVar;
        this.f7187e = new AtomicReference<>(c0103c);
    }

    private static int a(ac acVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int iIntValue = list.get(i20).intValue();
            if (a(acVar.a(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    public static int a(v vVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f8189c)) {
            return 4;
        }
        String strA = a(str);
        String strA2 = a(vVar.f8189c);
        if (strA2 == null || strA == null) {
            return (z10 && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return com.applovin.exoplayer2.l.ai.b(strA2, "-")[0].equals(com.applovin.exoplayer2.l.ai.b(strA, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    private static Point a(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, com.applovin.exoplayer2.l.ai.a(i15, i12)) : new Point(com.applovin.exoplayer2.l.ai.a(i14, i13), i10);
    }

    private static com.applovin.exoplayer2.j.d.a a(ad adVar, int[][] iArr, int i10, C0103c c0103c) {
        C0103c c0103c2 = c0103c;
        int i11 = c0103c2.f7210f ? 24 : 16;
        boolean z10 = c0103c2.f7209e && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < adVar.f6511b) {
            ac acVarA = adVar.a(i12);
            int i13 = i12;
            int[] iArrA = a(acVarA, iArr[i12], z10, i11, c0103c2.f7270q, c0103c2.f7271r, c0103c2.f7272s, c0103c2.f7273t, c0103c2.f7274u, c0103c2.f7275v, c0103c2.f7276w, c0103c2.f7277x, c0103c2.f7278y, c0103c2.f7279z, c0103c2.A);
            if (iArrA.length > 0) {
                return new com.applovin.exoplayer2.j.d.a(acVarA, iArrA);
            }
            i12 = i13 + 1;
            c0103c2 = c0103c;
        }
        return null;
    }

    private static com.applovin.exoplayer2.j.d.a a(ad adVar, int[][] iArr, C0103c c0103c) {
        int i10 = -1;
        ac acVar = null;
        g gVar = null;
        for (int i11 = 0; i11 < adVar.f6511b; i11++) {
            ac acVarA = adVar.a(i11);
            List<Integer> listA = a(acVarA, c0103c.f7278y, c0103c.f7279z, c0103c.A);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < acVarA.f6506a; i12++) {
                v vVarA = acVarA.a(i12);
                if ((vVarA.f8191e & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && a(iArr2[i12], c0103c.f7215k)) {
                    g gVar2 = new g(vVarA, c0103c, iArr2[i12], listA.contains(Integer.valueOf(i12)));
                    if ((gVar2.f7245a || c0103c.f7208d) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        acVar = acVarA;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new com.applovin.exoplayer2.j.d.a(acVar, i10);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static List<Integer> a(ac acVar, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(acVar.f6506a);
        for (int i13 = 0; i13 < acVar.f6506a; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < acVar.f6506a; i15++) {
                v vVarA = acVar.a(i15);
                int i16 = vVarA.f8203q;
                if (i16 > 0 && (i12 = vVarA.f8204r) > 0) {
                    Point pointA = a(z10, i10, i11, i16, i12);
                    int i17 = vVarA.f8203q;
                    int i18 = vVarA.f8204r;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointA.x * 0.98f)) && i18 >= ((int) (pointA.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iB = acVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (iB == -1 || iB > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void a(com.applovin.exoplayer2.j.f.a aVar, int[][][] iArr, at[] atVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= aVar.a()) {
                z10 = true;
                break;
            }
            int iA = aVar.a(i10);
            com.applovin.exoplayer2.j.d dVar = dVarArr[i10];
            if ((iA == 1 || iA == 2) && dVar != null && a(iArr[i10], aVar.b(i10), dVar)) {
                if (iA == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i10;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i10;
                }
            }
            i10++;
        }
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            at atVar = new at(true);
            atVarArr[i12] = atVar;
            atVarArr[i11] = atVar;
        }
    }

    public static boolean a(int i10, boolean z10) {
        int iC = as.c(i10);
        return iC == 4 || (z10 && iC == 3);
    }

    private static boolean a(v vVar, int i10, v vVar2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!a(i10, false) || (i12 = vVar.f8194h) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = vVar.f8211y) == -1 || i14 != vVar2.f8211y)) {
            return false;
        }
        if (z10 || ((str = vVar.f8198l) != null && TextUtils.equals(str, vVar2.f8198l))) {
            return z11 || ((i13 = vVar.f8212z) != -1 && i13 == vVar2.f8212z);
        }
        return false;
    }

    private static boolean a(v vVar, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((vVar.f8191e & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !a(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !com.applovin.exoplayer2.l.ai.a((Object) vVar.f8198l, (Object) str)) {
            return false;
        }
        int i21 = vVar.f8203q;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = vVar.f8204r;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = vVar.f8205s;
        return (f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = vVar.f8194h) != -1 && i19 <= i20 && i20 <= i15;
    }

    private static boolean a(int[][] iArr, ad adVar, com.applovin.exoplayer2.j.d dVar) {
        if (dVar == null) {
            return false;
        }
        int iA = adVar.a(dVar.d());
        for (int i10 = 0; i10 < dVar.e(); i10++) {
            if (as.d(iArr[iA][dVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static int[] a(ac acVar, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        v vVarA = acVar.a(i10);
        int[] iArr2 = new int[acVar.f6506a];
        int i12 = 0;
        for (int i13 = 0; i13 < acVar.f6506a; i13++) {
            if (i13 == i10 || a(acVar.a(i13), iArr[i13], vVarA, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    private static int[] a(ac acVar, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int i21;
        int i22;
        HashSet hashSet;
        if (acVar.f6506a < 2) {
            return f7183a;
        }
        List<Integer> listA = a(acVar, i19, i20, z11);
        if (listA.size() < 2) {
            return f7183a;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < listA.size()) {
                String str3 = acVar.a(listA.get(i24).intValue()).f8198l;
                if (hashSet2.add(str3)) {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                    int iA = a(acVar, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, listA);
                    if (iA > i21) {
                        i23 = iA;
                        str2 = str3;
                    }
                    i24 = i22 + 1;
                    hashSet2 = hashSet;
                } else {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                }
                i23 = i21;
                i24 = i22 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        b(acVar, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, listA);
        return listA.size() < 2 ? f7183a : com.applovin.exoplayer2.common.b.c.a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void b(ac acVar, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!a(acVar.a(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    public Pair<com.applovin.exoplayer2.j.d.a, f> a(ad adVar, int[][] iArr, C0103c c0103c, String str) throws com.applovin.exoplayer2.p {
        int i10 = -1;
        ac acVar = null;
        f fVar = null;
        for (int i11 = 0; i11 < adVar.f6511b; i11++) {
            ac acVarA = adVar.a(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < acVarA.f6506a; i12++) {
                if (a(iArr2[i12], c0103c.f7215k)) {
                    f fVar2 = new f(acVarA.a(i12), c0103c, iArr2[i12], str);
                    if (fVar2.f7236a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        acVar = acVarA;
                        i10 = i12;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return Pair.create(new com.applovin.exoplayer2.j.d.a(acVar, i10), (f) com.applovin.exoplayer2.l.a.b(fVar));
    }

    @Override // com.applovin.exoplayer2.j.f
    public final Pair<at[], com.applovin.exoplayer2.j.d[]> a(com.applovin.exoplayer2.j.f.a aVar, int[][][] iArr, int[] iArr2, com.applovin.exoplayer2.h.p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p {
        C0103c c0103c = this.f7187e.get();
        int iA = aVar.a();
        com.applovin.exoplayer2.j.d.a[] aVarArrA = a(aVar, iArr, iArr2, c0103c);
        int i10 = 0;
        while (true) {
            if (i10 >= iA) {
                break;
            }
            int iA2 = aVar.a(i10);
            if (c0103c.a(i10) || c0103c.M.contains(Integer.valueOf(iA2))) {
                aVarArrA[i10] = null;
            } else {
                ad adVarB = aVar.b(i10);
                if (c0103c.a(i10, adVarB)) {
                    e eVarB = c0103c.b(i10, adVarB);
                    aVarArrA[i10] = eVarB != null ? new com.applovin.exoplayer2.j.d.a(adVarB.a(eVarB.f7232a), eVarB.f7233b, eVarB.f7235d) : null;
                }
            }
            i10++;
        }
        com.applovin.exoplayer2.j.d[] dVarArrA = this.f7186d.a(aVarArrA, d(), aVar2, baVar);
        at[] atVarArr = new at[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            boolean z10 = true;
            if ((c0103c.a(i11) || c0103c.M.contains(Integer.valueOf(aVar.a(i11)))) || (aVar.a(i11) != -2 && dVarArrA[i11] == null)) {
                z10 = false;
            }
            atVarArr[i11] = z10 ? at.f4294a : null;
        }
        if (c0103c.f7216l) {
            a(aVar, iArr, atVarArr, dVarArrA);
        }
        return Pair.create(atVarArr, dVarArrA);
    }

    public com.applovin.exoplayer2.j.d.a a(int i10, ad adVar, int[][] iArr, C0103c c0103c) throws com.applovin.exoplayer2.p {
        ac acVar = null;
        b bVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < adVar.f6511b; i12++) {
            ac acVarA = adVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < acVarA.f6506a; i13++) {
                if (a(iArr2[i13], c0103c.f7215k)) {
                    b bVar2 = new b(acVarA.a(i13), iArr2[i13]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        acVar = acVarA;
                        i11 = i13;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new com.applovin.exoplayer2.j.d.a(acVar, i11);
    }

    public com.applovin.exoplayer2.j.d.a a(ad adVar, int[][] iArr, int i10, C0103c c0103c, boolean z10) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.j.d.a aVarA = (c0103c.L || c0103c.K || !z10) ? null : a(adVar, iArr, i10, c0103c);
        return aVarA == null ? a(adVar, iArr, c0103c) : aVarA;
    }

    @Override // com.applovin.exoplayer2.j.j
    public boolean a() {
        return true;
    }

    public com.applovin.exoplayer2.j.d.a[] a(com.applovin.exoplayer2.j.f.a aVar, int[][][] iArr, int[] iArr2, C0103c c0103c) throws com.applovin.exoplayer2.p {
        boolean z10;
        String str;
        int i10;
        a aVar2;
        String str2;
        int i11;
        int iA = aVar.a();
        com.applovin.exoplayer2.j.d.a[] aVarArr = new com.applovin.exoplayer2.j.d.a[iA];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            z10 = true;
            if (i13 >= iA) {
                break;
            }
            if (2 == aVar.a(i13)) {
                if (!z11) {
                    aVarArr[i13] = a(aVar.b(i13), iArr[i13], iArr2[i13], c0103c, true);
                    z11 = aVarArr[i13] != null;
                }
                z12 |= aVar.b(i13).f6511b > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        a aVar3 = null;
        String str3 = null;
        while (i14 < iA) {
            if (z10 == aVar.a(i14)) {
                boolean z13 = (c0103c.f7217m || !z12) ? z10 : false;
                i10 = i15;
                aVar2 = aVar3;
                str2 = str3;
                i11 = i14;
                Pair<com.applovin.exoplayer2.j.d.a, a> pairB = b(aVar.b(i14), iArr[i14], iArr2[i14], c0103c, z13);
                if (pairB != null && (aVar2 == null || ((a) pairB.second).compareTo(aVar2) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    com.applovin.exoplayer2.j.d.a aVar4 = (com.applovin.exoplayer2.j.d.a) pairB.first;
                    aVarArr[i11] = aVar4;
                    str3 = aVar4.f7252a.a(aVar4.f7253b[0]).f8189c;
                    aVar3 = (a) pairB.second;
                    i15 = i11;
                }
                i14 = i11 + 1;
                z10 = true;
            } else {
                i10 = i15;
                aVar2 = aVar3;
                str2 = str3;
                i11 = i14;
            }
            i15 = i10;
            aVar3 = aVar2;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        f fVar = null;
        while (i12 < iA) {
            int iA2 = aVar.a(i12);
            if (iA2 == 1) {
                str = str4;
            } else if (iA2 == 2) {
                str = str4;
            } else if (iA2 != 3) {
                aVarArr[i12] = a(iA2, aVar.b(i12), iArr[i12], c0103c);
                str = str4;
            } else {
                str = str4;
                Pair<com.applovin.exoplayer2.j.d.a, f> pairA = a(aVar.b(i12), iArr[i12], c0103c, str);
                if (pairA != null && (fVar == null || ((f) pairA.second).compareTo(fVar) > 0)) {
                    if (i16 != -1) {
                        aVarArr[i16] = null;
                    }
                    aVarArr[i12] = (com.applovin.exoplayer2.j.d.a) pairA.first;
                    fVar = (f) pairA.second;
                    i16 = i12;
                }
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair<com.applovin.exoplayer2.j.d.a, a> b(ad adVar, int[][] iArr, int i10, C0103c c0103c, boolean z10) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.j.d.a aVar = null;
        a aVar2 = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < adVar.f6511b; i13++) {
            ac acVarA = adVar.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < acVarA.f6506a; i14++) {
                if (a(iArr2[i14], c0103c.f7215k)) {
                    a aVar3 = new a(acVarA.a(i14), c0103c, iArr2[i14]);
                    if ((aVar3.f7188a || c0103c.f7211g) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        ac acVarA2 = adVar.a(i11);
        if (!c0103c.L && !c0103c.K && z10) {
            int[] iArrA = a(acVarA2, iArr[i11], i12, c0103c.F, c0103c.f7212h, c0103c.f7213i, c0103c.f7214j);
            if (iArrA.length > 1) {
                aVar = new com.applovin.exoplayer2.j.d.a(acVarA2, iArrA);
            }
        }
        if (aVar == null) {
            aVar = new com.applovin.exoplayer2.j.d.a(acVarA2, i12);
        }
        return Pair.create(aVar, (a) com.applovin.exoplayer2.l.a.b(aVar2));
    }
}
