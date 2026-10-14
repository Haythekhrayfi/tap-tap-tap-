package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f706h;

    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        if (!f702d) {
            try {
                f701c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f702d = true;
        }
        Class<?> cls = f701c;
        if (cls == null) {
            return;
        }
        if (!f704f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f703e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f704f = true;
        }
        Field field = f703e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
