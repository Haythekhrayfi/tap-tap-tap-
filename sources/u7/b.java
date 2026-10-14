package u7;

import fd.j0;
import java.util.Iterator;
import java.util.List;
import jc.w;
import p7.i1;
import uc.l;
import w7.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements p7.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36034c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36037f;

    public /* synthetic */ b(List list, h hVar, l lVar) {
        this.f36035d = list;
        this.f36036e = hVar;
        this.f36037f = lVar;
    }

    public /* synthetic */ b(c cVar, String str, uc.a aVar) {
        this.f36035d = cVar;
        this.f36036e = str;
        this.f36037f = aVar;
    }

    public /* synthetic */ b(h hVar, String str, l lVar) {
        this.f36035d = hVar;
        this.f36036e = str;
        this.f36037f = lVar;
    }

    @Override // p7.d, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f36034c) {
            case 0:
                c cVar = (c) this.f36035d;
                String str = (String) this.f36036e;
                uc.a<w> aVar = (uc.a) this.f36037f;
                j0.i(cVar, "this$0");
                j0.i(str, "$rawExpression");
                j0.i(aVar, "$callback");
                i1<uc.a<w>> i1Var = cVar.f36043g.get(str);
                if (i1Var != null) {
                    i1Var.c(aVar);
                    break;
                }
                break;
            case 1:
                h hVar = (h) this.f36035d;
                String str2 = (String) this.f36036e;
                l<w8.d, w> lVar = (l) this.f36037f;
                j0.i(hVar, "this$0");
                j0.i(str2, "$name");
                j0.i(lVar, "$observer");
                i1<l<w8.d, w>> i1Var2 = hVar.f37156c.get(str2);
                if (i1Var2 != null) {
                    i1Var2.c(lVar);
                    break;
                }
                break;
            default:
                List list = (List) this.f36035d;
                h hVar2 = (h) this.f36036e;
                l<w8.d, w> lVar2 = (l) this.f36037f;
                j0.i(list, "$names");
                j0.i(hVar2, "this$0");
                j0.i(lVar2, "$observer");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i1<l<w8.d, w>> i1Var3 = hVar2.f37156c.get((String) it.next());
                    if (i1Var3 != null) {
                        i1Var3.c(lVar2);
                    }
                }
                break;
        }
    }
}
