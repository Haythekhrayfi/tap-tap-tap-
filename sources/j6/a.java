package j6;

import a5.c;
import a5.g;
import com.google.firebase.components.ComponentRegistrar;
import g6.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a implements g {
    @Override // a5.g
    public List<c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : componentRegistrar.getComponents()) {
            String str = cVar.f79a;
            if (str != null) {
                cVar = new c<>(str, cVar.f80b, cVar.f81c, cVar.f82d, cVar.f83e, new e(str, cVar), cVar.f85g);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
