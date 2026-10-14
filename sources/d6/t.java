package d6;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t5.g f28737a;

    static {
        t5.g.a aVar = new t5.g.a();
        aVar.f35699a.put(t.class, com.google.firebase.messaging.c.f12631a);
        aVar.f35700b.remove(t.class);
        aVar.f35699a.put(e6.b.class, com.google.firebase.messaging.b.f12629a);
        aVar.f35700b.remove(e6.b.class);
        aVar.f35699a.put(e6.a.class, com.google.firebase.messaging.a.f12613a);
        aVar.f35700b.remove(e6.a.class);
        f28737a = new t5.g(new HashMap(aVar.f35699a), new HashMap(aVar.f35700b), aVar.f35701c);
    }

    public abstract e6.b a();
}
