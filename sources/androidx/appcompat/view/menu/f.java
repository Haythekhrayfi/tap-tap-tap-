package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.g f855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f856e;

    public f(e eVar) {
        this.f854c = eVar;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean a(e eVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f854c.performItemAction((g) ((c.a) this.f856e.a()).getItem(i10), 0);
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void onCloseMenu(e eVar, boolean z10) {
        androidx.appcompat.app.g gVar;
        if ((z10 || eVar == this.f854c) && (gVar = this.f855d) != null) {
            gVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f856e;
        e eVar = this.f854c;
        i.a aVar = cVar.f844i;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f855d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f855d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f854c.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f854c.performShortcut(i10, keyEvent, 0);
    }
}
