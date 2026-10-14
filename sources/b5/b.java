package b5;

import a5.t;
import d5.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.a<y4.a> f3311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d5.a f3312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e5.b f3313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e5.a> f3314d;

    public b(x5.a<y4.a> aVar) {
        this(aVar, new e5.c(), new f());
    }

    public b(x5.a<y4.a> aVar, e5.b bVar, d5.a aVar2) {
        this.f3311a = aVar;
        this.f3313c = bVar;
        this.f3314d = new ArrayList();
        this.f3312b = aVar2;
        ((t) aVar).a(new a(this, 2));
    }
}
