package ue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f36374a = u.f36488c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f36375b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f36376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f36377d;

    public a0(b0 b0Var, Class cls) {
        this.f36377d = b0Var;
        this.f36376c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f36375b;
        }
        return this.f36374a.f36489a && method.isDefault() ? this.f36374a.b(method, this.f36376c, obj, objArr) : this.f36377d.b(method).a(objArr);
    }
}
