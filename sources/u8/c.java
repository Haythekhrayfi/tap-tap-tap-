package u8;

import android.view.View;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements yc.b<View, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f36068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.l<T, T> f36069b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(T t10, uc.l<? super T, ? extends T> lVar) {
        this.f36068a = t10;
        this.f36069b = lVar;
    }

    @Override // yc.b
    public Object getValue(View view, cd.i iVar) {
        j0.i(view, "thisRef");
        j0.i(iVar, "property");
        return this.f36068a;
    }

    @Override // yc.b
    public void setValue(View view, cd.i iVar, Object obj) {
        T tInvoke;
        View view2 = view;
        j0.i(view2, "thisRef");
        j0.i(iVar, "property");
        uc.l<T, T> lVar = this.f36069b;
        if (lVar != null && (tInvoke = lVar.invoke(obj)) != null) {
            obj = tInvoke;
        }
        if (j0.d(this.f36068a, obj)) {
            return;
        }
        this.f36068a = (T) obj;
        view2.invalidate();
    }
}
