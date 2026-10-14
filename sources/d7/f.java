package d7;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends View {
    public f(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        new LinkedHashMap();
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        StringBuilder sbA = defpackage.a.a("RecordMeasureView: ");
        sbA.append(keyEvent != null ? Integer.valueOf(keyEvent.getKeyCode()) : null);
        xe.a.f37601c.a(sbA.toString(), new Object[0]);
        return false;
    }
}
