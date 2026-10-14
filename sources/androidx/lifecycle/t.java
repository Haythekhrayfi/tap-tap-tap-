package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Class<?>, Integer> f2254a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends g>>> f2255b = new HashMap();

    public static g a(Constructor<? extends g> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x011a A[SYNTHETIC] */
    public static int c(Class<?> cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int i10;
        Map<Class<?>, List<Constructor<? extends g>>> map;
        boolean z10;
        Integer num = (Integer) ((HashMap) f2254a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (cls.getCanonicalName() != null) {
            List arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strB = b(canonicalName);
                if (!name.isEmpty()) {
                    strB = name + "." + strB;
                }
                declaredConstructor = Class.forName(strB).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (declaredConstructor != null) {
                map = f2255b;
                arrayList = Collections.singletonList(declaredConstructor);
            } else {
                b bVar = b.f2172c;
                Boolean bool = bVar.f2174b.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                bVar.f2174b.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((x) declaredMethods[i12].getAnnotation(x.class)) != null) {
                                bVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i12++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (!(superclass != null && o.class.isAssignableFrom(superclass))) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && o.class.isAssignableFrom(cls2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) ((HashMap) f2255b).get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map = f2255b;
                        }
                    } else if (c(superclass) != 1) {
                        arrayList = new ArrayList((Collection) ((HashMap) f2255b).get(superclass));
                        while (i10 < r6) {
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) ((HashMap) f2255b).get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map = f2255b;
                        }
                    }
                }
            }
            ((HashMap) map).put(cls, arrayList);
            i11 = 2;
        }
        ((HashMap) f2254a).put(cls, Integer.valueOf(i11));
        return i11;
    }
}
