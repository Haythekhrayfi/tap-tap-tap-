package b4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<T, Y> f3300a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3302c;

    public g(long j10) {
        this.f3301b = j10;
    }

    public synchronized Y a(T t10) {
        return this.f3300a.get(t10);
    }

    public int b(Y y10) {
        return 1;
    }

    public void c(T t10, Y y10) {
    }

    public synchronized Y d(T t10, Y y10) {
        long jB = b(y10);
        if (jB >= this.f3301b) {
            c(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f3302c += jB;
        }
        Y yPut = this.f3300a.put(t10, y10);
        if (yPut != null) {
            this.f3302c -= (long) b(yPut);
            if (!yPut.equals(y10)) {
                c(t10, yPut);
            }
        }
        e(this.f3301b);
        return yPut;
    }

    public synchronized void e(long j10) {
        while (this.f3302c > j10) {
            Iterator<Map.Entry<T, Y>> it = this.f3300a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f3302c -= (long) b(value);
            T key = next.getKey();
            it.remove();
            c(key, value);
        }
    }
}
