package ld;

import fd.z;
import java.util.concurrent.TimeUnit;
import kd.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f33104a = z.Q("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f33107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f33108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f33109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f33110g;

    static {
        int i10 = a0.f32017a;
        f33105b = z.P("kotlinx.coroutines.scheduler.core.pool.size", i10 < 2 ? 2 : i10, 1, 0, 8, null);
        f33106c = z.P("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f33107d = TimeUnit.SECONDS.toNanos(z.Q("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f33108e = e.f33094a;
        f33109f = new j(0);
        f33110g = new j(1);
    }
}
