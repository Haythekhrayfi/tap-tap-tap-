package e1;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<b<?>, Object> f28968a = new LinkedHashMap();

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class C0248a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0248a f28969b = new C0248a();

        @Override // e1.a
        public <T> T a(b<T> bVar) {
            j0.i(bVar, Action.KEY_ATTRIBUTE);
            return null;
        }
    }

    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);
}
