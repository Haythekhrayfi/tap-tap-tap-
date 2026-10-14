package b6;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3339d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f3340e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.f f3341a = y5.f.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3343c;

    public synchronized boolean a() {
        return this.f3343c == 0 || this.f3341a.a() > this.f3342b;
    }

    public synchronized void b(int i10) {
        long jMin;
        boolean z10 = false;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f3343c = 0;
            }
            return;
        }
        this.f3343c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                z10 = true;
            }
            try {
                if (z10) {
                    double dPow = Math.pow(2.0d, this.f3343c);
                    Objects.requireNonNull(this.f3341a);
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f3340e);
                } else {
                    jMin = f3339d;
                }
                this.f3342b = this.f3341a.a() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
