package r7;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Boolean> f35273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<t8.a> f35274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<t8.c> f35275c;

    public j(ic.a<Boolean> aVar, ic.a<t8.a> aVar2, ic.a<t8.c> aVar3) {
        this.f35273a = aVar;
        this.f35274b = aVar2;
        this.f35275c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        t8.e eVar;
        String str;
        boolean zBooleanValue = this.f35273a.get().booleanValue();
        ic.a<t8.a> aVar = this.f35274b;
        ic.a<t8.c> aVar2 = this.f35275c;
        j0.i(aVar, "joinedStateSwitcher");
        j0.i(aVar2, "multipleStateSwitcher");
        if (zBooleanValue) {
            eVar = aVar2.get();
            str = "multipleStateSwitcher.get()";
        } else {
            eVar = aVar.get();
            str = "joinedStateSwitcher.get()";
        }
        j0.h(eVar, str);
        return eVar;
    }
}
