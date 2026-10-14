package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C0;
import com.yandex.metrica.impl.ob.F0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class B0<CANDIDATE, CHOSEN extends F0, STORAGE extends C0<CANDIDATE, CHOSEN>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q9<STORAGE> f13671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0<CHOSEN> f13672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T2<CANDIDATE, CHOSEN> f13673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L2<CANDIDATE, CHOSEN, STORAGE> f13674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2020v2<CHOSEN> f13675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1945s2 f13676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1794m0 f13677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private STORAGE f13678i;

    public B0(Context context, Q9<STORAGE> q10, D0<CHOSEN> d10, T2<CANDIDATE, CHOSEN> t10, L2<CANDIDATE, CHOSEN, STORAGE> l10, InterfaceC2020v2<CHOSEN> interfaceC2020v2, InterfaceC1945s2 interfaceC1945s2, InterfaceC1794m0 interfaceC1794m0, STORAGE storage, String str) {
        this.f13670a = context;
        this.f13671b = q10;
        this.f13672c = d10;
        this.f13673d = t10;
        this.f13674e = l10;
        this.f13675f = interfaceC2020v2;
        this.f13676g = interfaceC1945s2;
        this.f13677h = interfaceC1794m0;
        this.f13678i = storage;
    }

    private final synchronized CHOSEN b() {
        if (!this.f13676g.a()) {
            CHOSEN chosenInvoke = this.f13675f.invoke();
            this.f13676g.b();
            if (chosenInvoke != null) {
                b(chosenInvoke);
            }
        }
        B2.a("Choosing distribution data: %s", this.f13678i);
        return (CHOSEN) this.f13678i.b();
    }

    public final CHOSEN a() {
        this.f13677h.a(this.f13670a);
        return (CHOSEN) b();
    }

    public final CHOSEN a(CHOSEN chosen) {
        CHOSEN chosen2;
        this.f13677h.a(this.f13670a);
        synchronized (this) {
            b(chosen);
            chosen2 = (CHOSEN) b();
        }
        return chosen2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized boolean b(CHOSEN chosen) {
        boolean z10 = false;
        if (chosen.a() == E0.UNDEFINED) {
            return false;
        }
        List<? extends CANDIDATE> listInvoke = this.f13673d.invoke(this.f13678i.a(), chosen);
        boolean z11 = listInvoke != null;
        if (listInvoke == null) {
            listInvoke = this.f13678i.a();
        }
        if (this.f13672c.a(chosen, this.f13678i.b())) {
            z10 = true;
        } else {
            chosen = (CHOSEN) this.f13678i.b();
        }
        if (z10 || z11) {
            STORAGE storageInvoke = this.f13674e.invoke(chosen, listInvoke);
            this.f13678i = storageInvoke;
            this.f13671b.a(storageInvoke);
        }
        return z10;
    }
}
