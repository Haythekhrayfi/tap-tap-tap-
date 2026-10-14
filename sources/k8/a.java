package k8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Objects;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f31932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f31932c = new b(this);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    @Override // android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        boolean zA;
        j0.i(keyEvent, "event");
        b bVar = this.f31932c;
        Objects.requireNonNull(bVar);
        j0.i(keyEvent, "event");
        if (bVar.f31934b == null || i10 != 4) {
            zA = false;
        } else if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = bVar.f31933a.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, bVar);
            }
            zA = true;
        } else if (keyEvent.getAction() != 1) {
            zA = false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = bVar.f31933a.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                zA = false;
            } else {
                b.a aVar = bVar.f31934b;
                j0.f(aVar);
                zA = aVar.a();
            }
        }
        return zA || super.onKeyPreIme(i10, keyEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        j0.i(view, "changedView");
        this.f31932c.a();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b bVar = this.f31932c;
        Objects.requireNonNull(bVar);
        if (z10) {
            bVar.a();
        }
    }

    public void setOnBackClickListener(b.a aVar) {
        setDescendantFocusability(aVar != null ? 131072 : 262144);
        b bVar = this.f31932c;
        bVar.f31934b = aVar;
        bVar.a();
    }
}
