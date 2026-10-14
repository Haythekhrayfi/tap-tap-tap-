package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f2172c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f2173a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2174b = new HashMap();

    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<i.b, List<C0035b>> f2175a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<C0035b, i.b> f2176b;

        public a(Map<C0035b, i.b> map) {
            this.f2176b = map;
            for (Map.Entry<C0035b, i.b> entry : map.entrySet()) {
                i.b value = entry.getValue();
                List<C0035b> arrayList = this.f2175a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2175a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void a(List<C0035b> list, p pVar, i.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0035b c0035b = list.get(size);
                    Objects.requireNonNull(c0035b);
                    try {
                        int i10 = c0035b.f2177a;
                        if (i10 == 0) {
                            c0035b.f2178b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            c0035b.f2178b.invoke(obj, pVar);
                        } else if (i10 == 2) {
                            c0035b.f2178b.invoke(obj, pVar, bVar);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    @Deprecated
    public static final class C0035b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f2178b;

        public C0035b(int i10, Method method) {
            this.f2177a = i10;
            this.f2178b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0035b)) {
                return false;
            }
            C0035b c0035b = (C0035b) obj;
            return this.f2177a == c0035b.f2177a && this.f2178b.getName().equals(c0035b.f2178b.getName());
        }

        public int hashCode() {
            return this.f2178b.getName().hashCode() + (this.f2177a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarB;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarB = b(superclass)) != null) {
            map.putAll(aVarB.f2176b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0035b, i.b> entry : b(cls2).f2176b.entrySet()) {
                c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            x xVar = (x) method.getAnnotation(x.class);
            if (xVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(p.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                i.b bVarValue = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(i.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != i.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new C0035b(i10, method), bVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f2173a.put(cls, aVar);
        this.f2174b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.f2173a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<C0035b, i.b> map, C0035b c0035b, i.b bVar, Class<?> cls) {
        i.b bVar2 = map.get(c0035b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0035b, bVar);
                return;
            }
            return;
        }
        Method method = c0035b.f2178b;
        StringBuilder sbA = defpackage.a.a("Method ");
        sbA.append(method.getName());
        sbA.append(" in ");
        sbA.append(cls.getName());
        sbA.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbA.append(bVar2);
        sbA.append(", new value ");
        sbA.append(bVar);
        throw new IllegalArgumentException(sbA.toString());
    }
}
