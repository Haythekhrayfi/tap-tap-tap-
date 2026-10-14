package ia;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import fd.g0;
import fd.j0;
import java.util.Objects;
import java.util.WeakHashMap;
import jc.w;
import kotlin.reflect.KProperty;
import oc.h;
import p0.e0;
import p0.m0;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.exitads.ExitAds$loadExitAd$1", f = "ExitAds.kt", l = {BaseTransientBottomBar.ANIMATION_DURATION}, m = "invokeSuspend")
public final class c extends h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia.a f31524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f31525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f31526f;

    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31527c;

        public a(ViewGroup viewGroup) {
            this.f31527c = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            ViewGroup viewGroup = this.f31527c;
            if (viewGroup != null) {
                viewGroup.setMinimumHeight(view.getHeight());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ia.a aVar, Activity activity, boolean z10, mc.d<? super c> dVar) {
        super(2, dVar);
        this.f31524d = aVar;
        this.f31525e = activity;
        this.f31526f = z10;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new c(this.f31524d, this.f31525e, this.f31526f, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new c(this.f31524d, this.f31525e, this.f31526f, dVar).invokeSuspend(w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
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
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        View view;
        View view2;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31523c;
        if (i10 == 0) {
            h9.d.t(obj);
            ia.a aVar2 = this.f31524d;
            Activity activity = this.f31525e;
            KProperty<Object>[] kPropertyArr = ia.a.f31508e;
            Objects.requireNonNull(aVar2);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
            if (viewGroup.findViewById(com.inscode.autoclicker.R.id.ph_ad_close_view) != null) {
                if (((ViewGroup) viewGroup.findViewById(com.inscode.autoclicker.R.id.ph_ad_close_container)).getChildCount() != 0) {
                    z10 = false;
                }
                if (z10) {
                    ia.a aVar3 = this.f31524d;
                    Activity activity2 = this.f31525e;
                    boolean z11 = this.f31526f;
                    this.f31523c = 1;
                    Objects.requireNonNull(aVar3);
                    ViewGroup viewGroup2 = (ViewGroup) activity2.findViewById(com.inscode.autoclicker.R.id.ph_ad_close_container);
                    j0.h(viewGroup2, "adContainer");
                    obj = aVar3.b(activity2, viewGroup2, z11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return w.f31842a;
            }
            View viewInflate = LayoutInflater.from(activity).inflate(com.inscode.autoclicker.R.layout.ph_ad_close_view, viewGroup, false);
            viewGroup.addView(LayoutInflater.from(activity).inflate(com.inscode.autoclicker.R.layout.ph_ad_close_background, viewGroup, false));
            viewGroup.addView(viewInflate);
            s0.b bVar = new s0.b(viewInflate, 1);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.u(viewInflate, bVar);
            z10 = true;
            if (z10) {
                ia.a aVar4 = this.f31524d;
                Activity activity3 = this.f31525e;
                boolean z12 = this.f31526f;
                this.f31523c = 1;
                Objects.requireNonNull(aVar4);
                ViewGroup viewGroup3 = (ViewGroup) activity3.findViewById(com.inscode.autoclicker.R.id.ph_ad_close_container);
                j0.h(viewGroup3, "adContainer");
                obj = aVar4.b(activity3, viewGroup3, z12, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return w.f31842a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h9.d.t(obj);
        ia.a.C0313a c0313a = (ia.a.C0313a) obj;
        ViewGroup.LayoutParams layoutParams = null;
        if (c0313a == null) {
            c0313a = null;
        } else {
            if (!(c0313a.f31513a != null)) {
                c0313a = null;
            }
        }
        ia.a aVar5 = this.f31524d;
        KProperty<Object>[] kPropertyArr2 = ia.a.f31508e;
        Objects.requireNonNull(aVar5);
        ViewGroup viewGroup4 = (ViewGroup) this.f31525e.findViewById(com.inscode.autoclicker.R.id.ph_ad_close_container);
        if (c0313a != null && (view2 = c0313a.f31513a) != null) {
            layoutParams = view2.getLayoutParams();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
        }
        if (c0313a != null && (view = c0313a.f31513a) != null) {
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            if (!e0.g.c(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new a(viewGroup4));
            } else if (viewGroup4 != null) {
                viewGroup4.setMinimumHeight(view.getHeight());
            }
        }
        return w.f31842a;
    }
}
