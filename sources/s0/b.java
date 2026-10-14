package s0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputContentInfo;
import android.widget.LinearLayout;
import com.inscode.autoclicker.R;
import fd.j0;
import h0.g;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import p0.e0;
import p0.m0;
import p0.s0;
import p0.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements e, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f35391a;

    public boolean a(f fVar, int i10, Bundle bundle) {
        View view = this.f35391a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                fVar.f35394a.c();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f35394a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        p0.c.a aVar = new p0.c.a(new ClipData(fVar.f35394a.getDescription(), new ClipData.Item(fVar.f35394a.b())), 2);
        aVar.f34338a.a(fVar.f35394a.a());
        aVar.f34338a.setExtras(bundle);
        return e0.l(view, aVar.a()) == null;
    }

    @Override // p0.u
    public s0 onApplyWindowInsets(View view, s0 s0Var) {
        View view2 = this.f35391a;
        KProperty<Object>[] kPropertyArr = ia.a.f31508e;
        j0.i(view, "<anonymous parameter 0>");
        j0.i(s0Var, "insets");
        g gVarB = s0Var.b(-1);
        g gVar = g.f30458e;
        if ((gVarB.equals(gVar) && s0Var.f34404a.h(-9).equals(gVar) && s0Var.f34404a.f() == null) ? false : true) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.i.u(view2, null);
            View viewFindViewById = view2.findViewById(R.id.confirm_exit_text);
            j0.h(viewFindViewById, "bottomSheetView.findView…>(R.id.confirm_exit_text)");
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = s0Var.b(7).f30462d;
            viewFindViewById.setLayoutParams(layoutParams2);
        }
        return s0Var;
    }
}
