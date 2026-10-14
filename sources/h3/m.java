package h3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f30581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f30582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f30583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f30584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f30585h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30586a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<b, Bitmap> f30587b = new g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f30588c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30589a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f30589a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30589a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30589a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30589a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f30590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f30592c;

        public b(c cVar) {
            this.f30590a = cVar;
        }

        @Override // h3.l
        public void a() {
            this.f30590a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30591b == bVar.f30591b && b4.j.b(this.f30592c, bVar.f30592c);
        }

        public int hashCode() {
            int i10 = this.f30591b * 31;
            Bitmap.Config config = this.f30592c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.f30591b, this.f30592c);
        }
    }

    public static class c extends h3.c<b> {
        @Override // h3.c
        public l a() {
            return new b(this);
        }

        public b d(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.f30591b = i10;
            bVarB.f30592c = config;
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f30581d = configArr;
        f30582e = configArr;
        f30583f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f30584g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f30585h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iC = b4.j.c(i10, i11, config);
        b bVarB = this.f30586a.b();
        bVarB.f30591b = iC;
        bVarB.f30592c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = a.f30589a[config.ordinal()];
            if (i12 == 1) {
                configArr = f30581d;
            } else if (i12 == 2) {
                configArr = f30583f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f30585h;
            } else {
                configArr = f30584g;
            }
        } else {
            configArr = f30582e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iC));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iC * 8) {
                if (numCeilingKey.intValue() == iC && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f30586a.c(bVarB);
                bVarB = this.f30586a.d(numCeilingKey.intValue(), config2);
                break;
            }
        }
        Bitmap bitmapA = this.f30587b.a(bVarB);
        if (bitmapA != null) {
            a(Integer.valueOf(bVarB.f30591b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f30588c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f30588c.put(config, treeMap);
        return treeMap;
    }

    public String e(Bitmap bitmap) {
        return c(b4.j.d(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b bVarD = this.f30586a.d(b4.j.d(bitmap), bitmap.getConfig());
        this.f30587b.b(bVarD, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(bVarD.f30591b));
        navigableMapD.put(Integer.valueOf(bVarD.f30591b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SizeConfigStrategy{groupedMap=");
        sbA.append(this.f30587b);
        sbA.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f30588c.entrySet()) {
            sbA.append(entry.getKey());
            sbA.append('[');
            sbA.append(entry.getValue());
            sbA.append("], ");
        }
        if (!this.f30588c.isEmpty()) {
            sbA.replace(sbA.length() - 2, sbA.length(), "");
        }
        sbA.append(")}");
        return sbA.toString();
    }
}
