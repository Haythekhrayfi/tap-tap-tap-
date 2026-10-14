package ue;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f36488c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f36490b;

    public static final class a extends u {

        /* JADX INFO: renamed from: ue.u$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0434a implements Executor {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Handler f36491c = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f36491c.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // ue.u
        public Executor a() {
            return new ExecutorC0434a();
        }

        @Override // ue.u
        @Nullable
        public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f36488c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new u(true);
    }

    public u(boolean z10) {
        this.f36489a = z10;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z10) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f36490b = declaredConstructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f36490b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
