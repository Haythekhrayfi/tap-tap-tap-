package b1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kc.x;
import kc.y;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3231a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f3232b = c.f3233d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: b1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0051b {
        void a(l lVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f3233d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<a> f3234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0051b f3235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Set<Class<? extends l>>> f3236c;

        public static final class a {
            public a() {
            }

            public a(vc.g gVar) {
            }
        }

        static {
            new a(null);
            f3233d = new c(y.f32011c, null, x.f32010c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, InterfaceC0051b interfaceC0051b, Map<String, ? extends Set<Class<? extends l>>> map) {
            j0.i(set, "flags");
            j0.i(map, "allowedViolations");
            this.f3234a = set;
            this.f3235b = interfaceC0051b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends l>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f3236c = linkedHashMap;
        }
    }

    public static final c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                j0.h(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f3232b;
    }

    public static final void b(c cVar, l lVar) {
        Fragment fragment = lVar.f3238c;
        String name = fragment.getClass().getName();
        if (cVar.f3234a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, lVar);
        }
        if (cVar.f3235b != null) {
            e(fragment, new s(cVar, lVar));
        }
        if (cVar.f3234a.contains(a.PENALTY_DEATH)) {
            e(fragment, new s(name, lVar));
        }
    }

    public static final void c(l lVar) {
        if (FragmentManager.K(3)) {
            StringBuilder sbA = defpackage.a.a("StrictMode violation in ");
            sbA.append(lVar.f3238c.getClass().getName());
            Log.d("FragmentManager", sbA.toString(), lVar);
        }
    }

    public static final void d(Fragment fragment, String str) {
        j0.i(str, "previousFragmentId");
        b1.a aVar = new b1.a(fragment, str);
        c(aVar);
        c cVarA = a(fragment);
        if (cVarA.f3234a.contains(a.DETECT_FRAGMENT_REUSE) && f(cVarA, fragment.getClass(), b1.a.class)) {
            b(cVarA, aVar);
        }
    }

    public static final void e(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().f1919u.f2110e;
            j0.h(handler, "fragment.parentFragmentManager.host.handler");
            if (!j0.d(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        ((s) runnable).run();
    }

    public static final boolean f(c cVar, Class<? extends Fragment> cls, Class<? extends l> cls2) {
        Set<Class<? extends l>> set = cVar.f3236c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (j0.d(cls2.getSuperclass(), l.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
