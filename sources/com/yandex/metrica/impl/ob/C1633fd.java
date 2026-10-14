package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1633fd extends P2<Location> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f16131d = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f16132e = Arrays.asList("gps", "network");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f16133c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fd$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f16134a;

        public a(long j10, long j11, long j12) {
            this.f16134a = j10;
        }
    }

    public C1633fd(a aVar, long j10, long j11) {
        super(j10, j11);
        this.f16133c = aVar;
    }

    public C1633fd(C1887pi c1887pi) {
        this(new a(f16131d, 200L, 50L), c1887pi != null ? c1887pi.f17141c : O.f14598e.f16615d, (c1887pi != null ? c1887pi.f17141c : O.f14598e.f16615d) * 2);
    }

    private boolean a(Location location, Location location2) {
        boolean zEquals;
        long j10 = this.f16133c.f16134a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > j10;
        boolean z11 = time < (-j10);
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (!z11) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z13 = accuracy > 0;
            boolean z14 = accuracy < 0;
            boolean z15 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                zEquals = provider2 == null;
            } else {
                zEquals = provider.equals(provider2);
            }
            if (z14) {
                return true;
            }
            if (z12 && !z13) {
                return true;
            }
            if (z12 && !z15 && zEquals) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long a(C1887pi c1887pi) {
        return c1887pi.f17141c * 2;
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public boolean a(Object obj) {
        Location location = (Location) obj;
        return f16132e.contains(location.getProvider()) && (this.f14731a.b() || this.f14731a.d() || a(location, (Location) this.f14731a.a()));
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public long b(C1887pi c1887pi) {
        return c1887pi.f17141c;
    }
}
