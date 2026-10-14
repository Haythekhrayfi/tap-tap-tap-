package com.zipoapps.premiumhelper.util;

import android.content.SharedPreferences;
import com.facebook.applinks.AppLinkData;
import fd.g0;
import fd.j1;
import fd.s0;
import jc.w;
import oc.e;
import oc.h;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2", f = "FacebookInstallData.kt", l = {}, m = "invokeSuspend")
public final class a extends h implements p<g0, mc.d<? super j1>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f28437d;

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.util.a$a, reason: collision with other inner class name */
    @e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2$1", f = "FacebookInstallData.kt", l = {22}, m = "invokeSuspend")
    public static final class C0242a extends h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f28440e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0242a(b bVar, mc.d<? super C0242a> dVar) {
            super(2, dVar);
            this.f28440e = bVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new C0242a(this.f28440e, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new C0242a(this.f28440e, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28439d;
            try {
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (!this.f28440e.f28442b.f33405a.getBoolean("is_facebook_install_handled", false)) {
                        b bVar2 = this.f28440e;
                        this.f28438c = bVar2;
                        this.f28439d = 1;
                        Object objA = bVar2.a(this);
                        if (objA == aVar) {
                            return aVar;
                        }
                        bVar = bVar2;
                        obj = objA;
                    }
                    return w.f31842a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) this.f28438c;
                h9.d.t(obj);
                bVar.b((AppLinkData) obj);
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
            SharedPreferences.Editor editorEdit = this.f28440e.f28442b.f33405a.edit();
            editorEdit.putBoolean("is_facebook_install_handled", true);
            editorEdit.apply();
            return w.f31842a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, mc.d<? super a> dVar) {
        super(2, dVar);
        this.f28437d = bVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        a aVar = new a(this.f28437d, dVar);
        aVar.f28436c = obj;
        return aVar;
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super j1> dVar) {
        a aVar = new a(this.f28437d, dVar);
        aVar.f28436c = g0Var;
        return aVar.invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        return c0.z((g0) this.f28436c, s0.f29620b, null, new C0242a(this.f28437d, null), 2, null);
    }
}
