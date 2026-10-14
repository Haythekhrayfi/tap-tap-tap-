package m6;

import com.google.gson.internal.o;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f33225a;

    static {
        f33225a = o.f12865a < 9 ? new a() : new c();
    }

    public abstract void a(AccessibleObject accessibleObject);
}
