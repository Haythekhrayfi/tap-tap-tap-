package s7;

import android.view.View;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f35479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<i8.h> f35480b;

    public j(g gVar, ic.a<i8.h> aVar) {
        j0.i(gVar, "divPatchCache");
        j0.i(aVar, "divViewCreator");
        this.f35479a = gVar;
        this.f35480b = aVar;
    }

    public List<View> a(i8.k kVar, String str) {
        List<y9.k> listA = this.f35479a.a(kVar.getDataTag(), str);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f35480b.get().a((y9.k) it.next(), kVar, c8.e.f3631c.a(kVar.getCurrentStateId())));
        }
        return arrayList;
    }
}
