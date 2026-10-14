package a8;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.divImageStyle : i10);
    }

    public /* bridge */ /* synthetic */ a getAttachedPlayer() {
        return null;
    }
}
