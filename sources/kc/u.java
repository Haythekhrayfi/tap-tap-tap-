package kc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends vc.l implements uc.a<Iterator<Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable<Object> f32007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterable<Object> iterable) {
        super(0);
        this.f32007c = iterable;
    }

    @Override // uc.a
    public Iterator<Object> invoke() {
        return this.f32007c.iterator();
    }
}
