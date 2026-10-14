package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.a<String, Method> f2925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.a<String, Method> f2926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q.a<String, Class> f2927c;

    public a(q.a<String, Method> aVar, q.a<String, Method> aVar2, q.a<String, Class> aVar3) {
        this.f2925a = aVar;
        this.f2926b = aVar2;
        this.f2927c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class orDefault = this.f2927c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2927c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f2925a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f2925a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f2926b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f2926b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i10);

    public abstract int j();

    public int k(int i10, int i11) {
        return !i(i11) ? i10 : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t10, int i10) {
        return !i(i10) ? t10 : (T) l();
    }

    public abstract String n();

    public <T extends b> T o() {
        String strN = n();
        if (strN == null) {
            return null;
        }
        try {
            return (T) d(strN).invoke(null, b());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void p(int i10);

    public abstract void q(boolean z10);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i10);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public void w(b bVar) {
        if (bVar == null) {
            v(null);
            return;
        }
        try {
            v(c(bVar.getClass()).getName());
            a aVarB = b();
            try {
                e(bVar.getClass()).invoke(null, bVar, aVarB);
                aVarB.a();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
