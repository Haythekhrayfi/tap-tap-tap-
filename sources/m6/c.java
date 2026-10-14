package m6;

import com.google.gson.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f33226d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f33228c;

    public c() {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f33226d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f33227b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f33228c = declaredField;
    }

    @Override // m6.b
    public void a(AccessibleObject accessibleObject) {
        boolean z10 = false;
        if (this.f33227b != null && this.f33228c != null) {
            try {
                f33226d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f33227b, accessibleObject, Long.valueOf(((Long) f33226d.getMethod("objectFieldOffset", Field.class).invoke(this.f33227b, this.f33228c)).longValue()), Boolean.TRUE);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (z10) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new j("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }
}
