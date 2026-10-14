package a5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements x5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94b;

    public /* synthetic */ e(String str) {
        this.f94b = str;
    }

    @Override // x5.b
    public final Object get() {
        switch (this.f93a) {
            case 0:
                String str = (String) this.f94b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new p(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new p(String.format("Could not instantiate %s.", str), e10);
                } catch (InstantiationException e11) {
                    throw new p(String.format("Could not instantiate %s.", str), e11);
                } catch (NoSuchMethodException e12) {
                    throw new p(String.format("Could not instantiate %s", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new p(String.format("Could not instantiate %s", str), e13);
                }
            default:
                u4.d dVar = (u4.d) this.f94b;
                Object obj = com.google.firebase.installations.b.f12568m;
                return new a6.b(dVar);
        }
    }
}
