package f8;

import android.view.View;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uc.a<w> f29419a;

    public e(View view, uc.a<w> aVar) {
        j0.i(view, "view");
        this.f29419a = aVar;
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    public final void a() {
        uc.a<w> aVar = this.f29419a;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f29419a = null;
    }
}
