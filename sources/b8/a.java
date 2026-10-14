package b8;

import android.content.Context;
import android.content.res.Resources;
import fd.j0;
import jc.e;
import jc.f;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends i.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f3348g;

    /* JADX INFO: renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C0057a extends l implements uc.a<b> {
        public C0057a() {
            super(0);
        }

        @Override // uc.a
        public b invoke() {
            Resources resources = a.super.getResources();
            j0.h(resources, "super.getResources()");
            return new b(resources);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10) {
        super(context, i10);
        j0.i(context, "baseContext");
        this.f3348g = f.b(new C0057a());
    }

    @Override // i.c, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return (Resources) this.f3348g.getValue();
    }
}
