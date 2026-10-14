package a5;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c<?>> f118c;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(List<c<?>> list) {
        StringBuilder sbA = defpackage.a.a("Dependency cycle detected: ");
        sbA.append(Arrays.toString(list.toArray()));
        super(sbA.toString());
        this.f118c = list;
    }
}
