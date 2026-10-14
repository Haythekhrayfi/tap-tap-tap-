package xa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper;
import ed.u;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.m;
import ma.v;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends PreferenceHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f37577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f37578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        ArrayList arrayList;
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f37577j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f33519c);
        j0.h(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…leable.PremiumPreference)");
        try {
            String string = typedArrayObtainStyledAttributes.getString(1);
            if (string != null) {
                List listR = u.R(string, new String[]{","}, false, 0, 6);
                arrayList = new ArrayList(m.j(listR, 10));
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(u.Y((String) it.next()).toString())));
                }
            } else {
                arrayList = null;
            }
            this.f37578k = arrayList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper
    public void d() {
        if (!b()) {
            List<Integer> list = this.f37578k;
            if (!(list != null && (list.isEmpty() ^ true))) {
                c();
                return;
            }
        }
        TextView textView = this.f28314a;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }
}
