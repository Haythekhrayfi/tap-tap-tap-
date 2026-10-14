package e1;

import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewModelInitializer<?>[] f28970a;

    public b(ViewModelInitializer<?>... viewModelInitializerArr) {
        j0.i(viewModelInitializerArr, "initializers");
        this.f28970a = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.m0.b
    public <T extends l0> T b(Class<T> cls, a aVar) {
        T t10 = null;
        for (e eVar : this.f28970a) {
            if (j0.d(eVar.f28972a, cls)) {
                T tInvoke = eVar.f28973b.invoke(aVar);
                t10 = tInvoke instanceof l0 ? tInvoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        StringBuilder sbA = defpackage.a.a("No initializer set for given class ");
        sbA.append(cls.getName());
        throw new IllegalArgumentException(sbA.toString());
    }
}
