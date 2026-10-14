package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f10411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f10412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f10413c;

    public e(o oVar) {
        StringBuilder sbA = defpackage.a.a("com.applovin.sdk.preferences.");
        sbA.append(oVar.ax());
        this.f10413c = o.au().getSharedPreferences(sbA.toString(), 0);
        if (oVar.e()) {
            return;
        }
        f10411a = oVar;
    }

    private static SharedPreferences a(Context context) {
        if (f10412b == null) {
            f10412b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f10412b;
    }

    public static <T> T a(String str, T t10, Class cls, SharedPreferences sharedPreferences) {
        return (T) a(str, t10, cls, sharedPreferences, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, T t10, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object objValueOf;
        Object stringSet;
        Object string;
        long j10;
        int i10;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return t10;
            }
            if (Boolean.class.equals(cls)) {
                objValueOf = Boolean.valueOf(t10 != 0 ? sharedPreferences.getBoolean(str, ((Boolean) t10).booleanValue()) : sharedPreferences.getBoolean(str, false));
            } else if (Float.class.equals(cls)) {
                objValueOf = Float.valueOf(t10 != 0 ? sharedPreferences.getFloat(str, ((Float) t10).floatValue()) : sharedPreferences.getFloat(str, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
            } else if (Integer.class.equals(cls)) {
                if (t10 != 0) {
                    i10 = sharedPreferences.getInt(str, t10.getClass().equals(Long.class) ? ((Long) t10).intValue() : ((Integer) t10).intValue());
                } else {
                    i10 = sharedPreferences.getInt(str, 0);
                }
                objValueOf = Integer.valueOf(i10);
            } else if (Long.class.equals(cls)) {
                if (t10 != 0) {
                    j10 = sharedPreferences.getLong(str, t10.getClass().equals(Integer.class) ? ((Integer) t10).longValue() : ((Long) t10).longValue());
                } else {
                    j10 = sharedPreferences.getLong(str, 0L);
                }
                objValueOf = Long.valueOf(j10);
            } else if (Double.class.equals(cls)) {
                objValueOf = Double.valueOf(t10 != 0 ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t10).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
            } else if (String.class.equals(cls)) {
                string = sharedPreferences.getString(str, (String) t10);
            } else if (Set.class.isAssignableFrom(cls)) {
                stringSet = sharedPreferences.getStringSet(str, (Set) t10);
            } else {
                objValueOf = t10;
            }
            if (objValueOf == null) {
                objValueOf = stringSet;
                objValueOf = string;
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return t10;
            }
            objValueOf = stringSet;
            objValueOf = string;
            T t11 = (T) cls.cast(objValueOf);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return t11;
        } catch (Throwable th) {
            if (z10) {
                try {
                    o oVar = f10411a;
                    if (oVar != null) {
                        oVar.F();
                        if (y.a()) {
                            f10411a.F().b("SharedPreferencesManager", "Error getting value for key: " + str, th);
                        }
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return t10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0012, B:8:0x0018, B:10:0x0020, B:12:0x003e, B:11:0x003a), top: B:18:0x0000 }] */
    private static void a(final SharedPreferences.Editor editor) {
        try {
            o oVar = f10411a;
            if (oVar == null || !((Boolean) oVar.a(b.gl)).booleanValue()) {
                editor.apply();
            } else if (!w.b()) {
                editor.commit();
            } else if (f10411a.G() != null) {
                f10411a.G().a(new ac(f10411a, "commitSharedPreferencesChanges", new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        editor.commit();
                    }
                }), r.b.BACKGROUND);
            } else {
                editor.apply();
            }
        } catch (Throwable th) {
            y.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    public static <T> void a(d<T> dVar, T t10, Context context) {
        a(dVar.a(), t10, a(context), (SharedPreferences.Editor) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(String str, T t10, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long jDoubleToRawLongBits;
        boolean z10 = true;
        boolean z11 = editor != null;
        if (!z11) {
            editor = sharedPreferences.edit();
        }
        if (t10 == 0) {
            editor.remove(str);
        } else if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        } else if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        } else if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        } else {
            if (t10 instanceof Long) {
                jDoubleToRawLongBits = ((Long) t10).longValue();
            } else if (t10 instanceof Double) {
                jDoubleToRawLongBits = Double.doubleToRawLongBits(((Double) t10).doubleValue());
            } else if (t10 instanceof String) {
                editor.putString(str, (String) t10);
            } else if (t10 instanceof Set) {
                editor.putStringSet(str, (Set) t10);
            } else {
                y.j("SharedPreferencesManager", "Unable to put default value of invalid type: " + t10);
                z10 = false;
            }
            editor.putLong(str, jDoubleToRawLongBits);
        }
        if (!z10 || z11) {
            return;
        }
        a(editor);
    }

    public static <T> T b(d<T> dVar, T t10, Context context) {
        return (T) a(dVar.a(), t10, dVar.b(), a(context));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public <T> void a(d<T> dVar) {
        a(this.f10413c.edit().remove(dVar.a()));
    }

    public <T> void a(d<T> dVar, T t10) {
        a(dVar, t10, this.f10413c);
    }

    public <T> void a(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        a(dVar.a(), t10, sharedPreferences);
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        a(str, t10, (SharedPreferences) null, editor);
    }

    public <T> void a(String str, T t10, SharedPreferences sharedPreferences) {
        a(str, t10, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public <T> T b(d<T> dVar, T t10) {
        return (T) b(dVar, t10, this.f10413c);
    }

    public <T> T b(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t10, dVar.b(), sharedPreferences);
    }
}
