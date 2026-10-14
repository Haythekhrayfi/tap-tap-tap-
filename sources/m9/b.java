package m9;

import android.text.Layout;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.pl1;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33319c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33320d;

    public /* synthetic */ b(pl1 pl1Var) {
        this.f33320d = pl1Var;
    }

    public /* synthetic */ b(c cVar) {
        this.f33320d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Layout layout;
        int iMax;
        switch (this.f33319c) {
            case 0:
                c cVar = (c) this.f33320d;
                j0.i(cVar, "this$0");
                if (!cVar.f33322b || (layout = cVar.f33321a.getLayout()) == null) {
                    return true;
                }
                f fVar = cVar.f33321a;
                int iMin = Math.min(layout.getLineCount(), (fVar.getHeight() / fVar.getLineHeight()) + 1);
                while (iMin > 0) {
                    int i10 = iMin - 1;
                    if (layout.getLineBottom(i10) - ((fVar.getHeight() - fVar.getPaddingTop()) - fVar.getPaddingBottom()) <= 3) {
                        iMax = Math.max(0, iMin);
                        if (iMax != cVar.f33321a.getMaxLines()) {
                            cVar.f33321a.setMaxLines(iMax);
                            return false;
                        }
                        if (cVar.f33323c != null) {
                            return true;
                        }
                        cVar.f33321a.getViewTreeObserver().removeOnPreDrawListener(cVar.f33323c);
                        cVar.f33323c = null;
                        return true;
                    }
                    iMin = i10;
                }
                iMax = Math.max(0, iMin);
                if (iMax != cVar.f33321a.getMaxLines()) {
                    cVar.f33321a.setMaxLines(iMax);
                    return false;
                }
                if (cVar.f33323c != null) {
                    return true;
                }
                cVar.f33321a.getViewTreeObserver().removeOnPreDrawListener(cVar.f33323c);
                cVar.f33323c = null;
                return true;
            default:
                return pl1.g((pl1) this.f33320d);
        }
    }
}
