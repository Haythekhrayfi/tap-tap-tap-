package org.koin.android.scope;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.Objects;
import le.a;
import wd.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ScopeObserver implements o, a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.b f34302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.a f34304e;

    public ScopeObserver(i.b bVar, Object obj, de.a aVar) {
        j0.j(bVar, "event");
        j0.j(obj, "target");
        j0.j(aVar, Action.SCOPE_ATTRIBUTE);
        this.f34302c = bVar;
        this.f34303d = obj;
        this.f34304e = aVar;
    }

    @Override // le.a
    public b getKoin() {
        return a.C0352a.a();
    }

    @x(i.b.ON_DESTROY)
    public final void onDestroy() {
        if (this.f34302c == i.b.ON_DESTROY) {
            Objects.requireNonNull(wd.a.f37302g);
            wd.a.f37301f.info(this.f34303d + " received ON_DESTROY");
            this.f34304e.a();
        }
    }

    @x(i.b.ON_STOP)
    public final void onStop() {
        if (this.f34302c == i.b.ON_STOP) {
            Objects.requireNonNull(wd.a.f37302g);
            wd.a.f37301f.info(this.f34303d + " received ON_STOP");
            this.f34304e.a();
        }
    }
}
