package l0;

import android.os.Bundle;
import android.os.IBinder;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        j0.i(bundle, "bundle");
        j0.i(str, Action.KEY_ATTRIBUTE);
        bundle.putBinder(str, iBinder);
    }
}
