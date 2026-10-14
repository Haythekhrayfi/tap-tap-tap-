package j8;

import android.view.View;
import android.view.ViewGroupOverlay;
import com.inscode.autoclicker.R;
import fd.j0;
import r1.m;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f31784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroupOverlay f31785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f31786c;

    public l(View view, ViewGroupOverlay viewGroupOverlay, View view2) {
        this.f31784a = view;
        this.f31785b = viewGroupOverlay;
        this.f31786c = view2;
    }

    @Override // r1.m, r1.l.g
    public void onTransitionEnd(r1.l lVar) {
        j0.i(lVar, "transition");
        this.f31784a.setTag(R.id.save_overlay_view, null);
        this.f31784a.setVisibility(0);
        this.f31785b.remove(this.f31786c);
        lVar.removeListener(this);
    }

    @Override // r1.m, r1.l.g
    public void onTransitionPause(r1.l lVar) {
        j0.i(lVar, "transition");
        this.f31785b.remove(this.f31786c);
    }

    @Override // r1.m, r1.l.g
    public void onTransitionResume(r1.l lVar) {
        j0.i(lVar, "transition");
        if (this.f31786c.getParent() == null) {
            this.f31785b.add(this.f31786c);
        }
    }

    @Override // r1.m, r1.l.g
    public void onTransitionStart(r1.l lVar) {
        j0.i(lVar, "transition");
        this.f31784a.setVisibility(4);
    }
}
