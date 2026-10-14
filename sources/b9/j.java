package b9;

import java.util.concurrent.ConcurrentHashMap;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.e f3381a = jc.f.b(a.f3382c);

    public static final class a extends vc.l implements uc.a<ConcurrentHashMap<String, w>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f3382c = new a();

        public a() {
            super(0);
        }

        @Override // uc.a
        public ConcurrentHashMap<String, w> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    public final boolean a(String str) {
        return !((ConcurrentHashMap) this.f3381a.getValue()).containsKey(str) && ((ConcurrentHashMap) this.f3381a.getValue()).putIfAbsent(str, w.f31842a) == null;
    }
}
