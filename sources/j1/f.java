package j1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements n1.f, n1.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TreeMap<Integer, f> f31681k = new TreeMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f31682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f31683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f31684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f31685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[][] f31686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f31687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31689j;

    public f(int i10) {
        this.f31688i = i10;
        int i11 = i10 + 1;
        this.f31687h = new int[i11];
        this.f31683d = new long[i11];
        this.f31684e = new double[i11];
        this.f31685f = new String[i11];
        this.f31686g = new byte[i11][];
    }

    public static f c(String str, int i10) {
        TreeMap<Integer, f> treeMap = f31681k;
        synchronized (treeMap) {
            Map.Entry<Integer, f> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                f fVar = new f(i10);
                fVar.f31682c = str;
                fVar.f31689j = i10;
                return fVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            f value = entryCeilingEntry.getValue();
            value.f31682c = str;
            value.f31689j = i10;
            return value;
        }
    }

    @Override // n1.f
    public void a(n1.e eVar) {
        for (int i10 = 1; i10 <= this.f31689j; i10++) {
            int i11 = this.f31687h[i10];
            if (i11 == 1) {
                ((o1.e) eVar).f33885c.bindNull(i10);
            } else if (i11 == 2) {
                ((o1.e) eVar).f33885c.bindLong(i10, this.f31683d[i10]);
            } else if (i11 == 3) {
                ((o1.e) eVar).f33885c.bindDouble(i10, this.f31684e[i10]);
            } else if (i11 == 4) {
                ((o1.e) eVar).f33885c.bindString(i10, this.f31685f[i10]);
            } else if (i11 == 5) {
                ((o1.e) eVar).f33885c.bindBlob(i10, this.f31686g[i10]);
            }
        }
    }

    @Override // n1.f
    public String b() {
        return this.f31682c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void e(int i10, long j10) {
        this.f31687h[i10] = 2;
        this.f31683d[i10] = j10;
    }

    public void g(int i10) {
        this.f31687h[i10] = 1;
    }

    public void h(int i10, String str) {
        this.f31687h[i10] = 4;
        this.f31685f[i10] = str;
    }

    public void release() {
        TreeMap<Integer, f> treeMap = f31681k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f31688i), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }
}
