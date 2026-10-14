package p7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.b f34504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f34505b;

    public static final class a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f34506c;

        /* JADX INFO: renamed from: p7.e$a$a, reason: collision with other inner class name */
        public static final class C0385a {
            public C0385a() {
            }

            public C0385a(vc.g gVar) {
            }
        }

        static {
            new C0385a(null);
        }

        public a(e eVar) {
            fd.j0.i(eVar, "div2Context");
            this.f34506c = eVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            fd.j0.i(str, "name");
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            fd.j0.i(attributeSet, "attrs");
            return onCreateView(str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            fd.j0.i(str, "name");
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            fd.j0.i(attributeSet, "attrs");
            if (fd.j0.d("com.yandex.div.core.view2.Div2View", str) || fd.j0.d("Div2View", str)) {
                return new i8.k(this.f34506c, attributeSet, 0, 4, null);
            }
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, k kVar) {
        this(activity, kVar, 0, 4, null);
        fd.j0.i(activity, "activity");
        fd.j0.i(kVar, "configuration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(ContextThemeWrapper contextThemeWrapper, k kVar) {
        this(contextThemeWrapper, kVar, 0, 4, null);
        fd.j0.i(contextThemeWrapper, "baseContext");
        fd.j0.i(kVar, "configuration");
    }

    public e(ContextThemeWrapper contextThemeWrapper, k kVar, int i10) {
        fd.j0.i(contextThemeWrapper, "baseContext");
        fd.j0.i(kVar, "configuration");
        r7.a aVar = ((r7.a) q0.f34583b.a(contextThemeWrapper).f34586a).f35185b;
        Integer numValueOf = Integer.valueOf(i10);
        Objects.requireNonNull(numValueOf);
        j0 j0Var = new j0(SystemClock.uptimeMillis());
        w7.a aVar2 = kVar.f34550r;
        Objects.requireNonNull(aVar2);
        r7.a.b bVar = new r7.a.b(aVar, kVar, contextThemeWrapper, numValueOf, j0Var, aVar2, null);
        super(contextThemeWrapper);
        this.f34504a = bVar;
        if (j0Var.f34529b >= 0) {
            return;
        }
        Objects.requireNonNull(j0.f34525f);
        j0Var.f34529b = SystemClock.uptimeMillis();
    }

    public /* synthetic */ e(ContextThemeWrapper contextThemeWrapper, k kVar, int i10, int i11, vc.g gVar) {
        this(contextThemeWrapper, kVar, (i11 & 4) != 0 ? 2131951940 : i10);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        LayoutInflater layoutInflaterCloneInContext;
        fd.j0.i(str, "name");
        if (!fd.j0.d("layout_inflater", str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.f34505b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        synchronized (this) {
            layoutInflaterCloneInContext = this.f34505b;
            if (layoutInflaterCloneInContext == null) {
                layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                if (layoutInflaterCloneInContext == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                }
                layoutInflaterCloneInContext.setFactory2(new a(this));
                this.f34505b = layoutInflaterCloneInContext;
            }
        }
        return layoutInflaterCloneInContext;
    }
}
