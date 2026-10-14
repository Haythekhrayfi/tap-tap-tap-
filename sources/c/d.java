package c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c.a<Intent, ActivityResult> {

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // c.a
    public Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(intent2, "input");
        return intent2;
    }

    @Override // c.a
    public ActivityResult c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
