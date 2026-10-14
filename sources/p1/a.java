package p1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.inscode.autoclicker.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f34446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f34447e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f34450c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f34449b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f34448a = new HashMap();

    public a(Context context) {
        this.f34450c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f34446d == null) {
            synchronized (f34447e) {
                if (f34446d == null) {
                    f34446d = new a(context);
                }
            }
        }
        return f34446d;
    }

    public void a(Bundle bundle) {
        String string = this.f34450c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f34449b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f34449b.iterator();
                while (it.hasNext()) {
                    b(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    public final <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        if (q1.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f34448a.containsKey(cls)) {
            t10 = (T) this.f34448a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> listDependencies = bVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!this.f34448a.containsKey(cls2)) {
                            b(cls2, set);
                        }
                    }
                }
                t10 = (T) bVarNewInstance.create(this.f34450c);
                set.remove(cls);
                this.f34448a.put(cls, t10);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return t10;
    }
}
