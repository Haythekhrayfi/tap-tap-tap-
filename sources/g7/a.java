package g7;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fd.j0;
import jc.w;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowManager.LayoutParams f30019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.a<w> f30021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uc.a<w> f30022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f30025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30027k;

    public a(WindowManager.LayoutParams layoutParams, int i10, uc.a<w> aVar, uc.a<w> aVar2) {
        j0.i(layoutParams, "params");
        this.f30019c = layoutParams;
        this.f30020d = i10;
        this.f30021e = aVar;
        this.f30022f = aVar2;
    }

    public /* synthetic */ a(WindowManager.LayoutParams layoutParams, int i10, uc.a aVar, uc.a aVar2, int i11, g gVar) {
        this(layoutParams, (i11 & 2) != 0 ? 10 : i10, aVar, aVar2);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        j0.i(view, "v");
        j0.i(motionEvent, "event");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f30027k = false;
            WindowManager.LayoutParams layoutParams = this.f30019c;
            this.f30023g = layoutParams.x;
            this.f30024h = layoutParams.y;
            this.f30025i = motionEvent.getRawX();
            this.f30026j = motionEvent.getRawY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.f30027k) {
                    double dPow = Math.pow(motionEvent.getRawY() - this.f30026j, 2.0d) + Math.pow(motionEvent.getRawX() - this.f30025i, 2.0d);
                    int i10 = this.f30020d;
                    if (dPow > ((double) (i10 * i10))) {
                        this.f30027k = true;
                    }
                }
                if (!this.f30027k) {
                    return true;
                }
                this.f30019c.x = this.f30023g + ((int) (motionEvent.getRawX() - this.f30025i));
                this.f30019c.y = this.f30024h + ((int) (motionEvent.getRawY() - this.f30026j));
                uc.a<w> aVar = this.f30022f;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        } else if (!this.f30027k) {
            uc.a<w> aVar2 = this.f30021e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return false;
    }
}
