package s4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import fd.j0;
import kc.j;
import y6.d0;
import y6.v2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35450c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f35453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f35454g;

    public /* synthetic */ a(View view, View view2, v2 v2Var, d0 d0Var) {
        this.f35451d = view;
        this.f35452e = view2;
        this.f35453f = v2Var;
        this.f35454g = d0Var;
    }

    public /* synthetic */ a(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        this.f35451d = defaultScheduler;
        this.f35452e = transportContext;
        this.f35453f = transportScheduleCallback;
        this.f35454g = eventInternal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35450c) {
            case 0:
                ((DefaultScheduler) this.f35451d).lambda$schedule$1((TransportContext) this.f35452e, (TransportScheduleCallback) this.f35453f, (EventInternal) this.f35454g);
                break;
            default:
                View view = (View) this.f35451d;
                View view2 = (View) this.f35452e;
                v2 v2Var = (v2) this.f35453f;
                d0 d0Var = (d0) this.f35454g;
                d0.a aVar = d0.f38116t;
                j0.i(view, "$startView");
                j0.i(view2, "$endView");
                j0.i(v2Var, "$line");
                j0.i(d0Var, "this$0");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                j0.g(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                j0.g(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams4 = (WindowManager.LayoutParams) layoutParams3;
                int[] iArr = new int[2];
                v2Var.getLocationOnScreen(iArr);
                j.p(iArr);
                ViewGroup.LayoutParams layoutParams5 = v2Var.getLayoutParams();
                j0.g(layoutParams5, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                v2Var.setScale(d0Var.f38125m);
                float fG = layoutParams2.x + (d0Var.G() / 2);
                float fG2 = layoutParams2.y + (d0Var.G() / 2);
                float fG3 = layoutParams4.x + (d0Var.G() / 2);
                float fG4 = layoutParams4.y + (d0Var.G() / 2);
                v2Var.f38410c = fG;
                v2Var.f38411d = fG2;
                v2Var.f38412e = fG3;
                v2Var.f38413f = fG4;
                v2Var.invalidate();
                v2Var.requestLayout();
                break;
        }
    }
}
