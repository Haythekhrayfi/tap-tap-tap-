package y5;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f38089b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f38090c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f38091d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.c f38092a;

    public f(z.c cVar) {
        this.f38092a = cVar;
    }

    public static f c() {
        if (z.c.f44932b == null) {
            z.c.f44932b = new z.c(3);
        }
        z.c cVar = z.c.f44932b;
        if (f38091d == null) {
            f38091d = new f(cVar);
        }
        return f38091d;
    }

    public long a() {
        return this.f38092a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public boolean d(a6.d dVar) {
        if (TextUtils.isEmpty(dVar.a())) {
            return true;
        }
        return dVar.b() + dVar.g() < b() + f38089b;
    }
}
