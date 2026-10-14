package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.cj0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a20 f27592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f27593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f27594c;

    public interface a {
        void a(AdResponse<cj0> adResponse);
    }

    public h(Context context, a20 a20Var, i iVar) {
        this.f27592a = a20Var;
        this.f27593b = iVar;
        this.f27594c = new q(context);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(h hVar, MediatedNativeAd mediatedNativeAd, Map map, int i10, a aVar) {
        aVar.a(hVar.f27594c.a(mediatedNativeAd, map, i10));
    }

    public final void a(MediatedNativeAd mediatedNativeAd, int i10, ArrayList arrayList, a aVar) {
        this.f27592a.a(this.f27593b.a(arrayList), new g(this, mediatedNativeAd, i10, aVar));
    }
}
