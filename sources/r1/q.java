package r1;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f35129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f35130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f35131c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f35129a = true;
        f35130b = true;
        f35131c = i10 >= 28;
    }
}
