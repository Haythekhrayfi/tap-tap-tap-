package fe;

import fd.j0;
import ge.b;
import java.util.ArrayList;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b<?>> f29647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f29648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wd.b f29652f;

    public a(String str, boolean z10, boolean z11, wd.b bVar) {
        j0.j(str, "path");
        j0.j(bVar, "koinContext");
        this.f29649c = str;
        this.f29650d = z10;
        this.f29651e = z11;
        this.f29652f = bVar;
        this.f29647a = new ArrayList<>();
        this.f29648b = new ArrayList<>();
    }

    public /* synthetic */ a(String str, boolean z10, boolean z11, wd.b bVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, bVar);
    }

    public String toString() {
        return s.a.a(defpackage.a.a("ModuleDefinition["), this.f29649c, ']');
    }
}
