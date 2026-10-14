package ue;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class r extends t<Iterable<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f36447a;

    public r(t tVar) {
        this.f36447a = tVar;
    }

    @Override // ue.t
    public void a(v vVar, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f36447a.a(vVar, it.next());
        }
    }
}
