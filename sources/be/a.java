package be;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<ie.a> f3524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie.a f3525b;

    public a() {
        HashSet<ie.a> hashSet = new HashSet<>();
        this.f3524a = hashSet;
        ie.a aVarA = ie.a.f31641c.a();
        this.f3525b = aVarA;
        hashSet.add(aVarA);
    }

    public final void a(ie.a aVar) {
        this.f3524a.add(aVar);
        ie.a aVar2 = aVar.f31643b;
        if (aVar2 != null) {
            a(aVar2);
        }
    }
}
