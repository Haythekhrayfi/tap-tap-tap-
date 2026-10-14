package aa;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f235e;

    public d(c cVar, Map map, Map map2) {
        this.f235e = cVar;
        this.f233c = map;
        this.f234d = map2;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f235e.c(this.f233c, this.f234d);
        return null;
    }
}
