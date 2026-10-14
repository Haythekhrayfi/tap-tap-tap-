package org.lsposed.hiddenapibypass;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class HiddenApiBypass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f34309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f34310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f34311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f34312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f34313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f34314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f34315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f34316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f34317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f34318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f34319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f34320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f34321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f34322n = new HashSet();

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f34309a = unsafe;
            f34310b = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("artMethod"));
            f34311c = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("declaringClass"));
            long jObjectFieldOffset = unsafe.objectFieldOffset(Helper$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            f34312d = jObjectFieldOffset;
            f34313e = unsafe.objectFieldOffset(Helper$MethodHandleImpl.class.getDeclaredField("info"));
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("methods"));
            f34314f = jObjectFieldOffset2;
            long jObjectFieldOffset3 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("iFields"));
            f34315g = jObjectFieldOffset3;
            f34316h = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("sFields"));
            f34317i = unsafe.objectFieldOffset(Helper$HandleInfo.class.getDeclaredField("member"));
            Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = Helper$NeverCall.class.getDeclaredMethod("b", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j10 = unsafe.getLong(methodHandleUnreflect, jObjectFieldOffset);
            long j11 = unsafe.getLong(methodHandleUnreflect2, jObjectFieldOffset);
            long j12 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset2);
            long j13 = j11 - j10;
            f34318j = j13;
            f34319k = (j10 - j12) - j13;
            Field declaredField = Helper$NeverCall.class.getDeclaredField(IntegerTokenConverter.CONVERTER_KEY);
            Field declaredField2 = Helper$NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j14 = unsafe.getLong(methodHandleUnreflectGetter, jObjectFieldOffset);
            long j15 = unsafe.getLong(methodHandleUnreflectGetter2, jObjectFieldOffset);
            long j16 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset3);
            f34320l = j15 - j14;
            f34321m = j14 - j16;
        } catch (ReflectiveOperationException e10) {
            Log.e("HiddenApiBypass", "Initialize error", e10);
            throw new ExceptionInInitializerError(e10);
        }
    }

    static boolean a(Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (!clsArr[i10].isPrimitive()) {
                Object obj = objArr[i10];
                if (obj != null && !clsArr[i10].isInstance(obj)) {
                    return false;
                }
            } else {
                if (clsArr[i10] == Integer.TYPE && !(objArr[i10] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i10] == Byte.TYPE && !(objArr[i10] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i10] == Character.TYPE && !(objArr[i10] instanceof Character)) {
                    return false;
                }
                if (clsArr[i10] == Boolean.TYPE && !(objArr[i10] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i10] == Double.TYPE && !(objArr[i10] instanceof Double)) {
                    return false;
                }
                if (clsArr[i10] == Float.TYPE && !(objArr[i10] instanceof Float)) {
                    return false;
                }
                if (clsArr[i10] == Long.TYPE && !(objArr[i10] instanceof Long)) {
                    return false;
                }
                if (clsArr[i10] == Short.TYPE && !(objArr[i10] instanceof Short)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set set = f34322n;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[((HashSet) set).size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        ((HashSet) f34322n).clear();
        return setHiddenApiExemptions(new String[0]);
    }

    public static Constructor getDeclaredConstructor(Class cls, Class... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i10 = 0; i10 < clsArr.length; i10++) {
                        if (clsArr[i10] == parameterTypes[i10]) {
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method getDeclaredMethod(Class cls, String str, Class... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i10 = 0; i10 < clsArr.length; i10++) {
                        if (clsArr[i10] == parameterTypes[i10]) {
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static List getDeclaredMethods(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
                declaredMethod.setAccessible(true);
                MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
                Unsafe unsafe = f34309a;
                long j10 = unsafe.getLong(cls, f34314f);
                if (j10 == 0) {
                    return arrayList;
                }
                int i10 = unsafe.getInt(j10);
                for (int i11 = 0; i11 < i10; i11++) {
                    long j11 = (((long) i11) * f34318j) + j10 + f34319k;
                    Unsafe unsafe2 = f34309a;
                    unsafe2.putLong(methodHandleUnreflect, f34312d, j11);
                    unsafe2.putObject(methodHandleUnreflect, f34313e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflect);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f34309a;
                    arrayList.add((Executable) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflect, f34313e), f34317i));
                }
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        return arrayList;
    }

    public static List getInstanceFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField(IntegerTokenConverter.CONVERTER_KEY);
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f34309a;
                long j10 = unsafe.getLong(cls, f34315g);
                if (j10 == 0) {
                    return arrayList;
                }
                int i10 = unsafe.getInt(j10);
                for (int i11 = 0; i11 < i10; i11++) {
                    long j11 = (((long) i11) * f34320l) + j10 + f34321m;
                    Unsafe unsafe2 = f34309a;
                    unsafe2.putLong(methodHandleUnreflectGetter, f34312d, j11);
                    unsafe2.putObject(methodHandleUnreflectGetter, f34313e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f34309a;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflectGetter, f34313e), f34317i));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static List getStaticFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField("s");
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f34309a;
                long j10 = unsafe.getLong(cls, f34316h);
                if (j10 == 0) {
                    return arrayList;
                }
                int i10 = unsafe.getInt(j10);
                for (int i11 = 0; i11 < i10; i11++) {
                    long j11 = (((long) i11) * f34320l) + j10 + f34321m;
                    Unsafe unsafe2 = f34309a;
                    unsafe2.putLong(methodHandleUnreflectGetter, f34312d, j11);
                    unsafe2.putObject(methodHandleUnreflectGetter, f34313e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f34309a;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflectGetter, f34313e), f34317i));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static Object invoke(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f34309a;
        long j10 = unsafe.getLong(cls, f34314f);
        if (j10 == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i10 = unsafe.getInt(j10);
        for (int i11 = 0; i11 < i10; i11++) {
            f34309a.putLong(declaredMethod, f34310b, (((long) i11) * f34318j) + j10 + f34319k);
            if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(Class cls, Object... objArr) throws NoSuchMethodException {
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor declaredConstructor = Helper$InvokeStub.class.getDeclaredConstructor(Object[].class);
        declaredConstructor.setAccessible(true);
        Unsafe unsafe = f34309a;
        long j10 = unsafe.getLong(cls, f34314f);
        if (j10 == 0) {
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        int i10 = unsafe.getInt(j10);
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = (((long) i11) * f34318j) + j10 + f34319k;
            Unsafe unsafe2 = f34309a;
            long j12 = f34310b;
            unsafe2.putLong(declaredMethod, j12, j11);
            if ("<init>".equals(declaredMethod.getName())) {
                unsafe2.putLong(declaredConstructor, j12, j11);
                unsafe2.putObject(declaredConstructor, f34311c, cls);
                if (a(declaredConstructor.getParameterTypes(), objArr)) {
                    return declaredConstructor.newInstance(objArr);
                }
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(String... strArr) {
        try {
            invoke(VMRuntime.class, invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
            return false;
        }
    }
}
