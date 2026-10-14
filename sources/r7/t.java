package r7;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Context> f35285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<m7.b> f35286b;

    public t(ic.a<Context> aVar, ic.a<m7.b> aVar2) {
        this.f35285a = aVar;
        this.f35286b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        Context context = this.f35285a.get();
        m7.b bVar = this.f35286b.get();
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (bVar == null) {
            return null;
        }
        return new m7.d(context, bVar);
    }
}
