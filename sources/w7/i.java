package w7;

import fd.j0;
import java.util.Map;
import jc.w;
import k9.j;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, w8.d> f37160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<String, w> f37161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j<l<w8.d, w>> f37162c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Map<String, ? extends w8.d> map, l<? super String, w> lVar, j<l<w8.d, w>> jVar) {
        j0.i(map, "variables");
        j0.i(lVar, "requestObserver");
        j0.i(jVar, "declarationObservers");
        this.f37160a = map;
        this.f37161b = lVar;
        this.f37162c = jVar;
    }
}
