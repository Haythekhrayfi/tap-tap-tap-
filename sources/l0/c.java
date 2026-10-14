package l0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        j0.i(bundle, "bundle");
        j0.i(str, Action.KEY_ATTRIBUTE);
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        j0.i(bundle, "bundle");
        j0.i(str, Action.KEY_ATTRIBUTE);
        bundle.putSizeF(str, sizeF);
    }
}
