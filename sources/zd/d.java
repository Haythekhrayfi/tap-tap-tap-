package zd;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f45280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge.b<T> f45281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.a f45282c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ge.b<? extends T> bVar, de.a aVar) {
        j0.j(bVar, "bean");
        j0.j(aVar, Action.SCOPE_ATTRIBUTE);
        this.f45281b = bVar;
        this.f45282c = aVar;
    }

    @Override // zd.c
    public ge.b<T> a() {
        return this.f45281b;
    }

    @Override // zd.c
    public <T> b<T> b(uc.a<ae.a> aVar) {
        boolean z10 = this.f45280a == null;
        if (z10) {
            this.f45280a = (T) c.a.a(this, aVar);
        }
        Objects.requireNonNull(wd.a.f37302g);
        ke.b bVar = wd.a.f37301f;
        StringBuilder sbA = defpackage.a.a("[Scope] get '");
        sbA.append(this.f45281b.f30447d);
        sbA.append("' from ");
        sbA.append(this.f45282c);
        bVar.debug(sbA.toString());
        return new b<>(this.f45280a, z10);
    }

    @Override // zd.c
    public void release() {
        this.f45280a = null;
    }
}
