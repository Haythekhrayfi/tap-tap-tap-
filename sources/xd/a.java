package xd;

import ge.b;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<b<?>> f37598a = new HashSet<>();

    public final void a(b<?> bVar) {
        boolean zRemove = this.f37598a.remove(bVar);
        if (zRemove && !bVar.f30452i) {
            throw new je.b("Try to override definition with " + bVar + ", but override is not allowed. Use 'override' option in your definition or module.");
        }
        this.f37598a.add(bVar);
        String str = zRemove ? "override" : "declare";
        Objects.requireNonNull(wd.a.f37302g);
        wd.a.f37301f.info("[definition] " + str + ' ' + bVar);
    }
}
