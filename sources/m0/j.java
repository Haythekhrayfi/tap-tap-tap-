package m0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements o0.a<k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33148a;

    public j(String str) {
        this.f33148a = str;
    }

    @Override // o0.a
    public void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f33151c) {
            q.h<String, ArrayList<o0.a<k.a>>> hVar = k.f33152d;
            ArrayList<o0.a<k.a>> arrayList = hVar.get(this.f33148a);
            if (arrayList == null) {
                return;
            }
            hVar.remove(this.f33148a);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                arrayList.get(i10).accept(aVar2);
            }
        }
    }
}
