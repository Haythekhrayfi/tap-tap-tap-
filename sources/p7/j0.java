package p7;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34525f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f34526g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f34527h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34529b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f34530c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f34532e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public j0(long j10) {
        this.f34528a = j10;
        this.f34531d = f34526g.compareAndSet(true, false) ? "Cold" : "Cool";
        this.f34532e = new AtomicBoolean(true);
    }
}
